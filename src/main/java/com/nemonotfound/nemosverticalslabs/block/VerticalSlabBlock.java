package com.nemonotfound.nemosverticalslabs.block;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemosverticalslabs.block.enums.VerticalSlabType;
import com.nemonotfound.nemosverticalslabs.property.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements Waterloggable {

    public static final MapCodec<VerticalSlabBlock> CODEC = VerticalSlabBlock.createCodec(VerticalSlabBlock::new);
    public static EnumProperty<VerticalSlabType> TYPE = ModProperties.VERTICAL_SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    protected static final VoxelShape FRONT_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 8);
    protected static final VoxelShape LEFT_SHAPE = Block.createCuboidShape(0, 0, 0, 8, 16, 16);
    protected static final VoxelShape RIGHT_SHAPE = Block.createCuboidShape(8, 0, 0, 16, 16, 16);
    protected static final VoxelShape BACK_SHAPE = Block.createCuboidShape(0, 0, 8, 16, 16, 16);

    public MapCodec<? extends VerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public VerticalSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(TYPE, VerticalSlabType.FRONT).with(WATERLOGGED, false));
    }

    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VerticalSlabType slabType = state.get(TYPE);

        return switch (slabType) {
            case DOUBLE -> VoxelShapes.fullCube();
            case FRONT -> FRONT_SHAPE;
            case LEFT -> LEFT_SHAPE;
            case RIGHT -> RIGHT_SHAPE;
            case BACK -> BACK_SHAPE;
        };

    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);

        if (blockState.isOf(this)) {
            return blockState.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false);
        }

        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        BlockState blockState2 = this.getDefaultState().with(TYPE, VerticalSlabType.BACK).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        Direction direction = ctx.getSide();

        double zPos = ctx.getHitPos().z - (double)blockPos.getZ();
        double xPos = ctx.getHitPos().x - (double) blockPos.getX();

        if ((direction == Direction.UP || direction == Direction.DOWN) && zPos > 0.5) {
            double diffZ = 1 - zPos;

            if (xPos > 0.5) {
                double diffX = 1 - xPos;

                if (diffX > diffZ) {
                    return blockState2.with(TYPE, VerticalSlabType.BACK);
                } else {
                    return blockState2.with(TYPE, VerticalSlabType.RIGHT);
                }
            } else {
                if (xPos > diffZ) {
                    return blockState2.with(TYPE, VerticalSlabType.BACK);
                } else {
                    return blockState2.with(TYPE, VerticalSlabType.LEFT);
                }
            }
        } else if ((direction == Direction.UP || direction == Direction.DOWN) && zPos <= 0.5) {
            if (xPos > 0.5) {
                double diffX = 1 - xPos;

                if (diffX > zPos) {
                    return blockState2.with(TYPE, VerticalSlabType.FRONT);
                } else {
                    return blockState2.with(TYPE, VerticalSlabType.RIGHT);
                }
            } else {
                if (xPos > zPos) {
                    return blockState2.with(TYPE, VerticalSlabType.FRONT);
                } else {
                    return blockState2.with(TYPE, VerticalSlabType.LEFT);
                }
            }
        }


        if (direction == Direction.SOUTH) {
            if (xPos < 0.333) {
                return blockState2.with(TYPE, VerticalSlabType.LEFT);
            }

            if (xPos > 0.666) {
                return blockState2.with(TYPE, VerticalSlabType.RIGHT);
            }

            return blockState2.with(TYPE, VerticalSlabType.FRONT);
        }

        if (direction == Direction.NORTH) {
            if (xPos < 0.333) {
                return blockState2.with(TYPE, VerticalSlabType.LEFT);
            }

            if (xPos > 0.666) {
                return blockState2.with(TYPE, VerticalSlabType.RIGHT);
            }

            return blockState2.with(TYPE, VerticalSlabType.BACK);
        }

        if (direction == Direction.WEST) {
            if (zPos < 0.333) {
                return blockState2.with(TYPE, VerticalSlabType.FRONT);
            }

            if (zPos > 0.666) {
                return blockState2.with(TYPE, VerticalSlabType.BACK);
            }

            return blockState2.with(TYPE, VerticalSlabType.RIGHT);
        }

        if (direction == Direction.EAST) {
            if (zPos < 0.333) {
                return blockState2.with(TYPE, VerticalSlabType.FRONT);
            }

            if (zPos > 0.666) {
                return blockState2.with(TYPE, VerticalSlabType.BACK);
            }

            return blockState2.with(TYPE, VerticalSlabType.LEFT);
        }

        return blockState2;
    }

    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        VerticalSlabType slabType = state.get(TYPE);

        if (slabType == VerticalSlabType.DOUBLE || !itemStack.isOf(this.asItem())) {
            return false;
        }

        if (context.canReplaceExisting()) {
            Direction direction = context.getSide();

            if (slabType == VerticalSlabType.FRONT) {
                return direction == Direction.SOUTH;
            }

            if (slabType == VerticalSlabType.BACK) {
                return direction == Direction.NORTH;
            }

            if (slabType == VerticalSlabType.LEFT) {
                return direction == Direction.EAST;
            }

            if (slabType == VerticalSlabType.RIGHT) {
                return direction == Direction.WEST;
            }
        }

        return true;
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (isDoubleVerticalSlab(state)) {
            return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
        }

        return false;
    }

    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        if (isDoubleVerticalSlab(state)) {
            return Waterloggable.super.canFillWithFluid(player, world, pos, state, fluid);
        }
        return false;
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return switch (type) {
            case LAND, AIR -> false;
            case WATER -> state.getFluidState().isIn(FluidTags.WATER);
        };
    }

    private boolean isDoubleVerticalSlab(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }
}
