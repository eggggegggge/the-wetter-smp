package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class OnyxGrapple1Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure OnyxGrapple1!");
			return;
		}
		if (dependencies.get("imediatesourceentity") == null) {
			if (!dependencies.containsKey("imediatesourceentity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency imediatesourceentity for procedure OnyxGrapple1!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity imediatesourceentity = (Entity) dependencies.get("imediatesourceentity");
		imediatesourceentity.setNoGravity((true));
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (!imediatesourceentity.world.isRemote())
					imediatesourceentity.remove();
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 40);
	}
}
