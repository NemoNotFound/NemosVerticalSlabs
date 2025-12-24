package com.nemonotfound.nemos.vertical.slabs.registry;

import com.nemonotfound.nemos.vertical.slabs.tags.VerticalSlabBlockTags;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammableBlocks {

    public static void init() {
        var encouragement = 5;
        var flammability = 20;

        FlammableBlockRegistry.getDefaultInstance().add(VerticalSlabBlockTags.WOODEN_VERTICAL_SLABS, encouragement, flammability);
    }
}
