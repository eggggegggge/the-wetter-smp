package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModMobEffects;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

public class RingEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.AQUAMARINE_RING) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.WATER_WALKING, 1, 0, (true), (false)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.EMERALD_RING) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.SNACK_BULWARK, 1, 0, (true), (false)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.LAPIS_RING) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.MOTIVATION, 1, 0, (false), (false)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.ONYX_RING) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.STURDY, 1, 0, (false), (false)));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.RUBY_RING) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.VAMPIRISM, 1, 0, (false), (false)));
		}
	}
}
