package com.yeetdot.pathogens.item.custom;

import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CeremonialDaggerItem extends Item {
    public CeremonialDaggerItem(Settings settings) {
        super(settings.attributeModifiers(AttributeModifiersComponent.builder().add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()));
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world instanceof ServerWorld serverWorld) {
            if (user.isSneaking() && hand == Hand.MAIN_HAND) {
                user.damage(serverWorld, user.getDamageSources().mobAttack(user), 2.0F);
                user.getStackInHand(hand).damage(1, serverWorld, (ServerPlayerEntity) user, item -> user.sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                if (user.getStackInHand(Hand.OFF_HAND).isOf(Items.GLASS_BOTTLE)) {
                    user.dropItem(serverWorld, Items.HONEY_BOTTLE);
                    if (!user.isCreative()) user.getStackInHand(Hand.OFF_HAND).decrement(1);
                }
            }
        }
        return user.isSneaking() ? ActionResult.SUCCESS : ActionResult.PASS;
    }


}
