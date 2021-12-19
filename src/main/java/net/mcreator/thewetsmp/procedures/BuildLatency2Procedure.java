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

public class BuildLatency2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 81)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 82)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 83)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 84)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 85)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 86)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 87)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 88)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 89)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 90)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 91)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 92)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 93)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 94)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 95)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 96)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 97)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 98)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 99)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 100)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 101)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 102)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 103)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 104)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 105)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 106)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 107)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 108)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 109)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 110)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 111)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 112)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 113)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 114)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 115)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 116)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 117)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 118)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 119)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 120)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 121)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 122)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 123)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 124)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 125)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 126)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 127)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 128)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 129)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 130)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 131)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 132)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 133)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 134)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 135)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 136)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 137)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 138)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 139)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 140)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 141)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 142)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 143)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 144)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 145)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 146)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 147)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 148)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 149)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 150)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 151)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 152)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 153)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 154)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 155)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 156)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 157)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 158)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 159)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 160)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 161)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
	}
}
