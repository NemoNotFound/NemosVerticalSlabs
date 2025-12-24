package com.nemonotfound.nemos.vertical.slabs.datagen;

import com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlock;
import com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks;
import com.nemonotfound.nemos.vertical.slabs.world.level.block.state.properties.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(dataOutput, providerCompletableFuture);
    }

    @Override
    public void generate() {
        addVerticalSlabDrops(VerticalSlabBlocks.OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SPRUCE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIRCH_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.JUNGLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.ACACIA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DARK_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CHERRY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BAMBOO_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.COBBLESTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.STONE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.GRANITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DIORITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.ANDESITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.TUFF_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MUD_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.RED_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PRISMARINE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.NETHER_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BLACKSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.END_STONE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PURPUR_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.QUARTZ_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_SPRUCE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_BIRCH_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_JUNGLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_ACACIA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_CHERRY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_BAMBOO_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_CRIMSON_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_WARPED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB);

        addVerticalSlabDrops(VerticalSlabBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.FIR_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PINE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MAPLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.REDWOOD_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MAHOGANY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.JACARANDA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.PALM_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.WILLOW_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.DEAD_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.MAGIC_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.UMBRAN_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.HELLBARK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.EMPYREAL_VERTICAL_SLAB);

        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB);
        addVerticalSlabDrops(VerticalSlabBlocks.BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB);
    }

    private void addVerticalSlabDrops(Block drop) {
        this.add(drop, verticalSlabDrops(drop));
    }

    private LootTable.Builder verticalSlabDrops(Block drop) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(this.applyExplosionDecay(drop, LootItem.lootTableItem(drop)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(drop)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)))))));
    }
}
