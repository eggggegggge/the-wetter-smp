package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

import java.util.concurrent.atomic.AtomicReference;

public class RemoveBaitProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack removal = ItemStack.EMPTY;
		double bait = 0;
		double sel = 0;
		double rngesus = 0;
		double luck = 0;
		bait = 100;
		sel = 2;
		luck = LuckCheckProcedure.execute(entity);
		if (luck > 1) {
			sel = 4;
		} else if (luck < 0) {
			sel = 1;
		}
		rngesus = Math.random() * (sel + 1);
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.GREEN_JELLYFISH) {
						if (bait > 49) {
							bait = 49;
							removal = new ItemStack(TheWetSmpRehydratedModItems.GREEN_JELLYFISH);
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.BLUE_JELLYFISH) {
						if (bait > 49) {
							bait = 49;
							removal = new ItemStack(TheWetSmpRehydratedModItems.BLUE_JELLYFISH);
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.RED_JELLYFISH) {
						if (bait > 49) {
							bait = 49;
							removal = new ItemStack(TheWetSmpRehydratedModItems.RED_JELLYFISH);
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.YELLOW_JELLYFISH) {
						if (bait > 49) {
							bait = 49;
							removal = new ItemStack(TheWetSmpRehydratedModItems.YELLOW_JELLYFISH);
						}
					} else if (itemstackiterator.getItem() == TheWetSmpRehydratedModItems.PINK_JELLYFISH) {
						if (bait > 50) {
							bait = 50;
							removal = new ItemStack(TheWetSmpRehydratedModItems.PINK_JELLYFISH);
						}
					}
				}
			}
		}
		if (rngesus == 0) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = (removal);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
