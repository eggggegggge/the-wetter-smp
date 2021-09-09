package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.GreenJellyfishItem;
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
		bait = (double) 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (((itemstackiterator).getItem() == GreenJellyfishItem.block)) {
						if ((bait < 15)) {
							bait = (double) 15;
							if (!world.isRemote()) {
								MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
								if (mcserv != null)
									mcserv.getPlayerList().func_232641_a_(new StringTextComponent("green"), ChatType.SYSTEM, Util.DUMMY_UUID);
							}
						}
						return bait;
					}
				}
			}
		}
		return 0;
	}
}
