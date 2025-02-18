package com.nemonotfound.nemos.vertical.slabs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.log;

public class ModItemGroups {

    public static String NEMOS_VERTICAL_SLABS_GROUP_ID = "nemos_vertical_slabs";

    public static void registerItemGroups() {
        log.info("Registering item groups / Adding items to item groups");

        registerNemosVerticalSlabsItemGroup();
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
}
