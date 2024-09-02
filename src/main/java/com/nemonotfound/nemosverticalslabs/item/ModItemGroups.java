package com.nemonotfound.nemosverticalslabs.item;

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
        });
    }
}
