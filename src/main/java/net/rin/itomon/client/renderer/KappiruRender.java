package net.rin.itomon.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.KappiruModel;
import net.rin.itomon.entity.KappiruEntity;

public class KappiruRender extends MobRenderer<KappiruEntity, KappiruModel<KappiruEntity>> {
    public KappiruRender(EntityRendererProvider.Context context) {
        super(context, new KappiruModel<>(context.bakeLayer(KappiruModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(KappiruEntity entity) {
        return new ResourceLocation("itomon:textures/entities/kappiru.png");
    }
}
