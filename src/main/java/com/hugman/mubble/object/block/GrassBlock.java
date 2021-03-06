package com.hugman.mubble.object.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

import java.util.Random;

public class GrassBlock extends net.minecraft.block.GrassBlock {
	private final Block dirt;

	public GrassBlock(Block dirt, Settings builder) {
		super(builder);
		this.dirt = dirt;
	}

	private static boolean canSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		BlockPos blockpos = pos.up();
		return worldView.getLightLevel(blockpos) >= 4 || worldView.getBlockState(blockpos).getOpacity(worldView, blockpos) < worldView.getMaxLightLevel();
	}

	private static boolean canSpread(BlockState state, WorldView worldView, BlockPos pos) {
		BlockPos blockpos = pos.up();
		return worldView.getLightLevel(blockpos) >= 4 && worldView.getBlockState(blockpos).getOpacity(worldView, blockpos) < worldView.getMaxLightLevel() && !worldView.getFluidState(blockpos).isIn(FluidTags.WATER);
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		if(!worldIn.isClient) {
			if(!worldIn.isChunkLoaded(pos)) {
				return;
			}
			if(!canSurvive(state, worldIn, pos)) {
				worldIn.setBlockState(pos, this.dirt.getDefaultState());
			}
			else {
				if(worldIn.getLightLevel(pos.up()) >= 9) {
					for(int i = 0; i < 4; ++i) {
						BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
						if(!worldIn.canSetBlock(blockpos)) {
							return;
						}
						if(worldIn.getBlockState(blockpos).getBlock() == dirt && canSpread(state, worldIn, blockpos)) {
							worldIn.setBlockState(blockpos, this.getDefaultState());
						}
					}
				}
			}
		}
	}
}
