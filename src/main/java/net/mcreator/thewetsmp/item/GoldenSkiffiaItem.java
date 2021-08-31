
package net.mcreator.thewetsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.thewetsmp.itemgroup.FishingItemGroup;
import net.mcreator.thewetsmp.TheWetSmpModElements;

@TheWetSmpModElements.ModElement.Tag
public class GoldenSkiffiaItem extends TheWetSmpModElements.ModElement {
	@ObjectHolder("the_wet_smp:golden_skiffia")
	public static final Item block = null;
	public GoldenSkiffiaItem(TheWetSmpModElements instance) {
		super(instance, 362);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(FishingItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(2f).meat().build()));
			setRegistryName("golden_skiffia");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
