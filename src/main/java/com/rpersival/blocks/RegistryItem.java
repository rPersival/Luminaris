package com.rpersival.blocks;

import com.rpersival.items.ModItemGroups;
import com.rpersival.items.RegistryGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class RegistryItem {
    private final Item item;
    private final String name;
    private final RegistryKey<ItemGroup> group;

    public RegistryItem(Item item, String name) {
        this.item = item;
        this.name = name;
        this.group = ModItemGroups.LUMINARIUM_GROUP.getRegistryKey();
    }

    public RegistryItem(Item item, String name, RegistryGroup group) {
        this.item = item;
        this.name = name;
        this.group = group.getRegistryKey();
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public RegistryKey<ItemGroup> getGroup() {
        return group;
    }
}