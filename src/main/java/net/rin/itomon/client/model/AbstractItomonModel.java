package net.rin.itomon.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

public abstract class AbstractItomonModel<T extends Entity> extends EntityModel<T>{
    public final ModelPart root;

    public AbstractItomonModel(ModelPart root){
        this(root, 1.0F, 0.0F);
    }

    public AbstractItomonModel(ModelPart root, float scale,float y){
        this.root = root;
        this.root.xScale = scale;
		this.root.yScale = scale;
		this.root.zScale = scale;
        this.root.y += y;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay);
    }
}
