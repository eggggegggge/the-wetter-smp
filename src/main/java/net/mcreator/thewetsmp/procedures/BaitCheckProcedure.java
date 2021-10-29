package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.YellowJellyfishItem;
import net.mcreator.thewetsmp.item.TreasurePowderItem;
import net.mcreator.thewetsmp.item.RedJellyfishItem;
import net.mcreator.thewetsmp.item.PinkJellyfishItem;
import net.mcreator.thewetsmp.item.JunkPowderItem;
import net.mcreator.thewetsmp.item.GreenJellyfishItem;
import net.mcreator.thewetsmp.item.DevSalmonItem;
import net.mcreator.thewetsmp.item.BlueJellyfishItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class BaitCheckProcedure {
	public static double executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure BaitCheck!");
			return 0;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure BaitCheck!");
			return 0;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double bait = 0;
		bait = (double) 100;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (((itemstackiterator).getItem() == GreenJellyfishItem.block)) {
						if ((bait > 29)) {
							bait = (double) 29;
						}
						return bait;
					} else if (((itemstackiterator).getItem() == BlueJellyfishItem.block)) {
						if ((bait > 29)) {
							bait = (double) 29;
						}
						return bait;
					} else if (((itemstackiterator).getItem() == RedJellyfishItem.block)) {
						if ((bait > 29)) {
							bait = (double) 29;
						}
						return bait;
					} else if (((itemstackiterator).getItem() == YellowJellyfishItem.block)) {
						if ((bait > 29)) {
							bait = (double) 29;
						}
						return bait;
					} else if (((itemstackiterator).getItem() == PinkJellyfishItem.block)) {
						if ((bait > 30)) {
							bait = (double) 30;
						}
						return bait;
					} else if ((((itemstackiterator).getItem() == TreasurePowderItem.block)
							|| (((itemstackiterator).getItem() == DevSalmonItem.block) || ((itemstackiterator).getItem() == JunkPowderItem.block)))) {
						if ((bait > 0)) {
							bait = (double) 0;
						}
						return bait;
					}
				}
			}
		}
		return 44;
	}
}
