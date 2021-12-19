
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModTabs;

public class HumuhumunukunukuapuaAItem extends Item {
	public HumuhumunukunukuapuaAItem() {
		super(new Item.Properties().tab(TheWetSmpRehydratedModTabs.TAB_FISHING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.7f).alwaysEat().meat().build()));
		setRegistryName("humuhumunukunukuapua_a");
	}
}
