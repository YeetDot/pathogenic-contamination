package com.yeetdot.pathogens;

import com.yeetdot.pathogens.block.ModBlocks;
import com.yeetdot.pathogens.entity.effect.ModStatusEffects;
import com.yeetdot.pathogens.item.ModConsumableComponents;
import com.yeetdot.pathogens.item.ModItemGroups;
import com.yeetdot.pathogens.item.ModItems;
import com.yeetdot.pathogens.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pathogens implements ModInitializer {
	public static final String MOD_ID = "pathogens";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModStatusEffects.registerModStatusEffects();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}