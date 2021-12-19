
package net.mcreator.thewetsmp.potion;

import net.minecraftforge.client.EffectRenderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiComponent;

import net.mcreator.thewetsmp.procedures.AntipodalismAppliedProcedureProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class AntipodalismMobEffect extends MobEffect {
	public AntipodalismMobEffect() {
		super(MobEffectCategory.HARMFUL, -3355444);
		setRegistryName("antipodalism");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.antipodalism";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AntipodalismAppliedProcedureProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.EffectRenderer> consumer) {
		consumer.accept(new EffectRenderer() {
			@Override
			public boolean shouldRender(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean shouldRenderInvText(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean shouldRenderHUD(MobEffectInstance effect) {
				return false;
			}

			@Override
			public void renderInventoryEffect(MobEffectInstance effect, EffectRenderingInventoryScreen<?> gui, PoseStack mStack, int x, int y,
					float z) {
			}

			@Override
			public void renderHUDEffect(MobEffectInstance effect, GuiComponent gui, PoseStack mStack, int x, int y, float z, float alpha) {
			}
		});
	}
}
