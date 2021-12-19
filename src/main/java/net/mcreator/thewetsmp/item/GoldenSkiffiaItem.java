
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class GoldenSkiffiaItem extends Item {
	public GoldenSkiffiaItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(2f)

						.meat().build()));
		setRegistryName("golden_skiffia");
	}
}
