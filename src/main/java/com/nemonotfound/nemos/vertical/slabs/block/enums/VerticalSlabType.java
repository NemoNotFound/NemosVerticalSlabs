package com.nemonotfound.nemos.vertical.slabs.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum VerticalSlabType implements StringIdentifiable {

    FRONT("front"),
    LEFT("left"),
    RIGHT("right"),
    BACK("back"),
    DOUBLE("double");

    private final String name;

    VerticalSlabType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
