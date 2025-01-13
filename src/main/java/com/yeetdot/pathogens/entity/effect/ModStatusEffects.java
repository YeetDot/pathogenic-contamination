package com.yeetdot.pathogens.entity.effect;

import com.yeetdot.pathogens.Pathogens;
import com.yeetdot.pathogens.entity.effect.effects.AnaerobicMetabolism;
import com.yeetdot.pathogens.entity.effect.effects.CyanidePoisoning;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final RegistryEntry<StatusEffect> ANAEROBIC_METABOLISM = register("anaerobic_metabolism", new AnaerobicMetabolism());
    public static final RegistryEntry<StatusEffect> CYANIDE_POISONING = register("cyanide_poisoning", new CyanidePoisoning());

    private static RegistryEntry<StatusEffect> register(String name, StatusEffect effect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Pathogens.MOD_ID, name), effect);
    }

    public static void registerModStatusEffects() {}
}
