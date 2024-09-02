package com.nemonotfound.nemosverticalslabs.item;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.log;

public class ModItems {

    public static final Item OAK_VERTICAL_SLAB = registerBlockItem("oak_vertical_slab", ModBlocks.OAK_VERTICAL_SLAB);
    public static final Item SPRUCE_VERTICAL_SLAB = registerBlockItem("spruce_vertical_slab", ModBlocks.SPRUCE_VERTICAL_SLAB);
    public static final Item BIRCH_VERTICAL_SLAB = registerBlockItem("birch_vertical_slab", ModBlocks.BIRCH_VERTICAL_SLAB);
    public static final Item JUNGLE_VERTICAL_SLAB = registerBlockItem("jungle_vertical_slab", ModBlocks.JUNGLE_VERTICAL_SLAB);
    public static final Item ACACIA_VERTICAL_SLAB = registerBlockItem("acacia_vertical_slab", ModBlocks.ACACIA_VERTICAL_SLAB);
    public static final Item DARK_OAK_VERTICAL_SLAB = registerBlockItem("dark_oak_vertical_slab", ModBlocks.DARK_OAK_VERTICAL_SLAB);
    public static final Item MANGROVE_VERTICAL_SLAB = registerBlockItem("mangrove_vertical_slab", ModBlocks.MANGROVE_VERTICAL_SLAB);
    public static final Item CHERRY_VERTICAL_SLAB = registerBlockItem("cherry_vertical_slab", ModBlocks.CHERRY_VERTICAL_SLAB);
    public static final Item BAMBOO_VERTICAL_SLAB = registerBlockItem("bamboo_vertical_slab", ModBlocks.BAMBOO_VERTICAL_SLAB);
    public static final Item BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlockItem("bamboo_mosaic_vertical_slab", ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
    public static final Item CRIMSON_VERTICAL_SLAB = registerBlockItem("crimson_vertical_slab", ModBlocks.CRIMSON_VERTICAL_SLAB);
    public static final Item WARPED_VERTICAL_SLAB = registerBlockItem("warped_vertical_slab", ModBlocks.WARPED_VERTICAL_SLAB);

    public static void registerItems() {
        log.info("Registering items");
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
