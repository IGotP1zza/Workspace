
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

import net.mcreator.bloodyhell.item.CongealedSwordItem;
import net.mcreator.bloodyhell.item.CongealedShovelItem;
import net.mcreator.bloodyhell.item.CongealedPickaxeItem;
import net.mcreator.bloodyhell.item.CongealedHoeItem;
import net.mcreator.bloodyhell.item.CongealedAxeItem;
import net.mcreator.bloodyhell.item.CongealedArmorItem;
import net.mcreator.bloodyhell.item.BloodItem;
import net.mcreator.bloodyhell.item.BloodBallItem;
import net.mcreator.bloodyhell.item.BloodAxeItem;
import net.mcreator.bloodyhell.BloodyMod;

public class BloodyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BloodyMod.MODID);
	public static final RegistryObject<Item> BLOOD_BUCKET = REGISTRY.register("blood_bucket", () -> new BloodItem());
	public static final RegistryObject<Item> BLOOD_SLIME = REGISTRY.register("blood_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BloodyModEntities.BLOOD_SLIME, -1, -1, new Item.Properties().tab(BloodyModTabs.TAB_PIZZAS_TAB)));
	public static final RegistryObject<Item> BLOOD_BALL = REGISTRY.register("blood_ball", () -> new BloodBallItem());
	public static final RegistryObject<Item> BLOOD_SPROUT = block(BloodyModBlocks.BLOOD_SPROUT, BloodyModTabs.TAB_PIZZAS_TAB);
	public static final RegistryObject<Item> CONGEALED_BLOOD = block(BloodyModBlocks.CONGEALED_BLOOD, BloodyModTabs.TAB_PIZZAS_TAB);
	public static final RegistryObject<Item> BLOOD_AXE = REGISTRY.register("blood_axe", () -> new BloodAxeItem());
	public static final RegistryObject<Item> CONGEALED_PICKAXE = REGISTRY.register("congealed_pickaxe", () -> new CongealedPickaxeItem());
	public static final RegistryObject<Item> CONGEALED_AXE = REGISTRY.register("congealed_axe", () -> new CongealedAxeItem());
	public static final RegistryObject<Item> CONGEALED_SWORD = REGISTRY.register("congealed_sword", () -> new CongealedSwordItem());
	public static final RegistryObject<Item> CONGEALED_SHOVEL = REGISTRY.register("congealed_shovel", () -> new CongealedShovelItem());
	public static final RegistryObject<Item> CONGEALED_HOE = REGISTRY.register("congealed_hoe", () -> new CongealedHoeItem());
	public static final RegistryObject<Item> CONGEALED_ARMOR_HELMET = REGISTRY.register("congealed_armor_helmet",
			() -> new CongealedArmorItem.Helmet());
	public static final RegistryObject<Item> CONGEALED_ARMOR_CHESTPLATE = REGISTRY.register("congealed_armor_chestplate",
			() -> new CongealedArmorItem.Chestplate());
	public static final RegistryObject<Item> CONGEALED_ARMOR_LEGGINGS = REGISTRY.register("congealed_armor_leggings",
			() -> new CongealedArmorItem.Leggings());
	public static final RegistryObject<Item> CONGEALED_ARMOR_BOOTS = REGISTRY.register("congealed_armor_boots", () -> new CongealedArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
