
package net.mcreator.thewetsmp.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RuggedMobEffect extends MobEffect {
	public RuggedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434880);
		setRegistryName("rugged");
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_wet_smp_rehydrated.rugged";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
