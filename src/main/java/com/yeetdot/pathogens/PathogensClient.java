package com.yeetdot.pathogens;

import com.yeetdot.pathogens.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class PathogensClient implements ClientModInitializer {
    @Override

    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WATER, ModFluids.FLOWING_STILL_WATER, new SimpleFluidRenderHandler(
                Identifier.of("minecraft:block/water_still"),
                Identifier.of("minecraft:block/water_still"),
                0x6C7A0E
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_WATER, ModFluids.FLOWING_STILL_WATER);
    }
}
