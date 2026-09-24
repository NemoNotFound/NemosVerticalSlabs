package com.nemonotfound.nemos.vertical.slabs.reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.WeatheringCopperCollection;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class VerticalSlabBlockItemIds {

    public static final BlockItemId OAK_VERTICAL_SLAB = create("oak_vertical_slab");
    public static final BlockItemId SPRUCE_VERTICAL_SLAB = create("spruce_vertical_slab");
    public static final BlockItemId BIRCH_VERTICAL_SLAB = create("birch_vertical_slab");
    public static final BlockItemId JUNGLE_VERTICAL_SLAB = create("jungle_vertical_slab");
    public static final BlockItemId ACACIA_VERTICAL_SLAB = create("acacia_vertical_slab");
    public static final BlockItemId DARK_OAK_VERTICAL_SLAB = create("dark_oak_vertical_slab");
    public static final BlockItemId MANGROVE_VERTICAL_SLAB = create("mangrove_vertical_slab");
    public static final BlockItemId CHERRY_VERTICAL_SLAB = create("cherry_vertical_slab");
    public static final BlockItemId PALE_OAK_VERTICAL_SLAB = create("pale_oak_vertical_slab");
    public static final BlockItemId BAMBOO_VERTICAL_SLAB = create("bamboo_vertical_slab");
    public static final BlockItemId BAMBOO_MOSAIC_VERTICAL_SLAB = create("bamboo_mosaic_vertical_slab");
    public static final BlockItemId CRIMSON_VERTICAL_SLAB = create("crimson_vertical_slab");
    public static final BlockItemId WARPED_VERTICAL_SLAB = create("warped_vertical_slab");
    public static final BlockItemId STONE_VERTICAL_SLAB = create("stone_vertical_slab");
    public static final BlockItemId COBBLESTONE_VERTICAL_SLAB = create("cobblestone_vertical_slab");
    public static final BlockItemId MOSSY_COBBLESTONE_VERTICAL_SLAB = create("mossy_cobblestone_vertical_slab");
    public static final BlockItemId SMOOTH_STONE_VERTICAL_SLAB = create("smooth_stone_vertical_slab");
    public static final BlockItemId STONE_BRICK_VERTICAL_SLAB = create("stone_brick_vertical_slab");
    public static final BlockItemId MOSSY_STONE_BRICK_VERTICAL_SLAB = create("mossy_stone_brick_vertical_slab");
    public static final BlockItemId GRANITE_VERTICAL_SLAB = create("granite_vertical_slab");
    public static final BlockItemId POLISHED_GRANITE_VERTICAL_SLAB = create("polished_granite_vertical_slab");
    public static final BlockItemId DIORITE_VERTICAL_SLAB = create("diorite_vertical_slab");
    public static final BlockItemId POLISHED_DIORITE_VERTICAL_SLAB = create("polished_diorite_vertical_slab");
    public static final BlockItemId ANDESITE_VERTICAL_SLAB = create("andesite_vertical_slab");
    public static final BlockItemId POLISHED_ANDESITE_VERTICAL_SLAB = create("polished_andesite_vertical_slab");
    public static final BlockItemId COBBLED_DEEPSLATE_VERTICAL_SLAB = create("cobbled_deepslate_vertical_slab");
    public static final BlockItemId POLISHED_DEEPSLATE_VERTICAL_SLAB = create("polished_deepslate_vertical_slab");
    public static final BlockItemId DEEPSLATE_BRICK_VERTICAL_SLAB = create("deepslate_brick_vertical_slab");
    public static final BlockItemId DEEPSLATE_TILE_VERTICAL_SLAB = create("deepslate_tile_vertical_slab");
    public static final BlockItemId TUFF_VERTICAL_SLAB = create("tuff_vertical_slab");
    public static final BlockItemId POLISHED_TUFF_VERTICAL_SLAB = create("polished_tuff_vertical_slab");
    public static final BlockItemId TUFF_BRICK_VERTICAL_SLAB = create("tuff_brick_vertical_slab");
    public static final BlockItemId BRICK_VERTICAL_SLAB = create("brick_vertical_slab");
    public static final BlockItemId MUD_BRICK_VERTICAL_SLAB = create("mud_brick_vertical_slab");
    public static final BlockItemId SANDSTONE_VERTICAL_SLAB = create("sandstone_vertical_slab");
    public static final BlockItemId SMOOTH_SANDSTONE_VERTICAL_SLAB = create("smooth_sandstone_vertical_slab");
    public static final BlockItemId CUT_SANDSTONE_VERTICAL_SLAB = create("cut_sandstone_vertical_slab");
    public static final BlockItemId RED_SANDSTONE_VERTICAL_SLAB = create("red_sandstone_vertical_slab");
    public static final BlockItemId SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = create("smooth_red_sandstone_vertical_slab");
    public static final BlockItemId CUT_RED_SANDSTONE_VERTICAL_SLAB = create("cut_red_sandstone_vertical_slab");
    public static final BlockItemId PRISMARINE_VERTICAL_SLAB = create("prismarine_vertical_slab");
    public static final BlockItemId PRISMARINE_BRICK_VERTICAL_SLAB = create("prismarine_brick_vertical_slab");
    public static final BlockItemId DARK_PRISMARINE_VERTICAL_SLAB = create("dark_prismarine_vertical_slab");
    public static final BlockItemId NETHER_BRICK_VERTICAL_SLAB = create("nether_brick_vertical_slab");
    public static final BlockItemId RED_NETHER_BRICK_VERTICAL_SLAB = create("red_nether_brick_vertical_slab");
    public static final BlockItemId BLACKSTONE_VERTICAL_SLAB = create("blackstone_vertical_slab");
    public static final BlockItemId POLISHED_BLACKSTONE_VERTICAL_SLAB = create("polished_blackstone_vertical_slab");
    public static final BlockItemId POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = create("polished_blackstone_brick_vertical_slab");
    public static final BlockItemId END_STONE_BRICK_VERTICAL_SLAB = create("end_stone_brick_vertical_slab");
    public static final BlockItemId PURPUR_VERTICAL_SLAB = create("purpur_vertical_slab");
    public static final BlockItemId QUARTZ_VERTICAL_SLAB = create("quartz_vertical_slab");
    public static final BlockItemId SMOOTH_QUARTZ_VERTICAL_SLAB = create("smooth_quartz_vertical_slab");
    public static final WeatheringCopperCollection<BlockItemId> CUT_COPPER_VERTICAL_SLABS = createWeatheringCopper("cut_copper_vertical_slab");
    public static final BlockItemId MOSSY_OAK_VERTICAL_SLAB = create("mossy_oak_vertical_slab");
    public static final BlockItemId MOSSY_SPRUCE_VERTICAL_SLAB = create("mossy_spruce_vertical_slab");
    public static final BlockItemId MOSSY_BIRCH_VERTICAL_SLAB = create("mossy_birch_vertical_slab");
    public static final BlockItemId MOSSY_JUNGLE_VERTICAL_SLAB = create("mossy_jungle_vertical_slab");
    public static final BlockItemId MOSSY_ACACIA_VERTICAL_SLAB = create("mossy_acacia_vertical_slab");
    public static final BlockItemId MOSSY_DARK_OAK_VERTICAL_SLAB = create("mossy_dark_oak_vertical_slab");
    public static final BlockItemId MOSSY_MANGROVE_VERTICAL_SLAB = create("mossy_mangrove_vertical_slab");
    public static final BlockItemId MOSSY_CHERRY_VERTICAL_SLAB = create("mossy_cherry_vertical_slab");
    public static final BlockItemId MOSSY_PALE_OAK_VERTICAL_SLAB = create("mossy_pale_oak_vertical_slab");
    public static final BlockItemId MOSSY_BAMBOO_VERTICAL_SLAB = create("mossy_bamboo_vertical_slab");
    public static final BlockItemId MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = create("mossy_bamboo_mosaic_vertical_slab");
    public static final BlockItemId MOSSY_CRIMSON_VERTICAL_SLAB = create("mossy_crimson_vertical_slab");
    public static final BlockItemId MOSSY_WARPED_VERTICAL_SLAB = create("mossy_warped_vertical_slab");
    public static final BlockItemId MOSSY_STONE_VERTICAL_SLAB = create("mossy_stone_vertical_slab");
    public static final BlockItemId MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = create("mossy_cobbled_deepslate_vertical_slab");
    public static final BlockItemId MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = create("mossy_deepslate_brick_vertical_slab");
    public static final BlockItemId MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = create("mossy_deepslate_tile_vertical_slab");
    public static final BlockItemId MOSSY_TUFF_VERTICAL_SLAB = create("mossy_tuff_vertical_slab");
    public static final BlockItemId MOSSY_TUFF_BRICK_VERTICAL_SLAB = create("mossy_tuff_brick_vertical_slab");
    public static final BlockItemId MOSSY_BRICK_VERTICAL_SLAB = create("mossy_brick_vertical_slab");
    public static final BlockItemId PALE_MOSSY_OAK_VERTICAL_SLAB = create("pale_mossy_oak_vertical_slab");
    public static final BlockItemId PALE_MOSSY_SPRUCE_VERTICAL_SLAB = create("pale_mossy_spruce_vertical_slab");
    public static final BlockItemId PALE_MOSSY_BIRCH_VERTICAL_SLAB = create("pale_mossy_birch_vertical_slab");
    public static final BlockItemId PALE_MOSSY_JUNGLE_VERTICAL_SLAB = create("pale_mossy_jungle_vertical_slab");
    public static final BlockItemId PALE_MOSSY_ACACIA_VERTICAL_SLAB = create("pale_mossy_acacia_vertical_slab");
    public static final BlockItemId PALE_MOSSY_DARK_OAK_VERTICAL_SLAB = create("pale_mossy_dark_oak_vertical_slab");
    public static final BlockItemId PALE_MOSSY_MANGROVE_VERTICAL_SLAB = create("pale_mossy_mangrove_vertical_slab");
    public static final BlockItemId PALE_MOSSY_CHERRY_VERTICAL_SLAB = create("pale_mossy_cherry_vertical_slab");
    public static final BlockItemId PALE_MOSSY_PALE_OAK_VERTICAL_SLAB = create("pale_mossy_pale_oak_vertical_slab");
    public static final BlockItemId PALE_MOSSY_BAMBOO_VERTICAL_SLAB = create("pale_mossy_bamboo_vertical_slab");
    public static final BlockItemId PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = create("pale_mossy_bamboo_mosaic_vertical_slab");
    public static final BlockItemId PALE_MOSSY_CRIMSON_VERTICAL_SLAB = create("pale_mossy_crimson_vertical_slab");
    public static final BlockItemId PALE_MOSSY_WARPED_VERTICAL_SLAB = create("pale_mossy_warped_vertical_slab");
    public static final BlockItemId PALE_MOSSY_STONE_VERTICAL_SLAB = create("pale_mossy_stone_vertical_slab");
    public static final BlockItemId PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = create("pale_mossy_cobbled_deepslate_vertical_slab");
    public static final BlockItemId PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = create("pale_mossy_deepslate_brick_vertical_slab");
    public static final BlockItemId PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = create("pale_mossy_deepslate_tile_vertical_slab");
    public static final BlockItemId PALE_MOSSY_TUFF_VERTICAL_SLAB = create("pale_mossy_tuff_vertical_slab");
    public static final BlockItemId PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB = create("pale_mossy_tuff_brick_vertical_slab");
    public static final BlockItemId PALE_MOSSY_BRICK_VERTICAL_SLAB = create("pale_mossy_brick_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_OAK_VERTICAL_SLAB = create("crimson_mossy_oak_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB = create("crimson_mossy_spruce_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB = create("crimson_mossy_birch_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB = create("crimson_mossy_jungle_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB = create("crimson_mossy_acacia_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB = create("crimson_mossy_dark_oak_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB = create("crimson_mossy_mangrove_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB = create("crimson_mossy_cherry_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB = create("crimson_mossy_pale_oak_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB = create("crimson_mossy_bamboo_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = create("crimson_mossy_bamboo_mosaic_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB = create("crimson_mossy_crimson_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_WARPED_VERTICAL_SLAB = create("crimson_mossy_warped_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_STONE_VERTICAL_SLAB = create("crimson_mossy_stone_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = create("crimson_mossy_cobbled_deepslate_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = create("crimson_mossy_deepslate_brick_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = create("crimson_mossy_deepslate_tile_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_TUFF_VERTICAL_SLAB = create("crimson_mossy_tuff_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB = create("crimson_mossy_tuff_brick_vertical_slab");
    public static final BlockItemId CRIMSON_MOSSY_BRICK_VERTICAL_SLAB = create("crimson_mossy_brick_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_OAK_VERTICAL_SLAB = create("warped_mossy_oak_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_SPRUCE_VERTICAL_SLAB = create("warped_mossy_spruce_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_BIRCH_VERTICAL_SLAB = create("warped_mossy_birch_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_JUNGLE_VERTICAL_SLAB = create("warped_mossy_jungle_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_ACACIA_VERTICAL_SLAB = create("warped_mossy_acacia_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB = create("warped_mossy_dark_oak_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_MANGROVE_VERTICAL_SLAB = create("warped_mossy_mangrove_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_CHERRY_VERTICAL_SLAB = create("warped_mossy_cherry_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB = create("warped_mossy_pale_oak_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_BAMBOO_VERTICAL_SLAB = create("warped_mossy_bamboo_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = create("warped_mossy_bamboo_mosaic_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_CRIMSON_VERTICAL_SLAB = create("warped_mossy_crimson_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_WARPED_VERTICAL_SLAB = create("warped_mossy_warped_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_STONE_VERTICAL_SLAB = create("warped_mossy_stone_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = create("warped_mossy_cobbled_deepslate_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = create("warped_mossy_deepslate_brick_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = create("warped_mossy_deepslate_tile_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_TUFF_VERTICAL_SLAB = create("warped_mossy_tuff_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB = create("warped_mossy_tuff_brick_vertical_slab");
    public static final BlockItemId WARPED_MOSSY_BRICK_VERTICAL_SLAB = create("warped_mossy_brick_vertical_slab");
    public static final BlockItemId CUT_WHITE_SANDSTONE_VERTICAL_SLAB = create("cut_white_sandstone_vertical_slab");
    public static final BlockItemId SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = create("smooth_white_sandstone_vertical_slab");
    public static final BlockItemId WHITE_SANDSTONE_VERTICAL_SLAB = create("white_sandstone_vertical_slab");
    public static final BlockItemId CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = create("cut_orange_sandstone_vertical_slab");
    public static final BlockItemId SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = create("smooth_orange_sandstone_vertical_slab");
    public static final BlockItemId ORANGE_SANDSTONE_VERTICAL_SLAB = create("orange_sandstone_vertical_slab");
    public static final BlockItemId CUT_BLACK_SANDSTONE_VERTICAL_SLAB = create("cut_black_sandstone_vertical_slab");
    public static final BlockItemId SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = create("smooth_black_sandstone_vertical_slab");
    public static final BlockItemId BLACK_SANDSTONE_VERTICAL_SLAB = create("black_sandstone_vertical_slab");
    public static final BlockItemId FIR_VERTICAL_SLAB = create("fir_vertical_slab");
    public static final BlockItemId PINE_VERTICAL_SLAB = create("pine_vertical_slab");
    public static final BlockItemId MAPLE_VERTICAL_SLAB = create("maple_vertical_slab");
    public static final BlockItemId REDWOOD_VERTICAL_SLAB = create("redwood_vertical_slab");
    public static final BlockItemId MAHOGANY_VERTICAL_SLAB = create("mahogany_vertical_slab");
    public static final BlockItemId JACARANDA_VERTICAL_SLAB = create("jacaranda_vertical_slab");
    public static final BlockItemId PALM_VERTICAL_SLAB = create("palm_vertical_slab");
    public static final BlockItemId WILLOW_VERTICAL_SLAB = create("willow_vertical_slab");
    public static final BlockItemId DEAD_VERTICAL_SLAB = create("dead_vertical_slab");
    public static final BlockItemId MAGIC_VERTICAL_SLAB = create("magic_vertical_slab");
    public static final BlockItemId UMBRAN_VERTICAL_SLAB = create("umbran_vertical_slab");
    public static final BlockItemId HELLBARK_VERTICAL_SLAB = create("hellbark_vertical_slab");
    public static final BlockItemId EMPYREAL_VERTICAL_SLAB = create("empyreal_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB = create("biomeswevegone_aspen_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB = create("biomeswevegone_baobab_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB = create("biomeswevegone_blue_enchanted_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB = create("biomeswevegone_cika_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB = create("biomeswevegone_cypress_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB = create("biomeswevegone_ebony_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB = create("biomeswevegone_fir_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB = create("biomeswevegone_florus_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB = create("biomeswevegone_green_enchanted_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB = create("biomeswevegone_holly_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB = create("biomeswevegone_ironwood_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB = create("biomeswevegone_jacaranda_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB = create("biomeswevegone_mahogany_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB = create("biomeswevegone_maple_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB = create("biomeswevegone_palm_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB = create("biomeswevegone_pine_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB = create("biomeswevegone_rainbow_eucalyptus_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB = create("biomeswevegone_redwood_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB = create("biomeswevegone_sakura_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB = create("biomeswevegone_skyris_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB = create("biomeswevegone_spirit_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB = create("biomeswevegone_white_mangrove_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB = create("biomeswevegone_willow_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB = create("biomeswevegone_witch_hazel_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB = create("biomeswevegone_zelkova_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_black_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_black_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_black_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_white_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_white_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_white_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_blue_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_blue_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_blue_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_purple_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_purple_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_purple_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_pink_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_pink_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_pink_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_windswept_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_smooth_windswept_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = create("biomeswevegone_cut_windswept_sandstone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB = create("biomeswevegone_dacite_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_cracked_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_mossy_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_chiseled_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB = create("biomeswevegone_dacite_cobblestone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB = create("biomeswevegone_dacite_tile_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB = create("biomeswevegone_white_dacite_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_white_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_cracked_white_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_mossy_white_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB = create("biomeswevegone_chiseled_white_dacite_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB = create("biomeswevegone_white_dacite_cobblestone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB = create("biomeswevegone_white_dacite_tile_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB = create("biomeswevegone_red_rock_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB = create("biomeswevegone_red_rock_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB = create("biomeswevegone_cracked_red_rock_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB = create("biomeswevegone_mossy_red_rock_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB = create("biomeswevegone_chiseled_red_rock_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB = create("biomeswevegone_polished_red_rock_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB = create("biomeswevegone_red_rock_tile_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB = create("biomeswevegone_mossy_stone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB = create("biomeswevegone_rocky_stone_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB = create("biomeswevegone_pale_mud_brick_vertical_slab");
    public static final BlockItemId BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB = create("biomeswevegone_cattail_thatch_vertical_slab");

    private static BlockItemId create(final String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return create(id, id);
    }

    private static WeatheringCopperCollection<BlockItemId> createWeatheringCopper(final String name) {
        return new WeatheringCopperCollection<>(
                new WeatheringCopperCollection.ByState<>(
                        create(name),
                        create("exposed_" + name),
                        create("weathered_" + name),
                        create("oxidized_" + name)
                ),
                new WeatheringCopperCollection.ByState<>(
                        create("waxed_" + name),
                        create("waxed_exposed_" + name),
                        create("waxed_weathered_" + name),
                        create("waxed_oxidized_" + name)
                )
        );
    }

    private static BlockItemId create(final Identifier blockId, final Identifier itemId) {
        return new BlockItemId(ResourceKey.create(Registries.BLOCK, blockId), ResourceKey.create(Registries.ITEM, itemId));
    }
}
