package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModMobEffects;

public class ExplosiveCrabCannonHitEntityProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity imediatesourceentity) {
		if (imediatesourceentity == null)
			return;
		if (imediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.PEACE) : false) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 0, Explosion.BlockInteraction.NONE);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, (float) 1.4, Explosion.BlockInteraction.NONE);
		}
	}
}
