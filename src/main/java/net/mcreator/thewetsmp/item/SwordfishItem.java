
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SwordfishItem extends SwordItem {
	public SwordfishItem() {
		super(new Tier() {
			public int getUses() {
				return 1062;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COD), new ItemStack(Items.SALMON), new ItemStack(Items.PUFFERFISH));
			}
		}, 3, -1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		setRegistryName("swordfish");
	}
}
