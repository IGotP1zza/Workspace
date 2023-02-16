
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.bloodyhell.fluid.types.LiquitSingularityFluidType;
import net.mcreator.bloodyhell.fluid.types.BloodFluidType;
import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BloodyMod.MODID);
	public static final RegistryObject<FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
	public static final RegistryObject<FluidType> LIQUIT_SINGULARITY_TYPE = REGISTRY.register("liquit_singularity",
			() -> new LiquitSingularityFluidType());
}
