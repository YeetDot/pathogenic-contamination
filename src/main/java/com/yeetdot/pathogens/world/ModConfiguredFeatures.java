package com.yeetdot.pathogens.world;

import com.yeetdot.pathogens.Pathogens;
import com.yeetdot.pathogens.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.LakeFeature;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> STILL_WATER_PUDDLE = registerKey("still_water_puddle");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, STILL_WATER_PUDDLE, Feature.LAKE, new LakeFeature.Config(BlockStateProvider.of(ModBlocks.STILL_WATER), BlockStateProvider.of(Blocks.COARSE_DIRT)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Pathogens.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }


}
