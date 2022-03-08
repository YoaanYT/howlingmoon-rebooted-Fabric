package net.yoaan.howlingmoon_rebooted.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import net.yoaan.howlingmoon_rebooted.block.ModBlocks;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<TreeFeatureConfig, ?> DRIED_OAK_TREE =
            register("dried_oak", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.DRIED_OAK_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.DRIED_OAK_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> DRIED_OAK_TREE_RANDOM = register("dried_oak_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    DRIED_OAK_TREE.withWouldSurviveFilter(ModBlocks.DRIED_OAK_SAPLING), 0.1f)),
                    DRIED_OAK_TREE.withWouldSurviveFilter(ModBlocks.DRIED_OAK_SAPLING))));

    public static final ConfiguredFeature<RandomPatchFeatureConfig, ?> WOLFSBANE =
            ModConfiguredFeatures.register("wolfsbane", Feature.FLOWER.configure(
                    createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.WOLFSBANE), 64)));


    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> SILVER_ORE = register("silver_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_SILVER_ORES, 9)));



    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(howlingmoon_rebooted.MOD_ID, name),
                configuredFeature);
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(block)).withInAirFilter());
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + howlingmoon_rebooted.MOD_ID);
    }
}