
package net.mcreator.bloodyhell.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.bloodyhell.init.BloodyModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock() {
		super(() -> BloodyModFluids.BLOOD.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
