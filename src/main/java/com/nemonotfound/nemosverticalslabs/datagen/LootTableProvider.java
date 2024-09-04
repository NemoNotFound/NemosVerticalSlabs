package com.nemonotfound.nemosverticalslabs.datagen;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import com.nemonotfound.nemosverticalslabs.block.VerticalSlabBlock;
import com.nemonotfound.nemosverticalslabs.block.enums.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        this.addDrop(ModBlocks.OAK_VERTICAL_SLAB, slabDrops(ModBlocks.OAK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SPRUCE_VERTICAL_SLAB, slabDrops(ModBlocks.SPRUCE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BIRCH_VERTICAL_SLAB, slabDrops(ModBlocks.BIRCH_VERTICAL_SLAB));
        this.addDrop(ModBlocks.JUNGLE_VERTICAL_SLAB, slabDrops(ModBlocks.JUNGLE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ACACIA_VERTICAL_SLAB, slabDrops(ModBlocks.ACACIA_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DARK_OAK_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_OAK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MANGROVE_VERTICAL_SLAB, slabDrops(ModBlocks.MANGROVE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CHERRY_VERTICAL_SLAB, slabDrops(ModBlocks.CHERRY_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BAMBOO_VERTICAL_SLAB, slabDrops(ModBlocks.BAMBOO_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, slabDrops(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB, slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WARPED_VERTICAL_SLAB, slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        this.addDrop(ModBlocks.STONE_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLESTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.MUD_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MUD_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.NETHER_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.BLACKSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB));
        this.addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB));
        this.addDrop(ModBlocks.PURPUR_VERTICAL_SLAB, slabDrops(ModBlocks.PURPUR_VERTICAL_SLAB));
        this.addDrop(ModBlocks.QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.QUARTZ_VERTICAL_SLAB));
        this.addDrop(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB));
        this.addDrop(ModBlocks.CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        this.addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB));
    }

    public LootTable.Builder slabDrops(Block drop) {
        return LootTable.builder()
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(this.applyExplosionDecay(drop, ItemEntry.builder(drop)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                                        .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)))))));
    }
}
