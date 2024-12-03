package com.nemonotfound.nemosverticalslabs.datagen;

import com.nemonotfound.nemosverticalslabs.item.ModItems;
import com.nemonotfound.nemos.woodcutter.datagen.WoodcutterRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.block.Blocks.*;

public class WoodcuttingRecipeProvider extends FabricRecipeProvider {

    public WoodcuttingRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new WoodcutterRecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, OAK_PLANKS, ModItems.OAK_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, SPRUCE_PLANKS, ModItems.SPRUCE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BIRCH_PLANKS, ModItems.BIRCH_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, JUNGLE_PLANKS, ModItems.JUNGLE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ACACIA_PLANKS, ModItems.ACACIA_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DARK_OAK_PLANKS, ModItems.DARK_OAK_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, MANGROVE_PLANKS, ModItems.MANGROVE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CHERRY_PLANKS, ModItems.CHERRY_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BAMBOO_PLANKS, ModItems.BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BAMBOO_MOSAIC, ModItems.BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, CRIMSON_PLANKS, ModItems.CRIMSON_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, WARPED_PLANKS, ModItems.WARPED_VERTICAL_SLAB, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.OAK_LOGS, "has_oak_logs", ModItems.OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.SPRUCE_LOGS, "has_spruce_logs", ModItems.SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.BIRCH_LOGS, "has_birch_logs", ModItems.BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.JUNGLE_LOGS, "has_jungle_logs", ModItems.JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.ACACIA_LOGS, "has_acacia_logs", ModItems.ACACIA_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.DARK_OAK_LOGS, "has_dark_oak_logs", ModItems.DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.MANGROVE_LOGS, "has_mangrove_logs", ModItems.MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.CHERRY_LOGS, "has_cherry_logs", ModItems.CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.BAMBOO_BLOCKS, "has_bamboo_blocks", ModItems.BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.CRIMSON_STEMS, "has_crimson_stems", ModItems.CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ItemTags.WARPED_STEMS, "has_warped_stems", ModItems.WARPED_VERTICAL_SLAB, 8);
            }
        };
    }

    @Override
    public String getName() {
        return "Nemo's Vertical Slabs Woodcutting Recipes";
    }
}
