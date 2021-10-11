package net.mcreator.thewetsmp.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.RubyGrapplingHookItem;
import net.mcreator.thewetsmp.item.OnyxGrapplingHookItem;
import net.mcreator.thewetsmp.item.ExplosiveCrabCannonItem;
import net.mcreator.thewetsmp.item.CrabCannonItem;
import net.mcreator.thewetsmp.item.BufferBlasterItem;
import net.mcreator.thewetsmp.item.AquamarineGrapplingHookItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class CrabCannonRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure CrabCannonRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency itemstack for procedure CrabCannonRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((itemstack).getItem() == CrabCannonItem.block) || ((itemstack).getItem() == ExplosiveCrabCannonItem.block))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 30);
		} else if (((itemstack).getItem() == BufferBlasterItem.block)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 300);
		} else if ((((itemstack).getItem() == RubyGrapplingHookItem.block)
				|| (((itemstack).getItem() == AquamarineGrapplingHookItem.block) || ((itemstack).getItem() == OnyxGrapplingHookItem.block)))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 85);
		}
	}
}
