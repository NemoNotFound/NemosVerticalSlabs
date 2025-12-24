package com.nemonotfound.nemos.vertical.slabs.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class VerticalSlabItemTags {

    public static final TagKey<Item> WOODEN_VERTICAL_SLABS = bind("wooden_vertical_slabs");

    private static TagKey<Item> bind(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
