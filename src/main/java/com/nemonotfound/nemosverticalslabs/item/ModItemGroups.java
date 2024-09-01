package com.nemonotfound.nemosverticalslabs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosverticalslabs.NemosVerticalSlabs.log;

public class ModItemGroups {

    public static String NEMOS_VERTICAL_SLABS_GROUP_ID = "nemos_vertical_slabs";

    public static void registerItemGroups() {
        log.info("Registering item groups / Adding items to item groups");

        registerNemosVerticalSlabsItemGroup();
    }

    private static void registerNemosVerticalSlabsItemGroup() {
        ItemGroup itemGroup = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.OAK_VERTICAL_SLAB))
                .displayName(Text.translatable("itemGroup.nemosVerticalSlabs"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.OAK_VERTICAL_SLAB);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, NEMOS_VERTICAL_SLABS_GROUP_ID), itemGroup);
    }
}
