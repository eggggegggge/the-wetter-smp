package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DetermineBiomes1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("badlands").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BadlandsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("badlands_plateau").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BadlandsPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("bamboo_jungle").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BambooJungleFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("bamboo_jungle_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BambooJungleHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("beach").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BeachFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("birch_forest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BirchForestFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("birch_forest_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			BirchForestHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("cold_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ColdOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("dark_forest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DarkForestFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("dark_forest_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DarkForestHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("deep_cold_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DeepColdOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("deep_frozen_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DeepFrozenOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("deep_lukewarm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DeepLukewarmOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("deep_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DeepOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("deep_warm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DeepWarmOceanFishProcedure.execute(world, x, y, z, entity);
		}
	}
}
