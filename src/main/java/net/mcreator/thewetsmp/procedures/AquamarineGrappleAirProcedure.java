package net.mcreator.thewetsmp.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;
import java.util.Collections;

public class AquamarineGrappleAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure AquamarineGrappleAir!");
			return;
		}
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure AquamarineGrappleAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure AquamarineGrappleAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure AquamarineGrappleAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure AquamarineGrappleAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((imediatesourceentity.getMotion().getY()) < 0)) {
			if (!imediatesourceentity.world.isRemote())
				imediatesourceentity.remove();
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((Math.round(x) + 0.5), (y + 1), (Math.round(z) + 0.5));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((Math.round(x) + 0.5), (y + 1), (Math.round(z) + 0.5), _ent.rotationYaw,
							_ent.rotationPitch, Collections.emptySet());
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"setblock ~ ~-1 ~ the_wet_smp_rehydrated:aquamarine_construct");
				}
			}
			entity.fallDistance = (float) (0);
		}
	}
}
