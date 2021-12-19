package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.Collections;

public class AquamarineGrappleAirProcedure {
	public static void execute(double x, double y, double z, Entity entity, Entity imediatesourceentity) {
		if (entity == null || imediatesourceentity == null)
			return;
		if (imediatesourceentity.getDeltaMovement().y() < 0) {
			if (!imediatesourceentity.level.isClientSide())
				imediatesourceentity.discard();
			{
				Entity _ent = entity;
				_ent.teleportTo((Math.round(x) + 0.5), (y + 1), (Math.round(z) + 0.5));
				if (_ent instanceof ServerPlayer _serverPlayer) {
					_serverPlayer.connection.teleport((Math.round(x) + 0.5), (y + 1), (Math.round(z) + 0.5), _ent.getYRot(), _ent.getXRot(),
							Collections.emptySet());
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"setblock ~ ~-1 ~ the_wet_smp_rehydrated:aquamarine_construct");
			}
			entity.fallDistance = 0;
		}
	}
}
