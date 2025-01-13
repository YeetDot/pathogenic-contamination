package com.yeetdot.pathogens.item;

import com.yeetdot.pathogens.Pathogens;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PATHOGENS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Pathogens.MOD_ID, "pathogens_item_group"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.pathogens.pathogens_item_group"))
                    .icon(() -> new ItemStack(ModItems.CYANIDE))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.CYANIDE);
                    }))
            .build());

    public static void registerModItemGroups() {}
}
