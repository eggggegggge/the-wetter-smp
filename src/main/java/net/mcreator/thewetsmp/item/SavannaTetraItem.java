
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class SavannaTetraItem extends Item {
	public SavannaTetraItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f)

						.meat().build()));
		setRegistryName("savanna_tetra");
	}
}
