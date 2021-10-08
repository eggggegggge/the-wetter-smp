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

public class FlowerForestFishProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure FlowerForestFish!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure FlowerForestFish!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure FlowerForestFish!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure FlowerForestFish!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure FlowerForestFish!");
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
		double jellyfish = 0;
		double luck = 0;
		double koi = 0;
		double goldfish = 0;
		double glowkoi = 0;
		double flowerfish = 0;
		/* fishing factors */
		luck = (double) LuckCheckProcedure.executeProcedure(ImmutableMap.of("entity", entity));/* loot factors */
		time = (double) (world.getWorldInfo().getDayTime());
		altitude = (double) (Math.floor(y));/* define base values */
		koi = (double) 18;
		goldfish = (double) 25;
		flowerfish = (double) 29;
		if ((altitude < 60)) {
			glowkoi = (double) 34;
			jellyfish = (double) 39;/* apply modifiers */
			if ((luck > 1)) {
				koi = (double) (koi + 1);
				goldfish = (double) (goldfish + 2);
				flowerfish = (double) (flowerfish + 4);
				glowkoi = (double) (glowkoi + 7);
				jellyfish = (double) (jellyfish + 10);
			} else if ((luck < 0)) {
				koi = (double) (koi + 2);
				goldfish = (double) (goldfish - 1);
				flowerfish = (double) (flowerfish - 3);
				glowkoi = (double) (glowkoi - 7);
				jellyfish = (double) (jellyfish - 4);
			} /* fish */
			fish = (double) glowkoi;
			if (((time > 13000) && (time < 23000))) {
				fish = (double) jellyfish;
			}
			sel = (double) ((new Random()).nextInt((int) fish + 1));
			if (((sel >= 0) && (sel <= koi))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:koi 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
				}
			} else if (((sel >= (koi + 1)) && (sel <= goldfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:goldfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 6));
				}
			} else if (((sel >= (goldfish + 1)) && (sel <= flowerfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:flowerfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
				}
			} else if (((sel >= (flowerfish + 1)) && (sel <= glowkoi))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:glow_koi 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
				}
			} else if (((sel >= (glowkoi + 1)) && (sel <= jellyfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"give @s the_wet_smp_rehydrated:green_jellyfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
				}
			}
		} else {
			jellyfish = (double) 34;/* apply modifiers */
			if ((luck > 1)) {
				koi = (double) (koi + 1);
				goldfish = (double) (goldfish + 2);
				flowerfish = (double) (flowerfish + 4);
				jellyfish = (double) (jellyfish + 7);
			} else if ((luck < 0)) {
				koi = (double) (koi + 2);
				goldfish = (double) (goldfish - 1);
				flowerfish = (double) (flowerfish - 3);
				jellyfish = (double) (jellyfish - 7);
			} /* fish */
			fish = (double) flowerfish;
			if (((time > 13000) && (time < 23000))) {
				fish = (double) jellyfish;
			}
			sel = (double) ((new Random()).nextInt((int) fish + 1));
			if (((sel >= 0) && (sel <= koi))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:koi 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 4));
				}
			} else if (((sel >= (koi + 1)) && (sel <= goldfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:goldfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 6));
				}
			} else if (((sel >= (goldfish + 1)) && (sel <= flowerfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s the_wet_smp_rehydrated:flowerfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
				}
			} else if (((sel >= (flowerfish + 1)) && (sel <= jellyfish))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					RemoveBaitProcedure.executeProcedure($_dependencies);
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"give @s the_wet_smp_rehydrated:green_jellyfish 1");
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, (y - 0.5), z, (int) 8));
				}
			}
		}
	}
}
