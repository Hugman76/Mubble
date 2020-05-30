package hugman.mubble.objects.block;

import hugman.mubble.init.data.MubbleTags;
import hugman.mubble.objects.entity.FlyingBlockEntity;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.Random;

public class FlyingBlock extends Block
{
	public static boolean flyInstantly;

	public FlyingBlock(Block.Settings builder)
	{
		super(builder);
	}

	@Override
	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean p_220082_5_)
	{
		worldIn.getBlockTickScheduler().schedule(pos, this, this.getTickRate(worldIn));
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
	{
		worldIn.getBlockTickScheduler().schedule(currentPos, this, this.getTickRate(worldIn));
		return stateIn;
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random)
	{
		if (!worldIn.isClient) this.checkFlyable(worldIn, pos);
	}

	public void checkFlyable(World worldIn, BlockPos pos)
	{
		if (worldIn.isAir(pos.up()) || canFlyThrough(worldIn.getBlockState(pos.up())) && pos.getY() >= 0)
		{
			if (!worldIn.isClient)
			{
				FlyingBlockEntity flyingblockentity = new FlyingBlockEntity(worldIn, (double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, worldIn.getBlockState(pos));
				this.onStartFlying(flyingblockentity);
				worldIn.spawnEntity(flyingblockentity);
			}
		}
	}

	protected void onStartFlying(FlyingBlockEntity flyingEntity)
	{
	}

	@Override
	public int getTickRate(WorldView worldIn)
	{
		return 2;
	}

	public static boolean canFlyThrough(BlockState state)
	{
		Block block = state.getBlock();
		Material material = state.getMaterial();
		return block instanceof AirBlock || block == Blocks.FIRE || block.matches(MubbleTags.Blocks.CLOUD_BLOCKS) || material.isLiquid() || material.isReplaceable();
	}

	public void onEndFlying(World worldIn, BlockPos pos, BlockState flyingState, BlockState hitState)
	{
	}

	public void onBroken(World worldIn, BlockPos pos)
	{
	}
}
