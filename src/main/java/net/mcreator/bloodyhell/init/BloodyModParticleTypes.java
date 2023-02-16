
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BloodyMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLOODDRIP = REGISTRY.register("blooddrip", () -> new SimpleParticleType(false));
}
