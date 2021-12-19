
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thewetsmp.block.entity.SnowyCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.SavannaCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.OakCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.MountainCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.JungleCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.DeepOceanCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.BufferBlockEntity;
import net.mcreator.thewetsmp.block.entity.BirchCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.BadlandsCrateBlockEntity;
import net.mcreator.thewetsmp.block.entity.AquamarineGlassBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> BUFFER = register("the_wet_smp_rehydrated:buffer", TheWetSmpRehydratedModBlocks.BUFFER,
			BufferBlockEntity::new);
	public static final BlockEntityType<?> AQUAMARINE_GLASS = register("the_wet_smp_rehydrated:aquamarine_glass",
			TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS, AquamarineGlassBlockEntity::new);
	public static final BlockEntityType<?> BIRCH_CRATE = register("the_wet_smp_rehydrated:birch_crate", TheWetSmpRehydratedModBlocks.BIRCH_CRATE,
			BirchCrateBlockEntity::new);
	public static final BlockEntityType<?> JUNGLE_CRATE = register("the_wet_smp_rehydrated:jungle_crate", TheWetSmpRehydratedModBlocks.JUNGLE_CRATE,
			JungleCrateBlockEntity::new);
	public static final BlockEntityType<?> BADLANDS_CRATE = register("the_wet_smp_rehydrated:badlands_crate",
			TheWetSmpRehydratedModBlocks.BADLANDS_CRATE, BadlandsCrateBlockEntity::new);
	public static final BlockEntityType<?> SAVANNA_CRATE = register("the_wet_smp_rehydrated:savanna_crate",
			TheWetSmpRehydratedModBlocks.SAVANNA_CRATE, SavannaCrateBlockEntity::new);
	public static final BlockEntityType<?> MOUNTAIN_CRATE = register("the_wet_smp_rehydrated:mountain_crate",
			TheWetSmpRehydratedModBlocks.MOUNTAIN_CRATE, MountainCrateBlockEntity::new);
	public static final BlockEntityType<?> DEEP_OCEAN_CRATE = register("the_wet_smp_rehydrated:deep_ocean_crate",
			TheWetSmpRehydratedModBlocks.DEEP_OCEAN_CRATE, DeepOceanCrateBlockEntity::new);
	public static final BlockEntityType<?> OAK_CRATE = register("the_wet_smp_rehydrated:oak_crate", TheWetSmpRehydratedModBlocks.OAK_CRATE,
			OakCrateBlockEntity::new);
	public static final BlockEntityType<?> SNOWY_CRATE = register("the_wet_smp_rehydrated:snowy_crate", TheWetSmpRehydratedModBlocks.SNOWY_CRATE,
			SnowyCrateBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
