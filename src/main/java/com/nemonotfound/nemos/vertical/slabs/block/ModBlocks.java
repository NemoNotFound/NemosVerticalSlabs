package com.nemonotfound.nemos.vertical.slabs.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.log;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block OAK_VERTICAL_SLAB = register("oak_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(OAK_SLAB).nonOpaque());
    public static final Block SPRUCE_VERTICAL_SLAB = register("spruce_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SPRUCE_SLAB).nonOpaque());
    public static final Block BIRCH_VERTICAL_SLAB = register("birch_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(BIRCH_SLAB).nonOpaque());
    public static final Block JUNGLE_VERTICAL_SLAB = register("jungle_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(JUNGLE_SLAB).nonOpaque());
    public static final Block ACACIA_VERTICAL_SLAB = register("acacia_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(ACACIA_SLAB).nonOpaque());
    public static final Block DARK_OAK_VERTICAL_SLAB = register("dark_oak_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(DARK_OAK_SLAB).nonOpaque());
    public static final Block MANGROVE_VERTICAL_SLAB = register("mangrove_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(MANGROVE_SLAB).nonOpaque());
    public static final Block CHERRY_VERTICAL_SLAB = register("cherry_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(CHERRY_SLAB).nonOpaque());
    public static final Block BAMBOO_VERTICAL_SLAB = register("bamboo_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_SLAB).nonOpaque());
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = register("bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC_SLAB).nonOpaque());
    public static final Block CRIMSON_VERTICAL_SLAB = register("crimson_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(CRIMSON_SLAB).nonOpaque());
    public static final Block WARPED_VERTICAL_SLAB = register("warped_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WARPED_SLAB).nonOpaque());
    public static final Block STONE_VERTICAL_SLAB = register("stone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(STONE_SLAB).nonOpaque());
    public static final Block COBBLESTONE_VERTICAL_SLAB = register("cobblestone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(COBBLESTONE_SLAB).nonOpaque());
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = register("mossy_cobblestone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(MOSSY_COBBLESTONE_SLAB).nonOpaque());
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = register("smooth_stone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_STONE_SLAB).nonOpaque());
    public static final Block STONE_BRICK_VERTICAL_SLAB = register("stone_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(STONE_BRICK_SLAB).nonOpaque());
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = register("mossy_stone_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(MOSSY_STONE_BRICK_SLAB).nonOpaque());
    public static final Block GRANITE_VERTICAL_SLAB = register("granite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(GRANITE_SLAB).nonOpaque());
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = register("polished_granite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_GRANITE_SLAB).nonOpaque());
    public static final Block DIORITE_VERTICAL_SLAB = register("diorite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(DIORITE_SLAB).nonOpaque());
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = register("polished_diorite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_DIORITE_SLAB).nonOpaque());
    public static final Block ANDESITE_VERTICAL_SLAB = register("andesite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(ANDESITE_SLAB).nonOpaque());
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = register("polished_andesite_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE_SLAB).nonOpaque());
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = register("cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(COBBLED_DEEPSLATE_SLAB).nonOpaque());
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = register("polished_deepslate_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_SLAB).nonOpaque());
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = register("deepslate_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).nonOpaque());
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = register("deepslate_tile_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).nonOpaque());
    public static final Block TUFF_VERTICAL_SLAB = register("tuff_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(TUFF_SLAB).nonOpaque());
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = register("polished_tuff_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_TUFF_SLAB).nonOpaque());
    public static final Block TUFF_BRICK_VERTICAL_SLAB = register("tuff_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(TUFF_BRICK_SLAB).nonOpaque());
    public static final Block BRICK_VERTICAL_SLAB = register("brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(BRICK_SLAB).nonOpaque());
    public static final Block MUD_BRICK_VERTICAL_SLAB = register("mud_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(MUD_BRICK_SLAB).nonOpaque());
    public static final Block SANDSTONE_VERTICAL_SLAB = register("sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SANDSTONE_SLAB).nonOpaque());
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = register("smooth_sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_SANDSTONE_SLAB).nonOpaque());
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = register("cut_sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(CUT_SANDSTONE_SLAB).nonOpaque());
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = register("red_sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(RED_SANDSTONE_SLAB).nonOpaque());
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = register("smooth_red_sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_RED_SANDSTONE_SLAB).nonOpaque());
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = register("cut_red_sandstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(CUT_RED_SANDSTONE_SLAB).nonOpaque());
    public static final Block PRISMARINE_VERTICAL_SLAB = register("prismarine_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(PRISMARINE_SLAB).nonOpaque());
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = register("prismarine_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(PRISMARINE_BRICK_SLAB).nonOpaque());
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = register("dark_prismarine_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(DARK_PRISMARINE_SLAB).nonOpaque());
    public static final Block NETHER_BRICK_VERTICAL_SLAB = register("nether_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_BRICK_SLAB).nonOpaque());
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = register("red_nether_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(RED_NETHER_BRICK_SLAB).nonOpaque());
    public static final Block BLACKSTONE_VERTICAL_SLAB = register("blackstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(BLACKSTONE_SLAB).nonOpaque());
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = register("polished_blackstone_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_SLAB).nonOpaque());
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = register("polished_blackstone_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(POLISHED_BLACKSTONE_BRICK_SLAB).nonOpaque());
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = register("end_stone_brick_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(END_STONE_BRICK_SLAB).nonOpaque());
    public static final Block PURPUR_VERTICAL_SLAB = register("purpur_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(PURPUR_SLAB).nonOpaque());
    public static final Block QUARTZ_VERTICAL_SLAB = register("quartz_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(QUARTZ_SLAB).nonOpaque());
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = register("smooth_quartz_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_QUARTZ_SLAB).nonOpaque());
    public static final Block CUT_COPPER_VERTICAL_SLAB = register("cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(CUT_COPPER_SLAB).nonOpaque());
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = register("exposed_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(EXPOSED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = register("weathered_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WEATHERED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = register("oxidized_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = register("waxed_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WAXED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = register("waxed_exposed_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WAXED_EXPOSED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = register("waxed_weathered_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WAXED_WEATHERED_CUT_COPPER_SLAB).nonOpaque());
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = register("waxed_oxidized_cut_copper_vertical_slab",
            VerticalSlabBlock::new, AbstractBlock.Settings.copy(WAXED_OXIDIZED_CUT_COPPER_SLAB).nonOpaque());

    public static void registerBlocks() {
        log.info("Registering blocks");
    }

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return Blocks.register(keyOf(path), factory, settings);
    }

    private static RegistryKey<Block> keyOf(String path) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, path));
    }
}
