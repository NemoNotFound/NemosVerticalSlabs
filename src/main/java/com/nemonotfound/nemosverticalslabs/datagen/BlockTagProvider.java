package com.nemonotfound.nemosverticalslabs.datagen;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_VERTICAL_SLAB)
                .add(ModBlocks.SPRUCE_VERTICAL_SLAB)
                .add(ModBlocks.BIRCH_VERTICAL_SLAB)
                .add(ModBlocks.JUNGLE_VERTICAL_SLAB)
                .add(ModBlocks.ACACIA_VERTICAL_SLAB)
                .add(ModBlocks.DARK_OAK_VERTICAL_SLAB)
                .add(ModBlocks.MANGROVE_VERTICAL_SLAB)
                .add(ModBlocks.CHERRY_VERTICAL_SLAB)
                .add(ModBlocks.BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_VERTICAL_SLAB);
    }
}
