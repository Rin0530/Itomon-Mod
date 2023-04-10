package net.rin.itomon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.TumurisuModel;
import net.rin.itomon.entity.TumurisuEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TumurisuRenderer extends MobRenderer<TumurisuEntity, TumurisuModel<TumurisuEntity>> {
	public TumurisuRenderer(EntityRendererProvider.Context context) {
		super(context, new TumurisuModel<>(context.bakeLayer(TumurisuModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TumurisuEntity entity) {
		return new ResourceLocation("itomon:textures/entities/tumurisu.png");
	}
}
