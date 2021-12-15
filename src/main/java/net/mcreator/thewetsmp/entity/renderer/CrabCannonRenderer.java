package net.mcreator.thewetsmp.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.thewetsmp.item.CrabCannonItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrabCannonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrabCannonItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<CrabCannonItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("the_wet_smp_rehydrated:textures/crab_projectile.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(CrabCannonItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelcrab();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(CrabCannonItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelcrab extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;

		public Modelcrab() {
			textureWidth = 16;
			textureHeight = 16;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bone, 0, 0, -3.0F, -3.0F, -2.0F, 6, 2, 4, 0.0F, false);
			addBoxHelper(bone, 0, 6, -2.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(bone, 0, 6, 1.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(bone, 4, 6, 3.0F, -4.5F, -1.0F, 3, 2, 3, 0.0F, false);
			addBoxHelper(bone, 4, 6, -6.0F, -4.5F, -1.0F, 3, 2, 3, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-3.5F, 23.0F, 0.5F);
			setRotationAngle(bone2, 0.6981F, 0.0F, 0.5236F);
			addBoxHelper(bone2, 0, 0, -0.5F, -0.5F, 0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(bone2, 0, 0, -0.5F, -2.5F, -1.5F, 1, 2, 1, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-3.5F, 23.0F, 0.5F);
			setRotationAngle(bone3, 0.6981F, 0.0F, -0.5236F);
			addBoxHelper(bone3, 0, 0, 5.5F, 2.0F, -1.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(bone3, 0, 0, 5.5F, 0.0F, -3.5F, 1, 2, 1, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone4, 0.0F, 0.0F, -2.7925F);
			addBoxHelper(bone4, 4, 6, 4.3F, 3.0F, -1.0F, 3, 2, 3, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 23.0F, 0.0F);
			setRotationAngle(bone5, 0.0F, 0.0F, 2.7925F);
			addBoxHelper(bone5, 4, 6, -7.0F, 2.0F, -1.0F, 3, 2, 3, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone4.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone5.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
