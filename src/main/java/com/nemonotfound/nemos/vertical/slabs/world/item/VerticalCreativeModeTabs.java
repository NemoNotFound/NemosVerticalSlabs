package com.nemonotfound.nemos.vertical.slabs.world.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class VerticalCreativeModeTabs {

    private static final List<Item> DISPLAY_ITEMS = new ArrayList<>();

    public static CreativeModeTab NEMOS_VERTICAL_SLABS = register(
            "itemGroup." + MOD_ID,
            VerticalSlabItems.OAK_VERTICAL_SLAB,
            DISPLAY_ITEMS
    );

    public static void init() {
        addDisplayItems();
    }

    private static void addDisplayItems() {
        addDisplayItem(VerticalSlabItems.OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.GRANITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_GRANITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DIORITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_DIORITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ANDESITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_ANDESITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MUD_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PRISMARINE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DARK_PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.RED_NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.END_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PURPUR_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.QUARTZ_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_QUARTZ_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        addDisplayItem(VerticalSlabItems.MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB);

        addDisplayItem(VerticalSlabItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BRIMSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.FIR_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAPLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.REDWOOD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAHOGANY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.JACARANDA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALM_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WILLOW_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEAD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAGIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.UMBRAN_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.HELLBARK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.EMPYREAL_VERTICAL_SLAB);

        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_BLUE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_BLUE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_BLUE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_PURPLE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_PINK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_PINK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_PINK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_SMOOTH_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CUT_WINDSWEPT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_DACITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CRACKED_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MOSSY_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CHISELED_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_DACITE_COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_DACITE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_DACITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CRACKED_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MOSSY_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CHISELED_WHITE_DACITE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_DACITE_COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_WHITE_DACITE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_RED_ROCK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_RED_ROCK_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CRACKED_RED_ROCK_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MOSSY_RED_ROCK_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CHISELED_RED_ROCK_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_POLISHED_RED_ROCK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_RED_ROCK_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_ROCKY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_PALE_MUD_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIOMES_WEVE_GONE_CATTAIL_THATCH_VERTICAL_SLAB);
    }

    private static void addDisplayItem(Item item) {
        if (item != null) {
            DISPLAY_ITEMS.add(item);
        }
    }

    private static CreativeModeTab register(String title, Item iconItem, List<Item> dispalyItemSuppliers) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MOD_ID, FabricItemGroup.builder()
                .title(Component.translatable(title))
                .icon(() -> new ItemStack(iconItem))
                .displayItems((parameters, output) -> {
                    for (Item displayItemSupplier : dispalyItemSuppliers) {
                        output.accept(displayItemSupplier);
                    }
                })
                .build());
    }
}
