
package net.mcreator.thewetsmp.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.state.properties.SlabType;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.thewetsmp.TheWetSmpRehydratedModElements;

import java.util.List;
import java.util.Collections;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class PolishedScaleslateSlabBlock extends TheWetSmpRehydratedModElements.ModElement {
	@ObjectHolder("the_wet_smp_rehydrated:polished_scaleslate_slab")
	public static final Block block = null;

	public PolishedScaleslateSlabBlock(TheWetSmpRehydratedModElements instance) {
		super(instance, 591);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.NETHER_BRICK).hardnessAndResistance(3.5f, 6f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("polished_scaleslate_slab");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
