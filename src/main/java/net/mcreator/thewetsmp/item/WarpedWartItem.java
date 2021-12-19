
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class WarpedWartItem extends Item {
	public WarpedWartItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("warped_wart");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
