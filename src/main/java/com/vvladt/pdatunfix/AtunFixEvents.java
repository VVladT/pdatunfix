package com.vvladt.pdatunfix;

import net.giuliano.peruviansdelight.entity.ModEntities;
import net.giuliano.peruviansdelight.entity.custom.AtunEntity;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

public final class AtunFixEvents {

    private AtunFixEvents() {
    }

    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(
                ModEntities.ATUN.get(),
                AtunEntity.createAttributes().build()
        );
    }
}
