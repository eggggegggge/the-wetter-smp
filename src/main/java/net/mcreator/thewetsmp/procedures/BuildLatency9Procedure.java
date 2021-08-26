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

public class BuildLatency9Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure BuildLatency9!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure BuildLatency9!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure BuildLatency9!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure BuildLatency9!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (133)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (134)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (135)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (136)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (137)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (138)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (139)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (140)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z + 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (141)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (142)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (143)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (144)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (145)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (146)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (147)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (148)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (149)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z + 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (150)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (151)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (152)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (153)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (154)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (155)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (156)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (157)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (158)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z + 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (159)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (160)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (161)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (162)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (163)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (164)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (165)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (166)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (167)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z + 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (168)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (169)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (170)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (171)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (172)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (173)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (174)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (175)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (176)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) z);
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (177)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (178)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (179)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (180)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (181)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (182)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (183)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (184)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (185)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z - 1));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (186)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (187)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (188)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (189)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (190)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (191)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (192)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (193)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (194)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z - 2));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (195)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (196)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (197)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (198)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (199)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (201)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (202)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (203)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z - 3));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (204)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 4), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (205)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 3), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (206)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (207)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (208)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (209)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (210)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (211)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 3), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (212)))));
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x - 4), (int) (y - 4), (int) (z - 4));
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
			}.getItemStack(new BlockPos((int) x, (int) (y - 2), (int) z), (int) (213)))));
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
