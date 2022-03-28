package net.yoaan.howlingmoon_rebooted.block;

import net.minecraft.util.SignType;
import net.yoaan.howlingmoon_rebooted.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType DRIED_OAK =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("dried_oak"));
}
