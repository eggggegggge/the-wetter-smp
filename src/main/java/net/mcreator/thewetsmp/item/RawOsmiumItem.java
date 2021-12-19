
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RawOsmiumItem extends Item {
	public RawOsmiumItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("raw_osmium");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
