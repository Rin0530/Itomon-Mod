package net.rin.itomon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.MizumaroModel;
import net.rin.itomon.entity.MizumaroEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MizumaroRenderer extends MobRenderer<MizumaroEntity, MizumaroModel<MizumaroEntity>> {
	public MizumaroRenderer(EntityRendererProvider.Context context) {
		super(context, new MizumaroModel<>(context.bakeLayer(MizumaroModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MizumaroEntity entity) {
		return new ResourceLocation("itomon:textures/entities/mizumaro.png");
	}
}
