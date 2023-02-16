package net.mcreator.bloodyhell.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.client.Minecraft;

import net.mcreator.bloodyhell.BloodyMod;

public class BloodAxeRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(2, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		BloodyMod.queueServerWork(1, () -> {
			itemstack.getOrCreateTag().putBoolean("blood_rage", (true));
			BloodyMod.queueServerWork(60, () -> {
				itemstack.getOrCreateTag().putBoolean("blood_rage", (false));
			});
		});
	}
}
