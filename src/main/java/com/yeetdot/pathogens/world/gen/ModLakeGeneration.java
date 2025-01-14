package com.yeetdot.pathogens.world.gen;

import com.yeetdot.pathogens.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModLakeGeneration {
    public static void generateLakes() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.LAKES, ModPlacedFeatures.STILL_WATER_PUDDLE_PLACED_KEY);
    }
}
