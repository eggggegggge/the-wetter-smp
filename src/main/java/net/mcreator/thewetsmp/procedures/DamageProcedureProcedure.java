package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.potion.SnackBulwarkPotionEffect;
import net.mcreator.thewetsmp.potion.RuggedPotionEffect;
import net.mcreator.thewetsmp.potion.PeacePotionEffect;
import net.mcreator.thewetsmp.potion.LacunaPotionEffect;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class DamageProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingHurtEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure DamageProcedure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DamageProcedure!");
			return;
		}
		if (dependencies.get("amount") == null) {
			if (!dependencies.containsKey("amount"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency amount for procedure DamageProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double amount = dependencies.get("amount") instanceof Integer ? (int) dependencies.get("amount") : (double) dependencies.get("amount");
		double test = 0;
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SnackBulwarkPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) != 0) {
				if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) < amount * 0.685) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 0);
				} else {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getFoodStats()
								.setFoodLevel((int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0)
										- amount * 0.685));
					if (dependencies.get("event") != null) {
						Object _obj = dependencies.get("event");
						if (_obj instanceof Event) {
							Event _evt = (Event) _obj;
							if (_evt.isCancelable())
								_evt.setCanceled(true);
						}
					}
				}
			}
		} else if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == LacunaPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) (amount / 2 + amount));
		} else if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == PeacePotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (entity.getPosY() >= -64) {
				if (dependencies.get("event") != null) {
					Object _obj = dependencies.get("event");
					if (_obj instanceof Event) {
						Event _evt = (Event) _obj;
						if (_evt.isCancelable())
							_evt.setCanceled(true);
					}
				}
			}
		} else if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == PeacePotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(sourceentity)) {
			if (dependencies.get("event") != null) {
				Object _obj = dependencies.get("event");
				if (_obj instanceof Event) {
					Event _evt = (Event) _obj;
					if (_evt.isCancelable())
						_evt.setCanceled(true);
				}
			}
		} else if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RuggedPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (Math.random() * 100 <= amount * 2) {
				sourceentity.attackEntityFrom(DamageSource.MAGIC, (float) 2);
			}
		}
	}
}
