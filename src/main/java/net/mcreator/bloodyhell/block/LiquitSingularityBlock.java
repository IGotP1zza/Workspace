
package net.mcreator.bloodyhell.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.bloodyhell.init.BloodyModFluids;

public class LiquitSingularityBlock extends LiquidBlock {
	public LiquitSingularityBlock() {
		super(() -> BloodyModFluids.LIQUIT_SINGULARITY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5).noCollission().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
