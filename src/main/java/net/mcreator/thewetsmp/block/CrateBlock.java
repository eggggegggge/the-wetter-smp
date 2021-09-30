
package net.mcreator.thewetsmp.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.thewetsmp.TheWetSmpRehydratedModElements;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class CrateBlock extends TheWetSmpRehydratedModElements.ModElement {
	@ObjectHolder("the_wet_smp_rehydrated:crate")
	public static final Block block = null;
	public CrateBlock(TheWetSmpRehydratedModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.AXE).setRequiresTool());
			setRegistryName("crate");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
