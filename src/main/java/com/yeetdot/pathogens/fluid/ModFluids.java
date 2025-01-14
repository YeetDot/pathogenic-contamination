package com.yeetdot.pathogens.fluid;

import com.yeetdot.pathogens.Pathogens;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid FLOWING_STILL_WATER = register("flowing_still_water", new StillWaterFluid.Flowing());
    public static final FlowableFluid STILL_WATER = register("still_water", new StillWaterFluid.Still());


    private static <T extends Fluid> T register(String name, T fluid) {
        return Registry.register(Registries.FLUID, Identifier.of(Pathogens.MOD_ID, name), fluid);
    }

    public static void registerModFluids() {}
}
