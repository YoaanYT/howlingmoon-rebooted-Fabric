package net.yoaan.howlingmoon_rebooted.entity.client;

import net.minecraft.util.Identifier;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WerewolfModel extends AnimatedGeoModel<WerewolfEntity> {
    @Override
    public Identifier getModelLocation(WerewolfEntity entity) {
        return new Identifier(howlingmoon_rebooted.MOD_ID, "geo/werewolf.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WerewolfEntity entity) {
        return WerewolfRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public Identifier getAnimationFileLocation(WerewolfEntity entity) {
        return new Identifier(howlingmoon_rebooted.MOD_ID, "animations/werewolf.animation.json");
    }
}