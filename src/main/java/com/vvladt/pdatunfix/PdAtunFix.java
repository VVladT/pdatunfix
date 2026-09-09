package com.vvladt.pdatunfix;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(PdAtunFix.MOD_ID)
public final class PdAtunFix {

    public static final String MOD_ID = "pd_atunfix";

    public PdAtunFix(IEventBus modEventBus) {
        modEventBus.addListener(AtunFixEvents::registerAttributes);
    }
}