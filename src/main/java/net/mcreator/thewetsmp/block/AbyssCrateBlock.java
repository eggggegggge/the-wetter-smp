
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
public class AbyssCrateBlock extends TheWetSmpRehydratedModElements.ModElement {
	@ObjectHolder("the_wet_smp_rehydrated:abyss_crate")
	public static final Block block = null;

	public AbyssCrateBlock(TheWetSmpRehydratedModElements instance) {
		super(instance, 541);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("abyss_crate");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
