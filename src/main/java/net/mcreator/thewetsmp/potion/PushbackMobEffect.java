
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.thewetsmp.procedures.PushbackExpirationProcedureProcedure;
import net.mcreator.thewetsmp.procedures.PushbackAppliedProcedureProcedure;

public class PushbackMobEffect extends MobEffect {
	public PushbackMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26368);
		setRegistryName("pushback");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.pushback";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PushbackAppliedProcedureProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PushbackExpirationProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
