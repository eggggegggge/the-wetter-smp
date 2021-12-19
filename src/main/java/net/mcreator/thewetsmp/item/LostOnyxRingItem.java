
package net.mcreator.thewetsmp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.procedures.RingEffectProcedure;

public class LostOnyxRingItem extends Item {
	public LostOnyxRingItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("onyx_ring");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RingEffectProcedure.execute(entity);
	}
}
