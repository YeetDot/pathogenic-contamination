package com.yeetdot.pathogens.entity.effect.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;

public class AnaerobicMetabolism extends StatusEffect {
    public AnaerobicMetabolism() {
        super(StatusEffectCategory.HARMFUL, 0x0);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration%5==0;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        if (world.random.nextDouble() < 0.1) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300));
        }
        if (world.random.nextDouble() < 0.1) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100));
        }

        return super.applyUpdateEffect(world, entity, amplifier);
    }
}
