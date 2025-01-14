package com.yeetdot.pathogens.mixin;

import com.yeetdot.pathogens.block.ModBlocks;
import com.yeetdot.pathogens.entity.effect.ModStatusEffects;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends EntityMixin {
    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Override
    protected void onBlockCollision(BlockState state) {
        if (state.getBlock() == ModBlocks.STILL_WATER) {
            this.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ANAEROBIC_METABOLISM, 1000));
            this.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DIARRHEA, 1000));
        }
    }


}
