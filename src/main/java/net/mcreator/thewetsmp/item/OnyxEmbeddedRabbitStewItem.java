
package net.mcreator.thewetsmp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.thewetsmp.procedures.OnEatProcedure;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

public class OnyxEmbeddedRabbitStewItem extends Item {
	public OnyxEmbeddedRabbitStewItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(12f)

						.meat().build()));
		setRegistryName("onyx_embedded_rabbit_stew");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(TheWetSmpRehydratedModItems.ONYX_EMBEDDED_BOWL);
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OnEatProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
