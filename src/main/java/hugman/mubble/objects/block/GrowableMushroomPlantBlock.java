package hugman.mubble.objects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BigMushroomFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GrowableMushroomPlantBlock extends net.minecraft.block.MushroomBlock {
	protected final Block hatBlock;

	public GrowableMushroomPlantBlock(Block.Properties builder, Block hatBlock) {
		super(builder);
		this.hatBlock = hatBlock;
	}

	@Override
	public boolean func_226940_a_(ServerWorld serverWorld, BlockPos pos, BlockState state, Random random) {
		serverWorld.removeBlock(pos, false);
		ConfiguredFeature hugeMushroomFeature = Feature.HUGE_RED_MUSHROOM.withConfiguration(new BigMushroomFeatureConfig(new SimpleBlockStateProvider(this.hatBlock.getDefaultState().with(HugeMushroomBlock.DOWN, false)), new SimpleBlockStateProvider(Blocks.MUSHROOM_STEM.getDefaultState()), 2));
		if(hugeMushroomFeature.func_236265_a_(serverWorld, serverWorld.func_241112_a_(), serverWorld.getChunkProvider().getChunkGenerator(), random, pos)) {
			return true;
		}
		else {
			serverWorld.setBlockState(pos, state, 3);
			return false;
		}
	}
}
