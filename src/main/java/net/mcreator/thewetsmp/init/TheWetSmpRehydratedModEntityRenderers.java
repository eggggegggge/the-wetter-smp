
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.thewetsmp.client.renderer.BufferBlockRemovalRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheWetSmpRehydratedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.BUFFER_BLOCK_REMOVAL, BufferBlockRemovalRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.RUBY_GRAPPLING_HOOK, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.AQUAMARINE_GRAPPLING_HOOK, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.ONYX_GRAPPLING_HOOK, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.CRAB_CANNON, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.EXPLOSIVE_CRAB_CANNON, ThrownItemRenderer::new);
		event.registerEntityRenderer(TheWetSmpRehydratedModEntities.BUFFER_BLASTER, ThrownItemRenderer::new);
	}
}
