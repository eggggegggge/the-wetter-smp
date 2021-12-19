
package net.mcreator.thewetsmp.potion;

import net.minecraftforge.client.EffectRenderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiComponent;

import net.mcreator.thewetsmp.procedures.WaterWalkingProcedureProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class WaterWalkingMobEffect extends MobEffect {
	public WaterWalkingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 16777215);
		setRegistryName("water_walking");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.water_walking";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WaterWalkingProcedureProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.EffectRenderer> consumer) {
		consumer.accept(new EffectRenderer() {
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
