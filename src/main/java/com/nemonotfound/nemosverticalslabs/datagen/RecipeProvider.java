package com.nemonotfound.nemosverticalslabs.datagen;

import com.nemonotfound.nemosverticalslabs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OAK_VERTICAL_SLAB, Ingredient.ofItems(Items.OAK_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SPRUCE_VERTICAL_SLAB, Ingredient.ofItems(Items.SPRUCE_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BIRCH_VERTICAL_SLAB, Ingredient.ofItems(Items.BIRCH_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JUNGLE_VERTICAL_SLAB, Ingredient.ofItems(Items.JUNGLE_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ACACIA_VERTICAL_SLAB, Ingredient.ofItems(Items.ACACIA_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_OAK_VERTICAL_SLAB, Ingredient.ofItems(Items.DARK_OAK_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MANGROVE_VERTICAL_SLAB, Ingredient.ofItems(Items.MANGROVE_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHERRY_VERTICAL_SLAB, Ingredient.ofItems(Items.CHERRY_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAMBOO_VERTICAL_SLAB, Ingredient.ofItems(Items.BAMBOO_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAMBOO_MOSAIC_VERTICAL_SLAB, Ingredient.ofItems(Items.BAMBOO_MOSAIC));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CRIMSON_VERTICAL_SLAB, Ingredient.ofItems(Items.CRIMSON_PLANKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WARPED_VERTICAL_SLAB, Ingredient.ofItems(Items.WARPED_PLANKS));
    }

    public static void createVerticalSlabRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, Ingredient input) {
        ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .criterion("has_wood", VanillaRecipeProvider.conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter);
    }
}
