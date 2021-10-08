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

public class WarmOceanFishProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure WarmOceanFish!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure WarmOceanFish!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure WarmOceanFish!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure WarmOceanFish!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure WarmOceanFish!");
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
		double scallop = 0;
		double seaurchin = 0;
		double crab = 0;
		double jellyfish = 0;
		double luck = 0;
		double pufferfish = 0;
		double clownfish = 0;
		double koi = 0;
		double seahorse = 0;
		double humuhumunukunukuapuaa = 0;
		double cuttlefish = 0;
		/* fishing factors */
		luck = (double) LuckCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));/* loot factors */
		time = (double) (world.getWorldInfo().getDayTime());
		altitude = (double) (Math.floor(y));/* define base values */
		pufferfish = (double) 10;
		clownfish = (double) 18;
		koi = (double) 23;
		scallop = (double) 30;
		seahorse = (double) 35;
		seaurchin = (double) 40;
		crab = (double) 45;
		cuttlefish = (double) 48;
		humuhumunukunukuapuaa = (double) 49;
		jellyfish = (double) 55;/* apply modifiers */
		if ((luck > 1)) {
			pufferfish = (double) (pufferfish - 3);
			clownfish = (double) (clownfish - 2);
			koi = (double) (koi + 0);
			scallop = (double) (scallop + 1);
			seahorse = (double) (seahorse + 3);
			seaurchin = (double) (seaurchin + 0);
			crab = (double) (crab + 0);
			cuttlefish = (double) (cuttlefish + 4);
			humuhumunukunukuapuaa = (double) (humuhumunukunukuapuaa + 8);
			jellyfish = (double) (jellyfish + 2);
		} else if ((luck < 0)) {
			pufferfish = (double) (pufferfish + 5);
			clownfish = (double) (clownfish - 2);
			koi = (double) (koi - 4);
			scallop = (double) (scallop - 4);
			seahorse = (double) (scallop - 5);
			seaurchin = (double) (seaurchin + 3);
			crab = (double) (crab + 5);
			cuttlefish = (double) (cuttlefish + 3);
			humuhumunukunukuapuaa = (double) (humuhumunukunukuapuaa + 3);
			jellyfish = (double) (jellyfish + 2);
		} /* fish */
		fish = (double) humuhumunukunukuapuaa;
		if (((time > 13000) && (time < 23000))) {
			fish = (double) jellyfish;
		}
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
		} else if (((sel >= (clownfish + 1)) && (sel <= koi))) {
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
							"give @s the_wet_smp_rehydrated:koi 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
			}
		} else if (((sel >= (koi + 1)) && (sel <= scallop))) {
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
							"give @s the_wet_smp_rehydrated:seahorse 1");
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
		} else if (((sel >= (seaurchin + 1)) && (sel <= crab))) {
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
							"give @s the_wet_smp_rehydrated:crab 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 5));
			}
		} else if (((sel >= (crab + 1)) && (sel <= cuttlefish))) {
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
							"give @s the_wet_smp_rehydrated:cuttlefish 1");
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 2));
			}
		} else if (((sel >= (cuttlefish + 1)) && (sel <= humuhumunukunukuapuaa))) {
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
		}
	}
}
