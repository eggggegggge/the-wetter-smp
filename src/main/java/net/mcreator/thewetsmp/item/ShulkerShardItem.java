
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ShulkerShardItem extends Item {
	public ShulkerShardItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("shulker_shard");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
