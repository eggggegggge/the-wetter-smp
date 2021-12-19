
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.thewetsmp.procedures.HaywireProcedureProcedure;

public class HaywireMobEffect extends MobEffect {
	public HaywireMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092340);
		setRegistryName("haywire");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.haywire";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HaywireProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
