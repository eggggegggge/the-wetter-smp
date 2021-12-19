
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PeaceMobEffect extends MobEffect {
	public PeaceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26113);
		setRegistryName("peace");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.peace";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
