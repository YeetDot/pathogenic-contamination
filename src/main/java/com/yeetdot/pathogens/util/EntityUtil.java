package com.yeetdot.pathogens.util;

import net.minecraft.fluid.Fluid;
import net.minecraft.registry.tag.TagKey;

public interface EntityUtil {
    boolean pathogenic_contamination$isTouchingFluid(TagKey<Fluid> fluidTag);
}
