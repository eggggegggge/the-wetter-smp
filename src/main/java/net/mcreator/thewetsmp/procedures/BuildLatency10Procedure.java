package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class BuildLatency10Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 2), (int) z), 255)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 3), (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 2), (int) z), 254)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 2), (int) z), 253)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 2), (int) z), 252)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 2), (int) z), 251)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 3));
			BlockState _bs = ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 54)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
	}
}
