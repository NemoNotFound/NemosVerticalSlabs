package com.nemonotfound.nemos.vertical.slabs.datagen;

import com.nemonotfound.nemos.vertical.slabs.block.ModBlocks;
import com.nemonotfound.nemos.vertical.slabs.block.enums.VerticalSlabType;
import com.nemonotfound.nemos.vertical.slabs.property.ModProperties;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;

import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class ModelProvider extends FabricModelProvider {

    private static final String TOP_SUFFIX = "_top";
    private static final String SIDE_SUFFIX = "_side";
    private static final String BOTTOM_SUFFIX = "_bottom";

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PALE_OAK_PLANKS, ModBlocks.PALE_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BAMBOO_MOSAIC, ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WARPED_PLANKS, ModBlocks.WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE, ModBlocks.STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        registerSmoothStone(blockStateModelGenerator);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.GRANITE, ModBlocks.GRANITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DIORITE, ModBlocks.DIORITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.ANDESITE, ModBlocks.ANDESITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.TUFF, ModBlocks.TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.TUFF_BRICKS, ModBlocks.TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BRICKS, ModBlocks.BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.MUD_BRICKS, ModBlocks.MUD_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, ModBlocks.SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, TOP_SUFFIX, ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModelForCutSandstone(blockStateModelGenerator, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, ModBlocks.RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, TOP_SUFFIX, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModelForCutSandstone(blockStateModelGenerator, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PRISMARINE, ModBlocks.PRISMARINE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, TOP_SUFFIX, SIDE_SUFFIX, TOP_SUFFIX, ModBlocks.QUARTZ_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.QUARTZ_BLOCK, Blocks.SMOOTH_QUARTZ, BOTTOM_SUFFIX, ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private void registerSmoothStone(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.SIDE, TextureMap.getId(Blocks.SMOOTH_STONE_SLAB).withSuffixedPath("_side"))
                .put(TextureKey.BOTTOM, TextureMap.getId(Blocks.SMOOTH_STONE))
                .put(TextureKey.PARTICLE, TextureMap.getId(Blocks.SMOOTH_STONE));
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(Blocks.SMOOTH_STONE_SLAB, "_side"), textureMap.getTexture(TextureKey.TOP));

        var weightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, textureMap, blockStateModelGenerator.modelCollector));
        var leftWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_LEFT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_left", textureMap, blockStateModelGenerator.modelCollector));
        var rightWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_RIGHT.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_right", textureMap, blockStateModelGenerator.modelCollector));
        var backWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_BACK.upload(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_back", textureMap, blockStateModelGenerator.modelCollector));
        var fullWeightedVariant = createWeightedVariant(Models.CUBE_COLUMN.uploadWithoutVariant(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "_double", textureMap2, blockStateModelGenerator.modelCollector));

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, weightedVariant, leftWeightedVariant, rightWeightedVariant, backWeightedVariant, fullWeightedVariant));
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        WeightedVariant fullWeightedVariant = createWeightedVariant(ModelIds.getBlockModelId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, block, fullWeightedVariant);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockStateModelGenerator, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock).withSuffixedPath(sideSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock).withSuffixedPath(bottomSuffix))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix));
        WeightedVariant fullWeightedVariant = createWeightedVariant(ModelIds.getBlockModelId(fullBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, block, fullWeightedVariant);
    }

    private void generateVerticalSlabBlockModelForCutSandstone(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block secondTextureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(secondTextureBlock).withSuffixedPath(TOP_SUFFIX))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(secondTextureBlock).withSuffixedPath(BOTTOM_SUFFIX))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));
        var fullWeightedVariant = createWeightedVariant(ModelIds.getBlockModelId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, block, fullWeightedVariant);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, TextureMap textureMap, Block block, WeightedVariant fullWeightedVariant) {
        var weightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB.upload(block, textureMap, blockStateModelGenerator.modelCollector));
        var leftWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_LEFT.upload(block, "_left", textureMap, blockStateModelGenerator.modelCollector));
        var rightWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_RIGHT.upload(block, "_right", textureMap, blockStateModelGenerator.modelCollector));
        var backWeightedVariant = createWeightedVariant(ModModels.VERTICAL_SLAB_BACK.upload(block, "_back", textureMap, blockStateModelGenerator.modelCollector));

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(block, weightedVariant, leftWeightedVariant, rightWeightedVariant, backWeightedVariant, fullWeightedVariant));
    }

    public static BlockModelDefinitionCreator createVerticalSlabBlockState(Block verticalSlabBlock, WeightedVariant weightedVariant,
                                                                           WeightedVariant leftWeightedVariant, WeightedVariant rightWeightedVariant, WeightedVariant backWeightedVariant, WeightedVariant fullWeightedVariant) {
        return VariantsBlockModelDefinitionCreator.of(verticalSlabBlock)
                .with(
                        BlockStateVariantMap.models(ModProperties.VERTICAL_SLAB_TYPE)
                                .register(VerticalSlabType.FRONT, weightedVariant)
                                .register(VerticalSlabType.LEFT, leftWeightedVariant)
                                .register(VerticalSlabType.RIGHT, rightWeightedVariant)
                                .register(VerticalSlabType.BACK, backWeightedVariant)
                                .register(VerticalSlabType.DOUBLE, fullWeightedVariant)
                );
    }
}
