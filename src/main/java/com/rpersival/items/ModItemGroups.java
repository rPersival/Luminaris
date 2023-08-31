package com.rpersival.items;

import com.rpersival.registry.Register;
import com.rpersival.util.Util;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.List;

public class ModItemGroups {
    @Register
    public static final RegistryGroup LUMINARIUM_GROUP = new RegistryGroup("luminarium_group",
            new ItemStack(Items.DIAMOND_AXE));

    public static List<RegistryGroup> getModGroups() {
        return Util.getRegistryFields(ModItemGroups.class, RegistryGroup.class);
    }
}
