
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bloodyhell.block.CongealedBloodBlock;
import net.mcreator.bloodyhell.block.BloodSproutBlock;
import net.mcreator.bloodyhell.block.BloodBlock;
import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BloodyMod.MODID);
	public static final RegistryObject<Block> BLOOD = REGISTRY.register("blood", () -> new BloodBlock());
	public static final RegistryObject<Block> BLOOD_SPROUT = REGISTRY.register("blood_sprout", () -> new BloodSproutBlock());
	public static final RegistryObject<Block> CONGEALED_BLOOD = REGISTRY.register("congealed_blood", () -> new CongealedBloodBlock());
}
