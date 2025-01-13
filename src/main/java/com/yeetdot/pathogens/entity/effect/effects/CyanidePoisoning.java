package com.yeetdot.pathogens.entity.effect.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;

public class CyanidePoisoning extends StatusEffect {
    public CyanidePoisoning() {
        super(StatusEffectCategory.HARMFUL, 0x50cccc);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration<=6000;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 600));
        return super.applyUpdateEffect(world, entity, amplifier);
    }
}