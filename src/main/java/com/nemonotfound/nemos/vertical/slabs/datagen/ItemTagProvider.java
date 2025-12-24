package com.nemonotfound.nemos.vertical.slabs.datagen;

import com.nemonotfound.nemos.vertical.slabs.tags.VerticalSlabItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.vertical.slabs.world.item.VerticalSlabItems.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.getOrCreateRawBuilder(VerticalSlabItemTags.WOODEN_VERTICAL_SLABS)
                .addElement(getIdentifierFromItemRegistry(OAK_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(SPRUCE_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(BIRCH_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(JUNGLE_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(ACACIA_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(DARK_OAK_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(PALE_OAK_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(CRIMSON_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(WARPED_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(MANGROVE_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(BAMBOO_VERTICAL_SLAB))
                .addElement(getIdentifierFromItemRegistry(CHERRY_VERTICAL_SLAB))

                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALE_MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WARPED_MOSSY_CHERRY_VERTICAL_SLAB))

                .addOptionalElement(getIdentifierFromItemRegistry(FIR_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PINE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MAPLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(REDWOOD_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(MAHOGANY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(JACARANDA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(PALM_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(WILLOW_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(DEAD_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(UMBRAN_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(HELLBARK_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(EMPYREAL_VERTICAL_SLAB))

                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB))
                .addOptionalElement(getIdentifierFromItemRegistry(BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB));
    }

    private Identifier getIdentifierFromItemRegistry(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }
}
