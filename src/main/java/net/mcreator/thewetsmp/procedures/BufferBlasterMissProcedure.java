package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModParticles;

public class BufferBlasterMissProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(TheWetSmpRehydratedModParticles.BUFFER_PARTICLE, x, y, z, 12, 0.5, 0.5, 0.5, 0);
	}
}
