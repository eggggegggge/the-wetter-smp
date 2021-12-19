
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class FaienceScarabItem extends Item {
	public FaienceScarabItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("faience_scarab");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
