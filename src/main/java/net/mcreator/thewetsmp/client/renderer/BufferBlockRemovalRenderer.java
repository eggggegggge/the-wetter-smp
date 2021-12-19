package net.mcreator.thewetsmp.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.thewetsmp.entity.BufferBlockRemovalEntity;

public class BufferBlockRemovalRenderer extends HumanoidMobRenderer<BufferBlockRemovalEntity, HumanoidModel<BufferBlockRemovalEntity>> {
	public BufferBlockRemovalRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(BufferBlockRemovalEntity entity) {
		return new ResourceLocation("the_wet_smp_rehydrated:textures/buffer_texture_map.png");
	}
}
