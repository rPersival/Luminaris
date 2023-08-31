package com.rpersival.items;

import com.rpersival.Luminarium;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RegistryGroup {
    private final ItemGroup group;

    private final RegistryKey<ItemGroup> registryKey;

    public RegistryGroup(ItemGroup group, RegistryKey<ItemGroup> registryKey) {
        this.group = group;
        this.registryKey = registryKey;
    }

    public RegistryGroup(String name) {
        this.group = FabricItemGroup.builder().displayName(
                Text.translatable(Luminarium.MOD_ID + ".group." + name)).build();
        this.registryKey = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Luminarium.MOD_ID, name));
    }

    public RegistryGroup(String name, ItemStack icon) {
        this.group = FabricItemGroup.builder().displayName(
                Text.translatable("itemGroup." + Luminarium.MOD_ID + "." + name))
                .icon(() -> icon).build();
        this.registryKey = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Luminarium.MOD_ID, name));
    }

    public ItemGroup getGroup() {
        return group;
    }

    public RegistryKey<ItemGroup> getRegistryKey() {
        return registryKey;
    }
}
