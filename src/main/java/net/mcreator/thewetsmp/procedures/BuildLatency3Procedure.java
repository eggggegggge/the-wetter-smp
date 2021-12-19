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

public class BuildLatency3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 162)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 163)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 164)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 165)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 166)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 167)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 168)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 169)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 170)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 171)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 172)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 173)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 174)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 175)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 176)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 177)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 178)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 179)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 180)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 181)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 182)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 183)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 184)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 185)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 186)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 187)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 188)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 189)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 190)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 191)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 192)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 193)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 194)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 195)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 196)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 197)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 198)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 199)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 200)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 201)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 202)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 203)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 204)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 205)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 206)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 207)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 208)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 209)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 210)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 211)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 212)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 213)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 214)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 215)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 216)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 217)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 218)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 219)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 220)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 221)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 222)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 223)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 224)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 225)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 226)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 227)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 228)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 229)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 230)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 231)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 232)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 233)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 234)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 235)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 236)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 237)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 238)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 239)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 240)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 241)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 2), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 242)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
	}
}
