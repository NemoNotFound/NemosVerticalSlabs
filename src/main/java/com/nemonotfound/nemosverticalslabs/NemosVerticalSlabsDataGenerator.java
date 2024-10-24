package com.nemonotfound.nemosverticalslabs;

import com.nemonotfound.nemosverticalslabs.datagen.BlockTagProvider;
import com.nemonotfound.nemosverticalslabs.datagen.LootTableProvider;
import com.nemonotfound.nemosverticalslabs.datagen.RecipeProvider;
import com.nemonotfound.nemosverticalslabs.datagen.langdatagen.EnglishLanguageProvider;
import com.nemonotfound.nemosverticalslabs.datagen.ModelProvider;
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
	}
}
