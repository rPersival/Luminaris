package com.rpersival.registry;

import com.rpersival.blocks.RegistryItemBlock;
import com.rpersival.util.Util;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

import java.util.List;

public class ModBlocks {

    @Register
    public static final RegistryItemBlock TEST_BLOCK = new RegistryItemBlock(
            "test_block", new Block(FabricBlockSettings.create().strength(0.5f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));

    public static List<RegistryItemBlock> getModBlocks() {
        return Util.getRegistryFields(ModBlocks.class, RegistryItemBlock.class);
    }
}
