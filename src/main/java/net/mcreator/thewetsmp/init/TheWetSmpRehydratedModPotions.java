
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion LACUNA_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.LACUNA, 3600, 0, false, true)).setRegistryName("lacuna_potion"));
	public static final Potion HAYWIRE_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.HAYWIRE, 900, 0, false, true)).setRegistryName("haywire_potion"));
	public static final Potion PEACE_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.PEACE, 600, 0, false, true)).setRegistryName("peace_potion"));
	public static final Potion LUCK = register(new Potion(new MobEffectInstance(MobEffects.LUCK, 9600, 0, false, true)).setRegistryName("luck"));
	public static final Potion BAD_LUCK = register(
			new Potion(new MobEffectInstance(MobEffects.UNLUCK, 9600, 0, false, true)).setRegistryName("bad_luck"));
	public static final Potion PUSHBACK_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.PUSHBACK, 6000, 0, false, true)).setRegistryName("pushback_potion"));
	public static final Potion SALVATION_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.SALVATION, 3600, 0, false, true)).setRegistryName("salvation_potion"));
	public static final Potion SOUL_SUPPLEMENT_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.SOUL_SUPPLEMENT, 6000, 0, false, true))
					.setRegistryName("soul_supplement_potion"));
	public static final Potion SOUL_SUBDUCTION_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.SOUL_SUBDUCTION, 6000, 0, false, true))
					.setRegistryName("soul_subduction_potion"));
	public static final Potion RUGGED_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.RUGGED, 7200, 0, false, true)).setRegistryName("rugged_potion"));
	public static final Potion ANTIPODALISM_POTION = register(
			new Potion(new MobEffectInstance(TheWetSmpRehydratedModMobEffects.ANTIPODALISM, 1, 0, false, false))
					.setRegistryName("antipodalism_potion"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
