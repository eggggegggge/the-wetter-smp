
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class StrangeGelItem extends Item {
	public StrangeGelItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("strange_gel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
