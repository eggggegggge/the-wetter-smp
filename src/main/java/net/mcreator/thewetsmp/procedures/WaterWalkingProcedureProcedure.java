package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.Map;

public class WaterWalkingProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency entity for procedure WaterWalkingProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure WaterWalkingProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure WaterWalkingProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure WaterWalkingProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure WaterWalkingProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getFluidState(new BlockPos((int) x, (int) (y - 0.3), (int) z)).getBlockState()).getBlock() == Blocks.WATER)
				|| ((world.getFluidState(new BlockPos((int) x, (int) (y - 0.3), (int) z)).getBlockState()).getBlock() == Blocks.WATER))
				&& (!(entity.isInWaterOrBubbleColumn())))) {
			entity.setMotion((entity.getMotion().getX()), 0, (entity.getMotion().getZ()));
		}
	}
}
