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

public class BuildLatency4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 243)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 244)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 245)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 246)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 247)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 248)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 249)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 250)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 251)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 252)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 253)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 254)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 255)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 0)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 1)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 2)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 3)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 4)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 5)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 6)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 7)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 8)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 9)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 10)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 11)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 12)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 13)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 14)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 15)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 16)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 17)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 18)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 19)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 20)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 21)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 22)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 23)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 24)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 25)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 26)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 27)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 28)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 29)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 30)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 31)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 32)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 33)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 34)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 35)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 36)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 37)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 38)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 39)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 40)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 41)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 42)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 43)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 44)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 45)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 46)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 47)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 48)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 49)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 50)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 51)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 52)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 53)).getItem()instanceof BlockItem _bi
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (y - 1)), 54)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 55)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 56)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 57)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 58)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 59)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 60)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 61)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 62)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 63)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 64)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 65)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 66)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 1), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) (y - 1), (int) z), 67)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
	}
}
