package com.nemonotfound.nemosverticalslabs.item;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.log;

public class ModItemGroups {

    public static String NEMOS_VERTICAL_SLABS_GROUP_ID = "nemos_vertical_slabs";

    public static void registerItemGroups() {
        log.info("Registering item groups / Adding items to item groups");

        registerNemosVerticalSlabsItemGroup();
        modifyBuildingBlocksItemGroup();
    }

    private static void registerNemosVerticalSlabsItemGroup() {
        ItemGroup itemGroup = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.OAK_VERTICAL_SLAB))
                .displayName(Text.literal("Nemo's Vertical Slabs"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.OAK_VERTICAL_SLAB);
                    entries.add(ModItems.SPRUCE_VERTICAL_SLAB);
                    entries.add(ModItems.BIRCH_VERTICAL_SLAB);
                    entries.add(ModItems.JUNGLE_VERTICAL_SLAB);
                    entries.add(ModItems.ACACIA_VERTICAL_SLAB);
                    entries.add(ModItems.DARK_OAK_VERTICAL_SLAB);
                    entries.add(ModItems.MANGROVE_VERTICAL_SLAB);
                    entries.add(ModItems.CHERRY_VERTICAL_SLAB);
                    entries.add(ModItems.BAMBOO_VERTICAL_SLAB);
                    entries.add(ModItems.BAMBOO_MOSAIC_VERTICAL_SLAB);
                    entries.add(ModItems.CRIMSON_VERTICAL_SLAB);
                    entries.add(ModItems.WARPED_VERTICAL_SLAB);
                    entries.add(ModItems.STONE_VERTICAL_SLAB);
                    entries.add(ModItems.COBBLESTONE_VERTICAL_SLAB);
                    entries.add(ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB);
                    entries.add(ModItems.SMOOTH_STONE_VERTICAL_SLAB);
                    entries.add(ModItems.STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.GRANITE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_GRANITE_VERTICAL_SLAB);
                    entries.add(ModItems.DIORITE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_DIORITE_VERTICAL_SLAB);
                    entries.add(ModItems.ANDESITE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_ANDESITE_VERTICAL_SLAB);
                    entries.add(ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB);
                    entries.add(ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.DEEPSLATE_TILE_VERTICAL_SLAB);
                    entries.add(ModItems.TUFF_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_TUFF_VERTICAL_SLAB);
                    entries.add(ModItems.TUFF_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.MUD_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.CUT_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.PRISMARINE_VERTICAL_SLAB);
                    entries.add(ModItems.PRISMARINE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.DARK_PRISMARINE_VERTICAL_SLAB);
                    entries.add(ModItems.NETHER_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.RED_NETHER_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.BLACKSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB);
                    entries.add(ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.END_STONE_BRICK_VERTICAL_SLAB);
                    entries.add(ModItems.PURPUR_VERTICAL_SLAB);
                    entries.add(ModItems.QUARTZ_VERTICAL_SLAB);
                    entries.add(ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB);
                    entries.add(ModItems.CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                    entries.add(ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, NEMOS_VERTICAL_SLABS_GROUP_ID), itemGroup);
    }

    private static void modifyBuildingBlocksItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.OAK_SLAB, ModItems.OAK_VERTICAL_SLAB);
            entries.addAfter(Items.SPRUCE_SLAB, ModItems.SPRUCE_VERTICAL_SLAB);
            entries.addAfter(Items.BIRCH_SLAB, ModItems.BIRCH_VERTICAL_SLAB);
            entries.addAfter(Items.JUNGLE_SLAB, ModItems.JUNGLE_VERTICAL_SLAB);
            entries.addAfter(Items.ACACIA_SLAB, ModItems.ACACIA_VERTICAL_SLAB);
            entries.addAfter(Items.DARK_OAK_SLAB, ModItems.DARK_OAK_VERTICAL_SLAB);
            entries.addAfter(Items.MANGROVE_SLAB, ModItems.MANGROVE_VERTICAL_SLAB);
            entries.addAfter(Items.CHERRY_SLAB, ModItems.CHERRY_VERTICAL_SLAB);
            entries.addAfter(Items.BAMBOO_SLAB, ModItems.BAMBOO_VERTICAL_SLAB);
            entries.addAfter(Items.BAMBOO_MOSAIC_SLAB, ModItems.BAMBOO_MOSAIC_VERTICAL_SLAB);
            entries.addAfter(Items.CRIMSON_SLAB, ModItems.CRIMSON_VERTICAL_SLAB);
            entries.addAfter(Items.WARPED_SLAB, ModItems.WARPED_VERTICAL_SLAB);
            entries.addAfter(Items.STONE_SLAB, ModItems.STONE_VERTICAL_SLAB);
            entries.addAfter(Items.COBBLESTONE_SLAB, ModItems.COBBLESTONE_VERTICAL_SLAB);
            entries.addAfter(Items.MOSSY_COBBLESTONE_SLAB, ModItems.MOSSY_COBBLESTONE_VERTICAL_SLAB);
            entries.addAfter(Items.SMOOTH_STONE_SLAB, ModItems.SMOOTH_STONE_VERTICAL_SLAB);
            entries.addAfter(Items.STONE_BRICK_SLAB, ModItems.STONE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.MOSSY_STONE_BRICK_SLAB, ModItems.MOSSY_STONE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.GRANITE_SLAB, ModItems.GRANITE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_GRANITE_SLAB, ModItems.POLISHED_GRANITE_VERTICAL_SLAB);
            entries.addAfter(Items.DIORITE_SLAB, ModItems.DIORITE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_DIORITE_SLAB, ModItems.POLISHED_DIORITE_VERTICAL_SLAB);
            entries.addAfter(Items.ANDESITE_SLAB, ModItems.ANDESITE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_ANDESITE_SLAB, ModItems.POLISHED_ANDESITE_VERTICAL_SLAB);
            entries.addAfter(Items.COBBLED_DEEPSLATE_SLAB, ModItems.COBBLED_DEEPSLATE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_DEEPSLATE_SLAB, ModItems.POLISHED_DEEPSLATE_VERTICAL_SLAB);
            entries.addAfter(Items.DEEPSLATE_BRICK_SLAB, ModItems.DEEPSLATE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.DEEPSLATE_TILE_SLAB, ModItems.DEEPSLATE_TILE_VERTICAL_SLAB);
            entries.addAfter(Items.TUFF_SLAB, ModItems.TUFF_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_TUFF_SLAB, ModItems.POLISHED_TUFF_VERTICAL_SLAB);
            entries.addAfter(Items.TUFF_BRICK_SLAB, ModItems.TUFF_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.BRICK_SLAB, ModItems.BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.MUD_BRICK_SLAB, ModItems.MUD_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.SANDSTONE_SLAB, ModItems.SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.SMOOTH_SANDSTONE_SLAB, ModItems.SMOOTH_SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.CUT_SANDSTONE_SLAB, ModItems.CUT_SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.RED_SANDSTONE_SLAB, ModItems.RED_SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ModItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.CUT_RED_SANDSTONE_SLAB, ModItems.CUT_RED_SANDSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.PRISMARINE_SLAB, ModItems.PRISMARINE_VERTICAL_SLAB);
            entries.addAfter(Items.PRISMARINE_BRICK_SLAB, ModItems.PRISMARINE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.DARK_PRISMARINE_SLAB, ModItems.DARK_PRISMARINE_VERTICAL_SLAB);
            entries.addAfter(Items.NETHER_BRICK_SLAB, ModItems.NETHER_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.RED_NETHER_BRICK_SLAB, ModItems.RED_NETHER_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.BLACKSTONE_SLAB, ModItems.BLACKSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_BLACKSTONE_SLAB, ModItems.POLISHED_BLACKSTONE_VERTICAL_SLAB);
            entries.addAfter(Items.POLISHED_BLACKSTONE_BRICK_SLAB, ModItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.END_STONE_BRICK_SLAB, ModItems.END_STONE_BRICK_VERTICAL_SLAB);
            entries.addAfter(Items.PURPUR_SLAB, ModItems.PURPUR_VERTICAL_SLAB);
            entries.addAfter(Items.QUARTZ_SLAB, ModItems.QUARTZ_VERTICAL_SLAB);
            entries.addAfter(Items.SMOOTH_QUARTZ_SLAB, ModItems.SMOOTH_QUARTZ_VERTICAL_SLAB);
            entries.addAfter(Items.CUT_COPPER_SLAB, ModItems.CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.EXPOSED_CUT_COPPER_SLAB, ModItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.WEATHERED_CUT_COPPER_SLAB, ModItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB, ModItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.WAXED_CUT_COPPER_SLAB, ModItems.WAXED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, ModItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, ModItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
            entries.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        });
    }
}
