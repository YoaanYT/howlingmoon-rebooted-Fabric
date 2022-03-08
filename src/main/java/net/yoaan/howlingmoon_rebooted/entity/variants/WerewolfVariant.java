package net.yoaan.howlingmoon_rebooted.entity.variants;

import java.util.Arrays;
import java.util.Comparator;

public enum WerewolfVariant  {
    WHITE(0),
    BLACK(1),
    TIMBER(2),
    KILLER(3);

    private static final WerewolfVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WerewolfVariant::getId)).toArray(WerewolfVariant[]::new);
    private final int id;

    WerewolfVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static WerewolfVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}