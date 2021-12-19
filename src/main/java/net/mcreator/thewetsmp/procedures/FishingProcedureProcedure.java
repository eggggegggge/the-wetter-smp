package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemFishedEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.client.Minecraft;
import net.minecraft.Util;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FishingProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerFishItem(ItemFishedEvent event) {
		Player entity = event.getPlayer();
		execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double baitpower = 0;
		double treasure = 0;
		double junk = 0;
		double fish = 0;
		double luck = 0;
		double baitDeterm = 0;
		double wutda = 0;
		if (event != null && event.isCancelable()) {
			event.setCanceled(true);
		}
		baitpower = (double) BaitCheckProcedure.execute(world, entity);
		luck = (double) LuckCheckProcedure.execute(entity);
		fish = (double) 50;
		junk = (double) 87;
		treasure = (double) 99;
		if (luck > 1) {
			fish = (double) 69;
			junk = (double) 79;
			treasure = (double) 99;
		} else if (luck < 0) {
			fish = (double) 39;
			junk = (double) 89;
			treasure = (double) 99;
		}
		baitDeterm = (double) (Math.random() * 100);
		if (baitDeterm < baitpower) {
			if (world instanceof Level _level)
				_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_wet_smp_rehydrated:linebreak")), SoundSource.AMBIENT, 1, 1);
			RemoveBaitProcedure.execute(world, entity);
			if (!world.isClientSide()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().broadcastMessage(new TextComponent("you're fuckin line broked"), ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else {
			wutda = (double) (Math.random() * (treasure + 1));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.getItem() == TheWetSmpRehydratedModItems.DEV_SALMON) {
				DetermineAllBiomesProcedure.execute(world, x, y, z, entity);
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("fishh"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.getItem() == TheWetSmpRehydratedModItems.JUNK_POWDER) {
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("jank"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.getItem() == TheWetSmpRehydratedModItems.TREASURE_POWDER) {
				TreasureProcedureProcedure.execute(world, x, y, z, entity);
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("trombone"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			} else {
				if (wutda >= 0 && wutda <= fish) {
					DetermineAllBiomesProcedure.execute(world, x, y, z, entity);
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("fishh"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				} else if (wutda >= fish + 1 && wutda <= junk) {
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("jank"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				} else if (wutda >= junk + 1 && wutda <= treasure) {
					TreasureProcedureProcedure.execute(world, x, y, z, entity);
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("trombone"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
		}
	}
}
