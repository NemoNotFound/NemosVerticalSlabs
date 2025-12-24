package com.nemonotfound.nemos.vertical.slabs.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Optional;

import static com.nemonotfound.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class NemosVerticalModelTemplates {

    public static final ModelTemplate VERTICAL_SLAB = block("parent/vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate VERTICAL_SLAB_LEFT = block("parent/vertical_slab_left", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate VERTICAL_SLAB_RIGHT = block("parent/vertical_slab_right", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate VERTICAL_SLAB_BACK = block("parent/vertical_slab_back", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);

    private static ModelTemplate block(String parent, TextureSlot... requiredTextureSlots) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureSlots);
    }
}
