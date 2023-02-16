
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bloodyhell.fluid.LiquitSingularityFluid;
import net.mcreator.bloodyhell.fluid.BloodFluid;
import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BloodyMod.MODID);
	public static final RegistryObject<FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUIT_SINGULARITY = REGISTRY.register("liquit_singularity",
			() -> new LiquitSingularityFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUIT_SINGULARITY = REGISTRY.register("flowing_liquit_singularity",
			() -> new LiquitSingularityFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUIT_SINGULARITY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUIT_SINGULARITY.get(), RenderType.translucent());
		}
	}
}
