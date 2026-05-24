package com.nemonotfound.nemos.vertical.slabs.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import static com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks.*;

public class OxidizableBlocks {

    public static void init() {
        OxidizableBlocksRegistry.registerNextStage(CUT_COPPER_VERTICAL_SLAB, EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerNextStage(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerNextStage(WEATHERED_CUT_COPPER_VERTICAL_SLAB, OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        OxidizableBlocksRegistry.registerWaxable(CUT_COPPER_VERTICAL_SLAB, WAXED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(EXPOSED_CUT_COPPER_VERTICAL_SLAB, WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(WEATHERED_CUT_COPPER_VERTICAL_SLAB, WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(OXIDIZED_CUT_COPPER_VERTICAL_SLAB, WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }
}
