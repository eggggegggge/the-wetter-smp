
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheWetSmpRehydratedModTabs {
	public static CreativeModeTab TAB_FISHING;

	public static void load() {
		TAB_FISHING = new CreativeModeTab("tabfishing") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheWetSmpRehydratedModItems.KOI);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
