package net.rin.itomon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.TorobiModel;
import net.rin.itomon.entity.TorobiEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TorobiRenderer extends MobRenderer<TorobiEntity, TorobiModel<TorobiEntity>> {
	public TorobiRenderer(EntityRendererProvider.Context context) {
		super(context, new TorobiModel<>(context.bakeLayer(TorobiModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TorobiEntity entity) {
		return new ResourceLocation("itomon:textures/entities/torobi.png");
	}
}
