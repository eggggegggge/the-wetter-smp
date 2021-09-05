
package net.mcreator.thewetsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.thewetsmp.itemgroup.FishingItemGroup;
import net.mcreator.thewetsmp.TheWetSmpRehydratedModElements;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class HumuhumunukunukuapuaAItem extends TheWetSmpRehydratedModElements.ModElement {
	@ObjectHolder("the_wet_smp_rehydrated:humuhumunukunukuapua_a")
	public static final Item block = null;
	public HumuhumunukunukuapuaAItem(TheWetSmpRehydratedModElements instance) {
		super(instance, 372);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(FishingItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.7f).setAlwaysEdible().meat().build()));
			setRegistryName("humuhumunukunukuapua_a");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
