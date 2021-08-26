package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class BuildLatencyProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure BuildLatency!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure BuildLatency!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure BuildLatency!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure BuildLatency!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (12)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (13)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (15)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (16)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (17)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (19)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (20)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (21)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (22)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (23)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (24)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (25)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (26)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (27)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (28)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (29)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (30)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (31)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (32)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (33)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (34)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z + 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (35)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (36)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (37)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (38)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (39)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (40)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (41)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (42)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (43)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) z);
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (44)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (45)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (46)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (47)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (48)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (49)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (50)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (51)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (52)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 1));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (53)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (54)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (55)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (56)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (57)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (58)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (59)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (60)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (61)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 2));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (62)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (63)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (64)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (65)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (66)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (67)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (68)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (69)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (70)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 3));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (71)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (72)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (73)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (74)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (75)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (76)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (77)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (78)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (79)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y + 4), (int) (z - 4));
			BlockState _bs = (new Object() {
				public BlockState toBlock(ItemStack _stk) {
					if (_stk.getItem() instanceof BlockItem) {
						return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
					}
					return Blocks.AIR.getDefaultState();
				}
			}.toBlock((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (80)))));
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
