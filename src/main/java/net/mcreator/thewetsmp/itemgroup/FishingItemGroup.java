
package net.mcreator.thewetsmp.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.thewetsmp.item.KoiItem;
import net.mcreator.thewetsmp.TheWetSmpModElements;

@TheWetSmpModElements.ModElement.Tag
public class FishingItemGroup extends TheWetSmpModElements.ModElement {
	public FishingItemGroup(TheWetSmpModElements instance) {
		super(instance, 334);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfishing") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KoiItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
