
package net.mcreator.bloodyhell.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.bloodyhell.init.BloodyModTabs;
import net.mcreator.bloodyhell.init.BloodyModFluids;

public class LiquitSingularityItem extends BucketItem {
	public LiquitSingularityItem() {
		super(BloodyModFluids.LIQUIT_SINGULARITY,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BloodyModTabs.TAB_PIZZAS_TAB));
	}
}
