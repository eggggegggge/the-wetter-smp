package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.ItemFishedEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import com.google.common.collect.ImmutableMap;

public class ColdOceanFishProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerFishItem(ItemFishedEvent event) {
			PlayerEntity entity = event.getPlayer();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure ColdOceanFish!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		IWorld world = (IWorld) dependencies.get("world");
		boolean rain = false;
		double sel = 0;
		double luck = 0;
		double unluck = 0;
		double totalluck = 0;
		double rodpower = 0;
		double baitpower = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		/* fishing factors */
		rain = (boolean) world.getWorldInfo().isRaining();
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.LUCK)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			luck = (double) (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.LUCK)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity));
		} else {
			luck = (double) 0;
		}
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.UNLUCK)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			unluck = (double) (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.UNLUCK)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity));
		} else {
			unluck = (double) 0;
		}
		totalluck = (double) ((0 + luck) - unluck);
		rodpower = (double) FishingRodCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));
		baitpower = (double) BaitCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity, "world", world));/* loot factors */
		time = (double) (world.getWorldInfo().getDayTime());
		altitude = (double) (Math.floor(y));/* how many fish */
		fish = (double) 50;
		if (((time > 13000) && (time < 23000))) {
			fish = (double) 60;
		}
		sel = (double) ((new Random()).nextInt((int) fish + 1));
	}
}
