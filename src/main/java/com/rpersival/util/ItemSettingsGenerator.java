package com.rpersival.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ItemSettingsGenerator {

    public static Item.Settings getDefaultItemSettings() {
        return new FabricItemSettings();
    }
}
