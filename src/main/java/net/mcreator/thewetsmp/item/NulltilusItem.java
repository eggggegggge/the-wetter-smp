
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class NulltilusItem extends Item {
	public NulltilusItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("nulltilus");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
