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
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Pale Oak Vertical Slab");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Bamboo Vertical Slab");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Bamboo Mosaic Vertical Slab");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Crimson Vertical Slab");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Warped Vertical Slab");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Stone Vertical Slab");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Cobblestone Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Mossy Cobblestone Vertical Slab");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Smooth Stone Vertical Slab");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Stone Brick Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Mossy Stone Brick Vertical Slab");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Granite Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Polished Granite Vertical Slab");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Diorite Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Polished Diorite Vertical Slab");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Andesite Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Polished Andesite Vertical Slab");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Cobbled Deepslate Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Polished Deepslate Vertical Slab");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Deepslate Brick Vertical Slab");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Deepslate Tile Vertical Slab");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Tuff Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Polished Tuff Vertical Slab");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Tuff Brick Vertical Slab");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Brick Vertical Slab");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Mud Brick Vertical Slab");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Smooth Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Cut Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Red Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Smooth Red Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Cut Red Sandstone Vertical Slab");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Prismarine Vertical Slab");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Prismarine Brick Vertical Slab");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Dark Prismarine Vertical Slab");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Nether Brick Vertical Slab");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Red Nether Brick Vertical Slab");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Blackstone Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Polished Blackstone Vertical Slab");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Polished Blackstone Brick Vertical Slab");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "End Stone Brick Vertical Slab");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Purpur Vertical Slab");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Quartz Vertical Slab");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Smooth Quartz Vertical Slab");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Exposed Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Weathered Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Oxidized Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Waxed Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Waxed Exposed Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Waxed Weathered Cut Copper Vertical Slab");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Waxed Oxidized Cut Copper Vertical Slab");
    }
}
