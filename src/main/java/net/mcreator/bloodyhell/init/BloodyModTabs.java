
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodyhell.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BloodyModTabs {
	public static CreativeModeTab TAB_PIZZAS_TAB;

	public static void load() {
		TAB_PIZZAS_TAB = new CreativeModeTab("tabpizzas_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.LIGHT);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
