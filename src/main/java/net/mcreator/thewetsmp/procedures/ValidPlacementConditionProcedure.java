package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

public class ValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.SEA_URCHIN) {
			if (Blocks.SNOW.defaultBlockState().canSurvive(world, new BlockPos((int) x, (int) y, (int) z))) {
				return true;
			}
			return false;
		}
		return false;
	}
}
