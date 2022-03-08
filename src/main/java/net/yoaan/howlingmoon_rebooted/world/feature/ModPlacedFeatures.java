package net.yoaan.howlingmoon_rebooted.world.feature;

import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> DRIED_OAK_PLACED_KEY = registerKey("dried_oak_placed");
    public static final RegistryKey<PlacedFeature> WOLFSBANE_PLACED_KEY = registerKey("wolfsbane_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");

    public static final PlacedFeature DRIED_OAK_PLACED = registerPlacedFeature("dried_oak_placed",
            ModConfiguredFeatures.DRIED_OAK_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2))));

    public static final PlacedFeature WOLFSBANE_PLACED = registerPlacedFeature("wolfsbane_placed",
            ModConfiguredFeatures.WOLFSBANE.withPlacement(RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                    PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));


    public static final PlacedFeature SILVER_ORE_PLACED = registerPlacedFeature("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE.withPlacement(ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-150), YOffset.aboveBottom(150)))));



    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(howlingmoon_rebooted.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(howlingmoon_rebooted.MOD_ID, name));
    }
}
