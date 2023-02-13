
package net.mcreator.testmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.testmod.init.TestModModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock() {
		super(() -> TestModModFluids.BLOOD.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
