package com.nemonotfound.nemos.vertical.slabs.datagen;

import com.nemonotfound.nemos.vertical.slabs.reference.VerticalSlabBlockItemIds;
import com.nemonotfound.nemos.vertical.slabs.tags.VerticalSlabItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public ItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(VerticalSlabItemTags.WOODEN_VERTICAL_SLABS)
                .add(VerticalSlabBlockItemIds.OAK_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.SPRUCE_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.BIRCH_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.JUNGLE_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.ACACIA_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.DARK_OAK_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.PALE_OAK_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.CRIMSON_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.WARPED_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.MANGROVE_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.BAMBOO_VERTICAL_SLAB.item())
                .add(VerticalSlabBlockItemIds.CHERRY_VERTICAL_SLAB.item())

                .addOptional(VerticalSlabBlockItemIds.MOSSY_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_SPRUCE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_BIRCH_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_JUNGLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_ACACIA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_DARK_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_PALE_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_CRIMSON_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_WARPED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_MANGROVE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_BAMBOO_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MOSSY_CHERRY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_BIRCH_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_ACACIA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_WARPED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALE_MOSSY_CHERRY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_WARPED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.item())

                .addOptional(VerticalSlabBlockItemIds.FIR_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PINE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MAPLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.REDWOOD_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.MAHOGANY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.JACARANDA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.PALM_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.WILLOW_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.DEAD_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.UMBRAN_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.HELLBARK_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.EMPYREAL_VERTICAL_SLAB.item())

                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB.item())
                .addOptional(VerticalSlabBlockItemIds.BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB.item());
    }

}
