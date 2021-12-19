package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class ZN3StoreInfoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 255;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 4), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 254;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y - 3), (int) (z - 3)))).getBlock()));
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
				final int _sltid = 253;
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
				final int _sltid = 252;
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
			BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 2), (int) z));
			if (_ent != null) {
				final int _sltid = 251;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getBlock()));
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
				final int _sltid = 250;
				final ItemStack _setstack = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 3)))).getBlock()));
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
