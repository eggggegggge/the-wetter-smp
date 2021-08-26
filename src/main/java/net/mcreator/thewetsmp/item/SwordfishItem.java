
package net.mcreator.thewetsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.thewetsmp.TheWetSmpModElements;

@TheWetSmpModElements.ModElement.Tag
public class SwordfishItem extends TheWetSmpModElements.ModElement {
	@ObjectHolder("the_wet_smp:swordfish")
	public static final Item block = null;
	public SwordfishItem(TheWetSmpModElements instance) {
		super(instance, 331);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1062;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -1f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("swordfish"));
	}
}
