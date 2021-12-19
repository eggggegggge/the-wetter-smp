
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class EffervescentWatcherItem extends Item {
	public EffervescentWatcherItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.3f)

						.meat().build()));
		setRegistryName("effervescent_watcher");
	}
}
