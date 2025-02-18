package com.nemonotfound.nemos.vertical.slabs;

import com.nemonotfound.nemos.vertical.slabs.datagen.*;
import com.nemonotfound.nemos.vertical.slabs.datagen.langdatagen.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosVerticalSlabsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(WoodcuttingRecipeGenerator::new);
	}
}
