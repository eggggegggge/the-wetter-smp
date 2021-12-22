package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.network.TheWetSmpRehydratedModVariables;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModParticles;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

public class BufferBlasterHitsPlayerProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(TheWetSmpRehydratedModParticles.BUFFER_PARTICLE, x, y, z, 5, 1, 2, 1, 0);
		if (sourceentity == entity) {
			TheWetSmpRehydratedMod.LOGGER.info("Buffer blaster hit an invalid target");
		} else {
			if ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHunger == 100
					&& (sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHealth == 100) {
				{
					double _setval = sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHunger = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHealth = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = sourceentity.getAirSupply();
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterOxygen = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = sourceentity.isOnFire();
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterIgnited = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"execute as @s at @s run particle the_wet_smp_rehydrated:buffer_particle ~ ~1 ~ 0.5 0.5 0.5 0 20 normal");
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.chime")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.chime")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) (sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHealth);
				if (sourceentity instanceof Player _player)
					_player.getFoodData()
							.setFoodLevel((int) (sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterHunger);
				sourceentity.setAirSupply((int) (sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterOxygen);
				if ((sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TheWetSmpRehydratedModVariables.PlayerVariables())).bufferBlasterIgnited == true) {
					sourceentity.setSecondsOnFire(5);
				}
				{
					double _setval = 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHunger = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterHealth = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = 100;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterOxygen = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = false;
					sourceentity.getCapability(TheWetSmpRehydratedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bufferBlasterIgnited = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
