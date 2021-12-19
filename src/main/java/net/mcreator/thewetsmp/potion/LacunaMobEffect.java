
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LacunaMobEffect extends MobEffect {
	public LacunaMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092493);
		setRegistryName("lacuna");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.lacuna";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
