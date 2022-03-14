package net.yoaan.howlingmoon_rebooted.item;

import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
public class ModItemGroups {
    public static final ItemGroup HOWLINGMOONREBOOTEDTAB = FabricItemGroupBuilder.build(new Identifier(howlingmoon_rebooted.MOD_ID, "howlingmoonrebootedtab"),
            () -> new ItemStack(ModItems.SILVER_INGOT));
}
