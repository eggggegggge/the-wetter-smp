package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

import java.util.concurrent.atomic.AtomicReference;

public class BaitCheckProcedure {
	public static double execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return 0;
		double bait = 0;
		bait = (double) 44;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.GREEN_JELLYFISH) {
						if (bait > 29) {
							bait = (double) 29;
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.BLUE_JELLYFISH) {
						if (bait > 29) {
							bait = (double) 29;
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.RED_JELLYFISH) {
						if (bait > 29) {
							bait = (double) 29;
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.YELLOW_JELLYFISH) {
						if (bait > 29) {
							bait = (double) 29;
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.PINK_JELLYFISH) {
						if (bait > 30) {
							bait = (double) 30;
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.TREASURE_POWDER
							|| itemstackiterator.getItem() == TheWetSmpRehydratedModItems.DEV_SALMON
							|| itemstackiterator.getItem() == TheWetSmpRehydratedModItems.JUNK_POWDER) {
						if (bait > 0) {
							bait = (double) 0;
						}
					}
				}
			}
		}
		return bait;
	}
}
