package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class GiveThanosAdvancementProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(TheWetSmpRehydratedModItems.AQUAMARINE_RING))
				: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(TheWetSmpRehydratedModItems.EMERALD_RING))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(TheWetSmpRehydratedModItems.LAPIS_RING))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(TheWetSmpRehydratedModItems.ONYX_RING))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(TheWetSmpRehydratedModItems.RUBY_RING))
						: false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("the_wet_smp_rehydrated:get_all_rings"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
