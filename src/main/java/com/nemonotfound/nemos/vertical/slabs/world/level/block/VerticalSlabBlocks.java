package com.nemonotfound.nemos.vertical.slabs.world.level.block;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.Optional;
import java.util.function.Function;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.*;
import static net.minecraft.world.level.block.Blocks.*;

public class VerticalSlabBlocks {

    public static final Block OAK_VERTICAL_SLAB = registerVerticalSlab(
            "oak_vertical_slab",
            OAK_SLAB
    );
    public static final Block SPRUCE_VERTICAL_SLAB = registerVerticalSlab(
            "spruce_vertical_slab",
            SPRUCE_SLAB
    );
    public static final Block BIRCH_VERTICAL_SLAB = registerVerticalSlab(
            "birch_vertical_slab",
            BIRCH_SLAB
    );
    public static final Block JUNGLE_VERTICAL_SLAB = registerVerticalSlab(
            "jungle_vertical_slab",
            JUNGLE_SLAB
    );
    public static final Block ACACIA_VERTICAL_SLAB = registerVerticalSlab(
            "acacia_vertical_slab",
            ACACIA_SLAB
    );
    public static final Block DARK_OAK_VERTICAL_SLAB = registerVerticalSlab(
            "dark_oak_vertical_slab",
            DARK_OAK_SLAB
    );
    public static final Block MANGROVE_VERTICAL_SLAB = registerVerticalSlab(
            "mangrove_vertical_slab",
            MANGROVE_SLAB
    );
    public static final Block CHERRY_VERTICAL_SLAB = registerVerticalSlab(
            "cherry_vertical_slab",
            CHERRY_SLAB
    );
    public static final Block PALE_OAK_VERTICAL_SLAB = registerVerticalSlab(
            "pale_oak_vertical_slab",
            PALE_OAK_SLAB
    );
    public static final Block BAMBOO_VERTICAL_SLAB = registerVerticalSlab(
            "bamboo_vertical_slab",
            BAMBOO_SLAB
    );
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerVerticalSlab(
            "bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block CRIMSON_VERTICAL_SLAB = registerVerticalSlab(
            "crimson_vertical_slab",
            CRIMSON_SLAB
    );
    public static final Block WARPED_VERTICAL_SLAB = registerVerticalSlab(
            "warped_vertical_slab",
            WARPED_SLAB
    );
    public static final Block STONE_VERTICAL_SLAB = registerVerticalSlab(
            "stone_vertical_slab",
            STONE_SLAB
    );
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cobblestone_vertical_slab",
            COBBLESTONE_SLAB
    );
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            "mossy_cobblestone_vertical_slab",
            MOSSY_COBBLESTONE_SLAB
    );
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_stone_vertical_slab",
            SMOOTH_STONE_SLAB
    );
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "stone_brick_vertical_slab",
            STONE_BRICK_SLAB
    );
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "mossy_stone_brick_vertical_slab",
            MOSSY_STONE_BRICK_SLAB
    );
    public static final Block GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            "granite_vertical_slab",
            GRANITE_SLAB
    );
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_granite_vertical_slab",
            POLISHED_GRANITE_SLAB
    );
    public static final Block DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            "diorite_vertical_slab",
            DIORITE_SLAB
    );
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_diorite_vertical_slab",
            POLISHED_DIORITE_SLAB
    );
    public static final Block ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            "andesite_vertical_slab",
            ANDESITE_SLAB
    );
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_andesite_vertical_slab",
            POLISHED_ANDESITE_SLAB
    );
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            "cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_deepslate_vertical_slab",
            POLISHED_DEEPSLATE_SLAB
    );
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerVerticalSlab(
            "deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB
    );
    public static final Block TUFF_VERTICAL_SLAB = registerVerticalSlab(
            "tuff_vertical_slab",
            TUFF_SLAB
    );
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = registerVerticalSlab(
            "polished_tuff_vertical_slab",
            POLISHED_TUFF_SLAB
    );
    public static final Block TUFF_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB
    );
    public static final Block BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "brick_vertical_slab",
            BRICK_SLAB
    );
    public static final Block MUD_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "mud_brick_vertical_slab",
            MUD_BRICK_SLAB
    );
    public static final Block SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "sandstone_vertical_slab",
            SANDSTONE_SLAB
    );
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_sandstone_vertical_slab",
            SMOOTH_SANDSTONE_SLAB
    );
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cut_sandstone_vertical_slab",
            CUT_SANDSTONE_SLAB
    );
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "red_sandstone_vertical_slab",
            RED_SANDSTONE_SLAB
    );
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_red_sandstone_vertical_slab",
            SMOOTH_RED_SANDSTONE_SLAB
    );
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cut_red_sandstone_vertical_slab",
            CUT_RED_SANDSTONE_SLAB
    );
    public static final Block PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            "prismarine_vertical_slab",
            PRISMARINE_SLAB
    );
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "prismarine_brick_vertical_slab",
            PRISMARINE_BRICK_SLAB
    );
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            "dark_prismarine_vertical_slab",
            DARK_PRISMARINE_SLAB
    );
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "nether_brick_vertical_slab",
            NETHER_BRICK_SLAB
    );
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "red_nether_brick_vertical_slab",
            RED_NETHER_BRICK_SLAB
    );
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "blackstone_vertical_slab",
            BLACKSTONE_SLAB
    );
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_blackstone_vertical_slab",
            POLISHED_BLACKSTONE_SLAB
    );
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "polished_blackstone_brick_vertical_slab",
            POLISHED_BLACKSTONE_BRICK_SLAB
    );
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "end_stone_brick_vertical_slab",
            END_STONE_BRICK_SLAB
    );
    public static final Block PURPUR_VERTICAL_SLAB = registerVerticalSlab(
            "purpur_vertical_slab",
            PURPUR_SLAB
    );
    public static final Block QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            "quartz_vertical_slab",
            QUARTZ_SLAB
    );
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_quartz_vertical_slab",
            SMOOTH_QUARTZ_SLAB
    );
    public static final Block CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.UNAFFECTED,
            CUT_COPPER_SLAB
    );
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "exposed_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.EXPOSED,
            EXPOSED_CUT_COPPER_SLAB
    );
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "weathered_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.WEATHERED,
            WEATHERED_CUT_COPPER_SLAB
    );
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "oxidized_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.OXIDIZED,
            OXIDIZED_CUT_COPPER_SLAB
    );
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_cut_copper_vertical_slab",
            WAXED_CUT_COPPER_SLAB
    );
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_exposed_cut_copper_vertical_slab",
            WAXED_EXPOSED_CUT_COPPER_SLAB
    );
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_weathered_cut_copper_vertical_slab",
            WAXED_WEATHERED_CUT_COPPER_SLAB
    );
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_oxidized_cut_copper_vertical_slab",
            WAXED_OXIDIZED_CUT_COPPER_SLAB
    );

    public static final Block MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_oak_vertical_slab",
            OAK_SLAB
    );
    public static final Block MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_spruce_vertical_slab",
            SPRUCE_SLAB
    );
    public static final Block MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_birch_vertical_slab",
            BIRCH_SLAB
    );
    public static final Block MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_jungle_vertical_slab",
            JUNGLE_SLAB
    );
    public static final Block MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_acacia_vertical_slab",
            ACACIA_SLAB
    );
    public static final Block MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB
    );
    public static final Block MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_mangrove_vertical_slab",
            MANGROVE_SLAB
    );
    public static final Block MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_cherry_vertical_slab",
            CHERRY_SLAB
    );
    public static final Block MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB
    );
    public static final Block MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_bamboo_vertical_slab",
            BAMBOO_SLAB
    );
    public static final Block MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_crimson_vertical_slab",
            CRIMSON_SLAB
    );
    public static final Block MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_warped_vertical_slab",
            WARPED_SLAB
    );
    public static final Block MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_stone_vertical_slab",
            STONE_SLAB
    );
    public static final Block MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB
    );
    public static final Block MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_tuff_vertical_slab",
            TUFF_SLAB
    );
    public static final Block MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB
    );
    public static final Block MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_brick_vertical_slab",
            BRICK_SLAB
    );
    public static final Block PALE_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_oak_vertical_slab",
            OAK_SLAB
    );
    public static final Block PALE_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_spruce_vertical_slab",
            SPRUCE_SLAB
    );
    public static final Block PALE_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_birch_vertical_slab",
            BIRCH_SLAB
    );
    public static final Block PALE_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_jungle_vertical_slab",
            JUNGLE_SLAB
    );
    public static final Block PALE_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_acacia_vertical_slab",
            ACACIA_SLAB
    );
    public static final Block PALE_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB
    );
    public static final Block PALE_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB
    );
    public static final Block PALE_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_cherry_vertical_slab",
            CHERRY_SLAB
    );
    public static final Block PALE_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB
    );
    public static final Block PALE_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB
    );
    public static final Block PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block PALE_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_crimson_vertical_slab",
            CRIMSON_SLAB
    );
    public static final Block PALE_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_warped_vertical_slab",
            WARPED_SLAB
    );
    public static final Block PALE_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_stone_vertical_slab",
            STONE_SLAB
    );
    public static final Block PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB
    );
    public static final Block PALE_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_tuff_vertical_slab",
            TUFF_SLAB
    );
    public static final Block PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB
    );
    public static final Block PALE_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_brick_vertical_slab",
            BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_oak_vertical_slab",
            OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_spruce_vertical_slab",
            SPRUCE_SLAB
    );
    public static final Block CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_birch_vertical_slab",
            BIRCH_SLAB
    );
    public static final Block CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_jungle_vertical_slab",
            JUNGLE_SLAB
    );
    public static final Block CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_acacia_vertical_slab",
            ACACIA_SLAB
    );
    public static final Block CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB
    );
    public static final Block CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_cherry_vertical_slab",
            CHERRY_SLAB
    );
    public static final Block CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB
    );
    public static final Block CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_crimson_vertical_slab",
            CRIMSON_SLAB
    );
    public static final Block CRIMSON_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_warped_vertical_slab",
            WARPED_SLAB
    );
    public static final Block CRIMSON_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_stone_vertical_slab",
            STONE_SLAB
    );
    public static final Block CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB
    );
    public static final Block CRIMSON_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_tuff_vertical_slab",
            TUFF_SLAB
    );
    public static final Block CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_brick_vertical_slab",
            BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_oak_vertical_slab",
            OAK_SLAB
    );
    public static final Block WARPED_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_spruce_vertical_slab",
            SPRUCE_SLAB
    );
    public static final Block WARPED_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_birch_vertical_slab",
            BIRCH_SLAB
    );
    public static final Block WARPED_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_jungle_vertical_slab",
            JUNGLE_SLAB
    );
    public static final Block WARPED_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_acacia_vertical_slab",
            ACACIA_SLAB
    );
    public static final Block WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB
    );
    public static final Block WARPED_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB
    );
    public static final Block WARPED_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_cherry_vertical_slab",
            CHERRY_SLAB
    );
    public static final Block WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB
    );
    public static final Block WARPED_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB
    );
    public static final Block WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block WARPED_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_crimson_vertical_slab",
            CRIMSON_SLAB
    );
    public static final Block WARPED_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_warped_vertical_slab",
            WARPED_SLAB
    );
    public static final Block WARPED_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_stone_vertical_slab",
            STONE_SLAB
    );
    public static final Block WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB
    );
    public static final Block WARPED_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_tuff_vertical_slab",
            TUFF_SLAB
    );
    public static final Block WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_brick_vertical_slab",
            BRICK_SLAB
    );

    public static final Block CUT_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "cut_white_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "smooth_white_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "white_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "cut_orange_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "smooth_orange_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "orange_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block CUT_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "cut_black_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "smooth_black_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            "black_sandstone_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block BRIMSTONE_BRICK_VERTICAL_SLAB = registerBopVerticalSlab(
            "brimstone_brick_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.0F, 3.0F)
    );
    public static final Block FIR_VERTICAL_SLAB = registerBopVerticalSlab(
            "fir_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block PINE_VERTICAL_SLAB = registerBopVerticalSlab(
            "pine_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAPLE_VERTICAL_SLAB = registerBopVerticalSlab(
            "maple_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block REDWOOD_VERTICAL_SLAB = registerBopVerticalSlab(
            "redwood_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.CRIMSON_NYLIUM).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAHOGANY_VERTICAL_SLAB = registerBopVerticalSlab(
            "mahogany_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block JACARANDA_VERTICAL_SLAB = registerBopVerticalSlab(
            "jacaranda_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.QUARTZ).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block PALM_VERTICAL_SLAB = registerBopVerticalSlab(
            "palm_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block WILLOW_VERTICAL_SLAB = registerBopVerticalSlab(
            "willow_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block DEAD_VERTICAL_SLAB = registerBopVerticalSlab(
            "dead_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAGIC_VERTICAL_SLAB = registerBopVerticalSlab(
            "magic_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block UMBRAN_VERTICAL_SLAB = registerBopVerticalSlab(
            "umbran_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
    );
    public static final Block HELLBARK_VERTICAL_SLAB = registerBopVerticalSlab(
            "hellbark_vertical_slab",
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
    );
    public static final Block EMPYREAL_VERTICAL_SLAB = registerBopVerticalSlab(
            "empyreal_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.COLOR_PURPLE, SoundType.NETHER_WOOD)
    );

    public static final Block BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_aspen_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.QUARTZ, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_baobab_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_blue_enchanted_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.COLOR_BLUE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cika_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cypress_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_ebony_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_fir_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_florus_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_green_enchanted_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_holly_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_ironwood_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_jacaranda_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_mahogany_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_maple_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_palm_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_pine_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_rainbow_eucalyptus_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_redwood_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_sakura_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_skyris_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_spirit_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_mangrove_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_willow_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_witch_hazel_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_zelkova_vertical_slab",
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_black_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_black_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_black_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_white_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_white_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_blue_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_blue_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_blue_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_purple_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_purple_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_purple_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_pink_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_pink_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_pink_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_windswept_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_smooth_windswept_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cut_windswept_sandstone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_dacite_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cracked_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_mossy_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_chiseled_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_dacite_cobblestone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_dacite_tile_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_dacite_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cracked_white_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_mossy_white_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_chiseled_white_dacite_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_dacite_cobblestone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_white_dacite_tile_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_red_rock_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_red_rock_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cracked_red_rock_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_mossy_red_rock_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_chiseled_red_rock_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_polished_red_rock_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_red_rock_tile_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_mossy_stone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE)
    );
    public static final Block BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_rocky_stone_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_pale_mud_brick_vertical_slab",
            BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
    );
    public static final Block BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB = registerBWGVerticalSlab(
            "biomeswevegone_cattail_thatch_vertical_slab",
            BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.5F)
    );

    public static void init() {
    }

    private static Block registerVerticalSlab(String blockId, Block blockToCopy) {
        return registerBlock(
                blockId,
                VerticalSlabBlock::new,
                BlockBehaviour.Properties.ofFullCopy(blockToCopy)
        );
    }

    private static Block registerVerticalSlab(String blockId, BlockBehaviour.Properties properties) {
        return registerBlock(
                blockId,
                VerticalSlabBlock::new,
                properties
        );
    }

    private static Block registerCopperVerticalSlab(String blockId, WeatheringCopper.WeatherState weatherState, Block blockToCopy) {
        return registerBlock(
                blockId,
                properties -> new WeatheringCopperVerticalSlabBlock(weatherState, properties),
                BlockBehaviour.Properties.ofFullCopy(blockToCopy)
        );
    }

    private static Block registerMossyVerticalSlab(String blockId, Block blockToCopy) {
        return registerVerticalSlabIfModIsLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID, blockId, blockToCopy).orElse(null);

    }

    private static Block registerBopVerticalSlab(String blockId, BlockBehaviour.Properties properties) {
        return registerVerticalSlabIfModIsLoaded(BIOMES_O_PLENTY_MOD_ID, blockId, properties).orElse(null);
    }

    private static Block registerBWGVerticalSlab(String blockId, BlockBehaviour.Properties properties) {
        return registerVerticalSlabIfModIsLoaded(BIOMES_WEVE_GONE_MOD_ID, blockId, properties).orElse(null);
    }

    private static Optional<Block> registerVerticalSlabIfModIsLoaded(
            String modId,
            String blockId,
            Block blockToCopy
    ) {
        var isModLoaded = FabricLoader.getInstance().isModLoaded(modId);

        if (!isModLoaded) {
            return Optional.empty();
        }

        return Optional.of(registerVerticalSlab(blockId, blockToCopy));
    }

    private static Optional<Block> registerVerticalSlabIfModIsLoaded(
            String modId,
            String blockId,
            BlockBehaviour.Properties properties
    ) {
        var isModLoaded = FabricLoader.getInstance().isModLoaded(modId);

        if (!isModLoaded) {
            return Optional.empty();
        }

        return Optional.of(registerVerticalSlab(blockId, properties));
    }

    private static BlockBehaviour.Properties createWoodenVerticalSlabProperties(MapColor mapColor, SoundType soundType) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F, 3.0F)
                .sound(soundType)
                .ignitedByLava();
    }

    public static Block registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.BLOCK, id, key -> function.apply(properties.setId(key)));
    }

    private static <T, R extends Registry<T>> T registerSupplierWithResourceKey(R registry, String id, Function<ResourceKey<T>, T> object) {
        final var identifier = Identifier.fromNamespaceAndPath(MOD_ID, id);

        return Registry.register(registry, identifier, object.apply(ResourceKey.create(registry.key(), identifier)));
    }
}
