package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class DetermineTreasureBiomeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure DetermineTreasureBiome!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure DetermineTreasureBiome!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure DetermineTreasureBiome!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure DetermineTreasureBiome!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure DetermineTreasureBiome!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("badlands")))
				&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("badlands_plateau"))))
				&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("eroded_badlands")))
						&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
										.equals(new ResourceLocation("modified_badlands_plateau")))
								&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
												.equals(new ResourceLocation("wooded_badlands_plateau"))))))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				BadlandsTreasureProcedure.executeProcedure($_dependencies);
			}
		} else if (((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("bamboo_jungle")))
				&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("bamboo_jungle_hills"))))) {
			if ((((new Random()).nextBoolean()) == (true))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					BambooTreasureProcedure.executeProcedure($_dependencies);
				}
			} else {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					JungleTreasureProcedure.executeProcedure($_dependencies);
				}
			}
		} else if ((((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("birch_forest")))
				&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("birch_forest_hills"))))
				&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("tall_birch_hills")))
						&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
										.equals(new ResourceLocation("tall_birch_forest")))))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				BirchTreasureProcedure.executeProcedure($_dependencies);
			}
		} else if ((((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("cold_ocean")))
				&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("frozen_ocean"))))
				&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("lukewarm_ocean")))
						&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))).equals(new ResourceLocation("ocean")))
								&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
												.equals(new ResourceLocation("warm_ocean"))))))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				OceanTreasureProcedure.executeProcedure($_dependencies);
			}
		} else if ((((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("deep_cold_ocean")))
				&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("deep_frozen_ocean"))))
				&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
						&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("deep_lukewarm_ocean")))
						&& ((world.func_241828_r().getRegistry(Registry.BIOME_KEY)
								.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))).equals(new ResourceLocation("deep_ocean")))
								&& (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
										.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
												.equals(new ResourceLocation("deep_warm_ocean"))))))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				DeepOceanTreasureProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
