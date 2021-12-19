package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class YN2StoreInfoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 228;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 229;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 230;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 231;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 232;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 233;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 234;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 235;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 236;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z + 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 237;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 238;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 239;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 240;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 241;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 242;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 243;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 244;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 245;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z + 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 246;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 247;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 248;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 249;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 250;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 251;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 252;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 253;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 254;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z + 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 255;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 0;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 1;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 2;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 3;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 4;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 5;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 6;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 7;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z + 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 8;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 9;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 10;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 11;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 12;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 13;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 14;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 15;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) z))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 16;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 17;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 18;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 19;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 20;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 21;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 22;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 23;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 24;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z - 1)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 25;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 26;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 27;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 28;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 29;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 30;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 31;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 32;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 33;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z - 2)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 34;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 35;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 36;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 37;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 38;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 39;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 40;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 41;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 42;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z - 3)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 43;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 44;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 45;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 46;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 47;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 48;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 49;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 50;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 51;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 2), (int) (z - 4)))).getBlock()));
				_setstack.setCount(1);
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}
}
