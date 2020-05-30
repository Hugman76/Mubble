package hugman.mubble.objects.world.tree;

import hugman.mubble.init.world.MubbleFeatureConfigs;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.BranchedTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MegaTreeFeatureConfig;

import java.util.Random;

public class PinkPressGardenSaplingGenerator extends LargeTreeSaplingGenerator
{
	@Override
	protected ConfiguredFeature<BranchedTreeFeatureConfig, ?> createTreeFeature(Random random, boolean canHaveBeeHive)
	{
		return random.nextInt(10) == 0 ? Feature.FANCY_TREE.configure(MubbleFeatureConfigs.FANCY_PINK_PRESS_GARDEN_TREE_CONFIG) : Feature.NORMAL_TREE.configure(MubbleFeatureConfigs.PINK_PRESS_GARDEN_TREE_CONFIG);
	}

	@Override
	protected ConfiguredFeature<MegaTreeFeatureConfig, ?> createLargeTreeFeature(Random random)
	{
		return Feature.MEGA_JUNGLE_TREE.configure(MubbleFeatureConfigs.MEGA_PINK_PRESS_GARDEN_TREE_CONFIG);
	}
}