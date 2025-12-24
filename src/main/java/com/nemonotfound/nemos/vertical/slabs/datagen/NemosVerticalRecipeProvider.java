package com.nemonotfound.nemos.vertical.slabs.datagen;

import biomesoplenty.api.item.BOPItems;
import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import com.nemonotfound.nemos.vertical.slabs.world.item.VerticalSlabItems;
import com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.potionstudios.biomeswevegone.world.level.block.BWGBlocks;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class NemosVerticalRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(output, providerCompletableFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                createWoodenVerticalSlabRecipe(VerticalSlabItems.OAK_VERTICAL_SLAB, Items.OAK_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.SPRUCE_VERTICAL_SLAB, Items.SPRUCE_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.BIRCH_VERTICAL_SLAB, Items.BIRCH_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.JUNGLE_VERTICAL_SLAB, Items.JUNGLE_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.ACACIA_VERTICAL_SLAB, Items.ACACIA_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.DARK_OAK_VERTICAL_SLAB, Items.DARK_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MANGROVE_VERTICAL_SLAB, Items.MANGROVE_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CHERRY_VERTICAL_SLAB, Items.CHERRY_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_OAK_VERTICAL_SLAB, Items.PALE_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.BAMBOO_VERTICAL_SLAB, Items.BAMBOO_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.BAMBOO_MOSAIC_VERTICAL_SLAB, Items.BAMBOO_MOSAIC);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_VERTICAL_SLAB, Items.CRIMSON_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_VERTICAL_SLAB, Items.WARPED_PLANKS);
                createVerticalSlabRecipe(VerticalSlabItems.STONE_VERTICAL_SLAB, Items.STONE);
                createVerticalSlabRecipe(VerticalSlabItems.COBBLESTONE_VERTICAL_SLAB, Items.COBBLESTONE);
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Items.MOSSY_COBBLESTONE);
                createVerticalSlabRecipe(VerticalSlabItems.SMOOTH_STONE_VERTICAL_SLAB, Items.SMOOTH_STONE);
                createVerticalSlabRecipe(VerticalSlabItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Items.MOSSY_STONE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.GRANITE_VERTICAL_SLAB, Items.GRANITE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.POLISHED_GRANITE);
                createVerticalSlabRecipe(VerticalSlabItems.DIORITE_VERTICAL_SLAB, Items.DIORITE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.POLISHED_DIORITE);
                createVerticalSlabRecipe(VerticalSlabItems.ANDESITE_VERTICAL_SLAB, Items.ANDESITE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.POLISHED_ANDESITE);
                createVerticalSlabRecipe(VerticalSlabItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE);
                createVerticalSlabRecipe(VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_TILES);
                createVerticalSlabRecipe(VerticalSlabItems.TUFF_VERTICAL_SLAB, Items.TUFF);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_TUFF_VERTICAL_SLAB, Items.POLISHED_TUFF);
                createVerticalSlabRecipe(VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.BRICK_VERTICAL_SLAB, Items.BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.MUD_BRICK_VERTICAL_SLAB, Items.MUD_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.CUT_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_RED_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.CUT_RED_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.PRISMARINE_VERTICAL_SLAB, Items.PRISMARINE);
                createVerticalSlabRecipe(VerticalSlabItems.PRISMARINE_BRICK_VERTICAL_SLAB, Items.PRISMARINE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.DARK_PRISMARINE_VERTICAL_SLAB, Items.DARK_PRISMARINE);
                createVerticalSlabRecipe(VerticalSlabItems.NETHER_BRICK_VERTICAL_SLAB, Items.NETHER_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.RED_NETHER_BRICK_VERTICAL_SLAB, Items.RED_NETHER_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE);
                createVerticalSlabRecipe(VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.END_STONE_BRICK_VERTICAL_SLAB, Items.END_STONE_BRICKS);
                createVerticalSlabRecipe(VerticalSlabItems.PURPUR_VERTICAL_SLAB, Items.PURPUR_BLOCK);
                createVerticalSlabRecipe(VerticalSlabItems.QUARTZ_VERTICAL_SLAB, Items.QUARTZ_BLOCK);
                createVerticalSlabRecipe(VerticalSlabItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Items.SMOOTH_QUARTZ);
                createVerticalSlabRecipe(VerticalSlabItems.CUT_COPPER_VERTICAL_SLAB, Items.CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(VerticalSlabItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.STONE_VERTICAL_SLAB, Items.STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.COBBLESTONE_VERTICAL_SLAB, Items.COBBLESTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_COBBLESTONE_VERTICAL_SLAB, Items.MOSSY_COBBLESTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_STONE_VERTICAL_SLAB, Items.SMOOTH_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.STONE_BRICK_VERTICAL_SLAB, Items.STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_STONE_BRICK_VERTICAL_SLAB, Items.MOSSY_STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.GRANITE_VERTICAL_SLAB, Items.GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_GRANITE_VERTICAL_SLAB, Items.POLISHED_GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DIORITE_VERTICAL_SLAB, Items.DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_DIORITE_VERTICAL_SLAB, Items.POLISHED_DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.ANDESITE_VERTICAL_SLAB, Items.ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_ANDESITE_VERTICAL_SLAB, Items.POLISHED_ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.COBBLED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_DEEPSLATE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB, Items.DEEPSLATE_TILES, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.TUFF_VERTICAL_SLAB, Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_TUFF_VERTICAL_SLAB, Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.TUFF_VERTICAL_SLAB, Items.POLISHED_TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB, Items.POLISHED_TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB, Items.TUFF_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.BRICK_VERTICAL_SLAB, Items.BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MUD_BRICK_VERTICAL_SLAB, Items.MUD_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_SANDSTONE_VERTICAL_SLAB, Items.CUT_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Items.SMOOTH_RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_RED_SANDSTONE_VERTICAL_SLAB, Items.CUT_RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PRISMARINE_VERTICAL_SLAB, Items.PRISMARINE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PRISMARINE_BRICK_VERTICAL_SLAB, Items.PRISMARINE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.DARK_PRISMARINE_VERTICAL_SLAB, Items.DARK_PRISMARINE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.NETHER_BRICK_VERTICAL_SLAB, Items.NETHER_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.RED_NETHER_BRICK_VERTICAL_SLAB, Items.RED_NETHER_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_BLACKSTONE_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Items.POLISHED_BLACKSTONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.END_STONE_BRICK_VERTICAL_SLAB, Items.END_STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PURPUR_VERTICAL_SLAB, Items.PURPUR_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.QUARTZ_VERTICAL_SLAB, Items.QUARTZ_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_QUARTZ_VERTICAL_SLAB, Items.SMOOTH_QUARTZ, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_COPPER_VERTICAL_SLAB, Items.COPPER_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_COPPER_VERTICAL_SLAB, Items.CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.EXPOSED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WEATHERED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.OXIDIZED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_COPPER_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_EXPOSED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_WEATHERED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Items.WAXED_OXIDIZED_COPPER, 2);

                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_OAK_VERTICAL_SLAB, NemosMossyItems.MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_SPRUCE_VERTICAL_SLAB, NemosMossyItems.MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_BIRCH_VERTICAL_SLAB, NemosMossyItems.MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_JUNGLE_VERTICAL_SLAB, NemosMossyItems.MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_ACACIA_VERTICAL_SLAB, NemosMossyItems.MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_DARK_OAK_VERTICAL_SLAB, NemosMossyItems.MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_MANGROVE_VERTICAL_SLAB, NemosMossyItems.MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_CHERRY_VERTICAL_SLAB, NemosMossyItems.MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_PALE_OAK_VERTICAL_SLAB, NemosMossyItems.MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_BAMBOO_VERTICAL_SLAB, NemosMossyItems.MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, NemosMossyItems.MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_CRIMSON_VERTICAL_SLAB, NemosMossyItems.MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.MOSSY_WARPED_VERTICAL_SLAB, NemosMossyItems.MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.MOSSY_STONE.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.MOSSY_TUFF.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_OAK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_WARPED_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_STONE.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_TUFF.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.PALE_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.PALE_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.PALE_MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_STONE.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_TUFF.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.CRIMSON_MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_OAK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_STONE.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_TUFF.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(VerticalSlabItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_STONE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB, NemosMossyItems.WARPED_MOSSY_BRICKS.get(), 2);

                createVerticalSlabRecipe(VerticalSlabBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_WHITE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_WHITE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.WHITE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_ORANGE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_ORANGE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.ORANGE_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_BLACK_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_BLACK_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.BLACK_SANDSTONE);
                createVerticalSlabRecipe(VerticalSlabBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB, BOPItems.BRIMSTONE_BRICKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.FIR_VERTICAL_SLAB, BOPItems.FIR_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.PINE_VERTICAL_SLAB, BOPItems.PINE_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.MAPLE_VERTICAL_SLAB, BOPItems.MAPLE_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.REDWOOD_VERTICAL_SLAB, BOPItems.REDWOOD_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.MAHOGANY_VERTICAL_SLAB, BOPItems.MAHOGANY_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.JACARANDA_VERTICAL_SLAB, BOPItems.JACARANDA_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.PALM_VERTICAL_SLAB, BOPItems.PALM_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.WILLOW_VERTICAL_SLAB, BOPItems.WILLOW_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.DEAD_VERTICAL_SLAB, BOPItems.DEAD_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.MAGIC_VERTICAL_SLAB, BOPItems.MAGIC_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.UMBRAN_VERTICAL_SLAB, BOPItems.UMBRAN_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.HELLBARK_VERTICAL_SLAB, BOPItems.HELLBARK_PLANKS);
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.EMPYREAL_VERTICAL_SLAB, BOPItems.EMPYREAL_PLANKS);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_WHITE_SANDSTONE, 2);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_ORANGE_SANDSTONE, 2);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.SMOOTH_BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB, BOPItems.CUT_BLACK_SANDSTONE, 2);

                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB, BWGWood.ASPEN.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB, BWGWood.BAOBAB.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB, BWGWood.BLUE_ENCHANTED.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB, BWGWood.CIKA.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB, BWGWood.CYPRESS.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB, BWGWood.EBONY.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB, BWGWood.FIR.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB, BWGWood.FLORUS.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB, BWGWood.GREEN_ENCHANTED.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB, BWGWood.HOLLY.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB, BWGWood.IRONWOOD.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB, BWGWood.JACARANDA.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB, BWGWood.MAHOGANY.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB, BWGWood.MAPLE.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB, BWGWood.PALM.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB, BWGWood.PINE.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB, BWGWood.RAINBOW_EUCALYPTUS.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB, BWGWood.REDWOOD.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB, BWGWood.SAKURA.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB, BWGWood.SKYRIS.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB, BWGWood.SPIRIT.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB, BWGWood.WHITE_MANGROVE.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB, BWGWood.WILLOW.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB, BWGWood.WITCH_HAZEL.planks());
                createWoodenVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB, BWGWood.ZELKOVA.planks());

                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getSmoothSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getCutSandstone());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB, BWGBlocks.DACITE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB, BWGBlocks.DACITE_COBBLESTONE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB, BWGBlocks.DACITE_TILES_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_WHITE_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_WHITE_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_WHITE_DACITE_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_COBBLESTONE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_TILES_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB, BWGBlocks.RED_ROCK_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.RED_ROCK_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_RED_ROCK_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_RED_ROCK_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_RED_ROCK_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB, BWGBlocks.POLISHED_RED_ROCK_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB, BWGBlocks.RED_ROCK_TILES_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB, BWGBlocks.MOSSY_STONE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB, BWGBlocks.ROCKY_STONE_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB, BWGBlocks.PALE_MUD_BRICKS_SET.getBase());
                createVerticalSlabRecipe(VerticalSlabBlocks.BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB, BWGBlocks.CATTAIL_THATCH.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLACK_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WHITE_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.BLUE_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PURPLE_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB, BWGBlocks.PINK_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getSmoothSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB, BWGBlocks.WINDSWEPT_SAND_SET.getCutSandstone(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB, BWGBlocks.DACITE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB, BWGBlocks.DACITE_COBBLESTONE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB, BWGBlocks.DACITE_TILES_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_WHITE_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_WHITE_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_WHITE_DACITE_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_COBBLESTONE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB, BWGBlocks.WHITE_DACITE_TILES_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB, BWGBlocks.RED_ROCK_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.RED_ROCK_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.CRACKED_RED_ROCK_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.MOSSY_RED_ROCK_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB, BWGBlocks.CHISELED_RED_ROCK_BRICKS_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB, BWGBlocks.POLISHED_RED_ROCK_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB, BWGBlocks.RED_ROCK_TILES_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB, BWGBlocks.MOSSY_STONE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB, BWGBlocks.ROCKY_STONE_SET.getBase(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, VerticalSlabBlocks.BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB, BWGBlocks.PALE_MUD_BRICKS_SET.getBase(), 2);
            }

            public void createWoodenVerticalSlabRecipe(ItemLike result, ItemLike input) {
                this.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_wood", this.has(ItemTags.PLANKS))
                        .save(this.output);
            }

            public void createVerticalSlabRecipe(ItemLike result, ItemLike input) {
                this.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs Recipes";
    }
}
