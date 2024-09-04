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
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_VERTICAL_SLAB, Ingredient.ofItems(Items.STONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLESTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.COBBLESTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.MOSSY_COBBLESTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_STONE_VERTICAL_SLAB, Ingredient.ofItems(Items.SMOOTH_STONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.STONE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.MOSSY_STONE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRANITE_VERTICAL_SLAB, Ingredient.ofItems(Items.GRANITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_GRANITE_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_GRANITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIORITE_VERTICAL_SLAB, Ingredient.ofItems(Items.DIORITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DIORITE_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_DIORITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANDESITE_VERTICAL_SLAB, Ingredient.ofItems(Items.ANDESITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_ANDESITE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Ingredient.ofItems(Items.COBBLED_DEEPSLATE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_DEEPSLATE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.DEEPSLATE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Ingredient.ofItems(Items.DEEPSLATE_TILES));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MUD_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.MUD_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.SMOOTH_SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.CUT_SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.RED_SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.SMOOTH_RED_SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.CUT_RED_SANDSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_VERTICAL_SLAB, Ingredient.ofItems(Items.PRISMARINE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.PRISMARINE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_PRISMARINE_VERTICAL_SLAB, Ingredient.ofItems(Items.DARK_PRISMARINE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NETHER_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.NETHER_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.RED_NETHER_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACKSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.BLACKSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_BLACKSTONE));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_STONE_BRICK_VERTICAL_SLAB, Ingredient.ofItems(Items.END_STONE_BRICKS));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPUR_VERTICAL_SLAB, Ingredient.ofItems(Items.PURPUR_BLOCK));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.QUARTZ_VERTICAL_SLAB, Ingredient.ofItems(Items.QUARTZ_BLOCK));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Ingredient.ofItems(Items.SMOOTH_QUARTZ));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.EXPOSED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.WEATHERED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.OXIDIZED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.WAXED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.WAXED_EXPOSED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.WAXED_WEATHERED_CUT_COPPER));
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Ingredient.ofItems(Items.WAXED_OXIDIZED_CUT_COPPER));

        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_VERTICAL_SLAB, Items.STONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLESTONE_VERTICAL_SLAB, Items.COBBLESTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Items.MOSSY_COBBLESTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_STONE_VERTICAL_SLAB, Items.SMOOTH_STONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Items.MOSSY_STONE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRANITE_VERTICAL_SLAB, Items.GRANITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.POLISHED_GRANITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIORITE_VERTICAL_SLAB, Items.DIORITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.POLISHED_DIORITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANDESITE_VERTICAL_SLAB, Items.ANDESITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.POLISHED_ANDESITE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_TILES);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRICK_VERTICAL_SLAB, Items.BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MUD_BRICK_VERTICAL_SLAB, Items.MUD_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.CUT_SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_RED_SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.CUT_RED_SANDSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_VERTICAL_SLAB, Items.PRISMARINE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_BRICK_VERTICAL_SLAB, Items.PRISMARINE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_PRISMARINE_VERTICAL_SLAB, Items.DARK_PRISMARINE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NETHER_BRICK_VERTICAL_SLAB, Items.NETHER_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK_VERTICAL_SLAB, Items.RED_NETHER_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_STONE_BRICK_VERTICAL_SLAB, Items.END_STONE_BRICKS);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPUR_VERTICAL_SLAB, Items.PURPUR_BLOCK);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.QUARTZ_VERTICAL_SLAB, Items.QUARTZ_BLOCK);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Items.SMOOTH_QUARTZ);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_COPPER_VERTICAL_SLAB, Items.CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_CUT_COPPER);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER);
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
