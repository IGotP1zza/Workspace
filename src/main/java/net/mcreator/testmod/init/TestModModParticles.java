
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.testmod.client.particle.BlooddripParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(TestModModParticleTypes.BLOODDRIP.get(), BlooddripParticle::provider);
	}
}
