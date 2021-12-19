package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class YN1StoreInfoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
			if (_ent != null) {
				final int _sltid = 148;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 149;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 150;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 151;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 152;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 153;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 154;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 155;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 156;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z + 4)))).getBlock()));
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
				final int _sltid = 157;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 158;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 159;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 160;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 161;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 162;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 163;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 164;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 165;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z + 3)))).getBlock()));
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
				final int _sltid = 166;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 167;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 168;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 169;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 170;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 171;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 172;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 173;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 174;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z + 2)))).getBlock()));
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
				final int _sltid = 175;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 176;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 177;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 178;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 179;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 180;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 181;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 182;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 183;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z + 1)))).getBlock()));
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
				final int _sltid = 184;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 185;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 186;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 187;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 188;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 189;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 190;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 191;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) z))).getBlock()));
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
				final int _sltid = 192;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 193;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 194;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 195;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 196;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 197;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 198;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 199;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 200;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z - 1)))).getBlock()));
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
				final int _sltid = 201;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 202;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 203;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 204;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 205;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 206;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 207;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 208;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 209;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z - 2)))).getBlock()));
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
				final int _sltid = 210;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 211;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 212;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 213;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 214;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 215;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 216;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 217;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 218;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 219;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 4), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 220;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 3), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 221;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 222;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 223;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 224;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 225;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 226;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 3), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
				final int _sltid = 227;
				final ItemStack _setstack = (new ItemStack(
						(world.getBlockState(new BlockPos((int) (x - 4), (int) (y - 1), (int) (z - 4)))).getBlock()));
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
