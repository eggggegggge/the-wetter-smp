
package net.mcreator.thewetsmp.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thewetsmp.procedures.SepiaCarpetValidPlacementProcedure;
import net.mcreator.thewetsmp.procedures.AdjacentBlockUpdateProcedure;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.List;
import java.util.Collections;

public class SepiaCarpetBlock extends Block {
	public SepiaCarpetBlock() {
		super(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).sound(SoundType.WOOL).strength(0.1f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("sepia_carpet");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(0, 0, 0, 16, 1, 16).move(offset.x, offset.y, offset.z);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return SepiaCarpetValidPlacementProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		return !state.canSurvive(world, currentPos)
				? Blocks.AIR.defaultBlockState()
				: super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_ORANGE;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		AdjacentBlockUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheWetSmpRehydratedModBlocks.SEPIA_CARPET, renderType -> renderType == RenderType.cutoutMipped());
	}

}
