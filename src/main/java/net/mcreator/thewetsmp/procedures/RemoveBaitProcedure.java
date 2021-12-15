package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.YellowJellyfishItem;
import net.mcreator.thewetsmp.item.RedJellyfishItem;
import net.mcreator.thewetsmp.item.PinkJellyfishItem;
import net.mcreator.thewetsmp.item.GreenJellyfishItem;
import net.mcreator.thewetsmp.item.BlueJellyfishItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.stream.Stream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class RemoveBaitProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure RemoveBait!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure RemoveBait!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack removal = ItemStack.EMPTY;
		double bait = 0;
		double sel = 0;
		double rngesus = 0;
		double luck = 0;
		bait = (double) 100;
		sel = (double) 2;
		luck = (double) LuckCheckProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		if (luck > 1) {
			sel = (double) 4;
		} else if (luck < 0) {
			sel = (double) 1;
		}
		rngesus = (double) (Math.random() * (sel + 1));
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == GreenJellyfishItem.block) {
						if (bait > 49) {
							bait = (double) 49;
							removal = new ItemStack(GreenJellyfishItem.block);
						}
					} else if (itemstackiterator.getItem() == BlueJellyfishItem.block) {
						if (bait > 49) {
							bait = (double) 49;
							removal = new ItemStack(BlueJellyfishItem.block);
						}
					} else if (itemstackiterator.getItem() == RedJellyfishItem.block) {
						if (bait > 49) {
							bait = (double) 49;
							removal = new ItemStack(RedJellyfishItem.block);
						}
					} else if (itemstackiterator.getItem() == YellowJellyfishItem.block) {
						if (bait > 49) {
							bait = (double) 49;
							removal = new ItemStack(YellowJellyfishItem.block);
						}
					} else if (itemstackiterator.getItem() == PinkJellyfishItem.block) {
						if (bait > 50) {
							bait = (double) 50;
							removal = new ItemStack(PinkJellyfishItem.block);
						}
					}
				}
			}
		}
		if (rngesus == 0) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = (removal);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
