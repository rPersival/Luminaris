package com.rpersival.registry;

import com.rpersival.Luminarium;
import com.rpersival.blocks.RegistryItem;
import com.rpersival.blocks.RegistryItemBlock;
import com.rpersival.items.ModItemGroups;
import com.rpersival.items.RegistryGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.List;

public class RegistryHandler {

    public static void registerItems() {
        List<RegistryItem> modItems = ModItems.getModItems();
        for (RegistryItem item : modItems) {
            register(Registries.ITEM, item.getItem(), item.getName());
            addToGroup(item.getItem(), item.getGroup());
        }
    }

    public static void registerBlocks() {
        List<RegistryItemBlock> modBlocks = ModBlocks.getModBlocks();
        for (RegistryItemBlock block : modBlocks) {
            BlockItem item = block.asItem();

            register(Registries.ITEM, item, block.getName());
            addToGroup(item, block.getGroup());
            register(Registries.BLOCK, block.getBlock(), block.getName());
        }
    }

    public static void registerGroups() {
        List<RegistryGroup> modGroups = ModItemGroups.getModGroups();
        for (RegistryGroup group : modGroups) {
            register(Registries.ITEM_GROUP, group.getGroup(), group.getRegistryKey());
        }
    }

    public static void addToGroup(Item item, RegistryKey<ItemGroup> group) {
        if (group != null) {
            ItemGroupEvents.modifyEntriesEvent(group).register(x -> x.add(item));
        }
    }

    public static <T> void register(Registry<T> registry, T object, String name) {
        Registry.register(registry, new Identifier(Luminarium.MOD_ID, name), object);
    }

    public static <T> void register(Registry<T> registry, T object, RegistryKey<T> key) {
        Registry.register(registry, key, object);
    }
}
