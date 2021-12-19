package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class DetermineAllBiomesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		DetermineBiomes1Procedure.execute(world, x, y, z, entity);
		DetermineBiomes2Procedure.execute(world, x, y, z, entity);
		DetermineBiomes3Procedure.execute(world, x, y, z, entity);
		DetermineBiomes4Procedure.execute(world, x, y, z, entity);
		DetermineBiomes5Procedure.execute(world, x, y, z, entity);
	}
}
