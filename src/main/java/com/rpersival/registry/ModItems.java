package com.rpersival.registry;

import com.rpersival.blocks.RegistryItem;
import com.rpersival.util.ItemSettingsGenerator;
import com.rpersival.util.Util;
import net.minecraft.item.Item;

import java.util.List;

public class ModItems {

    @Register
    public static final RegistryItem TEST_ITEM = new RegistryItem(new Item(ItemSettingsGenerator.getDefaultItemSettings()),
            "test_item");

    public static List<RegistryItem> getModItems() {
        return Util.getRegistryFields(ModItems.class, RegistryItem.class);
    }
}
