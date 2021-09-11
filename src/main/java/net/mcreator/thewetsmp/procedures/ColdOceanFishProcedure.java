package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

import com.google.common.collect.ImmutableMap;

public class ColdOceanFishProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure ColdOceanFish!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure ColdOceanFish!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean rain = false;
		double sel = 0;
		double luck = 0;
		double unluck = 0;
		double totalluck = 0;
		double rodpower = 0;
		double baitpower = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double cod = 0;
		double salmon = 0;
		double scallop = 0;
		double seaurchin = 0;
		double crab = 0;
		double jellyfish = 0;
		/* fishing factors */
		rain = (boolean) world.getWorldInfo().isRaining();
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.LUCK)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			luck = (double) ((new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.LUCK)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity)) + 1);
		} else {
			luck = (double) 0;
		}
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.UNLUCK)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			unluck = (double) ((new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.UNLUCK)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity)) + 2);
		} else {
			unluck = (double) 0;
		}
		totalluck = (double) (1 + (luck - unluck));
		rodpower = (double) FishingRodCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));
		baitpower = (double) BaitCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity, "world", world));/* loot factors */
		time = (double) (world.getWorldInfo().getDayTime());
		altitude = (double) (Math.floor(y));/* define base values */
		cod = (double) 10;
		salmon = (double) 18;
		scallop = (double) 23;
		seaurchin = (double) 30;
		crab = (double) 37;
		jellyfish = (double) 45;/* apply modifiers */
		if ((totalluck > 1)) {
			cod = (double) (cod - 3);
			salmon = (double) (salmon - 2);
			scallop = (double) (scallop + 5);
			seaurchin = (double) (seaurchin + 4);
			crab = (double) (crab + 0);
			jellyfish = (double) (jellyfish + 2);
		} else if ((totalluck < 0)) {
			cod = (double) (cod + 3);
			salmon = (double) (salmon + 2);
			scallop = (double) (scallop - 2);
			seaurchin = (double) (seaurchin - 4);
			crab = (double) (crab + 2);
			jellyfish = (double) (jellyfish - 3);
		} /* fish */
		fish = (double) crab;
		if (((time > 13000) && (time < 23000))) {
			fish = (double) jellyfish;
		}
		sel = (double) ((new Random()).nextInt((int) fish + 1));
		if (((sel >= 0) && (sel <= cod))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s minecraft:cod 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 2));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("cod"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (((sel >= (cod + 1)) && (sel <= salmon))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s minecraft:salmon 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 2));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("salmon"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (((sel >= (salmon + 1)) && (sel <= scallop))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:scallop 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("scallop"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (((sel >= (scallop + 1)) && (sel <= seaurchin))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:sea_urchin 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 3));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("sea urchin"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (((sel >= (seaurchin + 1)) && (sel <= crab))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:crab 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 5));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("crab"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (((sel >= (crab + 1)) && (sel <= jellyfish))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:blue_jellyfish 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("blue jellyfish"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("selection"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(sel))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("total fish count"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(fish))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("luck"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(luck))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(unluck))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(totalluck))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("cod"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(cod))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("salmon"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(salmon))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("scallop"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(scallop))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("urchin"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(seaurchin))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("crab"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(crab))), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("jelly"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((new java.text.DecimalFormat("##.##").format(jellyfish))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
