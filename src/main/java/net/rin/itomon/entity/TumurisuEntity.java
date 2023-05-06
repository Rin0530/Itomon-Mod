package net.rin.itomon.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.rin.itomon.init.ItomonModEntities;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent.Operation;
import net.minecraftforge.fluids.FluidType;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

public class TumurisuEntity extends PathfinderMob {
	public TumurisuEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ItomonModEntities.TUMURISU.get(), world);
	}

	public TumurisuEntity(EntityType<TumurisuEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (TumurisuEntity.this.isInWater())
					TumurisuEntity.this.setDeltaMovement(TumurisuEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !TumurisuEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - TumurisuEntity.this.getX();
					double dy = this.wantedY - TumurisuEntity.this.getY();
					double dz = this.wantedZ - TumurisuEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier
							* TumurisuEntity.this.getAttributeValue(Attributes.MOVEMENT_SPEED));
					TumurisuEntity.this.setYRot(this.rotlerp(TumurisuEntity.this.getYRot(), f, 10));
					TumurisuEntity.this.yBodyRot = TumurisuEntity.this.getYRot();
					TumurisuEntity.this.yHeadRot = TumurisuEntity.this.getYRot();
					if (TumurisuEntity.this.isInWater()) {
						TumurisuEntity.this
								.setSpeed((float) TumurisuEntity.this.getAttributeValue(Attributes.MOVEMENT_SPEED));
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						TumurisuEntity.this.setXRot(this.rotlerp(TumurisuEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(TumurisuEntity.this.getXRot() * (float) (Math.PI / 180.0));
						TumurisuEntity.this.setZza(f3 * f1);
						TumurisuEntity.this.setYya((float) (f1 * dy));
					} else {
						TumurisuEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					TumurisuEntity.this.setSpeed(0);
					TumurisuEntity.this.setYya(0);
					TumurisuEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(3, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.ARTHROPOD;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		if (type == ForgeMod.WATER_TYPE.get())
			return true;
		return type.canDrownIn(self());
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event) {
		event.register(ItomonModEntities.TUMURISU.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (Mob.checkMobSpawnRules(entityType, world, reason, pos, random)),
				Operation.AND);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}
