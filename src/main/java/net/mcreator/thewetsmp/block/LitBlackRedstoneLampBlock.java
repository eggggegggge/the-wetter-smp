
package net.mcreator.thewetsmp.block;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.procedures.CustomLampCheckProcedure;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.List;
import java.util.Collections;

public class LitBlackRedstoneLampBlock extends Block {
	public LitBlackRedstoneLampBlock() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.3f).lightLevel(s -> 15));
		setRegistryName("lit_black_redstone_lamp");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public ItemStack getPickBlock(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TheWetSmpRehydratedModBlocks.BLACK_REDSTONE_LAMP);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheWetSmpRehydratedModBlocks.BLACK_REDSTONE_LAMP));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		CustomLampCheckProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			CustomLampCheckProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		} else {
			CustomLampCheckProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		}
		CustomLampCheckProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		CustomLampCheckProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}
}
