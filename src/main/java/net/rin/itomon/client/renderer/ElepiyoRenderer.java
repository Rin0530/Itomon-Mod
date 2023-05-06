package net.rin.itomon.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rin.itomon.client.model.ElepiyoModel;
import net.rin.itomon.entity.ElepiyoEntity;

public class ElepiyoRenderer extends MobRenderer<ElepiyoEntity, ElepiyoModel<ElepiyoEntity>> {
    public ElepiyoRenderer(EntityRendererProvider.Context context) {
        super(context, new ElepiyoModel<>(context.bakeLayer(ElepiyoModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ElepiyoEntity entity) {
        return new ResourceLocation("itomon:textures/entities/elepiyo.png");
    }
}
