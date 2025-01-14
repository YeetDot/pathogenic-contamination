package com.yeetdot.pathogens.util;

import com.yeetdot.pathogens.Pathogens;
import com.yeetdot.pathogens.PathogensClient;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Fluids {
        public static final TagKey<Fluid> STILL_WATER = createTag("still_water");

        private static TagKey<Fluid> createTag(String name) {
            return TagKey.of(RegistryKeys.FLUID, Identifier.of(Pathogens.MOD_ID, name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> STILL_WATER = createTag("still_water");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Pathogens.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Pathogens.MOD_ID, name));
        }
    }
}
