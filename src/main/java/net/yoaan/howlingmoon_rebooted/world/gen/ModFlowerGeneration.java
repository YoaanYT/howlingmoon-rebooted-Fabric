package net.yoaan.howlingmoon_rebooted.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.yoaan.howlingmoon_rebooted.world.feature.ModPlacedFeatures;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WOLFSBANE_PLACED_KEY);
    }
}
