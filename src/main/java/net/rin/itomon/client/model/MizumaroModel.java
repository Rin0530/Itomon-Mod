package net.rin.itomon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class MizumaroModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("itomon", "mizumaro_model"), "main");
	public final ModelPart tail;
	public final ModelPart body;
	public final ModelPart leg_f_r;
	public final ModelPart leg_f_l;
	public final ModelPart leg_b_l;
	public final ModelPart leg_b_r;

	public MizumaroModel(ModelPart root) {
		super(root);
		this.tail = root.getChild("tail");
		this.body = root.getChild("body");
		this.leg_f_r = root.getChild("leg_f_r");
		this.leg_f_l = root.getChild("leg_f_l");
		this.leg_b_l = root.getChild("leg_b_l");
		this.leg_b_r = root.getChild("leg_b_r");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(6, 1).addBox(-1.0F, 0.5609F, 0.2618F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 17.0822F, 3.7715F, 0.1745F, 0.0F, 0.0F));
		tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 4)
						.addBox(1.5F, 1.7816F, 2.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-0.5F, 1.7816F, 2.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-2.5F, 1.7816F, 2.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-2.5F, 1.7816F, 1.647F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.6133F, -0.172F, 0.3927F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 11).mirror()
						.addBox(-3.0F, -9.0F, -4.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(16, 5).mirror()
						.addBox(-2.0F, -8.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).addBox(-2.0F, -12.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0)
						.addBox(1.0F, -12.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("leg_f_r",
				CubeListBuilder.create().texOffs(4, 0).addBox(-2.5F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("leg_f_l",
				CubeListBuilder.create().texOffs(4, 0).addBox(1.5F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("leg_b_l",
				CubeListBuilder.create().texOffs(4, 0).addBox(1.5F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("leg_b_r",
				CubeListBuilder.create().texOffs(4, 0).addBox(-2.5F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 26, 24);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg_f_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_b_r.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_f_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_b_l.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
