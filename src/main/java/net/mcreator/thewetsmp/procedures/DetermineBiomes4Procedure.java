package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DetermineBiomes4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("ocean").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			OceanFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("plains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			PlainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("river").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			RiverFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("savanna").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SavannaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("savanna_plateau").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SavannaPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("shattered_savanna").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ShatteredSavannaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("shattered_savanna_plateau")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			ShatteredSavannaPlateauFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_beach").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyBeachFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyMountainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_taiga").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyTaigaFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_taiga_hills").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyTaigaHillsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_taiga_mountains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyTaigaMountainsFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("snowy_tundra").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SnowyTundraFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("stone_shore").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			StoneShoreFishProcedure.execute(world, x, y, z, entity);
		} else if (new ResourceLocation("sunflower_plains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			SunflowerPlainsFishProcedure.execute(world, x, y, z, entity);
		}
	}
}
