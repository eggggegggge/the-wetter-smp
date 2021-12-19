
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewetsmp.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewetsmp.entity.RubyGrapplingHookEntity;
import net.mcreator.thewetsmp.entity.OnyxGrapplingHookEntity;
import net.mcreator.thewetsmp.entity.ExplosiveCrabCannonEntity;
import net.mcreator.thewetsmp.entity.CrabCannonEntity;
import net.mcreator.thewetsmp.entity.BufferBlockRemovalEntity;
import net.mcreator.thewetsmp.entity.BufferBlasterEntity;
import net.mcreator.thewetsmp.entity.AquamarineGrapplingHookEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWetSmpRehydratedModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<BufferBlockRemovalEntity> BUFFER_BLOCK_REMOVAL = register("buffer_block_removal",
			EntityType.Builder.<BufferBlockRemovalEntity>of(BufferBlockRemovalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(BufferBlockRemovalEntity::new).fireImmune().sized(0f, 0f));
	public static final EntityType<RubyGrapplingHookEntity> RUBY_GRAPPLING_HOOK = register("entitybulletruby_grappling_hook",
			EntityType.Builder.<RubyGrapplingHookEntity>of(RubyGrapplingHookEntity::new, MobCategory.MISC)
					.setCustomClientFactory(RubyGrapplingHookEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AquamarineGrapplingHookEntity> AQUAMARINE_GRAPPLING_HOOK = register("entitybulletaquamarine_grappling_hook",
			EntityType.Builder.<AquamarineGrapplingHookEntity>of(AquamarineGrapplingHookEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AquamarineGrapplingHookEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<OnyxGrapplingHookEntity> ONYX_GRAPPLING_HOOK = register("entitybulletonyx_grappling_hook",
			EntityType.Builder.<OnyxGrapplingHookEntity>of(OnyxGrapplingHookEntity::new, MobCategory.MISC)
					.setCustomClientFactory(OnyxGrapplingHookEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<CrabCannonEntity> CRAB_CANNON = register("entitybulletcrab_cannon",
			EntityType.Builder.<CrabCannonEntity>of(CrabCannonEntity::new, MobCategory.MISC).setCustomClientFactory(CrabCannonEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ExplosiveCrabCannonEntity> EXPLOSIVE_CRAB_CANNON = register("entitybulletexplosive_crab_cannon",
			EntityType.Builder.<ExplosiveCrabCannonEntity>of(ExplosiveCrabCannonEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ExplosiveCrabCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BufferBlasterEntity> BUFFER_BLASTER = register("entitybulletbuffer_blaster",
			EntityType.Builder.<BufferBlasterEntity>of(BufferBlasterEntity::new, MobCategory.MISC).setCustomClientFactory(BufferBlasterEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BufferBlockRemovalEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BUFFER_BLOCK_REMOVAL, BufferBlockRemovalEntity.createAttributes().build());
	}
}
