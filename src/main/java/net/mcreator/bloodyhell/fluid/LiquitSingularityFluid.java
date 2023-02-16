
package net.mcreator.bloodyhell.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.bloodyhell.init.BloodyModItems;
import net.mcreator.bloodyhell.init.BloodyModFluids;
import net.mcreator.bloodyhell.init.BloodyModFluidTypes;
import net.mcreator.bloodyhell.init.BloodyModBlocks;

public abstract class LiquitSingularityFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> BloodyModFluidTypes.LIQUIT_SINGULARITY_TYPE.get(), () -> BloodyModFluids.LIQUIT_SINGULARITY.get(),
			() -> BloodyModFluids.FLOWING_LIQUIT_SINGULARITY.get()).explosionResistance(100f).slopeFindDistance(6)
			.bucket(() -> BloodyModItems.LIQUIT_SINGULARITY_BUCKET.get()).block(() -> (LiquidBlock) BloodyModBlocks.LIQUIT_SINGULARITY.get());

	private LiquitSingularityFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquitSingularityFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquitSingularityFluid {
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
