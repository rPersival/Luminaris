package com.rpersival.blocks;

import com.rpersival.items.ModItemGroups;
import com.rpersival.util.ItemSettingsGenerator;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class RegistryItemBlock {
    private final String name;
    private final Block block;
    private final Item.Settings itemSettings;
    private final RegistryKey<ItemGroup> group;

    public RegistryItemBlock(String name, Block block, Item.Settings itemSettings, RegistryKey<ItemGroup> group) {
        this.name = name;
        this.block = block;
        this.itemSettings = itemSettings;
        this.group = group;
    }

    public RegistryItemBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        this.name = name;
        this.block = block;
        this.group = group;
        this.itemSettings = ItemSettingsGenerator.getDefaultItemSettings();
    }

    public RegistryItemBlock(String name, Block block) {
        this.name = name;
        this.block = block;
        this.group = ModItemGroups.LUMINARIUM_GROUP.getRegistryKey();
        this.itemSettings = ItemSettingsGenerator.getDefaultItemSettings();
    }

    public String getName() {
        return name;
    }

    public Block getBlock() {
        return block;
    }

    public RegistryKey<ItemGroup> getGroup() {
        return group;
    }

    public BlockItem asItem() {
        return new BlockItem(this.block, this.itemSettings);
    }
}
