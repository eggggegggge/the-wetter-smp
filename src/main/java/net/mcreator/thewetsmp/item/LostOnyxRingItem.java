
package net.mcreator.thewetsmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.procedures.RingEffectProcedure;
import net.mcreator.thewetsmp.TheWetSmpModElements;

import java.util.Map;
import java.util.HashMap;

@TheWetSmpModElements.ModElement.Tag
public class LostOnyxRingItem extends TheWetSmpModElements.ModElement {
	@ObjectHolder("the_wet_smp:onyx_ring")
	public static final Item block = null;
	public LostOnyxRingItem(TheWetSmpModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("onyx_ring");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				RingEffectProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
