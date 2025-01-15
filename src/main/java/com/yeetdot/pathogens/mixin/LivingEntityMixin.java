package com.yeetdot.pathogens.mixin;

import com.yeetdot.pathogens.entity.effect.ModStatusEffects;
import com.yeetdot.pathogens.util.ModTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends EntityMixin {
    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Inject(at = @At("HEAD"), method = "baseTick")
    private void stillWaterEffect(CallbackInfo ci) {
        if (pathogenic_contamination$isTouchingFluid(ModTags.Fluids.STILL_WATER)) {
            this.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ANAEROBIC_METABOLISM, 1200));
            this.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DIARRHEA, 1200));
        }
    }
}
