package hugman.mubble.objects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.MushroomPlantBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

import java.util.Random;

public class GrowableMushroomPlantBlock extends MushroomPlantBlock
{
	protected final Block hatBlock;

	public GrowableMushroomPlantBlock(Block.Settings builder, Block hatBlock)
	{
		super(builder);
		this.hatBlock = hatBlock;
	}

	@Override
	public boolean trySpawningBigMushroom(ServerWorld serverWorld, BlockPos pos, BlockState state, Random random)
	{
		serverWorld.removeBlock(pos, false);
		ConfiguredFeature hugeMushroomFeature = Feature.HUGE_RED_MUSHROOM.configure(new HugeMushroomFeatureConfig(new SimpleBlockStateProvider(this.hatBlock.getDefaultState().with(MushroomBlock.DOWN, false)), new SimpleBlockStateProvider(Blocks.MUSHROOM_STEM.getDefaultState()), 2));
		if (hugeMushroomFeature.generate(serverWorld, serverWorld.getChunkManager().getChunkGenerator(), random, pos))
		{
			return true;
		}
		else
		{
			serverWorld.setBlockState(pos, state, 3);
			return false;
		}
	}
}
