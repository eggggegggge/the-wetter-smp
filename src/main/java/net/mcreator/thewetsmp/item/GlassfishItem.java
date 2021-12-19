
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class GlassfishItem extends Item {
	public GlassfishItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("glassfish");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
