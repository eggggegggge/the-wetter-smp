package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerXpEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerGainsXPProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerXPChange(PlayerXpEvent.XpChange event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheWetSmpRehydratedModMobEffects.SALVATION) : false) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == (entity instanceof LivingEntity _livEnt
					? _livEnt.getHealth()
					: -1))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.25));
			}
		}
	}
}
