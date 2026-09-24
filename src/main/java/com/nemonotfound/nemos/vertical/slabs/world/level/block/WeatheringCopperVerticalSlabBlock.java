package com.nemonotfound.nemos.vertical.slabs.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class WeatheringCopperVerticalSlabBlock extends VerticalSlabBlock implements WeatheringCopper {

    private final WeatherState weatherState;

    public WeatheringCopperVerticalSlabBlock(WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public @NotNull WeatherState getAge() {
        return this.weatherState;
    }
}
