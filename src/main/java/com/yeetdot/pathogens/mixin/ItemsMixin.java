package com.yeetdot.pathogens.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Items.class)
public abstract class ItemsMixin {
    @ModifyExpressionValue(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=milk_bucket")), at = @At(value = "FIELD", target = "Lnet/minecraft/component/type/ConsumableComponents;MILK_BUCKET:Lnet/minecraft/component/type/ConsumableComponent;", ordinal = 0))
    private static ConsumableComponent removeConsumableComponentForMilkBucket(ConsumableComponent original) {
        return null;
    }
}
