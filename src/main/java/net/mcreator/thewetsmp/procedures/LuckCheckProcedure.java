package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class LuckCheckProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double luck = 0;
		double unluck = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LUCK) : false) {
			luck = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
					? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
					: 0) + 1;
		} else {
			luck = 0;
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.UNLUCK) : false) {
			unluck = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK)
					? _livEnt.getEffect(MobEffects.UNLUCK).getAmplifier()
					: 0) + 2;
		} else {
			unluck = 0;
		}
		return 1 + luck - unluck;
	}
}
