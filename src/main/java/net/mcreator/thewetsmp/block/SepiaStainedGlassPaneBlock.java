
package net.mcreator.thewetsmp.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.List;
import java.util.Collections;

public class SepiaStainedGlassPaneBlock extends IronBarsBlock {
	public SepiaStainedGlassPaneBlock() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.3f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("sepia_stained_glass_pane");
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.352941176471f, 0.274509803922f, 0.211764705882f};
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(Blocks.AIR));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheWetSmpRehydratedModBlocks.SEPIA_STAINED_GLASS_PANE,
				renderType -> renderType == RenderType.translucent());
	}

}
