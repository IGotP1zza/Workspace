
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bloodyhell.entity.DummyEntity;
import net.mcreator.bloodyhell.entity.BloodSlimeEntity;
import net.mcreator.bloodyhell.BloodyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BloodyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BloodyMod.MODID);
	public static final RegistryObject<EntityType<BloodSlimeEntity>> BLOOD_SLIME = register("blood_slime",
			EntityType.Builder.<BloodSlimeEntity>of(BloodSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodSlimeEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DummyEntity>> DUMMY = register("dummy",
			EntityType.Builder.<DummyEntity>of(DummyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1)
					.setUpdateInterval(3).setCustomClientFactory(DummyEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BloodSlimeEntity.init();
			DummyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLOOD_SLIME.get(), BloodSlimeEntity.createAttributes().build());
		event.put(DUMMY.get(), DummyEntity.createAttributes().build());
	}
}
