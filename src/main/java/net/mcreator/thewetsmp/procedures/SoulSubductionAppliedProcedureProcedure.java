package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModMobEffects;

public class SoulSubductionAppliedProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.SOUL_SUPPLEMENT) : false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 20");
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 16");
			}
		}
	}
}
