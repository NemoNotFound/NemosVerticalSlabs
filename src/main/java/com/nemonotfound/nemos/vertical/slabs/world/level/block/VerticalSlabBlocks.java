package com.nemonotfound.nemos.vertical.slabs.world.level.block;

import com.nemonotfound.nemos.vertical.slabs.reference.VerticalSlabBlockItemIds;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopperCollection;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.Optional;
import java.util.function.Function;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.*;
import static net.minecraft.world.level.block.Blocks.*;

public class VerticalSlabBlocks {

    public static final Block OAK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.OAK_VERTICAL_SLAB.block(),
            OAK_SLAB
    );
    public static final Block SPRUCE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SPRUCE_VERTICAL_SLAB.block(),
            SPRUCE_SLAB
    );
    public static final Block BIRCH_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.BIRCH_VERTICAL_SLAB.block(),
            BIRCH_SLAB
    );
    public static final Block JUNGLE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.JUNGLE_VERTICAL_SLAB.block(),
            JUNGLE_SLAB
    );
    public static final Block ACACIA_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.ACACIA_VERTICAL_SLAB.block(),
            ACACIA_SLAB
    );
    public static final Block DARK_OAK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.DARK_OAK_VERTICAL_SLAB.block(),
            DARK_OAK_SLAB
    );
    public static final Block MANGROVE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.MANGROVE_VERTICAL_SLAB.block(),
            MANGROVE_SLAB
    );
    public static final Block CHERRY_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.CHERRY_VERTICAL_SLAB.block(),
            CHERRY_SLAB
    );
    public static final Block PALE_OAK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.PALE_OAK_VERTICAL_SLAB.block(),
            PALE_OAK_SLAB
    );
    public static final Block BAMBOO_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.BAMBOO_VERTICAL_SLAB.block(),
            BAMBOO_SLAB
    );
    public static final Block BAMBOO_MOSAIC_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.BAMBOO_MOSAIC_VERTICAL_SLAB.block(),
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block CRIMSON_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_VERTICAL_SLAB.block(),
            CRIMSON_SLAB
    );
    public static final Block WARPED_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_VERTICAL_SLAB.block(),
            WARPED_SLAB
    );
    public static final Block STONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.STONE_VERTICAL_SLAB.block(),
            STONE_SLAB
    );
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.COBBLESTONE_VERTICAL_SLAB.block(),
            COBBLESTONE_SLAB
    );
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_COBBLESTONE_VERTICAL_SLAB.block(),
            MOSSY_COBBLESTONE_SLAB
    );
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_STONE_VERTICAL_SLAB.block(),
            SMOOTH_STONE_SLAB
    );
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.STONE_BRICK_VERTICAL_SLAB.block(),
            STONE_BRICK_SLAB
    );
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_STONE_BRICK_VERTICAL_SLAB.block(),
            MOSSY_STONE_BRICK_SLAB
    );
    public static final Block GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.GRANITE_VERTICAL_SLAB.block(),
            GRANITE_SLAB
    );
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_GRANITE_VERTICAL_SLAB.block(),
            POLISHED_GRANITE_SLAB
    );
    public static final Block DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.DIORITE_VERTICAL_SLAB.block(),
            DIORITE_SLAB
    );
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_DIORITE_VERTICAL_SLAB.block(),
            POLISHED_DIORITE_SLAB
    );
    public static final Block ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.ANDESITE_VERTICAL_SLAB.block(),
            ANDESITE_SLAB
    );
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_ANDESITE_VERTICAL_SLAB.block(),
            POLISHED_ANDESITE_SLAB
    );
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.COBBLED_DEEPSLATE_VERTICAL_SLAB.block(),
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_DEEPSLATE_VERTICAL_SLAB.block(),
            POLISHED_DEEPSLATE_SLAB
    );
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.DEEPSLATE_BRICK_VERTICAL_SLAB.block(),
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.DEEPSLATE_TILE_VERTICAL_SLAB.block(),
            DEEPSLATE_TILE_SLAB
    );
    public static final Block TUFF_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.TUFF_VERTICAL_SLAB.block(),
            TUFF_SLAB
    );
    public static final Block POLISHED_TUFF_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_TUFF_VERTICAL_SLAB.block(),
            POLISHED_TUFF_SLAB
    );
    public static final Block TUFF_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.TUFF_BRICK_VERTICAL_SLAB.block(),
            TUFF_BRICK_SLAB
    );
    public static final Block BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.BRICK_VERTICAL_SLAB.block(),
            BRICK_SLAB
    );
    public static final Block MUD_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.MUD_BRICK_VERTICAL_SLAB.block(),
            MUD_BRICK_SLAB
    );
    public static final Block SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SANDSTONE_VERTICAL_SLAB.block(),
            SANDSTONE_SLAB
    );
    public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_SANDSTONE_VERTICAL_SLAB.block(),
            SMOOTH_SANDSTONE_SLAB
    );
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.CUT_SANDSTONE_VERTICAL_SLAB.block(),
            CUT_SANDSTONE_SLAB
    );
    public static final Block RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.RED_SANDSTONE_VERTICAL_SLAB.block(),
            RED_SANDSTONE_SLAB
    );
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.block(),
            SMOOTH_RED_SANDSTONE_SLAB
    );
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.CUT_RED_SANDSTONE_VERTICAL_SLAB.block(),
            CUT_RED_SANDSTONE_SLAB
    );
    public static final Block PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.PRISMARINE_VERTICAL_SLAB.block(),
            PRISMARINE_SLAB
    );
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.PRISMARINE_BRICK_VERTICAL_SLAB.block(),
            PRISMARINE_BRICK_SLAB
    );
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.DARK_PRISMARINE_VERTICAL_SLAB.block(),
            DARK_PRISMARINE_SLAB
    );
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.NETHER_BRICK_VERTICAL_SLAB.block(),
            NETHER_BRICK_SLAB
    );
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.RED_NETHER_BRICK_VERTICAL_SLAB.block(),
            RED_NETHER_BRICK_SLAB
    );
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.BLACKSTONE_VERTICAL_SLAB.block(),
            BLACKSTONE_SLAB
    );
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_BLACKSTONE_VERTICAL_SLAB.block(),
            POLISHED_BLACKSTONE_SLAB
    );
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.block(),
            POLISHED_BLACKSTONE_BRICK_SLAB
    );
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.END_STONE_BRICK_VERTICAL_SLAB.block(),
            END_STONE_BRICK_SLAB
    );
    public static final Block PURPUR_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.PURPUR_VERTICAL_SLAB.block(),
            PURPUR_SLAB
    );
    public static final Block QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.QUARTZ_VERTICAL_SLAB.block(),
            QUARTZ_SLAB
    );
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_QUARTZ_VERTICAL_SLAB.block(),
            SMOOTH_QUARTZ_SLAB
    );
    public static final WeatheringCopperCollection<Block> CUT_COPPER_VERTICAL_SLABS = registerCopperVerticalSlab(VerticalSlabBlockItemIds.CUT_COPPER_VERTICAL_SLABS);

    public static final Block MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_OAK_VERTICAL_SLAB.block(),
            OAK_SLAB
    );
    public static final Block MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_SPRUCE_VERTICAL_SLAB.block(),
            SPRUCE_SLAB
    );
    public static final Block MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_BIRCH_VERTICAL_SLAB.block(),
            BIRCH_SLAB
    );
    public static final Block MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_JUNGLE_VERTICAL_SLAB.block(),
            JUNGLE_SLAB
    );
    public static final Block MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_ACACIA_VERTICAL_SLAB.block(),
            ACACIA_SLAB
    );
    public static final Block MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_DARK_OAK_VERTICAL_SLAB.block(),
            DARK_OAK_SLAB
    );
    public static final Block MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_MANGROVE_VERTICAL_SLAB.block(),
            MANGROVE_SLAB
    );
    public static final Block MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_CHERRY_VERTICAL_SLAB.block(),
            CHERRY_SLAB
    );
    public static final Block MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_PALE_OAK_VERTICAL_SLAB.block(),
            PALE_OAK_SLAB
    );
    public static final Block MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_BAMBOO_VERTICAL_SLAB.block(),
            BAMBOO_SLAB
    );
    public static final Block MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.block(),
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_CRIMSON_VERTICAL_SLAB.block(),
            CRIMSON_SLAB
    );
    public static final Block MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_WARPED_VERTICAL_SLAB.block(),
            WARPED_SLAB
    );
    public static final Block MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_STONE_VERTICAL_SLAB.block(),
            STONE_SLAB
    );
    public static final Block MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.block(),
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.block(),
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.block(),
            DEEPSLATE_TILE_SLAB
    );
    public static final Block MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_TUFF_VERTICAL_SLAB.block(),
            TUFF_SLAB
    );
    public static final Block MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_TUFF_BRICK_VERTICAL_SLAB.block(),
            TUFF_BRICK_SLAB
    );
    public static final Block MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.MOSSY_BRICK_VERTICAL_SLAB.block(),
            BRICK_SLAB
    );
    public static final Block PALE_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_OAK_VERTICAL_SLAB.block(),
            OAK_SLAB
    );
    public static final Block PALE_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.block(),
            SPRUCE_SLAB
    );
    public static final Block PALE_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_BIRCH_VERTICAL_SLAB.block(),
            BIRCH_SLAB
    );
    public static final Block PALE_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.block(),
            JUNGLE_SLAB
    );
    public static final Block PALE_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_ACACIA_VERTICAL_SLAB.block(),
            ACACIA_SLAB
    );
    public static final Block PALE_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.block(),
            DARK_OAK_SLAB
    );
    public static final Block PALE_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.block(),
            MANGROVE_SLAB
    );
    public static final Block PALE_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_CHERRY_VERTICAL_SLAB.block(),
            CHERRY_SLAB
    );
    public static final Block PALE_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.block(),
            PALE_OAK_SLAB
    );
    public static final Block PALE_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.block(),
            BAMBOO_SLAB
    );
    public static final Block PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.block(),
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block PALE_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.block(),
            CRIMSON_SLAB
    );
    public static final Block PALE_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_WARPED_VERTICAL_SLAB.block(),
            WARPED_SLAB
    );
    public static final Block PALE_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_STONE_VERTICAL_SLAB.block(),
            STONE_SLAB
    );
    public static final Block PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.block(),
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.block(),
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.block(),
            DEEPSLATE_TILE_SLAB
    );
    public static final Block PALE_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_TUFF_VERTICAL_SLAB.block(),
            TUFF_SLAB
    );
    public static final Block PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.block(),
            TUFF_BRICK_SLAB
    );
    public static final Block PALE_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.PALE_MOSSY_BRICK_VERTICAL_SLAB.block(),
            BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.block(),
            OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.block(),
            SPRUCE_SLAB
    );
    public static final Block CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.block(),
            BIRCH_SLAB
    );
    public static final Block CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.block(),
            JUNGLE_SLAB
    );
    public static final Block CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.block(),
            ACACIA_SLAB
    );
    public static final Block CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.block(),
            DARK_OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.block(),
            MANGROVE_SLAB
    );
    public static final Block CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.block(),
            CHERRY_SLAB
    );
    public static final Block CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.block(),
            PALE_OAK_SLAB
    );
    public static final Block CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.block(),
            BAMBOO_SLAB
    );
    public static final Block CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.block(),
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.block(),
            CRIMSON_SLAB
    );
    public static final Block CRIMSON_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.block(),
            WARPED_SLAB
    );
    public static final Block CRIMSON_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.block(),
            STONE_SLAB
    );
    public static final Block CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.block(),
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.block(),
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.block(),
            DEEPSLATE_TILE_SLAB
    );
    public static final Block CRIMSON_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.block(),
            TUFF_SLAB
    );
    public static final Block CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.block(),
            TUFF_BRICK_SLAB
    );
    public static final Block CRIMSON_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.block(),
            BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_OAK_VERTICAL_SLAB.block(),
            OAK_SLAB
    );
    public static final Block WARPED_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.block(),
            SPRUCE_SLAB
    );
    public static final Block WARPED_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.block(),
            BIRCH_SLAB
    );
    public static final Block WARPED_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.block(),
            JUNGLE_SLAB
    );
    public static final Block WARPED_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.block(),
            ACACIA_SLAB
    );
    public static final Block WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.block(),
            DARK_OAK_SLAB
    );
    public static final Block WARPED_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.block(),
            MANGROVE_SLAB
    );
    public static final Block WARPED_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.block(),
            CHERRY_SLAB
    );
    public static final Block WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.block(),
            PALE_OAK_SLAB
    );
    public static final Block WARPED_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.block(),
            BAMBOO_SLAB
    );
    public static final Block WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.block(),
            BAMBOO_MOSAIC_SLAB
    );
    public static final Block WARPED_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.block(),
            CRIMSON_SLAB
    );
    public static final Block WARPED_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_WARPED_VERTICAL_SLAB.block(),
            WARPED_SLAB
    );
    public static final Block WARPED_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_STONE_VERTICAL_SLAB.block(),
            STONE_SLAB
    );
    public static final Block WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.block(),
            COBBLED_DEEPSLATE_SLAB
    );
    public static final Block WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.block(),
            DEEPSLATE_BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.block(),
            DEEPSLATE_TILE_SLAB
    );
    public static final Block WARPED_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_TUFF_VERTICAL_SLAB.block(),
            TUFF_SLAB
    );
    public static final Block WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.block(),
            TUFF_BRICK_SLAB
    );
    public static final Block WARPED_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            VerticalSlabBlockItemIds.WARPED_MOSSY_BRICK_VERTICAL_SLAB.block(),
            BRICK_SLAB
    );

    public static final Block CUT_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.ORANGE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block CUT_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
    );
    public static final Block BRIMSTONE_BRICK_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.BRIMSTONE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.0F, 3.0F)
    );
    public static final Block FIR_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.FIR_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block PINE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.PINE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAPLE_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.MAPLE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block REDWOOD_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.REDWOOD_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.CRIMSON_NYLIUM).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAHOGANY_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.MAHOGANY_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block JACARANDA_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.JACARANDA_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.QUARTZ).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block PALM_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.PALM_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block WILLOW_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.WILLOW_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block DEAD_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.DEAD_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
    );
    public static final Block MAGIC_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.MAGIC_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
    );
    public static final Block UMBRAN_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.UMBRAN_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
    );
    public static final Block HELLBARK_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.HELLBARK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
    );
    public static final Block EMPYREAL_VERTICAL_SLAB = registerBopVerticalSlab(
            VerticalSlabBlockItemIds.EMPYREAL_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.COLOR_PURPLE, SoundType.NETHER_WOOD)
    );

    public static final Block BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.QUARTZ, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.COLOR_BLUE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB.block(),
            createWoodenVerticalSlabProperties(MapColor.TERRACOTTA_WHITE, SoundType.WOOD)
    );
    public static final Block BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)
    );
    public static final Block BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE)
    );
    public static final Block BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE)
    );
    public static final Block BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS)
    );
    public static final Block BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB = registerBWGVerticalSlab(
            VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB.block(),
            BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.5F)
    );

    public static void init() {
    }

    private static Block registerVerticalSlab(ResourceKey<Block> blockId, Block blockToCopy) {
        return registerBlock(
                blockId,
                VerticalSlabBlock::new,
                BlockBehaviour.Properties.ofFullCopy(blockToCopy)
        );
    }

    private static Block registerVerticalSlab(ResourceKey<Block> blockId, BlockBehaviour.Properties properties) {
        return registerBlock(
                blockId,
                VerticalSlabBlock::new,
                properties
        );
    }

    private static WeatheringCopperCollection<Block> registerCopperVerticalSlab(WeatheringCopperCollection<BlockItemId> weatheringCopperCollection) {
        return WeatheringCopperCollection.registerBlocks(
                weatheringCopperCollection,
                (id, function, properties) -> registerBlock(id.block(), function, properties),
                WeatheringCopperVerticalSlabBlock::new,
                WeatheringCopperVerticalSlabBlock::new,
                (ignore) -> BlockBehaviour.Properties.of()
                        .requiresCorrectToolForDrops()
                        .strength(5.0F, 6.0F)
                        .sound(SoundType.COPPER)
                        .noOcclusion()
        );
    }

    private static Block registerMossyVerticalSlab(ResourceKey<Block> blockId, Block blockToCopy) {
        return registerVerticalSlabIfModIsLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID, blockId, blockToCopy).orElse(null);

    }

    private static Block registerBopVerticalSlab(ResourceKey<Block> blockId, BlockBehaviour.Properties properties) {
        return registerVerticalSlabIfModIsLoaded(BIOMES_O_PLENTY_MOD_ID, blockId, properties).orElse(null);
    }

    private static Block registerBWGVerticalSlab(ResourceKey<Block> blockId, BlockBehaviour.Properties properties) {
        return registerVerticalSlabIfModIsLoaded(BIOMES_WEVE_GONE_MOD_ID, blockId, properties).orElse(null);
    }

    private static Optional<Block> registerVerticalSlabIfModIsLoaded(
            String modId,
            ResourceKey<Block> blockId,
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
            ResourceKey<Block> blockId,
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

    public static Block registerBlock(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, id, function.apply(properties.setId(id)));
    }
}
