
package net.mcreator.bloodyhell.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.bloodyhell.procedures.BloodAxeRightclickedProcedure;
import net.mcreator.bloodyhell.procedures.BloodAxeLivingEntityIsHitWithToolProcedure;
import net.mcreator.bloodyhell.init.BloodyModTabs;
import net.mcreator.bloodyhell.init.BloodyModItems;

public class BloodAxeItem extends AxeItem {
	public BloodAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 131;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 6.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BloodyModItems.BLOOD_BALL.get()));
			}
		}, 1, -3.2f, new Item.Properties().tab(BloodyModTabs.TAB_PIZZAS_TAB));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BloodAxeLivingEntityIsHitWithToolProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BloodAxeRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
