package com.yeetdot.pathogens.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.*;

@Mixin(Items.class)
public abstract class ItemsMixin {
    @Shadow
    public static Item register(String id, Item.Settings settings) {
        return null;
    }

    @Shadow @Final public static Item BUCKET;
//    @Shadow
//    public static final Item MILK_BUCKET = Registry.register(Registries.ITEM, Identifier.ofVanilla("milk_bucket"),
//            new Item(new Item.Settings().recipeRemainder(BUCKET).maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.ofVanilla("milk_bucket")))));
}
