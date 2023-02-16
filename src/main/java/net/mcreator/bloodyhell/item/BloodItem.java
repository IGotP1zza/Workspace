
package net.mcreator.bloodyhell.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.mcreator.bloodyhell.init.BloodyModTabs;
import net.mcreator.bloodyhell.init.BloodyModFluids;

import java.util.List;

public class BloodItem extends BucketItem {
	public BloodItem() {
		super(BloodyModFluids.BLOOD,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BloodyModTabs.TAB_PIZZAS_TAB));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("It's Blood!"));
	}
}
