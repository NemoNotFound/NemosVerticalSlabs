package com.nemonotfound.nemosverticalslabs;

import com.nemonotfound.nemosverticalslabs.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NemosVerticalSlabsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_VERTICAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_VERTICAL_SLAB, RenderLayer.getCutout());
	}
}