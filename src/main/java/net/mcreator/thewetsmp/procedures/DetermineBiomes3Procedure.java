package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DetermineBiomes3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("ice_spikes").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			IceSpikesFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("jungle").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			JungleFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("jungle_edge").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			JungleEdgeFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("jungle_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			JungleHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("lukewarm_ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			LukewarmOceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("lush_caves").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			LushCavesFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("modified_badlands_plateau")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ModifiedBadlandsPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("modified_gravelly_mountains")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ModifiedGravellyMountainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("modified_jungle").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ModifiedJungleFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("modified_jungle_edge").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ModifiedJungleEdgeFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("modified_wooded_badlands_plateau")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ModifiedWoodedBadlandsPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("mountain_edge").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			MountainEdgeFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			MountainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("mushroom_field_shore").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			MushroomFieldShoreFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("mushroom_fields").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			MushroomFieldsFishProcedure.execute(world, x, y, z, entity);
		}
	}
}
