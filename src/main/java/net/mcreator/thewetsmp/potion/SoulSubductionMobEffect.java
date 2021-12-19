
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.thewetsmp.procedures.SoulSubductionExpirationProcedureProcedure;
import net.mcreator.thewetsmp.procedures.SoulSubductionAppliedProcedureProcedure;

public class SoulSubductionMobEffect extends MobEffect {
	public SoulSubductionMobEffect() {
		super(MobEffectCategory.HARMFUL, -16755114);
		setRegistryName("soul_subduction");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.soul_subduction";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SoulSubductionAppliedProcedureProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SoulSubductionExpirationProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
