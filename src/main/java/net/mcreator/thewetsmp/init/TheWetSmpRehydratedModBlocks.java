
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.thewetsmp.block.YellowRedstoneLampBlock;
import net.mcreator.thewetsmp.block.WhiteRedstoneLampBlock;
import net.mcreator.thewetsmp.block.WhitePearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.WhitePearlButtonBlock;
import net.mcreator.thewetsmp.block.SnowyCrateBlock;
import net.mcreator.thewetsmp.block.SingingSingingSingingBassBlock;
import net.mcreator.thewetsmp.block.SingingSingingBassBlock;
import net.mcreator.thewetsmp.block.SingingBassBlock;
import net.mcreator.thewetsmp.block.SepiaWoolBlock;
import net.mcreator.thewetsmp.block.SepiaTerracottaBlock;
import net.mcreator.thewetsmp.block.SepiaStainedGlassPaneBlock;
import net.mcreator.thewetsmp.block.SepiaStainedGlassBlock;
import net.mcreator.thewetsmp.block.SepiaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.SepiaConcretePowderBlock;
import net.mcreator.thewetsmp.block.SepiaConcreteBlock;
import net.mcreator.thewetsmp.block.SepiaCarpetBlock;
import net.mcreator.thewetsmp.block.SeaUrchinBlock;
import net.mcreator.thewetsmp.block.ScaleslateTilesBlock;
import net.mcreator.thewetsmp.block.ScaleslateBricksBlock;
import net.mcreator.thewetsmp.block.ScaleslateBlock;
import net.mcreator.thewetsmp.block.SavannaCrateBlock;
import net.mcreator.thewetsmp.block.RedRedstoneLampBlock;
import net.mcreator.thewetsmp.block.PurpleRedstoneLampBlock;
import net.mcreator.thewetsmp.block.PolishedScaleslateBlock;
import net.mcreator.thewetsmp.block.PinkRedstoneLampBlock;
import net.mcreator.thewetsmp.block.PinkPearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.PinkPearlButtonBlock;
import net.mcreator.thewetsmp.block.OsmiumTilesBlock;
import net.mcreator.thewetsmp.block.OsmiumPillarBlock;
import net.mcreator.thewetsmp.block.OsmiumBlockBlock;
import net.mcreator.thewetsmp.block.OrangeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.OceanCrateBlock;
import net.mcreator.thewetsmp.block.OakCrateBlock;
import net.mcreator.thewetsmp.block.MountainCrateBlock;
import net.mcreator.thewetsmp.block.MaroonPearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.MaroonPearlButtonBlock;
import net.mcreator.thewetsmp.block.MagentaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitYellowRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitWhiteRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitSepiaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitRedRestoneLampBlock;
import net.mcreator.thewetsmp.block.LitPurpleRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitPinkRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitOrangeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitMagentaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLimeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLightGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLightBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitGreenRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitCyanRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBrownRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBlackRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LimestoneTilesBlock;
import net.mcreator.thewetsmp.block.LimestonePillarBlock;
import net.mcreator.thewetsmp.block.LimestoneBricksBlock;
import net.mcreator.thewetsmp.block.LimestoneBlock;
import net.mcreator.thewetsmp.block.LimeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LightGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LightBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.JungleCrateBlock;
import net.mcreator.thewetsmp.block.HotAirVentBlock;
import net.mcreator.thewetsmp.block.GreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.GreenRedstoneLampBlock;
import net.mcreator.thewetsmp.block.GoldPearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.GoldPearlButtonBlock;
import net.mcreator.thewetsmp.block.DeepslateOsmiumOreBlock;
import net.mcreator.thewetsmp.block.DeepOceanCrateBlock;
import net.mcreator.thewetsmp.block.CyanRedstoneLampBlock;
import net.mcreator.thewetsmp.block.CrateBlock;
import net.mcreator.thewetsmp.block.ColdAirVentBlock;
import net.mcreator.thewetsmp.block.ChiseledScaleslateBlock;
import net.mcreator.thewetsmp.block.BufferBlock;
import net.mcreator.thewetsmp.block.BrownRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BluePearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.BluePearlButtonBlock;
import net.mcreator.thewetsmp.block.BlackRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BlackPearlPressurePlateBlock;
import net.mcreator.thewetsmp.block.BlackPearlButtonBlock;
import net.mcreator.thewetsmp.block.BirchCrateBlock;
import net.mcreator.thewetsmp.block.BasaltCrateBlock;
import net.mcreator.thewetsmp.block.BambooCrateBlock;
import net.mcreator.thewetsmp.block.BadlandsCrateBlock;
import net.mcreator.thewetsmp.block.AquamarineGlassPaneBlock;
import net.mcreator.thewetsmp.block.AquamarineGlassBlock;
import net.mcreator.thewetsmp.block.AquamarineConstructBlock;
import net.mcreator.thewetsmp.block.AirVentBlock;
import net.mcreator.thewetsmp.block.AbyssCrateBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CRATE = register(new CrateBlock());
	public static final Block BUFFER = register(new BufferBlock());
	public static final Block AQUAMARINE_GLASS = register(new AquamarineGlassBlock());
	public static final Block AQUAMARINE_GLASS_PANE = register(new AquamarineGlassPaneBlock());
	public static final Block DEEPSLATE_OSMIUM_ORE = register(new DeepslateOsmiumOreBlock());
	public static final Block AIR_VENT = register(new AirVentBlock());
	public static final Block RED_REDSTONE_LAMP = register(new RedRedstoneLampBlock());
	public static final Block ORANGE_REDSTONE_LAMP = register(new OrangeRedstoneLampBlock());
	public static final Block YELLOW_REDSTONE_LAMP = register(new YellowRedstoneLampBlock());
	public static final Block LIME_REDSTONE_LAMP = register(new LimeRedstoneLampBlock());
	public static final Block GREEN_REDSTONE_LAMP = register(new GreenRedstoneLampBlock());
	public static final Block LIGHT_BLUE_REDSTONE_LAMP = register(new LightBlueRedstoneLampBlock());
	public static final Block CYAN_REDSTONE_LAMP = register(new CyanRedstoneLampBlock());
	public static final Block BLUE_REDSTONE_LAMP = register(new BlueRedstoneLampBlock());
	public static final Block PURPLE_REDSTONE_LAMP = register(new PurpleRedstoneLampBlock());
	public static final Block MAGENTA_REDSTONE_LAMP = register(new MagentaRedstoneLampBlock());
	public static final Block PINK_REDSTONE_LAMP = register(new PinkRedstoneLampBlock());
	public static final Block WHITE_REDSTONE_LAMP = register(new WhiteRedstoneLampBlock());
	public static final Block LIGHT_GREY_REDSTONE_LAMP = register(new LightGreyRedstoneLampBlock());
	public static final Block GREY_REDSTONE_LAMP = register(new GreyRedstoneLampBlock());
	public static final Block BLACK_REDSTONE_LAMP = register(new BlackRedstoneLampBlock());
	public static final Block BROWN_REDSTONE_LAMP = register(new BrownRedstoneLampBlock());
	public static final Block SEPIA_REDSTONE_LAMP = register(new SepiaRedstoneLampBlock());
	public static final Block PINK_PEARL_BUTTON = register(new PinkPearlButtonBlock());
	public static final Block MAROON_PEARL_BUTTON = register(new MaroonPearlButtonBlock());
	public static final Block BLUE_PEARL_BUTTON = register(new BluePearlButtonBlock());
	public static final Block BLACK_PEARL_BUTTON = register(new BlackPearlButtonBlock());
	public static final Block GOLD_PEARL_BUTTON = register(new GoldPearlButtonBlock());
	public static final Block WHITE_PEARL_BUTTON = register(new WhitePearlButtonBlock());
	public static final Block WHITE_PEARL_PRESSURE_PLATE = register(new WhitePearlPressurePlateBlock());
	public static final Block PINK_PEARL_PRESSURE_PLATE = register(new PinkPearlPressurePlateBlock());
	public static final Block MAROON_PEARL_PRESSURE_PLATE = register(new MaroonPearlPressurePlateBlock());
	public static final Block BLUE_PEARL_PRESSURE_PLATE = register(new BluePearlPressurePlateBlock());
	public static final Block BLACK_PEARL_PRESSURE_PLATE = register(new BlackPearlPressurePlateBlock());
	public static final Block GOLD_PEARL_PRESSURE_PLATE = register(new GoldPearlPressurePlateBlock());
	public static final Block SEA_URCHIN = register(new SeaUrchinBlock());
	public static final Block SEPIA_WOOL = register(new SepiaWoolBlock());
	public static final Block SEPIA_CARPET = register(new SepiaCarpetBlock());
	public static final Block SEPIA_TERRACOTTA = register(new SepiaTerracottaBlock());
	public static final Block SEPIA_STAINED_GLASS = register(new SepiaStainedGlassBlock());
	public static final Block SEPIA_STAINED_GLASS_PANE = register(new SepiaStainedGlassPaneBlock());
	public static final Block SEPIA_CONCRETE_POWDER = register(new SepiaConcretePowderBlock());
	public static final Block SEPIA_CONCRETE = register(new SepiaConcreteBlock());
	public static final Block OSMIUM_BLOCK = register(new OsmiumBlockBlock());
	public static final Block OSMIUM_PILLAR = register(new OsmiumPillarBlock());
	public static final Block OSMIUM_TILES = register(new OsmiumTilesBlock());
	public static final Block SINGING_BASS = register(new SingingBassBlock());
	public static final Block HOT_AIR_VENT = register(new HotAirVentBlock());
	public static final Block COLD_AIR_VENT = register(new ColdAirVentBlock());
	public static final Block AQUAMARINE_CONSTRUCT = register(new AquamarineConstructBlock());
	public static final Block SINGING_SINGING_BASS = register(new SingingSingingBassBlock());
	public static final Block LIT_RED_RESTONE_LAMP = register(new LitRedRestoneLampBlock());
	public static final Block LIT_ORANGE_REDSTONE_LAMP = register(new LitOrangeRedstoneLampBlock());
	public static final Block LIT_YELLOW_REDSTONE_LAMP = register(new LitYellowRedstoneLampBlock());
	public static final Block LIT_LIME_REDSTONE_LAMP = register(new LitLimeRedstoneLampBlock());
	public static final Block LIT_GREEN_REDSTONE_LAMP = register(new LitGreenRedstoneLampBlock());
	public static final Block LIT_LIGHT_BLUE_REDSTONE_LAMP = register(new LitLightBlueRedstoneLampBlock());
	public static final Block LIT_CYAN_REDSTONE_LAMP = register(new LitCyanRedstoneLampBlock());
	public static final Block LIT_BLUE_REDSTONE_LAMP = register(new LitBlueRedstoneLampBlock());
	public static final Block LIT_PURPLE_REDSTONE_LAMP = register(new LitPurpleRedstoneLampBlock());
	public static final Block LIT_MAGENTA_REDSTONE_LAMP = register(new LitMagentaRedstoneLampBlock());
	public static final Block LIT_PINK_REDSTONE_LAMP = register(new LitPinkRedstoneLampBlock());
	public static final Block LIT_WHITE_REDSTONE_LAMP = register(new LitWhiteRedstoneLampBlock());
	public static final Block LIT_LIGHT_GREY_REDSTONE_LAMP = register(new LitLightGreyRedstoneLampBlock());
	public static final Block LIT_GREY_REDSTONE_LAMP = register(new LitGreyRedstoneLampBlock());
	public static final Block LIT_BLACK_REDSTONE_LAMP = register(new LitBlackRedstoneLampBlock());
	public static final Block LIT_BROWN_REDSTONE_LAMP = register(new LitBrownRedstoneLampBlock());
	public static final Block LIT_SEPIA_REDSTONE_LAMP = register(new LitSepiaRedstoneLampBlock());
	public static final Block SINGING_SINGING_SINGING_BASS = register(new SingingSingingSingingBassBlock());
	public static final Block BIRCH_CRATE = register(new BirchCrateBlock());
	public static final Block JUNGLE_CRATE = register(new JungleCrateBlock());
	public static final Block BAMBOO_CRATE = register(new BambooCrateBlock());
	public static final Block BADLANDS_CRATE = register(new BadlandsCrateBlock());
	public static final Block SAVANNA_CRATE = register(new SavannaCrateBlock());
	public static final Block MOUNTAIN_CRATE = register(new MountainCrateBlock());
	public static final Block PRISMARINE_CRATE = register(new OceanCrateBlock());
	public static final Block DEEP_OCEAN_CRATE = register(new DeepOceanCrateBlock());
	public static final Block OAK_CRATE = register(new OakCrateBlock());
	public static final Block SNOWY_CRATE = register(new SnowyCrateBlock());
	public static final Block BASALT_CRATE = register(new BasaltCrateBlock());
	public static final Block ABYSS_CRATE = register(new AbyssCrateBlock());
	public static final Block LIMESTONE = register(new LimestoneBlock());
	public static final Block LIMESTONE_TILES = register(new LimestoneTilesBlock());
	public static final Block LIMESTONE_PILLAR = register(new LimestonePillarBlock());
	public static final Block LIMESTONE_BRICKS = register(new LimestoneBricksBlock());
	public static final Block SCALESLATE = register(new ScaleslateBlock());
	public static final Block POLISHED_SCALESLATE = register(new PolishedScaleslateBlock());
	public static final Block SCALESLATE_BRICKS = register(new ScaleslateBricksBlock());
	public static final Block SCALESLATE_TILES = register(new ScaleslateTilesBlock());
	public static final Block CHISELED_SCALESLATE = register(new ChiseledScaleslateBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BufferBlock.registerRenderLayer();
			AquamarineGlassBlock.registerRenderLayer();
			AquamarineGlassPaneBlock.registerRenderLayer();
			AirVentBlock.registerRenderLayer();
			PinkPearlButtonBlock.registerRenderLayer();
			MaroonPearlButtonBlock.registerRenderLayer();
			BluePearlButtonBlock.registerRenderLayer();
			BlackPearlButtonBlock.registerRenderLayer();
			GoldPearlButtonBlock.registerRenderLayer();
			WhitePearlButtonBlock.registerRenderLayer();
			WhitePearlPressurePlateBlock.registerRenderLayer();
			PinkPearlPressurePlateBlock.registerRenderLayer();
			MaroonPearlPressurePlateBlock.registerRenderLayer();
			BluePearlPressurePlateBlock.registerRenderLayer();
			BlackPearlPressurePlateBlock.registerRenderLayer();
			GoldPearlPressurePlateBlock.registerRenderLayer();
			SeaUrchinBlock.registerRenderLayer();
			SepiaWoolBlock.registerRenderLayer();
			SepiaCarpetBlock.registerRenderLayer();
			SepiaStainedGlassBlock.registerRenderLayer();
			SepiaStainedGlassPaneBlock.registerRenderLayer();
			SingingBassBlock.registerRenderLayer();
			HotAirVentBlock.registerRenderLayer();
			ColdAirVentBlock.registerRenderLayer();
			AquamarineConstructBlock.registerRenderLayer();
			SingingSingingBassBlock.registerRenderLayer();
			SingingSingingSingingBassBlock.registerRenderLayer();
		}
	}
}
