
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "buffer.latency"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "buffer.latency")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "buffer.new_latency"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "buffer.new_latency")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "crabcannon"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "crabcannon")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "linebreak"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "linebreak")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "sea_urchin.step"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "sea_urchin.step")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "singing_bass.sing"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "singing_bass.sing")));
		REGISTRY.put(new ResourceLocation("the_wet_smp_rehydrated", "disc.troll"),
				new SoundEvent(new ResourceLocation("the_wet_smp_rehydrated", "disc.troll")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
