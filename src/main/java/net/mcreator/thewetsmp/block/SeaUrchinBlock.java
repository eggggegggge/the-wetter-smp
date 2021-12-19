
package net.mcreator.thewetsmp.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thewetsmp.procedures.ValidPlacementConditionProcedure;
import net.mcreator.thewetsmp.procedures.StungBySeaUrchinProcedureProcedure;
import net.mcreator.thewetsmp.procedures.AdjacentBlockUpdateProcedure;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.List;
import java.util.Collections;

public class SeaUrchinBlock extends Block implements SimpleWaterloggedBlock

{
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SeaUrchinBlock() {
		super(BlockBehaviour.Properties.of(Material.WATER_PLANT).sound(SoundType.HONEY_BLOCK).strength(1f, 10f).noCollission().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
		setRegistryName("sea_urchin");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return box(3.5, 0, 3.5, 12.5, 5, 12.5).move(offset.x, offset.y, offset.z);
			case NORTH :
				return box(3.5, 0, 3.5, 12.5, 5, 12.5).move(offset.x, offset.y, offset.z);
			case EAST :
				return box(3.5, 0, 3.5, 12.5, 5, 12.5).move(offset.x, offset.y, offset.z);
			case WEST :
				return box(3.5, 0, 3.5, 12.5, 5, 12.5).move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return ValidPlacementConditionProcedure.execute(world, x, y, z, blockstate);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return !state.canSurvive(world, currentPos)
				? Blocks.AIR.defaultBlockState()
				: super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_GRAY;
	}

	@Override
	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
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

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		StungBySeaUrchinProcedureProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheWetSmpRehydratedModBlocks.SEA_URCHIN, renderType -> renderType == RenderType.cutout());
	}

}
