
package net.mcreator.thewetsmp;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.Potions;
import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.thewetsmp.potion.CombatPotionPotion;
import net.mcreator.thewetsmp.item.NetherragfishItem;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class CombatPotionRecipeBrewingRecipe extends TheWetSmpRehydratedModElements.ModElement {
	public CombatPotionRecipeBrewingRecipe(TheWetSmpRehydratedModElements instance) {
		super(instance, 468);
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
					&& PotionUtils.getPotionFromItem(input) == Potions.AWKWARD;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == NetherragfishItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(input.getItem()), CombatPotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
