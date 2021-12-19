package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

public class CrabCannonRangedItemUsedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == TheWetSmpRehydratedModItems.CRAB_CANNON
				|| itemstack.getItem() == TheWetSmpRehydratedModItems.EXPLOSIVE_CRAB_CANNON) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
		} else if (itemstack.getItem() == TheWetSmpRehydratedModItems.BUFFER_BLASTER) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
		} else if (itemstack.getItem() == TheWetSmpRehydratedModItems.RUBY_GRAPPLING_HOOK
				|| itemstack.getItem() == TheWetSmpRehydratedModItems.AQUAMARINE_GRAPPLING_HOOK
				|| itemstack.getItem() == TheWetSmpRehydratedModItems.ONYX_GRAPPLING_HOOK) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 85);
		}
	}
}
