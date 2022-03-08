package net.yoaan.howlingmoon_rebooted.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;

public class ModEntities {
    public static final EntityType<WerewolfEntity> WEREWOLF = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(howlingmoon_rebooted.MOD_ID, "werewolf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WerewolfEntity::new)
                    .dimensions(EntityDimensions.fixed(1.01f, 1.01f)).build());
}
