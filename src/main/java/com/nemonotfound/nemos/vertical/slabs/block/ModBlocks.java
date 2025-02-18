package com.nemonotfound.nemos.vertical.slabs.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.log;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(OAK_SLAB).nonOpaque()));
    public static final Block SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SPRUCE_SLAB).nonOpaque()));
    public static final Block BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BIRCH_SLAB).nonOpaque()));
    public static final Block JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(JUNGLE_SLAB).nonOpaque()));
    public static final Block ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(ACACIA_SLAB).nonOpaque()));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(DARK_OAK_SLAB).nonOpaque()));
    public static final Block MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(MANGROVE_SLAB).nonOpaque()));
    public static final Block CHERRY_VERTICAL_SLAB = registerBlock("cherry_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(CHERRY_SLAB).nonOpaque()));
    public static final Block BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_SLAB).nonOpaque()));
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlock("bamboo_mosaic_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_MOSAIC_SLAB).nonOpaque()));
    public static final Block CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(CRIMSON_SLAB).nonOpaque()));
    public static final Block WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WARPED_SLAB).nonOpaque()));
    public static final Block STONE_VERTICAL_SLAB = registerBlock("stone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(STONE_SLAB).nonOpaque()));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock("cobblestone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(COBBLESTONE_SLAB).nonOpaque()));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlock("mossy_cobblestone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(MOSSY_COBBLESTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerBlock("smooth_stone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_STONE_SLAB).nonOpaque()));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerBlock("stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(STONE_BRICK_SLAB).nonOpaque()));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerBlock("mossy_stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(MOSSY_STONE_BRICK_SLAB).nonOpaque()));
    public static final Block GRANITE_VERTICAL_SLAB = registerBlock("granite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(GRANITE_SLAB).nonOpaque()));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerBlock("polished_granite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_GRANITE_SLAB).nonOpaque()));
    public static final Block DIORITE_VERTICAL_SLAB = registerBlock("diorite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(DIORITE_SLAB).nonOpaque()));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerBlock("polished_diorite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_DIORITE_SLAB).nonOpaque()));
    public static final Block ANDESITE_VERTICAL_SLAB = registerBlock("andesite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(ANDESITE_SLAB).nonOpaque()));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerBlock("polished_andesite_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_ANDESITE_SLAB).nonOpaque()));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlock("cobbled_deepslate_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE_SLAB).nonOpaque()));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlock("polished_deepslate_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_SLAB).nonOpaque()));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerBlock("deepslate_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).nonOpaque()));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerBlock("deepslate_tile_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).nonOpaque()));
    public static final Block TUFF_VERTICAL_SLAB = registerBlock("tuff_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(TUFF_SLAB).nonOpaque()));
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = registerBlock("polished_tuff_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_TUFF_SLAB).nonOpaque()));
    public static final Block TUFF_BRICK_VERTICAL_SLAB = registerBlock("tuff_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(TUFF_BRICK_SLAB).nonOpaque()));
    public static final Block BRICK_VERTICAL_SLAB = registerBlock("brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BRICK_SLAB).nonOpaque()));
    public static final Block MUD_BRICK_VERTICAL_SLAB = registerBlock("mud_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(MUD_BRICK_SLAB).nonOpaque()));
    public static final Block SANDSTONE_VERTICAL_SLAB = registerBlock("sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SANDSTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_SANDSTONE_SLAB).nonOpaque()));
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(CUT_SANDSTONE_SLAB).nonOpaque()));
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerBlock("red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_red_sandstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(CUT_RED_SANDSTONE_SLAB).nonOpaque()));
    public static final Block PRISMARINE_VERTICAL_SLAB = registerBlock("prismarine_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(PRISMARINE_SLAB).nonOpaque()));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerBlock("prismarine_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(PRISMARINE_BRICK_SLAB).nonOpaque()));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerBlock("dark_prismarine_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(DARK_PRISMARINE_SLAB).nonOpaque()));
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerBlock("nether_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_BRICK_SLAB).nonOpaque()));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("red_nether_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(RED_NETHER_BRICK_SLAB).nonOpaque()));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerBlock("blackstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_SLAB).nonOpaque()));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("polished_blackstone_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_SLAB).nonOpaque()));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerBlock("polished_blackstone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_BRICK_SLAB).nonOpaque()));
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerBlock("end_stone_brick_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(END_STONE_BRICK_SLAB).nonOpaque()));
    public static final Block PURPUR_VERTICAL_SLAB = registerBlock("purpur_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(PURPUR_SLAB).nonOpaque()));
    public static final Block QUARTZ_VERTICAL_SLAB = registerBlock("quartz_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(QUARTZ_SLAB).nonOpaque()));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerBlock("smooth_quartz_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(SMOOTH_QUARTZ_SLAB).nonOpaque()));
    public static final Block CUT_COPPER_VERTICAL_SLAB = registerBlock("cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(CUT_COPPER_SLAB).nonOpaque()));
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("exposed_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(EXPOSED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("weathered_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WEATHERED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("oxidized_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_exposed_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_EXPOSED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_weathered_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_WEATHERED_CUT_COPPER_SLAB).nonOpaque()));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_oxidized_cut_copper_vertical_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(WAXED_OXIDIZED_CUT_COPPER_SLAB).nonOpaque()));

    public static void registerBlocks() {
        log.info("Registering blocks");
    }

    private static Block registerBlock(String path, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
    }
}
