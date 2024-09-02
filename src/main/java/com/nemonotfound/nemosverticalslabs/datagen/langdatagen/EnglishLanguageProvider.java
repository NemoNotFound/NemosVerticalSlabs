package com.nemonotfound.nemosverticalslabs.datagen.langdatagen;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Oak Vertical Slab");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Spruce Vertical Slab");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Birch Vertical Slab");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Jungle Vertical Slab");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Acacia Vertical Slab");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Dark Oak Vertical Slab");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Mangrove Vertical Slab");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Cherry Vertical Slab");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Bamboo Vertical Slab");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Bamboo Mosaic Vertical Slab");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Crimson Vertical Slab");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Warped Vertical Slab");
    }
}
