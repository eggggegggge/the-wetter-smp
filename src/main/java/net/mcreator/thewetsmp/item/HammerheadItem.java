
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class HammerheadItem extends PickaxeItem {
	public HammerheadItem() {
		super(new Tier() {
			public int getUses() {
				return 1062;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COD), new ItemStack(Items.SALMON), new ItemStack(Items.PUFFERFISH),
						new ItemStack(Items.TROPICAL_FISH));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("hammerhead");
	}
}
