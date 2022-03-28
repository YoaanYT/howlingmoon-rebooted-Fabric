package net.yoaan.howlingmoon_rebooted.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoaan.howlingmoon_rebooted.block.custom.*;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.yoaan.howlingmoon_rebooted.item.ModItemGroups;
import net.yoaan.howlingmoon_rebooted.world.feature.tree.DriedOakSaplingGenerator;

public class ModBlocks {

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_STAIRS = registerBlock("silver_stairs",
            new ModStairsBlock(ModBlocks.SILVER_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_SLAB = registerBlock("silver_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_DOOR = registerBlock("silver_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_TRAPDOOR = registerBlock("silver_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_PRESSURE_PLATE = registerBlock("silver_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                      FabricBlockSettings.of(Material.METAL).strength(0.2f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_BUTTON = registerBlock("silver_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(0.2f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_WALL = registerBlock("silver_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_FENCE = registerBlock("silver_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block SILVER_FENCE_GATE = registerBlock("silver_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block HUNTER_BANNER = registerBlock("hunter_banner",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block WOLFSBANE = registerBlock("wolfsbane",
            new FlowerBlock(StatusEffects.REGENERATION, 8,
                    FabricBlockSettings.copy(Blocks.POPPY)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block POTTED_WOLFSBANE = registerBlockWithoutBlockItem("potted_wolfsbane",
            new FlowerPotBlock(ModBlocks.WOLFSBANE, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)));

    public static final Block DRIED_OAK_LOG = registerBlock("dried_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_PLANKS = registerBlock("dried_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_WOOD = registerBlock("dried_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block STRIPPED_DRIED_OAK_LOG = registerBlock("stripped_dried_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block STRIPPED_DRIED_OAK_WOOD = registerBlock("stripped_dried_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_DOOR = registerBlock("dried_oak_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_TRAPDOOR = registerBlock("dried_oak_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_BUTTON = registerBlock("dried_oak_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_FENCE = registerBlock("dried_oak_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(0.2f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_FENCE_GATE = registerBlock("dried_oak_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_SLAB = registerBlock("dried_oak_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_STAIRS = registerBlock("dried_oak_stairs",
            new ModStairsBlock(ModBlocks.DRIED_OAK_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(1.0f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_LEAVES = registerBlock("dried_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_SAPLING = registerBlock("dried_oak_sapling",
            new ModSaplingBlock(new DriedOakSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_PRESSURE_PLATE = registerBlock("dried_oak_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD).strength(0.2f).requiresTool()), ModItemGroups.HOWLINGMOONREBOOTEDTAB);

    public static final Block DRIED_OAK_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("dried_oak_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS), ModSignTypes.DRIED_OAK));

    public static final Block DRIED_OAK_SIGN_BLOCK = registerBlockWithoutBlockItem("dried_oak_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS), ModSignTypes.DRIED_OAK));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(howlingmoon_rebooted.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(howlingmoon_rebooted.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(howlingmoon_rebooted.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + howlingmoon_rebooted.MOD_ID);
    }
}