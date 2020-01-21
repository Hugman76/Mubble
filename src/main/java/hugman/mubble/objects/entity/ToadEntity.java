package hugman.mubble.objects.entity;

import java.util.Random;

import hugman.mubble.init.MubbleEntities;
import hugman.mubble.init.MubbleSounds;
import hugman.mubble.init.data.MubbleLootTables;
import hugman.mubble.init.data.MubbleTags;
import hugman.mubble.util.CalendarEvents;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnType;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FleeEntityGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LongDoorInteractGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

public class ToadEntity extends AnimalEntity
{
	private static final TrackedData<Integer> VARIANT = DataTracker.registerData(ToadEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final Ingredient TEMPTATION_ITEMS = Ingredient.fromTag(MubbleTags.Items.TEMPTING_TO_TOAD);
	
    public ToadEntity(EntityType<? extends ToadEntity> type, World worldIn) 
    {
        super(type, worldIn);
    }
    
    @Override
    public net.minecraft.entity.EntityData initialize(IWorld worldIn, LocalDifficulty difficultyIn, SpawnType reason, net.minecraft.entity.EntityData spawnDataIn, CompoundTag dataTag)
    {
        this.setVariant(this.world.random.nextInt(16));
        return super.initialize(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }
    
    @Override
    protected void initGoals()
    {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, ChinchoEntity.class, 10f, 1.2d, 1.45d, EntityPredicates.VALID_ENTITY_LIVING::test));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, LivingEntity.class, checkedEntity -> MubbleTags.Items.SCARY_TO_TOAD.contains(((LivingEntity) checkedEntity).getMainHandStack().getItem()), 10f, 1.2f, 1.45f, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR::test));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, LivingEntity.class, checkedEntity -> MubbleTags.Items.SCARY_TO_TOAD.contains(((LivingEntity) checkedEntity).getOffHandStack().getItem()), 10f, 1.2f, 1.45f, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR::test));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, LivingEntity.class, checkedEntity -> MubbleTags.Items.SCARY_TO_TOAD.contains(((LivingEntity) checkedEntity).getEquippedStack(EquipmentSlot.HEAD).getItem()), 10f, 1.2f, 1.45f, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR::test));
        this.goalSelector.add(1, new LongDoorInteractGoal(this, true));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.6D));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
        this.goalSelector.add(3, new TemptGoal(this, 1.4D, false, TEMPTATION_ITEMS));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.add(4, new EscapeDangerGoal(this, 1.0D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, BeeEntity.class, 10.0F, 0.08F));
        this.goalSelector.add(5, new LookAtEntityGoal(this, ChickenEntity.class, 10.0F));
        this.goalSelector.add(6, new LookAtEntityGoal(this, this.getClass(), 8.0F));
        this.goalSelector.add(7, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }
    
    @Override
    protected void initAttributes() 
    {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(9.0D);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }
    
    @Override
    public float getEyeHeight(EntityPose pose)
    {
    	if(this.isBaby()) return 0.75f;
        return 1.35f;
    }
    
    @Override
    protected SoundEvent getAmbientSound() 
    {
    	if(CalendarEvents.isAprilFools) return MubbleSounds.ENTITY_TOAD_BUP;
    	else return MubbleSounds.ENTITY_TOAD_AMBIENT;
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource source) 
    {
        return MubbleSounds.ENTITY_TOAD_HURT;
    }
    
    @Override
    protected SoundEvent getDeathSound() 
    {
        return MubbleSounds.ENTITY_TOAD_DEATH;
    }
    
    public int getVariant()
    {
    	return this.dataTracker.get(VARIANT);
	}

	public void setVariant(int variantIn)
	{
		this.dataTracker.set(VARIANT, variantIn);
	}
	
	@Override
	protected void initDataTracker()
	{
		super.initDataTracker();
		this.dataTracker.startTracking(VARIANT, 0);
	}
    
    @Override
    public void writeCustomDataToTag(CompoundTag compound)
    {
        super.writeCustomDataToTag(compound);
        compound.putInt("Variant", this.getVariant());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag compound)
    {
        super.readCustomDataFromTag(compound);
        this.setVariant(compound.getInt("Variant"));
    }
    
    @Override
    protected Identifier getLootTableId()
    {
		switch(this.getVariant())
		{
        case 0:
            return MubbleLootTables.WHITE_TOAD;
        case 1:
            return MubbleLootTables.LIGHT_GRAY_TOAD;
        case 2:
            return MubbleLootTables.GRAY_TOAD;
        case 3:
            return MubbleLootTables.BLACK_TOAD;
        case 4:
            return MubbleLootTables.BROWN_TOAD;
        case 5:
            return MubbleLootTables.RED_TOAD;
        case 6:
            return MubbleLootTables.ORANGE_TOAD;
        case 7:
            return MubbleLootTables.YELLOW_TOAD;
        case 8:
            return MubbleLootTables.LIME_TOAD;
        case 9:
            return MubbleLootTables.GREEN_TOAD;
        case 10:
            return MubbleLootTables.CYAN_TOAD;
        case 11:
            return MubbleLootTables.LIGHT_BLUE_TOAD;
        case 12:
            return MubbleLootTables.BLUE_TOAD;
        case 13:
            return MubbleLootTables.PURPLE_TOAD;
        case 14:
            return MubbleLootTables.MAGENTA_TOAD;
        case 15:
            return MubbleLootTables.PINK_TOAD;
        case 100:
            return MubbleLootTables.CAPTAIN_TOAD;
        case 101:
            return MubbleLootTables.HINT_TOAD;
        case 102:
            return MubbleLootTables.BANKTOAD;
        case 103:
            return MubbleLootTables.YELLOW_BTOAD;
        case 104:
            return MubbleLootTables.MAILTOAD;
        case 105:
            return MubbleLootTables.RED_TOAD;
		default:
			return MubbleLootTables.RED_TOAD;
		}
    }
    
    @Override
    public PassiveEntity createChild(PassiveEntity ageable)
    {
    	ToadEntity childToad = new ToadEntity(MubbleEntities.TOAD, this.world);
    	childToad.setVariant(this.world.random.nextInt(16));
    	return childToad;
    }
    
    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return TEMPTATION_ITEMS.test(stack);
    }
    
	public static boolean canSpawn(EntityType<ToadEntity> entity, IWorld world, SpawnType reason, BlockPos pos, Random rand)
	{
		return true;
	}
}