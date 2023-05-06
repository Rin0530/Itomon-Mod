package net.rin.itomon.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.KonsainuModel;
import net.rin.itomon.entity.KonsainuEntity;

public class KonsainuRenderer extends MobRenderer<KonsainuEntity, KonsainuModel<KonsainuEntity>> {
	public KonsainuRenderer(EntityRendererProvider.Context context) {
		super(context, new KonsainuModel<>(context.bakeLayer(KonsainuModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KonsainuEntity entity) {
		return new ResourceLocation("itomon:textures/entities/konsainu.png");
	}
}
