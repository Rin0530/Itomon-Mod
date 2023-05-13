package net.rin.itomon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
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

public class KappiruModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kappiru"), "main");
	private final ModelPart body;
	private final ModelPart cold_air;
	private final ModelPart head;
	private final ModelPart LeftHand;
	private final ModelPart RightHand;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public KappiruModel(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.cold_air = root.getChild("cold_air");
		this.head = root.getChild("head");
		this.LeftHand = root.getChild("LeftHand");
		this.RightHand = root.getChild("RightHand");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(206, 0).addBox(-7.0F, -9.0F, -5.0F, 13.0F, 19.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, -29.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cold_air = partdefinition.addOrReplaceChild("cold_air",
				CubeListBuilder.create().texOffs(55, 12)
						.addBox(-17.0F, -6.0F, -3.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(55, 12).addBox(-20.0F, -4.0F, -6.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
						.texOffs(152, 50).addBox(-26.0F, -3.0F, -12.0F, 26.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
						.texOffs(88, 10).addBox(-18.0F, -8.0F, -4.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(111, 30).addBox(-19.0F, -12.0F, -5.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = cold_air.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -6.0F, -6.0F, 2.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -19.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r3 = cold_air.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -6.0F, -6.0F, 2.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -30.0F, 10.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r4 = cold_air.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -9.0F, -6.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -30.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = cold_air.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -9.0F, -6.0F, 2.0F, 8.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -18.0F, 8.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r6 = cold_air.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -9.0F, -6.0F, 2.0F, 8.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -30.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r7 = cold_air.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -9.0F, -6.0F, 2.0F, 27.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -30.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r8 = cold_air.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(2.0F, -9.0F, -5.0F, 16.0F, 25.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 107).addBox(4.0F, -8.0F, -7.0F, 11.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 72).addBox(3.0F, -9.0F, -6.0F, 13.0F, 23.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 107).addBox(4.0F, -8.0F, 14.0F, 11.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 72).addBox(3.0F, -9.0F, 13.0F, 13.0F, 23.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(2.0F, -9.0F, 11.0F, 16.0F, 25.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.0F, -24.0F, -3.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r9 = cold_air.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(13, 26).addBox(10.0F, 7.0F, 4.0F, 5.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.0F, -27.0F, -15.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r10 = cold_air.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(26, 26).addBox(12.0F, 9.0F, 4.0F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-37.0F, -27.0F, -15.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r11 = cold_air.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(10.0F, 7.0F, 4.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 26).addBox(10.0F, 7.0F, 27.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0F, -35.0F, -15.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r12 = cold_air.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(26, 26).addBox(12.0F, 9.0F, -5.0F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-37.0F, -30.0F, 17.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r13 = cold_air.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(13, 26).addBox(10.0F, 7.0F, -5.0F, 5.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.0F, -24.0F, 17.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r14 = cold_air.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(162, 6).addBox(4.0F, -9.0F, -8.0F, 2.0F, 19.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.0F, -21.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r15 = cold_air.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(119, 0).addBox(-8.0F, -12.0F, -6.0F, 14.0F, 4.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(61, 37)
						.addBox(-39.0F, -43.0F, -5.0F, 18.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
						.texOffs(38, 19).addBox(-43.0F, -41.0F, -3.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(37, 0).addBox(-38.0F, -44.0F, -4.0F, 17.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(82, 0).addBox(-37.0F, -45.0F, -3.0F, 16.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(40, 0).addBox(-35.0F, -47.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(40, 0).addBox(-35.0F, -47.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftHand = partdefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r16 = LeftHand.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(9, 48).addBox(-3.5F, -6.0F, -6.0F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5F, -26.0F, -12.0F, 0.3491F, 0.0F, -0.5236F));

		PartDefinition cube_r17 = LeftHand.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(36, 58).addBox(-4.5F, -10.0F, -6.0F, 7.0F, 16.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.5F, -29.0F, -20.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r18 = LeftHand.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 42).addBox(-4.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.5F, -26.0F, -3.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition RightHand = partdefinition.addOrReplaceChild("RightHand", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r19 = RightHand.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 35).addBox(-4.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.5F, -26.0F, 5.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r20 = RightHand.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(67, 61).addBox(-4.5F, -10.0F, -1.0F, 7.0F, 16.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.5F, -29.0F, 20.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r21 = RightHand.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(34, 40).addBox(-3.5F, -6.0F, -1.0F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5F, -26.0F, 12.0F, -0.3491F, 0.0F, -0.5236F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(8.0F, 34.0F, 0.0F));

		PartDefinition cube_r22 = LeftLeg.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(44, 12).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.5F, -27.0F, -3.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(8.0F, 34.0F, 0.0F));

		PartDefinition cube_r23 = RightLeg.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(44, 12).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.5F, -27.0F, 5.0F, 0.0F, 0.0F, -1.2217F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightHand.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftHand.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}