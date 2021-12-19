package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;
import net.mcreator.thewetsmp.entity.BufferBlockRemovalEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BufferBlockDestroyedByPlayerProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BufferBlockRemovalEntity.class, AABB.ofSize(new Vec3(x, y, z), 9, 9, 9), e -> true).isEmpty()) {
			if (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.BUFFER
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.BUFFER
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS) {
			if (!(entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "owner"))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "latencyLoaded")) == true) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "cooldown")) == true) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=the_wet_smp:buffer_block_removal,limit=1,sort=nearest]");
			}
		}
	}
}
