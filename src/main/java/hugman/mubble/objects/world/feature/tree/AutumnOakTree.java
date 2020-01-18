package hugman.mubble.objects.world.feature.tree;

import java.util.Random;

import hugman.mubble.init.world.MubbleFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.BranchedTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class AutumnOakTree extends SaplingGenerator
{
	@Override
	protected ConfiguredFeature<BranchedTreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl)
	{
		return random.nextInt(10) == 0 ? MubbleFeatures.TALL_AUTUMN_OAK_TREE.configure(MubbleFeatures.Config.TALL_AUTUMN_OAK_TREE) : MubbleFeatures.AUTUMN_OAK_TREE.configure(MubbleFeatures.Config.AUTUMN_OAK_TREE);
	}
}