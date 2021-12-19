
package net.mcreator.thewetsmp.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.Set;
import java.util.Random;

public class DeepslateOsmiumOreFeature extends OreFeature {
	public static final DeepslateOsmiumOreFeature FEATURE = (DeepslateOsmiumOreFeature) new DeepslateOsmiumOreFeature()
			.setRegistryName("the_wet_smp_rehydrated:deepslate_osmium_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(DeepslateOsmiumOreFeatureRuleTest.INSTANCE,
					TheWetSmpRehydratedModBlocks.DEEPSLATE_OSMIUM_ORE.defaultBlockState(), 8))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(10)))).squared().count(13);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public DeepslateOsmiumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class DeepslateOsmiumOreFeatureRuleTest extends RuleTest {
		static final DeepslateOsmiumOreFeatureRuleTest INSTANCE = new DeepslateOsmiumOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<DeepslateOsmiumOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<DeepslateOsmiumOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("the_wet_smp_rehydrated:deepslate_osmium_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
