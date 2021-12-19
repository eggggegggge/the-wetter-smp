package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DetermineBiomes2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("desert").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DesertFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("desert_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DesertHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("desert_lakes").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DesertLakesFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			DripstoneCavesFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("eroded_badlands").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ErodedBadlandsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("flower_forest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			FlowerForestFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("forest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ForestFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("wooded_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			WoodedHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("frozen_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			FrozenOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("frozen_river").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			FrozenRiverFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("giant_spruce_taiga").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			GiantSpruceTaigaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("giant_spruce_taiga_hills")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			GiantSpruceTaigaHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("giant_tree_taiga").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			GiantTreeTaigaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("giant_tree_taiga_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			GiantTreeTaigaHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("gravelly_mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			GravellyMountainsFishProcedure.execute(world, x, y, z, entity);
		}
	}
}
