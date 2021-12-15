package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.particle.BufferParticleParticle;
import net.mcreator.thewetsmp.TheWetSmpRehydratedModVariables;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class BufferBlasterHitsPlayerProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure BufferBlasterHitsPlayerProcedure!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(BufferParticleParticle.particle, x, y, z, (int) 5, 1, 2, 1, 0);
		}
		if (sourceentity == entity) {
			System.out.println("Buffer blaster hit an invalid target");
		} else {
			if ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHunger == 100
					&& (sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHealth == 100) {
				{
					double _setval = (double) ((sourceentity instanceof PlayerEntity)
							? ((PlayerEntity) sourceentity).getFoodStats().getFoodLevel()
							: 0);
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHunger = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (double) ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1);
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHealth = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (double) (sourceentity.getAir());
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterOxygen = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = (boolean) (sourceentity.isBurning());
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterIgnited = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"execute as @s at @s run particle the_wet_smp_rehydrated:buffer_particle ~ ~1 ~ 0.5 0.5 0.5 0 20 normal");
					}
				}
			} else {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.chime")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.chime")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHealth));
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).getFoodStats()
							.setFoodLevel((int) ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHunger));
				sourceentity.setAir((int) ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterOxygen));
				if ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterIgnited == true) {
					sourceentity.setFire((int) 5);
				}
				{
					double _setval = (double) 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHunger = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (double) 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHealth = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (double) 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterOxygen = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = (boolean) (false);
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterIgnited = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
