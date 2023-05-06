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
public class TorobiModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("itomon", "torobi_model"), "main");
	public final ModelPart leg_l;
	public final ModelPart leg_r;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart arm_l;
	public final ModelPart arm_r;
	public final ModelPart tail;

	public TorobiModel(ModelPart root) {
		super(root, 0.5F, 10.0F);
		this.leg_l = root.getChild("leg_l");
		this.leg_r = root.getChild("leg_r");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.arm_l = root.getChild("arm_l");
		this.arm_r = root.getChild("arm_r");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg_l = partdefinition.addOrReplaceChild("leg_l", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -4.0F));

		leg_l.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -1.0F, 11.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(38, 21).addBox(-1.0F, -4.0F, 12.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(38, 21).addBox(-1.0F, -4.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-3.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 5.0F, 0.0F, -1.5708F, 0.0F));

		partdefinition.addOrReplaceChild("leg_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 23).addBox(-4.0F, -15.0F, 0.0F, 8.0F,
				13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(3.0F, -22.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 29).addBox(2.0F, -22.0F, 8.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 29).addBox(3.0F, -19.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 29).addBox(3.0F, -19.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 29).addBox(3.0F, -22.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 29).addBox(2.0F, -22.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(4, 1).addBox(-7.0F, -22.0F, 0.0F, 9.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition arm_l = partdefinition.addOrReplaceChild("arm_l", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		arm_l.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 27).addBox(-13.8F, -14.0F, -4.0F, 2.0F,
				5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		arm_l.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(40, 27).addBox(-1.8F, -14.0F, 2.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 1.0F, 3.1416F, 0.0F, 3.1416F));

		partdefinition.addOrReplaceChild("arm_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 21).addBox(4.0F, -9.0F, 5.0F, 8.0F, 5.0F,
				2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.arm_r.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.arm_l.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
