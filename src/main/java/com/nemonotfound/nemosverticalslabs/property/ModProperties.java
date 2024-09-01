package com.nemonotfound.nemosverticalslabs.property;

import com.nemonotfound.nemosverticalslabs.block.enums.VerticalSlabType;
import net.minecraft.state.property.EnumProperty;

public class ModProperties {

    public static final EnumProperty<VerticalSlabType> VERTICAL_SLAB_TYPE = EnumProperty.of("type", VerticalSlabType.class);
}
