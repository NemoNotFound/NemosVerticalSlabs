package com.nemonotfound.nemosverticalslabs.item;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import com.nemonotfound.nemosverticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.log;
import static net.minecraft.block.Blocks.*;

public class ModItems {

    public static final Item OAK_VERTICAL_SLAB = registerBlockItem("oak_vertical_slab", ModBlocks.OAK_VERTICAL_SLAB);
    public static final Item SPRUCE_VERTICAL_SLAB = registerBlockItem("spruce_vertical_slab", ModBlocks.SPRUCE_VERTICAL_SLAB);
    public static final Item BIRCH_VERTICAL_SLAB = registerBlockItem("birch_vertical_slab", ModBlocks.BIRCH_VERTICAL_SLAB);
    public static final Item JUNGLE_VERTICAL_SLAB = registerBlockItem("jungle_vertical_slab", ModBlocks.JUNGLE_VERTICAL_SLAB);
    public static final Item ACACIA_VERTICAL_SLAB = registerBlockItem("acacia_vertical_slab", ModBlocks.ACACIA_VERTICAL_SLAB);
    public static final Item DARK_OAK_VERTICAL_SLAB = registerBlockItem("dark_oak_vertical_slab", ModBlocks.DARK_OAK_VERTICAL_SLAB);
    public static final Item MANGROVE_VERTICAL_SLAB = registerBlockItem("mangrove_vertical_slab", ModBlocks.MANGROVE_VERTICAL_SLAB);
    public static final Item CHERRY_VERTICAL_SLAB = registerBlockItem("cherry_vertical_slab", ModBlocks.CHERRY_VERTICAL_SLAB);
    public static final Item BAMBOO_VERTICAL_SLAB = registerBlockItem("bamboo_vertical_slab", ModBlocks.BAMBOO_VERTICAL_SLAB);
    public static final Item BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlockItem("bamboo_mosaic_vertical_slab", ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
    public static final Item CRIMSON_VERTICAL_SLAB = registerBlockItem("crimson_vertical_slab", ModBlocks.CRIMSON_VERTICAL_SLAB);
    public static final Item WARPED_VERTICAL_SLAB = registerBlockItem("warped_vertical_slab", ModBlocks.WARPED_VERTICAL_SLAB);
    public static final Item STONE_VERTICAL_SLAB = registerBlockItem("stone_vertical_slab", ModBlocks.STONE_VERTICAL_SLAB);
    public static final Item COBBLESTONE_VERTICAL_SLAB = registerBlockItem("cobblestone_vertical_slab", ModBlocks.COBBLESTONE_VERTICAL_SLAB);
    public static final Item MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlockItem("mossy_cobblestone_vertical_slab", ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
    public static final Item SMOOTH_STONE_VERTICAL_SLAB = registerBlockItem("smooth_stone_vertical_slab", ModBlocks.SMOOTH_STONE_VERTICAL_SLAB);
    public static final Item STONE_BRICK_VERTICAL_SLAB = registerBlockItem("stone_brick_vertical_slab", ModBlocks.STONE_BRICK_VERTICAL_SLAB);
    public static final Item MOSSY_STONE_BRICK_VERTICAL_SLAB = registerBlockItem("mossy_stone_brick_vertical_slab", ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
    public static final Item GRANITE_VERTICAL_SLAB = registerBlockItem("granite_vertical_slab", ModBlocks.GRANITE_VERTICAL_SLAB);
    public static final Item POLISHED_GRANITE_VERTICAL_SLAB = registerBlockItem("polished_granite_vertical_slab", ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
    public static final Item DIORITE_VERTICAL_SLAB = registerBlockItem("diorite_vertical_slab", ModBlocks.DIORITE_VERTICAL_SLAB);
    public static final Item POLISHED_DIORITE_VERTICAL_SLAB = registerBlockItem("polished_diorite_vertical_slab", ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
    public static final Item ANDESITE_VERTICAL_SLAB = registerBlockItem("andesite_vertical_slab", ModBlocks.ANDESITE_VERTICAL_SLAB);
    public static final Item POLISHED_ANDESITE_VERTICAL_SLAB = registerBlockItem("polished_andesite_vertical_slab", ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
    public static final Item COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlockItem("cobbled_deepslate_vertical_slab", ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
    public static final Item POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlockItem("polished_deepslate_vertical_slab", ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
    public static final Item DEEPSLATE_BRICK_VERTICAL_SLAB = registerBlockItem("deepslate_brick_vertical_slab", ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
    public static final Item DEEPSLATE_TILE_VERTICAL_SLAB = registerBlockItem("deepslate_tile_vertical_slab", ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
    public static final Item TUFF_VERTICAL_SLAB = registerBlockItem("tuff_vertical_slab", ModBlocks.TUFF_VERTICAL_SLAB);
    public static final Item POLISHED_TUFF_VERTICAL_SLAB = registerBlockItem("polished_tuff_vertical_slab", ModBlocks.POLISHED_TUFF_VERTICAL_SLAB);
    public static final Item TUFF_BRICK_VERTICAL_SLAB = registerBlockItem("tuff_brick_vertical_slab", ModBlocks.TUFF_BRICK_VERTICAL_SLAB);
    public static final Item BRICK_VERTICAL_SLAB = registerBlockItem("brick_vertical_slab", ModBlocks.BRICK_VERTICAL_SLAB);
    public static final Item MUD_BRICK_VERTICAL_SLAB = registerBlockItem("mud_brick_vertical_slab", ModBlocks.MUD_BRICK_VERTICAL_SLAB);
    public static final Item SANDSTONE_VERTICAL_SLAB = registerBlockItem("sandstone_vertical_slab", ModBlocks.SANDSTONE_VERTICAL_SLAB);
    public static final Item SMOOTH_SANDSTONE_VERTICAL_SLAB = registerBlockItem("smooth_sandstone_vertical_slab", ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
    public static final Item CUT_SANDSTONE_VERTICAL_SLAB = registerBlockItem("cut_sandstone_vertical_slab", ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
    public static final Item RED_SANDSTONE_VERTICAL_SLAB = registerBlockItem("red_sandstone_vertical_slab", ModBlocks.RED_SANDSTONE_VERTICAL_SLAB);
    public static final Item SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerBlockItem("smooth_red_sandstone_vertical_slab", ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
    public static final Item CUT_RED_SANDSTONE_VERTICAL_SLAB = registerBlockItem("cut_red_sandstone_vertical_slab", ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
    public static final Item PRISMARINE_VERTICAL_SLAB = registerBlockItem("prismarine_vertical_slab", ModBlocks.PRISMARINE_VERTICAL_SLAB);
    public static final Item PRISMARINE_BRICK_VERTICAL_SLAB = registerBlockItem("prismarine_brick_vertical_slab", ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
    public static final Item DARK_PRISMARINE_VERTICAL_SLAB = registerBlockItem("dark_prismarine_vertical_slab", ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
    public static final Item NETHER_BRICK_VERTICAL_SLAB = registerBlockItem("nether_brick_vertical_slab", ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
    public static final Item RED_NETHER_BRICK_VERTICAL_SLAB = registerBlockItem("red_nether_brick_vertical_slab", ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
    public static final Item BLACKSTONE_VERTICAL_SLAB = registerBlockItem("blackstone_vertical_slab", ModBlocks.BLACKSTONE_VERTICAL_SLAB);
    public static final Item POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlockItem("polished_blackstone_vertical_slab", ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
    public static final Item POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerBlockItem("polished_blackstone_brick_vertical_slab", ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
    public static final Item END_STONE_BRICK_VERTICAL_SLAB = registerBlockItem("end_stone_brick_vertical_slab", ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
    public static final Item PURPUR_VERTICAL_SLAB = registerBlockItem("purpur_vertical_slab", ModBlocks.PURPUR_VERTICAL_SLAB);
    public static final Item QUARTZ_VERTICAL_SLAB = registerBlockItem("quartz_vertical_slab", ModBlocks.QUARTZ_VERTICAL_SLAB);
    public static final Item SMOOTH_QUARTZ_VERTICAL_SLAB = registerBlockItem("smooth_quartz_vertical_slab", ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
    public static final Item CUT_COPPER_VERTICAL_SLAB = registerBlockItem("cut_copper_vertical_slab", ModBlocks.CUT_COPPER_VERTICAL_SLAB);
    public static final Item EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("exposed_cut_copper_vertical_slab", ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("weathered_cut_copper_vertical_slab", ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("oxidized_cut_copper_vertical_slab", ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item WAXED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("waxed_cut_copper_vertical_slab", ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("waxed_exposed_cut_copper_vertical_slab", ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("waxed_weathered_cut_copper_vertical_slab", ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
    public static final Item WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlockItem("waxed_oxidized_cut_copper_vertical_slab", ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

    public static void registerItems() {
        log.info("Registering items");
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
