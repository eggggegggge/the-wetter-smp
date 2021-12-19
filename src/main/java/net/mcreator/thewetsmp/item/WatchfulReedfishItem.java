
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class WatchfulReedfishItem extends Item {
	public WatchfulReedfishItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("watchful_reedfish");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
