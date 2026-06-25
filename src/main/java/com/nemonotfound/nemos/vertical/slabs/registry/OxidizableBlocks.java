package com.nemonotfound.nemos.vertical.slabs.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import static com.nemonotfound.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks.CUT_COPPER_VERTICAL_SLABS;

public class OxidizableBlocks {

    public static void init() {
        CUT_COPPER_VERTICAL_SLABS.weathering().progressMapping(OxidizableBlocksRegistry::registerNextStage);
        CUT_COPPER_VERTICAL_SLABS.zipUnwaxedWaxed(OxidizableBlocksRegistry::registerWaxable);
    }
}
