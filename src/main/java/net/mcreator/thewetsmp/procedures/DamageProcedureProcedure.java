package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DamageProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, Entity sourceentity, double amount) {
		execute(null, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double test = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.SNACK_BULWARK) : false) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) != 0) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < amount * 0.685) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel(0);
				} else {
					if (entity instanceof Player _player)
						_player.getFoodData()
								.setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - amount * 0.685));
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				}
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.LACUNA) : false) {
			entity.hurt(DamageSource.GENERIC, (float) (amount * 1.5));
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.PEACE) : false) {
			if (entity.getY() >= -64) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		} else if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.PEACE) : false) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.RUGGED) : false) {
			if (Math.random() * 100 <= amount * 2) {
				sourceentity.hurt(DamageSource.MAGIC, 2);
			}
		}
	}
}
