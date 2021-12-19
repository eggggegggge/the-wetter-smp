package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SepiaCarpetValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.RED_CARPET.defaultBlockState().canSurvive(world, new BlockPos((int) x, (int) y, (int) z))) {
			return true;
		}
		return false;
	}
}
