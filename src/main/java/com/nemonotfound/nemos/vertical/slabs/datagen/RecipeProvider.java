package com.nemonotfound.nemos.vertical.slabs.datagen;

import com.nemonotfound.nemos.vertical.slabs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OAK_VERTICAL_SLAB, Items.OAK_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SPRUCE_VERTICAL_SLAB, Items.SPRUCE_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BIRCH_VERTICAL_SLAB, Items.BIRCH_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JUNGLE_VERTICAL_SLAB, Items.JUNGLE_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ACACIA_VERTICAL_SLAB, Items.ACACIA_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_OAK_VERTICAL_SLAB, Items.DARK_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MANGROVE_VERTICAL_SLAB, Items.MANGROVE_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHERRY_VERTICAL_SLAB, Items.CHERRY_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PALE_OAK_VERTICAL_SLAB, Items.PALE_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAMBOO_VERTICAL_SLAB, Items.BAMBOO_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAMBOO_MOSAIC_VERTICAL_SLAB, Items.BAMBOO_MOSAIC);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CRIMSON_VERTICAL_SLAB, Items.CRIMSON_PLANKS);
                createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WARPED_VERTICAL_SLAB, Items.WARPED_PLANKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_VERTICAL_SLAB, Items.STONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLESTONE_VERTICAL_SLAB, Items.COBBLESTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Items.MOSSY_COBBLESTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_STONE_VERTICAL_SLAB, Items.SMOOTH_STONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Items.MOSSY_STONE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRANITE_VERTICAL_SLAB, Items.GRANITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.POLISHED_GRANITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIORITE_VERTICAL_SLAB, Items.DIORITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.POLISHED_DIORITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANDESITE_VERTICAL_SLAB, Items.ANDESITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.POLISHED_ANDESITE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_TILES);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_VERTICAL_SLAB, Items.TUFF);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_TUFF_VERTICAL_SLAB, Items.POLISHED_TUFF);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRICK_VERTICAL_SLAB, Items.BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MUD_BRICK_VERTICAL_SLAB, Items.MUD_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.CUT_SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_RED_SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.CUT_RED_SANDSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_VERTICAL_SLAB, Items.PRISMARINE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_BRICK_VERTICAL_SLAB, Items.PRISMARINE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_PRISMARINE_VERTICAL_SLAB, Items.DARK_PRISMARINE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NETHER_BRICK_VERTICAL_SLAB, Items.NETHER_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK_VERTICAL_SLAB, Items.RED_NETHER_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_STONE_BRICK_VERTICAL_SLAB, Items.END_STONE_BRICKS);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPUR_VERTICAL_SLAB, Items.PURPUR_BLOCK);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.QUARTZ_VERTICAL_SLAB, Items.QUARTZ_BLOCK);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Items.SMOOTH_QUARTZ);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_COPPER_VERTICAL_SLAB, Items.CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER);

                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_VERTICAL_SLAB, Items.STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLESTONE_VERTICAL_SLAB, Items.COBBLESTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Items.MOSSY_COBBLESTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_STONE_VERTICAL_SLAB, Items.SMOOTH_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Items.MOSSY_STONE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.GRANITE_VERTICAL_SLAB, Items.GRANITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.GRANITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.POLISHED_GRANITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DIORITE_VERTICAL_SLAB, Items.DIORITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.DIORITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.POLISHED_DIORITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.ANDESITE_VERTICAL_SLAB, Items.ANDESITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.ANDESITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.POLISHED_ANDESITE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_TILES, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_VERTICAL_SLAB, Items.TUFF, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_TUFF_VERTICAL_SLAB, Items.TUFF, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_VERTICAL_SLAB, Items.POLISHED_TUFF, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_BRICK_VERTICAL_SLAB, Items.POLISHED_TUFF, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.BRICK_VERTICAL_SLAB, Items.BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MUD_BRICK_VERTICAL_SLAB, Items.MUD_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.CUT_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_RED_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.CUT_RED_SANDSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_VERTICAL_SLAB, Items.PRISMARINE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMARINE_BRICK_VERTICAL_SLAB, Items.PRISMARINE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.DARK_PRISMARINE_VERTICAL_SLAB, Items.DARK_PRISMARINE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.NETHER_BRICK_VERTICAL_SLAB, Items.NETHER_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_NETHER_BRICK_VERTICAL_SLAB, Items.RED_NETHER_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.END_STONE_BRICK_VERTICAL_SLAB, Items.END_STONE_BRICKS, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.PURPUR_VERTICAL_SLAB, Items.PURPUR_BLOCK, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.QUARTZ_VERTICAL_SLAB, Items.QUARTZ_BLOCK, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Items.SMOOTH_QUARTZ, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_COPPER_VERTICAL_SLAB, Items.COPPER_BLOCK, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.CUT_COPPER_VERTICAL_SLAB, Items.CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_COPPER_BLOCK, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_COPPER, 2);
            }

            public void createWoodenVerticalSlabRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                this.createShaped(category, output, 6)
                        .input('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .criterion("has_wood", this.conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);
            }

            public void createVerticalSlabRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                this.createShaped(category, output, 6)
                        .input('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Nemo's Vertical Slabs Recipes";
    }
}
