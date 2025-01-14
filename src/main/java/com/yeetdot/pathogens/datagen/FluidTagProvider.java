package com.yeetdot.pathogens.datagen;

import com.yeetdot.pathogens.fluid.ModFluids;
import com.yeetdot.pathogens.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.FluidTags;

import java.util.concurrent.CompletableFuture;

public class FluidTagProvider extends FabricTagProvider.FluidTagProvider {
    public FluidTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Fluids.STILL_WATER).add(ModFluids.STILL_WATER).add(ModFluids.FLOWING_STILL_WATER);
    }
}
