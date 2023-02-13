
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testmod.block.BloodSproutBlock;
import net.mcreator.testmod.block.BloodBlock;
import net.mcreator.testmod.TestModMod;

public class TestModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestModMod.MODID);
	public static final RegistryObject<Block> BLOOD = REGISTRY.register("blood", () -> new BloodBlock());
	public static final RegistryObject<Block> BLOOD_SPROUT = REGISTRY.register("blood_sprout", () -> new BloodSproutBlock());
}
