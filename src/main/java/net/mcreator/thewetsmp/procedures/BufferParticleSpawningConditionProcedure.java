package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModParticles;

public class BufferParticleSpawningConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "latencyLoaded")) == true) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(TheWetSmpRehydratedModParticles.BUFFER_PARTICLE, x, y, z, 4, 0.3, 0.3, 0.3, 0);
		}
	}
}
