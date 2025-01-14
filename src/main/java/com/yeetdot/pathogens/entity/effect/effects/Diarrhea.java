package com.yeetdot.pathogens.entity.effect.effects;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;

public class Diarrhea extends StatusEffect {
    public Diarrhea() {
        super(StatusEffectCategory.HARMFUL, 0x724622);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        if (world.random.nextDouble() < 0.01) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 9));
            ItemEntity item = new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.COCOA_BEANS));
            world.spawnEntity(item);
        }
        return super.applyUpdateEffect(world, entity, amplifier);
    }
}