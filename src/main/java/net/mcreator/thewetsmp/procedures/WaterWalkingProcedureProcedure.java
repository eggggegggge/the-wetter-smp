package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WaterWalkingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getFluidState(new BlockPos((int) x, (int) (y - 0.3), (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(new BlockPos((int) x, (int) (y - 0.3), (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER)
				&& !entity.isInWaterOrBubble()) {
			entity.setDeltaMovement((entity.getDeltaMovement().x()), 0, (entity.getDeltaMovement().z()));
		}
	}
}
