package net.rin.itomon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.NyafukaModel;
import net.rin.itomon.entity.NyafukaEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;



public class NyafukaRenderer extends MobRenderer<NyafukaEntity, NyafukaModel<NyafukaEntity>> {
	public NyafukaRenderer(EntityRendererProvider.Context context) {
		super(context, new NyafukaModel<>(context.bakeLayer(NyafukaModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NyafukaEntity entity) {
		return new ResourceLocation("itomon:textures/entities/nyahuka.png");
	}
}

