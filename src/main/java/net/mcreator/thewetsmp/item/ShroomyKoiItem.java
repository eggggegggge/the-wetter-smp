
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class ShroomyKoiItem extends Item {
	public ShroomyKoiItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f)

						.build()));
		setRegistryName("shroomy_koi");
	}
}
