
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(64, 64).setRegistryName("city_beacon"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("prehydrated"));
	}
}
