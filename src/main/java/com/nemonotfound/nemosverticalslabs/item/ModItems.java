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

    public static void registerItems() {
        log.info("Registering items");
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
