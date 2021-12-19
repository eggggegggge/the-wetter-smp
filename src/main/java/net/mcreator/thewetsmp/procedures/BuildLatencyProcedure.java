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

public class BuildLatencyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 1)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 2)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 3)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 4)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 5)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 6)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 7)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 8)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 9)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 10)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 11)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 12)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 13)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 14)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 15)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 16)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 17)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 18)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 19)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 20)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 21)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 22)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 23)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 24)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 25)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 26)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 27)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 28)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 29)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 30)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 31)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 32)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 33)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 34)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 35)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 36)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 37)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 38)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 39)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 40)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 41)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 42)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 43)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) z);
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 44)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 45)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 46)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 47)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 48)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 49)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 50)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 51)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 52)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 1));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 53)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 54)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 55)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 56)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 57)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 58)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 59)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 60)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 61)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 2));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 62)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 63)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 64)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 65)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 66)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 67)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 68)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 69)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 70)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 3));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 71)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 72)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 73)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 74)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 75)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 76)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 77)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 78)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 79)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 4));
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 80)).getItem()instanceof BlockItem _bi
					? _bi.getBlock().defaultBlockState()
					: Blocks.AIR.defaultBlockState());
			world.setBlock(_bp, _bs, 3);
		}
	}
}
