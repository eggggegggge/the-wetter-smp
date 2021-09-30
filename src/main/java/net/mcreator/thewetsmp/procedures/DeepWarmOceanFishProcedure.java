package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

public class DeepWarmOceanFishProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure DeepWarmOceanFish!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure DeepWarmOceanFish!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure DeepWarmOceanFish!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure DeepWarmOceanFish!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure DeepWarmOceanFish!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double luck = 0;
		double pufferfish = 0;
		double clownfish = 0;
		double scallop = 0;
		double seahorse = 0;
		double seaurchin = 0;
		double humuhumunukunukuapuaa = 0;
		double jellyfish = 0;
		/* fishing factors */
		luck = (double) LuckCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));/* loot factors */
		time = (double) (world.getWorldInfo().getDayTime());
		altitude = (double) (Math.floor(y));/* define base values */
		pufferfish = (double) 12;
		clownfish = (double) 15;
		scallop = (double) 20;
		seahorse = (double) 24;
		seaurchin = (double) 32;
		humuhumunukunukuapuaa = (double) 34;
		jellyfish = (double) 40;/* apply modifiers */
		if ((luck > 1)) {
			pufferfish = (double) (pufferfish - 3);
			clownfish = (double) (clownfish + 2);
			scallop = (double) (scallop - 1);
			seahorse = (double) (seahorse + 2);
			seaurchin = (double) (seaurchin - 4);
			humuhumunukunukuapuaa = (double) (humuhumunukunukuapuaa + 2);
			jellyfish = (double) (jellyfish - 1);
		} else if ((luck < 0)) {
			pufferfish = (double) (pufferfish + 4);
			clownfish = (double) (clownfish + 2);
			scallop = (double) (scallop + 1);
			seahorse = (double) (seahorse + 2);
			seaurchin = (double) (seaurchin + 2);
			humuhumunukunukuapuaa = (double) (humuhumunukunukuapuaa + 1);
			jellyfish = (double) (jellyfish + 1);
		} /* fish */
		fish = (double) jellyfish;
		sel = (double) ((new Random()).nextInt((int) fish + 1));
		if (((sel >= 0) && (sel <= pufferfish))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s minecraft:pufferfish 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 3));
			}
		} else if (((sel >= (pufferfish + 1)) && (sel <= clownfish))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s minecraft:tropical_fish 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
			}
		} else if (((sel >= (clownfish + 1)) && (sel <= scallop))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
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
		} else if (((sel >= (scallop + 1)) && (sel <= seahorse))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:sea_horse 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
			}
		} else if (((sel >= (seahorse + 1)) && (sel <= seaurchin))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
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
		} else if (((sel >= (seaurchin + 1)) && (sel <= humuhumunukunukuapuaa))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s the_wet_smp_rehydrated:humuhumunukunukuapua_a 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
			}
		} else if (((sel >= (humuhumunukunukuapuaa + 1)) && (sel <= jellyfish))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				RemoveBaitProcedure.executeProcedure($_dependencies);
			}
			if (((time > 13000) && (time < 23000))) {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"give @s the_wet_smp_rehydrated:blue_jellyfish 1");
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:nautilus 1");
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
			}
		}
	}
}
