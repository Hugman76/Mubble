package hugman.mod.objects.world.feature.tree.cherry_oak;

import hugman.mod.init.MubbleBlocks;
import hugman.mod.objects.world.feature.tree.template.TreeFeature;
import net.minecraft.init.Blocks;

public class CherryOakTreeFeature extends TreeFeature
{
	public CherryOakTreeFeature(boolean notify)
	{
		super(notify, Blocks.OAK_LOG, MubbleBlocks.CHERRY_OAK_LEAVES, MubbleBlocks.CHERRY_OAK_SAPLING);
	}
}