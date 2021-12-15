package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemFishedEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.TreasurePowderItem;
import net.mcreator.thewetsmp.item.JunkPowderItem;
import net.mcreator.thewetsmp.item.DevSalmonItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class FishingProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerFishItem(ItemFishedEvent event) {
			PlayerEntity entity = event.getPlayer();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure FishingProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure FishingProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure FishingProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure FishingProcedure!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure FishingProcedure!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double baitpower = 0;
		double treasure = 0;
		double junk = 0;
		double fish = 0;
		double luck = 0;
		double baitDeterm = 0;
		double wutda = 0;
		if (dependencies.get("event") != null) {
			Object _obj = dependencies.get("event");
			if (_obj instanceof Event) {
				Event _evt = (Event) _obj;
				if (_evt.isCancelable())
					_evt.setCanceled(true);
			}
		}
		baitpower = (double) BaitCheckProcedure
				.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		luck = (double) LuckCheckProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
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
			if (world instanceof World && !world.isRemote()) {
				((World) world)
						.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("the_wet_smp_rehydrated:linebreak")),
								SoundCategory.AMBIENT, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("the_wet_smp_rehydrated:linebreak")),
						SoundCategory.AMBIENT, (float) 1, (float) 1, false);
			}
			RemoveBaitProcedure
					.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("you're fuckin line broked"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else {
			wutda = (double) (Math.random() * (treasure + 1));
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == DevSalmonItem.block) {
				DetermineBiomeProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
								new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent("fishh"), ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == JunkPowderItem.block) {
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent("jank"), ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == TreasurePowderItem.block) {
				TreasureProcedureProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
								new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent("trombone"), ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			} else {
				if (wutda >= 0 && wutda <= fish) {
					DetermineBiomeProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
									new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
									new AbstractMap.SimpleEntry<>("z", z))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("fishh"), ChatType.SYSTEM, Util.DUMMY_UUID);
					}
				} else if (wutda >= fish + 1 && wutda <= junk) {
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("jank"), ChatType.SYSTEM, Util.DUMMY_UUID);
					}
				} else if (wutda >= junk + 1 && wutda <= treasure) {
					TreasureProcedureProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
									new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
									new AbstractMap.SimpleEntry<>("z", z))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("trombone"), ChatType.SYSTEM, Util.DUMMY_UUID);
					}
				}
			}
		}
	}
}
