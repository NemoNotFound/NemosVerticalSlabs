package com.nemonotfound.nemosverticalslabs;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NemosVerticalSlabsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_VERTICAL_SLAB, RenderLayer.getCutout());
	}
}