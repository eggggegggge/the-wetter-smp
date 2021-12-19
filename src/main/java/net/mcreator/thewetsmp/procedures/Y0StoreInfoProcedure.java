package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class Y0StoreInfoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 68;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 69;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 70;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 71;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 72;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 73;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 74;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 75;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 76;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 77;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 78;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 79;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 80;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 81;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 82;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 83;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 84;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 85;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 86;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 87;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 88;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 89;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 90;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 91;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 92;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 93;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 94;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 95;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 96;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 97;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 98;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 99;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 100;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 101;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 102;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 103;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 104;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 105;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 106;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 107;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 108;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 109;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 110;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 111;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) z))).getBlock()));
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
				final int _sltid = 112;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 113;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 114;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 115;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 116;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 117;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 118;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 119;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 120;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 121;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 122;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 123;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 124;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 125;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 126;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 127;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 128;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 129;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 130;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 131;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 132;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 133;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 134;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 135;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 136;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 137;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 138;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 139;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 140;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 141;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 142;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 143;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 144;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 145;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 146;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 147;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y + 0), (int) (z - 4)))).getBlock()));
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
