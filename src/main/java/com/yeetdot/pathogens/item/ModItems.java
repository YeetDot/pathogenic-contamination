package com.yeetdot.pathogens.item;

import com.yeetdot.pathogens.Pathogens;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item CYANIDE = register("cyanide", Item::new, new Item.Settings().component(DataComponentTypes.CONSUMABLE, ModConsumableComponents.CYANIDE));

    private static Item register(String name, Function<Item.Settings, Item> factory,Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Pathogens.MOD_ID, name));
        Item item = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    private static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModItems() {}
}
