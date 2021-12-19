package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TreasureProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("desert").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("desert_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("desert_lakes").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"loot give @s loot the_wet_smp_rehydrated:desert_treasure");
			}
		} else if (new ResourceLocation("ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("cold_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("frozen_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("warm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("river").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("lukewarm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("frozen_river").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"loot give @s loot the_wet_smp_rehydrated:ocean_treasure");
			}
		} else if (new ResourceLocation("deep_cold_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("deep_frozen_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("deep_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("deep_lukewarm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("deep_warm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"loot give @s loot the_wet_smp_rehydrated:deep_ocean_treasure");
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"loot give @s loot the_wet_smp_rehydrated:generic_treasure");
			}
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 2));
		RemoveBaitProcedure.execute(world, entity);
	}
}
