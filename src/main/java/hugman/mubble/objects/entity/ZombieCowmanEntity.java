package hugman.mubble.objects.entity;

import hugman.mubble.init.MubbleSounds;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.mob.ZombiePigmanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

import java.util.Random;
import java.util.UUID;

public class ZombieCowmanEntity extends ZombiePigmanEntity
{
	private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
	private static final EntityAttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new EntityAttributeModifier(ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, EntityAttributeModifier.Operation.ADDITION)).setSerialize(false);
	private int angerLevel;
	private int randomSoundDelay;
	private UUID angerTargetUUID;

	public ZombieCowmanEntity(EntityType<? extends ZombieCowmanEntity> type, World worldIn)
	{
		super(type, worldIn);
		this.setPathfindingPenalty(PathNodeType.WATER, 8.0F);
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return MubbleSounds.ENTITY_ZOMBIE_COWMAN_AMBIENT;
	}

	@Override
	protected SoundEvent getStepSound()
	{
		return MubbleSounds.ENTITY_ZOMBIE_COWMAN_STEP;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return MubbleSounds.ENTITY_ZOMBIE_COWMAN_HURT;
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return MubbleSounds.ENTITY_ZOMBIE_COWMAN_DEATH;
	}

	@Override
	protected void initGoals()
	{
		this.goalSelector.add(2, new ZombieAttackGoal(this, 1.0D, false));
		this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D));
		this.targetSelector.add(1, new ZombieCowmanEntity.HurtByAggressorGoal(this));
		this.targetSelector.add(2, new ZombieCowmanEntity.TargetAggressorGoal(this));
	}

	@Override
	protected void initAttributes()
	{
		super.initAttributes();
		this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue((double) 0.34F);
		this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
	}

	public static boolean canSpawn(EntityType<ZombiePigmanEntity> entity, IWorld world, SpawnType reason, BlockPos pos, Random rand)
	{
		return world.getDifficulty() != Difficulty.PEACEFUL;
	}

	@Override
	protected void initEquipment(LocalDifficulty difficulty)
	{
		this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
	}

	@Override
	protected void mobTick()
	{
		EntityAttributeInstance iattributeinstance = this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED);
		if (this.isAngry())
		{
			if (!this.isBaby() && !iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER))
			{
				iattributeinstance.addModifier(ATTACK_SPEED_BOOST_MODIFIER);
			}
			--this.angerLevel;
		}
		else if (iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER))
		{
			iattributeinstance.removeModifier(ATTACK_SPEED_BOOST_MODIFIER);
		}
		if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0)
		{
			this.playSound(MubbleSounds.ENTITY_ZOMBIE_COWMAN_ANGRY, this.getSoundVolume() * 2.0F, ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}
		if (this.angerLevel > 0 && this.angerTargetUUID != null && this.getAttacker() == null)
		{
			PlayerEntity entityplayer = this.world.getPlayerByUuid(this.angerTargetUUID);
			this.setAttacker(entityplayer);
			this.attackingPlayer = entityplayer;
			this.playerHitTimer = this.getLastAttackedTime();
		}
		super.mobTick();
	}

	private boolean becomeAngryAt(Entity p_70835_1_)
	{
		this.angerLevel = 400 + this.random.nextInt(400);
		this.randomSoundDelay = this.random.nextInt(40);
		if (p_70835_1_ instanceof LivingEntity)
		{
			this.setAttacker((LivingEntity) p_70835_1_);
		}
		return true;
	}

	private boolean isAngry()
	{
		return this.angerLevel > 0;
	}

	static class HurtByAggressorGoal extends RevengeGoal
	{
		public HurtByAggressorGoal(ZombieCowmanEntity p_i45828_1_)
		{
			super(p_i45828_1_);
			this.setGroupRevenge(new Class[]{ZombieEntity.class});
		}

		protected void setMobEntityTarget(MobEntity mobIn, LivingEntity targetIn)
		{
			if (mobIn instanceof ZombieCowmanEntity && this.mob.canSee(targetIn) && ((ZombieCowmanEntity) mobIn).becomeAngryAt(targetIn))
			{
				mobIn.setTarget(targetIn);
			}
		}
	}

	static class TargetAggressorGoal extends FollowTargetGoal<PlayerEntity>
	{
		public TargetAggressorGoal(ZombieCowmanEntity p_i45829_1_)
		{
			super(p_i45829_1_, PlayerEntity.class, true);
		}

		public boolean canStart()
		{
			return ((ZombieCowmanEntity) this.mob).isAngry() && super.canStart();
		}
	}

	@Override
	protected boolean burnsInDaylight()
	{
		return false;
	}
}