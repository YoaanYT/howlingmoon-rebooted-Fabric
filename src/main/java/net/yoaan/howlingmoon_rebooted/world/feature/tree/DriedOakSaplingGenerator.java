package net.yoaan.howlingmoon_rebooted.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.yoaan.howlingmoon_rebooted.world.feature.ModConfiguredFeatures;

import javax.annotation.Nullable;
import java.util.Random;

public class DriedOakSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.DRIED_OAK_TREE;
    }
}