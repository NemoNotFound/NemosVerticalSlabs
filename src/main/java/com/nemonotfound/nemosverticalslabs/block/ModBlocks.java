package com.nemonotfound.nemosverticalslabs.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.log;
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

    public static void registerBlocks() {
        log.info("Registering blocks");
    }

    private static Block registerBlock(String path, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
    }
}
