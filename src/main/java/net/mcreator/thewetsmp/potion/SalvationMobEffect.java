
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SalvationMobEffect extends MobEffect {
	public SalvationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -205);
		setRegistryName("salvation");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.salvation";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
