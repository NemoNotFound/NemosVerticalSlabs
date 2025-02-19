package com.nemonotfound.nemos.vertical.slabs;

import com.nemonotfound.nemos.vertical.slabs.block.ModBlocks;
import com.nemonotfound.nemos.vertical.slabs.item.ModItemGroups;
import com.nemonotfound.nemos.vertical.slabs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosVerticalSlabs implements ModInitializer {

	public static final String MOD_ID = "nemos-vertical-slabs";
	public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Vertical Slabs!");

		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
	}
}