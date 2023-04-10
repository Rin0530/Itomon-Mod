package net.rin.itomon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.PokonohaModel;
import net.rin.itomon.entity.PokonohaEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PokonohaRenderer extends MobRenderer<PokonohaEntity, PokonohaModel<PokonohaEntity>> {
	public PokonohaRenderer(EntityRendererProvider.Context context) {
		super(context, new PokonohaModel<>(context.bakeLayer(PokonohaModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PokonohaEntity entity) {
		return new ResourceLocation("itomon:textures/entities/pokonoha.png");
	}
}
