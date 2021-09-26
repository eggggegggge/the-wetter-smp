
package net.mcreator.thewetsmp;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.thewetsmp.potion.LuckPotion;
import net.mcreator.thewetsmp.potion.BadLuckPotion;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class BrewBadLuckPotionBrewingRecipe extends TheWetSmpRehydratedModElements.ModElement {
	public BrewBadLuckPotionBrewingRecipe(TheWetSmpRehydratedModElements instance) {
		super(instance, 475);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			Item inputItem = input.getItem();
			return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
					&& PotionUtils.getPotionFromItem(input) == LuckPotion.potionType;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.FERMENTED_SPIDER_EYE;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(input.getItem()), BadLuckPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
