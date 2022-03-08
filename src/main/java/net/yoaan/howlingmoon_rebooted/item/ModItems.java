package net.yoaan.howlingmoon_rebooted.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoaan.howlingmoon_rebooted.entity.ModEntities;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.yoaan.howlingmoon_rebooted.item.custom.*;

public class ModItems {
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new ModPickaxeItem(ModToolMaterial.SILVER, 2, -2f,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_AXE = registerItem("silver_axe",
            new ModAxeItem(ModToolMaterial.SILVER, 8, -3f,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new ModHoeItem(ModToolMaterial.SILVER, 0, 0f,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterial.SILVER, 1, -2f,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterial.SILVER, 4, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item MOONSTONE = registerItem("moonstone",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item LOREBOOK = registerItem("lorebook",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item WOLFFANGS = registerItem("wolffangs",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item LYCANTHROPEBOOK = registerItem("lycanthropebook",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item POTION_WOLFSBANE = registerItem("potion_wolfsbane",
            new Item(new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));

    public static final Item WEREWOLF_SPAWN_EGG = registerItem("werewolf_spawn_egg",
            new SpawnEggItem(ModEntities.WEREWOLF,0xFFFFFF, 0x111111,
                    new FabricItemSettings().group(ModItemGroups.HOWLINGMOONREBOOTEDTAB)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(howlingmoon_rebooted.MOD_ID, name), item);
    }
    public static void registerModItems() {
        howlingmoon_rebooted.LOGGER.info("Registering Mod Items for " + howlingmoon_rebooted.MOD_ID);
    }
}