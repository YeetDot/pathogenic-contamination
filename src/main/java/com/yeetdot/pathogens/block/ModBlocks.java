package com.yeetdot.pathogens.block;

import com.yeetdot.pathogens.Pathogens;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block TILE = register("tile", Block::new, AbstractBlock.Settings.create());

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory ,AbstractBlock.Settings settings) {
        Block block = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Pathogens.MOD_ID, name))));
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Pathogens.MOD_ID, name));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Pathogens.MOD_ID, name)), new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Pathogens.MOD_ID, name)))));
    }

    public static void registerModBlocks() {}
}
