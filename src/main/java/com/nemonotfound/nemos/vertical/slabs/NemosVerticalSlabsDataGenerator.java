package com.nemonotfound.nemos.vertical.slabs;

import com.nemonotfound.nemos.vertical.slabs.datagen.*;
import com.nemonotfound.nemos.vertical.slabs.datagen.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosVerticalSlabsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(NemosVerticalRecipeProvider::new);
	}
}
