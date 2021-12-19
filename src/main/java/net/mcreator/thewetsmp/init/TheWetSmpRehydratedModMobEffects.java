
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thewetsmp.potion.WaterWalkingMobEffect;
import net.mcreator.thewetsmp.potion.VampirismMobEffect;
import net.mcreator.thewetsmp.potion.SturdyMobEffect;
import net.mcreator.thewetsmp.potion.SoulSupplementMobEffect;
import net.mcreator.thewetsmp.potion.SoulSubductionMobEffect;
import net.mcreator.thewetsmp.potion.SnackBulwarkMobEffect;
import net.mcreator.thewetsmp.potion.SalvationMobEffect;
import net.mcreator.thewetsmp.potion.RuggedMobEffect;
import net.mcreator.thewetsmp.potion.PushbackMobEffect;
import net.mcreator.thewetsmp.potion.PeaceMobEffect;
import net.mcreator.thewetsmp.potion.MotivationMobEffect;
import net.mcreator.thewetsmp.potion.LacunaMobEffect;
import net.mcreator.thewetsmp.potion.HaywireMobEffect;
import net.mcreator.thewetsmp.potion.AntipodalismMobEffect;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect WATER_WALKING = register(new WaterWalkingMobEffect());
	public static final MobEffect SNACK_BULWARK = register(new SnackBulwarkMobEffect());
	public static final MobEffect STURDY = register(new SturdyMobEffect());
	public static final MobEffect MOTIVATION = register(new MotivationMobEffect());
	public static final MobEffect VAMPIRISM = register(new VampirismMobEffect());
	public static final MobEffect LACUNA = register(new LacunaMobEffect());
	public static final MobEffect HAYWIRE = register(new HaywireMobEffect());
	public static final MobEffect PEACE = register(new PeaceMobEffect());
	public static final MobEffect PUSHBACK = register(new PushbackMobEffect());
	public static final MobEffect SALVATION = register(new SalvationMobEffect());
	public static final MobEffect SOUL_SUPPLEMENT = register(new SoulSupplementMobEffect());
	public static final MobEffect SOUL_SUBDUCTION = register(new SoulSubductionMobEffect());
	public static final MobEffect RUGGED = register(new RuggedMobEffect());
	public static final MobEffect ANTIPODALISM = register(new AntipodalismMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
