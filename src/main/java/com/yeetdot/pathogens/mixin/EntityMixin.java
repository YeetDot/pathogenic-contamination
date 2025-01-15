package com.yeetdot.pathogens.mixin;

import com.yeetdot.pathogens.util.EntityUtil;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
public abstract class EntityMixin implements EntityUtil {

    @Shadow public abstract double getY();

    @Shadow public abstract double getX();

    @Shadow public abstract double getZ();

    @Shadow public abstract World getWorld();

    @Override
    public boolean pathogenic_contamination$isTouchingFluid(TagKey<Fluid> fluidTag) {
        BlockPos blockPos = BlockPos.ofFloored(this.getX(), this.getY(), this.getZ());
        FluidState fluidState = this.getWorld().getFluidState(blockPos);
        double e = (float)blockPos.getY() + fluidState.getHeight(this.getWorld(), blockPos);
        return e > 0.1 && fluidState.isIn(fluidTag);
    }
}
