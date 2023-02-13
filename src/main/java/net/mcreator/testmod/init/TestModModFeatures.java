
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.testmod.world.features.plants.BloodSproutFeature;
import net.mcreator.testmod.world.features.lakes.BloodFeature;
import net.mcreator.testmod.TestModMod;

@Mod.EventBusSubscriber
public class TestModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TestModMod.MODID);
	public static final RegistryObject<Feature<?>> BLOOD = REGISTRY.register("blood", BloodFeature::feature);
	public static final RegistryObject<Feature<?>> BLOOD_SPROUT = REGISTRY.register("blood_sprout", BloodSproutFeature::feature);
}
