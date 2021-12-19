
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.Minecraft;

import net.mcreator.thewetsmp.client.particle.HotAirParticle;
import net.mcreator.thewetsmp.client.particle.BufferParticleParticle;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheWetSmpRehydratedModParticles {
	private static final Map<ParticleType<?>, Function<SpriteSet, ParticleProvider<SimpleParticleType>>> REGISTRY = new HashMap<>();
	public static final SimpleParticleType BUFFER_PARTICLE = register(new SimpleParticleType(false).setRegistryName("buffer_particle"),
			BufferParticleParticle::provider);
	public static final SimpleParticleType HOT_AIR = register(new SimpleParticleType(false).setRegistryName("hot_air"), HotAirParticle::provider);

	private static SimpleParticleType register(ParticleType<?> particle, Function<SpriteSet, ParticleProvider<SimpleParticleType>> provider) {
		REGISTRY.put(particle, provider);
		return (SimpleParticleType) particle;
	}

	@SubscribeEvent
	public static void registerParticleTypes(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new ParticleType[0]));
	}

	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		REGISTRY.forEach((particle, provider) -> Minecraft.getInstance().particleEngine.register((SimpleParticleType) particle,
				spriteSet -> provider.apply(spriteSet)));
	}
}
