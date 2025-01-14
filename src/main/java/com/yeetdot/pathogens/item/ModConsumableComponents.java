package com.yeetdot.pathogens.item;

import com.yeetdot.pathogens.entity.effect.ModStatusEffects;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

public class ModConsumableComponents {
    public static final ConsumableComponent CYANIDE = ConsumableComponents.drink().consumeEffect(new ApplyEffectsConsumeEffect(
            List.of(new StatusEffectInstance(ModStatusEffects.ANAEROBIC_METABOLISM, 12000), new StatusEffectInstance(ModStatusEffects.CYANIDE_POISONING, 12000))
    )).build();

    public static final ConsumableComponent STILL_WATER = ConsumableComponents.drink().consumeEffect(new ApplyEffectsConsumeEffect(
            List.of(new StatusEffectInstance(ModStatusEffects.ANAEROBIC_METABOLISM, 12000), new StatusEffectInstance(ModStatusEffects.DIARRHEA, 12000))
    )).build();
}
