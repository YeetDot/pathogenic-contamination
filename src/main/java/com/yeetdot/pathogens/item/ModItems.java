package com.yeetdot.pathogens.item;

import com.yeetdot.pathogens.Pathogens;
import com.yeetdot.pathogens.fluid.ModFluids;
import com.yeetdot.pathogens.item.custom.CeremonialDaggerItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item CYANIDE = register("cyanide", Item::new, new Item.Settings().component(DataComponentTypes.CONSUMABLE, ModConsumableComponents.CYANIDE));
    public static final Item STILL_WATER_BUCKET = register("still_water_bucket", settings -> new BucketItem(ModFluids.STILL_WATER, settings), new Item.Settings());
    public static final Item STILL_WATER_BOTTLE = register("still_water_bottle", Item::new, new Item.Settings().maxCount(1)
            .component(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT)
            .component(DataComponentTypes.CONSUMABLE, ModConsumableComponents.STILL_WATER)
            .useRemainder(Items.GLASS_BOTTLE));
    public static final Item CEREMONIAL_DAGGER = register("ceremonial_dagger", CeremonialDaggerItem::new, new Item.Settings().maxCount(1));
    public static final Item BLOOD_BOTTLE = register("blood_bottle", Item::new, new Item.Settings().maxCount(16).recipeRemainder(Items.GLASS_BOTTLE));

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
