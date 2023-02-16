
package net.mcreator.bloodyhell.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.bloodyhell.entity.BloodSlimeEntity;

public class BloodSlimeRenderer extends MobRenderer<BloodSlimeEntity, SlimeModel<BloodSlimeEntity>> {
	public BloodSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodSlimeEntity entity) {
		return new ResourceLocation("bloody:textures/entities/blood_slime.png");
	}
}
