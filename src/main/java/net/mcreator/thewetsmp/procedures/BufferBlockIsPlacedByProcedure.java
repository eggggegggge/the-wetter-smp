package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModEntities;
import net.mcreator.thewetsmp.entity.BufferBlockRemovalEntity;

public class BufferBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String name = "";
		if (!world.getEntitiesOfClass(BufferBlockRemovalEntity.class, AABB.ofSize(new Vec3(x, y, z), 18, 18, 18), e -> true).isEmpty()) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		} else {
			name = (String) (entity.getDisplayName().getString());
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("owner", name);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new BufferBlockRemovalEntity(TheWetSmpRehydratedModEntities.BUFFER_BLOCK_REMOVAL, _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"data modify entity @e[type=the_wet_smp:buffer_block_removal,limit=1,sort=nearest] PersistenceRequired set value 1");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"data modify entity @e[type=the_wet_smp:buffer_block_removal,limit=1,sort=nearest] Invulnerable set value 1");
		}
	}
}
