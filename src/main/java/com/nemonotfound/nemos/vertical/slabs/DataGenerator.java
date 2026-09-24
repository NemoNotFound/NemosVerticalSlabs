package com.nemonotfound.nemos.vertical.slabs;

import com.nemonotfound.nemos.vertical.slabs.datagen.*;
import com.nemonotfound.nemos.vertical.slabs.datagen.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class DataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();
		var mossyPack = fabricDataGenerator.createBuiltinResourcePack(
				Identifier.fromNamespaceAndPath(MOD_ID, "mossy_vertical_slabs")
		);
		var biomesOPlentyPack = fabricDataGenerator.createBuiltinResourcePack(
				Identifier.fromNamespaceAndPath(MOD_ID, "biomesoplenty_vertical_slabs")
		);
		var biomesWeveGonePack = fabricDataGenerator.createBuiltinResourcePack(
				Identifier.fromNamespaceAndPath(MOD_ID, "biomeswevegone_vertical_slabs")
		);

		pack.addProvider((FabricDataGenerator.Pack.Factory<ModelProvider>)
				output -> new ModelProvider(output, GenerationTarget.MAIN));
		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider((output, registries) -> new LootTableProvider(output, registries, GenerationTarget.MAIN));
		pack.addProvider((output, registries) -> new NemosVerticalRecipeProvider(output, registries, GenerationTarget.MAIN));

		addCompatibilityProviders(mossyPack, GenerationTarget.MOSSY);
		addCompatibilityProviders(biomesOPlentyPack, GenerationTarget.BIOMES_O_PLENTY);
		addCompatibilityProviders(biomesWeveGonePack, GenerationTarget.BIOMES_WEVE_GONE);
	}

	private static void addCompatibilityProviders(FabricDataGenerator.Pack pack, GenerationTarget target) {
		pack.addProvider((FabricDataGenerator.Pack.Factory<ModelProvider>)
				output -> new ModelProvider(output, target));
		pack.addProvider((output, registries) -> new LootTableProvider(output, registries, target));
		pack.addProvider((output, registries) -> new NemosVerticalRecipeProvider(output, registries, target));
	}
}
