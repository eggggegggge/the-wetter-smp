package net.mcreator.thewetsmp.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.Map;

public class MotivationStartProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency entity for procedure MotivationStartProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/attribute @p forge:reach_distance base set 7");
			}
		}
	}
}
