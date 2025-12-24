package com.nemonotfound.nemos.vertical.slabs.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import static com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks.*;

public class OxidizableBlocks {

    public static void init() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CUT_COPPER_VERTICAL_SLAB, EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_CUT_COPPER_VERTICAL_SLAB, OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        OxidizableBlocksRegistry.registerWaxableBlockPair(CUT_COPPER_VERTICAL_SLAB, WAXED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_CUT_COPPER_VERTICAL_SLAB, WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_CUT_COPPER_VERTICAL_SLAB, WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }
}
