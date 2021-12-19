
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OnyxItem extends Item {
	public OnyxItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("onyx");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
