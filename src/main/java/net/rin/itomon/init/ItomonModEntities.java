package net.rin.itomon.init;

import net.minecraftforge.registries.RegistryObject;
import net.rin.itomon.ItomonMod;
import net.rin.itomon.entity.KonsainuEntity;
import net.rin.itomon.entity.MizumaroEntity;
import net.rin.itomon.entity.PokonohaEntity;
import net.rin.itomon.entity.TorobiEntity;
import net.rin.itomon.entity.TumurisuEntity;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItomonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ItomonMod.MODID);
	public static final RegistryObject<EntityType<TumurisuEntity>> TUMURISU = register("tumurisu",
			EntityType.Builder.<TumurisuEntity>of(TumurisuEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TumurisuEntity::new)
					.sized(0.6f, 0.6f));

	public static final RegistryObject<EntityType<MizumaroEntity>> MIZUMARO = register("mizumaro",
			EntityType.Builder.<MizumaroEntity>of(MizumaroEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MizumaroEntity::new)
					.sized(0.6f, 0.6f));
	
	public static final RegistryObject<EntityType<PokonohaEntity>> POKONOHA = register("pokonoha",
			EntityType.Builder.<PokonohaEntity>of(PokonohaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PokonohaEntity::new)
					.sized(0.6f, 0.6f));
	
	public static final RegistryObject<EntityType<TorobiEntity>> TOROBI = register("torobi",
			EntityType.Builder.<TorobiEntity>of(TorobiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TorobiEntity::new).fireImmune()
					.sized(0.6f, 0.8f));
	
	public static final RegistryObject<EntityType<KonsainuEntity>> KONSAINU = register("konsainu",
			EntityType.Builder.<KonsainuEntity>of(KonsainuEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KonsainuEntity::new)
					.sized(0.6f, 0.8f));
	
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TUMURISU.get(), TumurisuEntity.createAttributes().build());
		event.put(MIZUMARO.get(), MizumaroEntity.createAttributes().build());
		event.put(POKONOHA.get(), PokonohaEntity.createAttributes().build());
		event.put(TOROBI.get(), TorobiEntity.createAttributes().build());
		event.put(KONSAINU.get(), KonsainuEntity.createAttributes().build());
	}

	@SubscribeEvent
	public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event) {
		TumurisuEntity.registerSpawnPlacement(event);
		MizumaroEntity.registerSpawnPlacement(event);
		PokonohaEntity.registerSpawnPlacement(event);
		TorobiEntity.registerSpawnPlacement(event);
		KonsainuEntity.registerSpawnPlacement(event);
	}
}
