
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class WuuthradItem extends AxeItem {
	public WuuthradItem() {
		super(new Tier() {
			public int getUses() {
				return 1062;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("wuuthrad");
	}
}
