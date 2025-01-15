package com.yeetdot.pathogens.datagen;

import com.yeetdot.pathogens.block.ModBlocks;
import com.yeetdot.pathogens.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerBuiltin(ModBlocks.TILE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CYANIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STILL_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CEREMONIAL_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STILL_WATER_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_BOTTLE, Models.GENERATED);
    }
}
