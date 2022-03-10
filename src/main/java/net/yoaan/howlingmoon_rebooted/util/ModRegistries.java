package net.yoaan.howlingmoon_rebooted.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.yoaan.howlingmoon_rebooted.block.ModBlocks;
import net.yoaan.howlingmoon_rebooted.entity.ModEntities;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerAttributes();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.DRIED_OAK_LOG, ModBlocks.STRIPPED_DRIED_OAK_LOG);
        StrippableBlockRegistry.register(ModBlocks.DRIED_OAK_WOOD, ModBlocks.STRIPPED_DRIED_OAK_WOOD);
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.WEREWOLF, WerewolfEntity.setAttributes());
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        instance.add(ModBlocks.DRIED_OAK_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_DRIED_OAK_LOG, 5, 5);
        instance.add(ModBlocks.DRIED_OAK_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_DRIED_OAK_WOOD, 5, 5);
        instance.add(ModBlocks.DRIED_OAK_PLANKS, 5, 20);
        instance.add(ModBlocks.DRIED_OAK_LEAVES, 30, 60);
    }
}