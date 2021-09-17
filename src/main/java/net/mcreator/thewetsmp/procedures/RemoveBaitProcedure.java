package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.GreenJellyfishItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class RemoveBaitProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure RemoveBait!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure RemoveBait!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack removal = ItemStack.EMPTY;
		double bait = 0;
		double sel = 0;
		double rngesus = 0;
		double luck = 0;
		bait = (double) 100;
		sel = (double) 2;
		luck = (double) LuckCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));
		if ((luck > 1)) {
			sel = (double) 4;
		} else if ((luck < 0)) {
			sel = (double) 1;
		}
		rngesus = (double) ((new Random()).nextInt((int) sel + 1));
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (((itemstackiterator).getItem() == GreenJellyfishItem.block)) {
						if ((bait > 49)) {
							bait = (double) 49;
							removal = new ItemStack(GreenJellyfishItem.block);
						}
					}
				}
			}
		}
		if ((rngesus == 0)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = (removal);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
