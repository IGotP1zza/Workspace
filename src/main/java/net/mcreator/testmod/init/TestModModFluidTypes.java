
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.testmod.fluid.types.BloodFluidType;
import net.mcreator.testmod.TestModMod;

public class TestModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TestModMod.MODID);
	public static final RegistryObject<FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
}
