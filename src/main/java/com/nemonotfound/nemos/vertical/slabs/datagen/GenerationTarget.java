package com.nemonotfound.nemos.vertical.slabs.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public enum GenerationTarget {
    MAIN,
    MOSSY,
    BIOMES_O_PLENTY,
    BIOMES_WEVE_GONE;

    private static final Set<String> BIOMES_O_PLENTY_BLOCKS = Set.of(
            "cut_white_sandstone_vertical_slab",
            "smooth_white_sandstone_vertical_slab",
            "white_sandstone_vertical_slab",
            "cut_orange_sandstone_vertical_slab",
            "smooth_orange_sandstone_vertical_slab",
            "orange_sandstone_vertical_slab",
            "cut_black_sandstone_vertical_slab",
            "smooth_black_sandstone_vertical_slab",
            "black_sandstone_vertical_slab",
            "fir_vertical_slab",
            "pine_vertical_slab",
            "maple_vertical_slab",
            "redwood_vertical_slab",
            "mahogany_vertical_slab",
            "jacaranda_vertical_slab",
            "palm_vertical_slab",
            "willow_vertical_slab",
            "dead_vertical_slab",
            "magic_vertical_slab",
            "umbran_vertical_slab",
            "hellbark_vertical_slab",
            "empyreal_vertical_slab"
    );

    private static final Set<String> VANILLA_MOSSY_BLOCKS = Set.of(
            "mossy_cobblestone_vertical_slab",
            "mossy_stone_brick_vertical_slab"
    );

    public boolean owns(Block block) {
        return owns(BuiltInRegistries.BLOCK.getKey(block).getPath());
    }

    public boolean owns(String path) {
        boolean mossy = !VANILLA_MOSSY_BLOCKS.contains(path)
                && (path.startsWith("mossy_")
                    || path.startsWith("pale_mossy_")
                    || path.startsWith("crimson_mossy_")
                    || path.startsWith("warped_mossy_"));

        return switch (this) {
            case MOSSY -> mossy;
            case BIOMES_O_PLENTY -> BIOMES_O_PLENTY_BLOCKS.contains(path);
            case BIOMES_WEVE_GONE -> path.startsWith("biomeswevegone_");
            case MAIN -> !mossy && !BIOMES_O_PLENTY_BLOCKS.contains(path)
                    && !path.startsWith("biomeswevegone_");
        };
    }
}
