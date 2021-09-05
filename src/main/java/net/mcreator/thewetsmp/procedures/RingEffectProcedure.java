package net.mcreator.thewetsmp.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.potion.WaterWalkingPotionEffect;
import net.mcreator.thewetsmp.potion.VampirismPotionEffect;
import net.mcreator.thewetsmp.potion.SturdyPotionEffect;
import net.mcreator.thewetsmp.potion.SnackBulwarkPotionEffect;
import net.mcreator.thewetsmp.potion.MotivationPotionEffect;
import net.mcreator.thewetsmp.item.LostRubyRingItem;
import net.mcreator.thewetsmp.item.LostOnyxRingItem;
import net.mcreator.thewetsmp.item.LostLapisRingItem;
import net.mcreator.thewetsmp.item.LostEmeraldRingItem;
import net.mcreator.thewetsmp.item.LostAquamarineRingItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class RingEffectProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure RingEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == LostAquamarineRingItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(WaterWalkingPotionEffect.potion, (int) 1, (int) 0, (true), (false)));
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == LostEmeraldRingItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(SnackBulwarkPotionEffect.potion, (int) 1, (int) 0, (true), (false)));
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == LostLapisRingItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(MotivationPotionEffect.potion, (int) 1, (int) 0, (false), (false)));
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == LostOnyxRingItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(SturdyPotionEffect.potion, (int) 1, (int) 0, (false), (false)));
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == LostRubyRingItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(VampirismPotionEffect.potion, (int) 1, (int) 0, (false), (false)));
		}
	}
}
