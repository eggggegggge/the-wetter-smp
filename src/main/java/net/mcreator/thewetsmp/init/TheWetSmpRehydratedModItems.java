
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thewetsmp.item.YellowJellyfishItem;
import net.mcreator.thewetsmp.item.WuuthradItem;
import net.mcreator.thewetsmp.item.WhitePearlItem;
import net.mcreator.thewetsmp.item.WatchfulReedfishItem;
import net.mcreator.thewetsmp.item.WarpedWartItem;
import net.mcreator.thewetsmp.item.VoidswimmerItem;
import net.mcreator.thewetsmp.item.TreasurePowderItem;
import net.mcreator.thewetsmp.item.SwordfishItem;
import net.mcreator.thewetsmp.item.StrangeGelItem;
import net.mcreator.thewetsmp.item.SoulscaleItem;
import net.mcreator.thewetsmp.item.SkeletalEelItem;
import net.mcreator.thewetsmp.item.SilverEyeItem;
import net.mcreator.thewetsmp.item.ShulkfishItem;
import net.mcreator.thewetsmp.item.ShulkerShardItem;
import net.mcreator.thewetsmp.item.ShroomyKoiItem;
import net.mcreator.thewetsmp.item.ShiitakeOrfeItem;
import net.mcreator.thewetsmp.item.SepiaDyeItem;
import net.mcreator.thewetsmp.item.SeahorseItem;
import net.mcreator.thewetsmp.item.ScallopItem;
import net.mcreator.thewetsmp.item.SavannaTetraItem;
import net.mcreator.thewetsmp.item.RubyOrefishItem;
import net.mcreator.thewetsmp.item.RubyItem;
import net.mcreator.thewetsmp.item.RubyGrapplingHookItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedSuspiciousStewItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedRabbitStewItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedBeetrootSoupItem;
import net.mcreator.thewetsmp.item.RedJellyfishItem;
import net.mcreator.thewetsmp.item.RawOsmiumItem;
import net.mcreator.thewetsmp.item.PupfishItem;
import net.mcreator.thewetsmp.item.PinkPearlItem;
import net.mcreator.thewetsmp.item.PinkJellyfishItem;
import net.mcreator.thewetsmp.item.OsmiumOrefishItem;
import net.mcreator.thewetsmp.item.OsmiumIngotItem;
import net.mcreator.thewetsmp.item.OnyxOrefishItem;
import net.mcreator.thewetsmp.item.OnyxItem;
import net.mcreator.thewetsmp.item.OnyxGrapplingHookItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedSuspiciousStewItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedRabbitStewItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedBeetrootSoupItem;
import net.mcreator.thewetsmp.item.NulltilusItem;
import net.mcreator.thewetsmp.item.NightKoiItem;
import net.mcreator.thewetsmp.item.NetherragfishItem;
import net.mcreator.thewetsmp.item.NetheritePistonBootsItem;
import net.mcreator.thewetsmp.item.NautilusItem;
import net.mcreator.thewetsmp.item.MoltenCharrItem;
import net.mcreator.thewetsmp.item.MinnowItem;
import net.mcreator.thewetsmp.item.MaroonPearlItem;
import net.mcreator.thewetsmp.item.LostRubyRingItem;
import net.mcreator.thewetsmp.item.LostOnyxRingItem;
import net.mcreator.thewetsmp.item.LostLapisRingItem;
import net.mcreator.thewetsmp.item.LostEmeraldRingItem;
import net.mcreator.thewetsmp.item.LostAquamarineRingItem;
import net.mcreator.thewetsmp.item.LeatherPistonBootsItem;
import net.mcreator.thewetsmp.item.LapisOrefishItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedSuspiciousStewItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedRabbitStewItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedBeetrootSoupItem;
import net.mcreator.thewetsmp.item.KoiItem;
import net.mcreator.thewetsmp.item.JunkPowderItem;
import net.mcreator.thewetsmp.item.JungleSnapperItem;
import net.mcreator.thewetsmp.item.IronPistonBootsItem;
import net.mcreator.thewetsmp.item.HumuhumunukunukuapuaAItem;
import net.mcreator.thewetsmp.item.HammerheadItem;
import net.mcreator.thewetsmp.item.HaloclineDiverfishItem;
import net.mcreator.thewetsmp.item.GreenJellyfishItem;
import net.mcreator.thewetsmp.item.GoldfishItem;
import net.mcreator.thewetsmp.item.GoldenSkiffiaItem;
import net.mcreator.thewetsmp.item.GoldenPistonBootsItem;
import net.mcreator.thewetsmp.item.GoldenBananaItem;
import net.mcreator.thewetsmp.item.GoldPearlItem;
import net.mcreator.thewetsmp.item.GoldOrefishItem;
import net.mcreator.thewetsmp.item.GoldBassItem;
import net.mcreator.thewetsmp.item.GlowKoiItem;
import net.mcreator.thewetsmp.item.GlassfishItem;
import net.mcreator.thewetsmp.item.FungiGobiItem;
import net.mcreator.thewetsmp.item.FlowerfishItem;
import net.mcreator.thewetsmp.item.FishlingItem;
import net.mcreator.thewetsmp.item.FakeCreeperDiscItem;
import net.mcreator.thewetsmp.item.FaienceScarabItem;
import net.mcreator.thewetsmp.item.ExplosiveCrabCannonItem;
import net.mcreator.thewetsmp.item.EmeraldOrefishItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedSuspiciousStewItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedRabbitStewItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedBeetrootSoupItem;
import net.mcreator.thewetsmp.item.EffervescentWatcherItem;
import net.mcreator.thewetsmp.item.DryadsAequoriaItem;
import net.mcreator.thewetsmp.item.DiamondPistonBootsItem;
import net.mcreator.thewetsmp.item.DiamondOrefishItem;
import net.mcreator.thewetsmp.item.DevSalmonItem;
import net.mcreator.thewetsmp.item.CuttlefishItem;
import net.mcreator.thewetsmp.item.CrabItem;
import net.mcreator.thewetsmp.item.CrabCannonItem;
import net.mcreator.thewetsmp.item.CopperfishItem;
import net.mcreator.thewetsmp.item.ChorusfishItem;
import net.mcreator.thewetsmp.item.ChainmailPistonBootsItem;
import net.mcreator.thewetsmp.item.BufferBlasterItem;
import net.mcreator.thewetsmp.item.BrushItem;
import net.mcreator.thewetsmp.item.BrineKoiItem;
import net.mcreator.thewetsmp.item.BluePearlItem;
import net.mcreator.thewetsmp.item.BlueJellyfishItem;
import net.mcreator.thewetsmp.item.BlackPearlItem;
import net.mcreator.thewetsmp.item.BassItem;
import net.mcreator.thewetsmp.item.BananaItem;
import net.mcreator.thewetsmp.item.BadlandsCarpItem;
import net.mcreator.thewetsmp.item.AquamarineItem;
import net.mcreator.thewetsmp.item.AquamarineGrapplingHookItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedSuspiciousStewItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedRabbitStewItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedBeetrootSoupItem;
import net.mcreator.thewetsmp.item.AnchovyItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RUBY_RING = register(new LostRubyRingItem());
	public static final Item EMERALD_RING = register(new LostEmeraldRingItem());
	public static final Item ONYX_RING = register(new LostOnyxRingItem());
	public static final Item LAPIS_RING = register(new LostLapisRingItem());
	public static final Item AQUAMARINE_RING = register(new LostAquamarineRingItem());
	public static final Item BRUSH = register(new BrushItem());
	public static final Item AQUAMARINE = register(new AquamarineItem());
	public static final Item RUBY = register(new RubyItem());
	public static final Item ONYX = register(new OnyxItem());
	public static final Item AQUAMARINE_EMBEDDED_BOWL = register(new AquamarineEmbeddedBowlItem());
	public static final Item EMERALD_EMBEDDED_BOWL = register(new EmeraldEmbeddedBowlItem());
	public static final Item LAPIS_EMBEDDED_BOWL = register(new LapisEmbeddedBowlItem());
	public static final Item ONYX_EMBEDDED_BOWL = register(new OnyxEmbeddedBowlItem());
	public static final Item RUBY_EMBEDDED_BOWL = register(new RubyEmbeddedBowlItem());
	public static final Item RAW_OSMIUM = register(new RawOsmiumItem());
	public static final Item DEV_SALMON = register(new DevSalmonItem());
	public static final Item WHITE_PEARL = register(new WhitePearlItem());
	public static final Item PINK_PEARL = register(new PinkPearlItem());
	public static final Item MAROON_PEARL = register(new MaroonPearlItem());
	public static final Item BLUE_PEARL = register(new BluePearlItem());
	public static final Item BLACK_PEARL = register(new BlackPearlItem());
	public static final Item GOLD_PEARL = register(new GoldPearlItem());
	public static final Item OSMIUM_INGOT = register(new OsmiumIngotItem());
	public static final Item CRATE = register(TheWetSmpRehydratedModBlocks.CRATE, CreativeModeTab.TAB_MISC);
	public static final Item SEPIA_DYE = register(new SepiaDyeItem());
	public static final Item LEATHER_PISTON_BOOTS = register(new LeatherPistonBootsItem.Boots());
	public static final Item CHAINMAIL_PISTON_BOOTS = register(new ChainmailPistonBootsItem.Boots());
	public static final Item GOLDEN_PISTON_BOOTS = register(new GoldenPistonBootsItem.Boots());
	public static final Item IRON_PISTON_BOOTS = register(new IronPistonBootsItem.Boots());
	public static final Item DIAMOND_PISTON_BOOTS = register(new DiamondPistonBootsItem.Boots());
	public static final Item NETHERITE_PISTON_BOOTS = register(new NetheritePistonBootsItem.Boots());
	public static final Item RUBY_GRAPPLING_HOOK = register(new RubyGrapplingHookItem());
	public static final Item AQUAMARINE_GRAPPLING_HOOK = register(new AquamarineGrapplingHookItem());
	public static final Item ONYX_GRAPPLING_HOOK = register(new OnyxGrapplingHookItem());
	public static final Item WARPED_WART = register(new WarpedWartItem());
	public static final Item STRANGE_GEL = register(new StrangeGelItem());
	public static final Item AQUAMARINE_EMBEDDED_BEETROOT_SOUP = register(new AquamarineEmbeddedBeetrootSoupItem());
	public static final Item AQUAMARINE_EMBEDDED_MUSHROOM_STEW = register(new AquamarineEmbeddedMushroomStewItem());
	public static final Item AQUAMARINE_EMBEDDED_RABBIT_STEW = register(new AquamarineEmbeddedRabbitStewItem());
	public static final Item AQUAMARINE_EMBEDDED_SUSPICIOUS_STEW = register(new AquamarineEmbeddedSuspiciousStewItem());
	public static final Item EMERALD_EMBEDDED_BEETROOT_SOUP = register(new EmeraldEmbeddedBeetrootSoupItem());
	public static final Item EMERALD_EMBEDDED_MUSHROOM_STEW = register(new EmeraldEmbeddedMushroomStewItem());
	public static final Item EMERALD_EMBEDDED_RABBIT_STEW = register(new EmeraldEmbeddedRabbitStewItem());
	public static final Item EMERALD_EMBEDDED_SUSPICIOUS_STEW = register(new EmeraldEmbeddedSuspiciousStewItem());
	public static final Item LAPIS_EMBEDDED_BEETROOT_SOUP = register(new LapisEmbeddedBeetrootSoupItem());
	public static final Item LAPIS_EMBEDDED_MUSHROOM_STEW = register(new LapisEmbeddedMushroomStewItem());
	public static final Item LAPIS_EMBEDDED_RABBIT_STEW = register(new LapisEmbeddedRabbitStewItem());
	public static final Item LAPIS_EMBEDDED_SUSPICIOUS_STEW = register(new LapisEmbeddedSuspiciousStewItem());
	public static final Item ONYX_EMBEDDED_BEETROOT_SOUP = register(new OnyxEmbeddedBeetrootSoupItem());
	public static final Item ONYX_EMBEDDED_MUSHROOM_STEW = register(new OnyxEmbeddedMushroomStewItem());
	public static final Item ONYX_EMBEDDED_RABBIT_STEW = register(new OnyxEmbeddedRabbitStewItem());
	public static final Item ONYX_EMBEDDED_SUSPICIOUS_STEW = register(new OnyxEmbeddedSuspiciousStewItem());
	public static final Item RUBY_EMBEDDED_BEETROOT_SOUP = register(new RubyEmbeddedBeetrootSoupItem());
	public static final Item RUBY_EMBEDDED_MUSHROOM_STEW = register(new RubyEmbeddedMushroomStewItem());
	public static final Item RUBY_EMBEDDED_RABBIT_STEW = register(new RubyEmbeddedRabbitStewItem());
	public static final Item RUBY_EMBEDDED_SUSPICIOUS_STEW = register(new RubyEmbeddedSuspiciousStewItem());
	public static final Item BUFFER = register(TheWetSmpRehydratedModBlocks.BUFFER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item AQUAMARINE_GLASS = register(TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item AQUAMARINE_GLASS_PANE = register(TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS_PANE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DEEPSLATE_OSMIUM_ORE = register(TheWetSmpRehydratedModBlocks.DEEPSLATE_OSMIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item AIR_VENT = register(TheWetSmpRehydratedModBlocks.AIR_VENT, CreativeModeTab.TAB_REDSTONE);
	public static final Item RED_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.RED_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item ORANGE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.ORANGE_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item YELLOW_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.YELLOW_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item LIME_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIME_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item GREEN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.GREEN_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item LIGHT_BLUE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIGHT_BLUE_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item CYAN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.CYAN_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item BLUE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.BLUE_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item PURPLE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.PURPLE_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item MAGENTA_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.MAGENTA_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item PINK_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.PINK_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item WHITE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.WHITE_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item LIGHT_GREY_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIGHT_GREY_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item GREY_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.GREY_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item BLACK_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.BLACK_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item BROWN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.BROWN_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item SEPIA_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.SEPIA_REDSTONE_LAMP, CreativeModeTab.TAB_REDSTONE);
	public static final Item PINK_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.PINK_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item MAROON_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.MAROON_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item BLUE_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.BLUE_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item BLACK_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.BLACK_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item GOLD_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.GOLD_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item WHITE_PEARL_BUTTON = register(TheWetSmpRehydratedModBlocks.WHITE_PEARL_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final Item WHITE_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.WHITE_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item PINK_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.PINK_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item MAROON_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.MAROON_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item BLUE_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.BLUE_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item BLACK_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.BLACK_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item GOLD_PEARL_PRESSURE_PLATE = register(TheWetSmpRehydratedModBlocks.GOLD_PEARL_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item KOI = register(new KoiItem());
	public static final Item GLOW_KOI = register(new GlowKoiItem());
	public static final Item NIGHT_KOI = register(new NightKoiItem());
	public static final Item SHROOMY_KOI = register(new ShroomyKoiItem());
	public static final Item BRINE_KOI = register(new BrineKoiItem());
	public static final Item GOLDFISH = register(new GoldfishItem());
	public static final Item PUPFISH = register(new PupfishItem());
	public static final Item SAVANNA_TETRA = register(new SavannaTetraItem());
	public static final Item GOLDEN_SKIFFIA = register(new GoldenSkiffiaItem());
	public static final Item MINNOW = register(new MinnowItem());
	public static final Item ANCHOVY = register(new AnchovyItem());
	public static final Item FISHLING = register(new FishlingItem());
	public static final Item EFFERVESCENT_WATCHER = register(new EffervescentWatcherItem());
	public static final Item SHULKFISH = register(new ShulkfishItem());
	public static final Item CHORUSFISH = register(new ChorusfishItem());
	public static final Item GREEN_JELLYFISH = register(new GreenJellyfishItem());
	public static final Item BLUE_JELLYFISH = register(new BlueJellyfishItem());
	public static final Item RED_JELLYFISH = register(new RedJellyfishItem());
	public static final Item YELLOW_JELLYFISH = register(new YellowJellyfishItem());
	public static final Item PINK_JELLYFISH = register(new PinkJellyfishItem());
	public static final Item NAUTILUS = register(new NautilusItem());
	public static final Item NULLTILUS = register(new NulltilusItem());
	public static final Item NETHERRAGFISH = register(new NetherragfishItem());
	public static final Item MOLTEN_CHARR = register(new MoltenCharrItem());
	public static final Item SOULSCALE = register(new SoulscaleItem());
	public static final Item SHIITAKE_ORFE = register(new ShiitakeOrfeItem());
	public static final Item FUNGI_GOBI = register(new FungiGobiItem());
	public static final Item DRYADS_AEQUOREA = register(new DryadsAequoriaItem());
	public static final Item LAPIS_OREFISH = register(new LapisOrefishItem());
	public static final Item RUBY_OREFISH = register(new RubyOrefishItem());
	public static final Item DIAMOND_OREFISH = register(new DiamondOrefishItem());
	public static final Item GOLD_OREFISH = register(new GoldOrefishItem());
	public static final Item ONYX_OREFISH = register(new OnyxOrefishItem());
	public static final Item OSMIUM_OREFISH = register(new OsmiumOrefishItem());
	public static final Item EMERALD_OREFISH = register(new EmeraldOrefishItem());
	public static final Item COPPERFISH = register(new CopperfishItem());
	public static final Item VOIDSWIMMER = register(new VoidswimmerItem());
	public static final Item SKELETAL_EEL = register(new SkeletalEelItem());
	public static final Item WATCHFUL_REEDFISH = register(new WatchfulReedfishItem());
	public static final Item SEA_URCHIN = register(TheWetSmpRehydratedModBlocks.SEA_URCHIN, TheWetSmpRehydratedModTabs.TAB_FISHING);
	public static final Item SCALLOP = register(new ScallopItem());
	public static final Item CRAB = register(new CrabItem());
	public static final Item BASS = register(new BassItem());
	public static final Item GOLD_BASS = register(new GoldBassItem());
	public static final Item BADLANDS_CARP = register(new BadlandsCarpItem());
	public static final Item SEAHORSE = register(new SeahorseItem());
	public static final Item SILVER_EYE = register(new SilverEyeItem());
	public static final Item HALOCLINE_DIVERFISH = register(new HaloclineDiverfishItem());
	public static final Item CUTTLEFISH = register(new CuttlefishItem());
	public static final Item JUNGLE_SNAPPER = register(new JungleSnapperItem());
	public static final Item FLOWERFISH = register(new FlowerfishItem());
	public static final Item HUMUHUMUNUKUNUKUAPUA_A = register(new HumuhumunukunukuapuaAItem());
	public static final Item GLASSFISH = register(new GlassfishItem());
	public static final Item SWORDFISH = register(new SwordfishItem());
	public static final Item CRAB_CANNON = register(new CrabCannonItem());
	public static final Item EXPLOSIVE_CRAB_CANNON = register(new ExplosiveCrabCannonItem());
	public static final Item SEPIA_WOOL = register(TheWetSmpRehydratedModBlocks.SEPIA_WOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_CARPET = register(TheWetSmpRehydratedModBlocks.SEPIA_CARPET, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_TERRACOTTA = register(TheWetSmpRehydratedModBlocks.SEPIA_TERRACOTTA, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_STAINED_GLASS = register(TheWetSmpRehydratedModBlocks.SEPIA_STAINED_GLASS, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_STAINED_GLASS_PANE = register(TheWetSmpRehydratedModBlocks.SEPIA_STAINED_GLASS_PANE,
			CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_CONCRETE_POWDER = register(TheWetSmpRehydratedModBlocks.SEPIA_CONCRETE_POWDER, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEPIA_CONCRETE = register(TheWetSmpRehydratedModBlocks.SEPIA_CONCRETE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OSMIUM_BLOCK = register(TheWetSmpRehydratedModBlocks.OSMIUM_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OSMIUM_PILLAR = register(TheWetSmpRehydratedModBlocks.OSMIUM_PILLAR, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OSMIUM_TILES = register(TheWetSmpRehydratedModBlocks.OSMIUM_TILES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SINGING_BASS = register(TheWetSmpRehydratedModBlocks.SINGING_BASS, CreativeModeTab.TAB_DECORATIONS);
	public static final Item HOT_AIR_VENT = register(TheWetSmpRehydratedModBlocks.HOT_AIR_VENT, null);
	public static final Item COLD_AIR_VENT = register(TheWetSmpRehydratedModBlocks.COLD_AIR_VENT, null);
	public static final Item AQUAMARINE_CONSTRUCT = register(TheWetSmpRehydratedModBlocks.AQUAMARINE_CONSTRUCT, null);
	public static final Item SINGING_SINGING_BASS = register(TheWetSmpRehydratedModBlocks.SINGING_SINGING_BASS, null);
	public static final Item LIT_RED_RESTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_RED_RESTONE_LAMP, null);
	public static final Item LIT_ORANGE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_ORANGE_REDSTONE_LAMP, null);
	public static final Item LIT_YELLOW_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_YELLOW_REDSTONE_LAMP, null);
	public static final Item LIT_LIME_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_LIME_REDSTONE_LAMP, null);
	public static final Item LIT_GREEN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_GREEN_REDSTONE_LAMP, null);
	public static final Item LIT_LIGHT_BLUE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_LIGHT_BLUE_REDSTONE_LAMP, null);
	public static final Item LIT_CYAN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_CYAN_REDSTONE_LAMP, null);
	public static final Item LIT_BLUE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_BLUE_REDSTONE_LAMP, null);
	public static final Item LIT_PURPLE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_PURPLE_REDSTONE_LAMP, null);
	public static final Item LIT_MAGENTA_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_MAGENTA_REDSTONE_LAMP, null);
	public static final Item LIT_PINK_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_PINK_REDSTONE_LAMP, null);
	public static final Item LIT_WHITE_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_WHITE_REDSTONE_LAMP, null);
	public static final Item LIT_LIGHT_GREY_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_LIGHT_GREY_REDSTONE_LAMP, null);
	public static final Item LIT_GREY_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_GREY_REDSTONE_LAMP, null);
	public static final Item LIT_BLACK_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_BLACK_REDSTONE_LAMP, null);
	public static final Item LIT_BROWN_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_BROWN_REDSTONE_LAMP, null);
	public static final Item LIT_SEPIA_REDSTONE_LAMP = register(TheWetSmpRehydratedModBlocks.LIT_SEPIA_REDSTONE_LAMP, null);
	public static final Item SINGING_SINGING_SINGING_BASS = register(TheWetSmpRehydratedModBlocks.SINGING_SINGING_SINGING_BASS, null);
	public static final Item BUFFER_BLASTER = register(new BufferBlasterItem());
	public static final Item BIRCH_CRATE = register(TheWetSmpRehydratedModBlocks.BIRCH_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item JUNGLE_CRATE = register(TheWetSmpRehydratedModBlocks.JUNGLE_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item BAMBOO_CRATE = register(TheWetSmpRehydratedModBlocks.BAMBOO_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item BADLANDS_CRATE = register(TheWetSmpRehydratedModBlocks.BADLANDS_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item SAVANNA_CRATE = register(TheWetSmpRehydratedModBlocks.SAVANNA_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item MOUNTAIN_CRATE = register(TheWetSmpRehydratedModBlocks.MOUNTAIN_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item PRISMARINE_CRATE = register(TheWetSmpRehydratedModBlocks.PRISMARINE_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item DEEP_OCEAN_CRATE = register(TheWetSmpRehydratedModBlocks.DEEP_OCEAN_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item OAK_CRATE = register(TheWetSmpRehydratedModBlocks.OAK_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item SNOWY_CRATE = register(TheWetSmpRehydratedModBlocks.SNOWY_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item BASALT_CRATE = register(TheWetSmpRehydratedModBlocks.BASALT_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item ABYSS_CRATE = register(TheWetSmpRehydratedModBlocks.ABYSS_CRATE, CreativeModeTab.TAB_MISC);
	public static final Item LIMESTONE = register(TheWetSmpRehydratedModBlocks.LIMESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIMESTONE_TILES = register(TheWetSmpRehydratedModBlocks.LIMESTONE_TILES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIMESTONE_PILLAR = register(TheWetSmpRehydratedModBlocks.LIMESTONE_PILLAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIMESTONE_BRICKS = register(TheWetSmpRehydratedModBlocks.LIMESTONE_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SHULKER_SHARD = register(new ShulkerShardItem());
	public static final Item WUUTHRAD = register(new WuuthradItem());
	public static final Item FAKE_CREEPER_DISC = register(new FakeCreeperDiscItem());
	public static final Item HAMMERHEAD = register(new HammerheadItem());
	public static final Item FAIENCE_SCARAB = register(new FaienceScarabItem());
	public static final Item TREASURE_POWDER = register(new TreasurePowderItem());
	public static final Item JUNK_POWDER = register(new JunkPowderItem());
	public static final Item SCALESLATE = register(TheWetSmpRehydratedModBlocks.SCALESLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBBLED_SCALESLATE = register(TheWetSmpRehydratedModBlocks.COBBLED_SCALESLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBBLED_SCALESLATE_SLAB = register(TheWetSmpRehydratedModBlocks.COBBLED_SCALESLATE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBBLED_SCALESLATE_STAIRS = register(TheWetSmpRehydratedModBlocks.COBBLED_SCALESLATE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBBLED_SCALESLATE_WALL = register(TheWetSmpRehydratedModBlocks.COBBLED_SCALESLATE_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_SCALESLATE = register(TheWetSmpRehydratedModBlocks.POLISHED_SCALESLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_SCALESLATE_SLAB = register(TheWetSmpRehydratedModBlocks.POLISHED_SCALESLATE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_SCALESLATE_STAIRS = register(TheWetSmpRehydratedModBlocks.POLISHED_SCALESLATE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_SCALESLATE_WALL = register(TheWetSmpRehydratedModBlocks.POLISHED_SCALESLATE_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_BRICKS = register(TheWetSmpRehydratedModBlocks.SCALESLATE_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_BRICK_SLAB = register(TheWetSmpRehydratedModBlocks.SCALESLATE_BRICK_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_BRICK_STAIRS = register(TheWetSmpRehydratedModBlocks.SCALESLATE_BRICK_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_BRICK_WALL = register(TheWetSmpRehydratedModBlocks.SCALESLATE_BRICK_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_TILES = register(TheWetSmpRehydratedModBlocks.SCALESLATE_TILES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_TILE_SLAB = register(TheWetSmpRehydratedModBlocks.SCALESLATE_TILE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_TILE_STAIRS = register(TheWetSmpRehydratedModBlocks.SCALESLATE_TILE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCALESLATE_TILES_WALL = register(TheWetSmpRehydratedModBlocks.SCALESLATE_TILES_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHISELED_SCALESLATE = register(TheWetSmpRehydratedModBlocks.CHISELED_SCALESLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BANANA = register(new BananaItem());
	public static final Item GOLDEN_BANANA = register(new GoldenBananaItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
