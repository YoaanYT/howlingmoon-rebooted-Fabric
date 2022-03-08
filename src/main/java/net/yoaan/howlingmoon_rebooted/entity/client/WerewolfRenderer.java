package net.yoaan.howlingmoon_rebooted.entity.client;

import com.google.common.collect.Maps;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.entity.variants.WerewolfVariant;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class WerewolfRenderer extends GeoEntityRenderer<WerewolfEntity> {
    public static final Map<WerewolfVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WerewolfVariant.class), (map) -> {
                map.put(WerewolfVariant.WHITE,
                        new Identifier(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_white.png"));
                map.put(WerewolfVariant.BLACK,
                        new Identifier(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_black.png"));
                map.put(WerewolfVariant.TIMBER,
                        new Identifier(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_timber.png"));
                map.put(WerewolfVariant.KILLER,
                        new Identifier(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_killerwolf.png"));
            });

    public WerewolfRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WerewolfModel());
    }

    @Override
    public Identifier getTextureLocation(WerewolfEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}