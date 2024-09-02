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
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
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
