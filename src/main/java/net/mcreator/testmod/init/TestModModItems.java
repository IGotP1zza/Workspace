
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testmod.item.BloodItem;
import net.mcreator.testmod.item.BloodBallItem;
import net.mcreator.testmod.TestModMod;

public class TestModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestModMod.MODID);
	public static final RegistryObject<Item> BLOOD_BUCKET = REGISTRY.register("blood_bucket", () -> new BloodItem());
	public static final RegistryObject<Item> BLOOD_SLIME = REGISTRY.register("blood_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(TestModModEntities.BLOOD_SLIME, -1, -1, new Item.Properties().tab(TestModModTabs.TAB_PIZZAS_TAB)));
	public static final RegistryObject<Item> BLOOD_BALL = REGISTRY.register("blood_ball", () -> new BloodBallItem());
	public static final RegistryObject<Item> BLOOD_SPROUT = block(TestModModBlocks.BLOOD_SPROUT, TestModModTabs.TAB_PIZZAS_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
