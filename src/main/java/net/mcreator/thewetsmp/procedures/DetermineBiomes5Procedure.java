package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DetermineBiomes5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("swamp").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SwampFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("swamp_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SwampHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("taiga").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			TaigaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("taiga_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			TaigaHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("taiga_mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			TaigaMountainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("tall_birch_forest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			TallBirchForestFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("tall_birch_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			TallBirchHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("warm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			WarmOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("wooded_badlands_plateau")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			WoodedBadlandsPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("wooded_mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			WoodedMountainsFishProcedure.execute(world, x, y, z, entity);
		}
	}
}
