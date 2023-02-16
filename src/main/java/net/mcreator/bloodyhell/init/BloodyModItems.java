
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bloodyhell.item.LiquitSingularityItem;
import net.mcreator.bloodyhell.item.CongealedSwordItem;
import net.mcreator.bloodyhell.item.CongealedShovelItem;
import net.mcreator.bloodyhell.item.CongealedPickaxeItem;
import net.mcreator.bloodyhell.item.CongealedHoeItem;
import net.mcreator.bloodyhell.item.CongealedAxeItem;
import net.mcreator.bloodyhell.item.BloodItem;
import net.mcreator.bloodyhell.item.BloodBallItem;
import net.mcreator.bloodyhell.item.BloodAxeItem;
import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BloodyMod.MODID);
	public static final RegistryObject<Item> BLOOD_BUCKET = REGISTRY.register("blood_bucket", () -> new BloodItem());
	public static final RegistryObject<Item> BLOOD_BALL = REGISTRY.register("blood_ball", () -> new BloodBallItem());
	public static final RegistryObject<Item> BLOOD_SPROUT = block(BloodyModBlocks.BLOOD_SPROUT, BloodyModTabs.TAB_PIZZAS_TAB);
	public static final RegistryObject<Item> CONGEALED_BLOOD = block(BloodyModBlocks.CONGEALED_BLOOD, BloodyModTabs.TAB_PIZZAS_TAB);
	public static final RegistryObject<Item> BLOOD_AXE = REGISTRY.register("blood_axe", () -> new BloodAxeItem());
	public static final RegistryObject<Item> CONGEALED_PICKAXE = REGISTRY.register("congealed_pickaxe", () -> new CongealedPickaxeItem());
	public static final RegistryObject<Item> CONGEALED_AXE = REGISTRY.register("congealed_axe", () -> new CongealedAxeItem());
	public static final RegistryObject<Item> CONGEALED_SWORD = REGISTRY.register("congealed_sword", () -> new CongealedSwordItem());
	public static final RegistryObject<Item> CONGEALED_SHOVEL = REGISTRY.register("congealed_shovel", () -> new CongealedShovelItem());
	public static final RegistryObject<Item> CONGEALED_HOE = REGISTRY.register("congealed_hoe", () -> new CongealedHoeItem());
	public static final RegistryObject<Item> BLOOD_SLIME = REGISTRY.register("blood_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BloodyModEntities.BLOOD_SLIME, -65536, -13434880, new Item.Properties().tab(BloodyModTabs.TAB_PIZZAS_TAB)));
	public static final RegistryObject<Item> DUMMY = REGISTRY.register("dummy_spawn_egg",
			() -> new ForgeSpawnEggItem(BloodyModEntities.DUMMY, -52, -256, new Item.Properties().tab(BloodyModTabs.TAB_PIZZAS_TAB)));
	public static final RegistryObject<Item> LIQUIT_SINGULARITY_BUCKET = REGISTRY.register("liquit_singularity_bucket",
			() -> new LiquitSingularityItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
