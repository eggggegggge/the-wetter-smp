package net.mcreator.thewetsmp.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class GrapplingHookHitsBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure GrapplingHookHitsBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(5, 10, 5);
	}
}
