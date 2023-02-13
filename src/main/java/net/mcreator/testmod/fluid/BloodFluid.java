
package net.mcreator.testmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.testmod.init.TestModModParticleTypes;
import net.mcreator.testmod.init.TestModModItems;
import net.mcreator.testmod.init.TestModModFluids;
import net.mcreator.testmod.init.TestModModFluidTypes;
import net.mcreator.testmod.init.TestModModBlocks;

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TestModModFluidTypes.BLOOD_TYPE.get(),
			() -> TestModModFluids.BLOOD.get(), () -> TestModModFluids.FLOWING_BLOOD.get()).explosionResistance(100f).tickRate(7)
			.levelDecreasePerBlock(3).bucket(() -> TestModModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) TestModModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (TestModModParticleTypes.BLOODDRIP.get());
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
