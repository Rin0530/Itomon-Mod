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

public class ElepiyoModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "elepiyo"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart LeftWing;
	private final ModelPart RightWing;

	public ElepiyoModel(ModelPart root) {
		super(root, 0.2F, 19);
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftWing = root.getChild("LeftWing");
		this.RightWing = root.getChild("RightWing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -37.0F, 20.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F))
						.texOffs(106, 60).mirror()
						.addBox(-18.0F, -33.0F, 24.0F, 2.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(61, 65).mirror()
						.addBox(-20.0F, -31.0F, 26.0F, 2.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(106, 60).addBox(16.0F, -33.0F, 24.0F, 2.0F, 24.0F, 24.0F, new CubeDeformation(0.0F))
						.texOffs(212, 140).addBox(18.0F, -31.0F, 24.0F, 2.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
						.texOffs(136, 50).addBox(-15.0F, -39.0F, 21.0F, 30.0F, 2.0F, 30.0F, new CubeDeformation(0.0F))
						.texOffs(97, 0).addBox(-12.0F, -41.0F, 24.0F, 24.0F, 2.0F, 24.0F, new CubeDeformation(0.0F))
						.texOffs(130, 27).addBox(-10.0F, -43.0F, 26.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
						.texOffs(32, 137).addBox(-15.0F, -5.0F, 21.0F, 30.0F, 2.0F, 30.0F, new CubeDeformation(0.0F))
						.texOffs(160, 84).addBox(-14.0F, -35.0F, 52.0F, 28.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(160, 116).addBox(-12.0F, -34.0F, 54.0F, 24.0F, 24.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(212, 116).addBox(-10.0F, -32.0F, 56.0F, 20.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 125).addBox(-14.0F, -35.0F, 18.0F, 28.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(106, 109).addBox(-12.0F, -33.0F, 16.0F, 24.0F, 24.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(61, 106).addBox(-10.0F, -32.0F, 14.0F, 20.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -36.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 166).addBox(-0.5F,
				-20.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(134, 136).mirror()
						.addBox(-1.5F, -4.0F, -1.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -31.0F, 14.0F, 0.0F, 0.0F, 0.4363F));

		head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(123, 136).addBox(-1.5F, -4.0F, -1.0F, 3.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -31.0F, 14.0F, 0.0F, 0.0F, -0.4363F));

		head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 164).mirror()
						.addBox(1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -42.0F, 27.0F, -0.2333F, -0.1198F, -0.4659F));

		head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 164).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -42.0F, 27.0F, -0.2333F, 0.1198F, 0.4659F));

		head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 156).addBox(-2.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -43.0F, 27.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create()
				.texOffs(224, 240).addBox(7.5526F, -2.125F, 15.4104F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(224, 240).addBox(8.5526F, -0.125F, 2.4104F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.0526F, 23.125F, -9.4104F));

		RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(224, 240).addBox(-0.5F, -1.0F, -13.0F, 1.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0526F, 0.875F, 15.4104F, 0.0F, -0.48F, 0.0F));

		RightLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(224, 240).addBox(-0.5F, -1.0F, -13.0F, 1.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0526F, 0.875F, 15.4104F, 0.0F, 0.5236F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(224, 240)
				.addBox(7.5526F, -2.125F, 14.6604F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(224, 240).addBox(8.5526F, -0.125F, 2.6604F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0526F, 23.125F, -9.6604F));

		LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(224, 240).addBox(-0.5F, -1.0F, -13.0F, 1.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0526F, 0.875F, 15.6604F, 0.0F, -0.48F, 0.0F));

		LeftLeg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(224, 240).addBox(-0.5F, -1.0F, -13.0F, 1.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0526F, 0.875F, 15.6604F, 0.0F, 0.5236F, 0.0F));

		partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(246, 7)
				.addBox(4.7368F, -21.9606F, 11.0866F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(238, 18).addBox(5.7368F, -17.9606F, 11.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(239, 12).addBox(11.7368F, -17.9606F, 11.0866F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(232, 8).addBox(11.7368F, -14.9606F, 11.0866F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(232, 8).addBox(4.7368F, -17.9606F, 11.0866F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(245, 19).addBox(7.7368F, -10.9606F, 11.0866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(245, 19).addBox(10.7368F, -10.9606F, 11.0866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(238, 18).addBox(6.7368F, -11.9606F, 11.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(242, 0).addBox(6.7368F, -9.9606F, 11.0866F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(231, 21).addBox(6.7368F, -17.9606F, 11.0866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(239, 23).addBox(4.7368F, -22.9606F, 11.0866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(245, 19).addBox(8.7368F, -14.9606F, 11.0866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(233, 16).addBox(8.7368F, -14.9606F, 11.0866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(238, 18).addBox(9.7368F, -22.9606F, 11.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(239, 7).addBox(9.7368F, -22.9606F, 11.0866F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(248, 23).addBox(9.7368F, -14.9606F, 11.0866F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(248, 23).addBox(9.7368F, -12.9606F, 11.0866F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(250, 14).addBox(5.7368F, -15.9606F, 11.0866F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(231, 0).addBox(10.7368F, -22.9606F, 11.0866F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7368F, 1.3684F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create(),
				PartPose.offset(22.1111F, 3.3167F, -12.5395F));

		LeftWing.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(40, 157)
						.addBox(-3.0F, -2.5F, 9.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(33, 159).addBox(-3.0F, -2.5F, -11.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(19, 157).addBox(-1.0F, -2.5F, -9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(1, 155).addBox(-3.0F, -5.0F, -10.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(51, 157).addBox(-1.0F, -2.5F, 4.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(18, 184).addBox(1.0F, -2.5F, -6.5F, 2.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
						.texOffs(0, 168).addBox(-3.0F, -5.0F, 4.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(34, 172).addBox(-1.0F, -4.5F, -7.5F, 2.0F, 9.0F, 12.0F, new CubeDeformation(0.0F))
						.texOffs(15, 157).addBox(-3.0F, -6.5F, -8.5F, 2.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8889F, 0.1833F, 12.0395F, -0.1745F, 0.0F, 0.0F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create(),
				PartPose.offset(-22.1111F, 3.3167F, -12.5395F));

		RightWing.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(40, 157).mirror()
						.addBox(1.0F, -2.5F, 9.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(33, 159).mirror()
						.addBox(1.0F, -2.5F, -11.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(19, 157).mirror()
						.addBox(-1.0F, -2.5F, -9.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(1, 155).mirror()
						.addBox(1.0F, -5.0F, -10.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(51, 157).mirror()
						.addBox(-1.0F, -2.5F, 4.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(18, 184).mirror()
						.addBox(-3.0F, -2.5F, -6.5F, 2.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 168).mirror()
						.addBox(1.0F, -5.0F, 4.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(34, 172).mirror()
						.addBox(-1.0F, -4.5F, -7.5F, 2.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(15, 157).mirror()
						.addBox(1.0F, -6.5F, -8.5F, 2.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8889F, 0.1833F, 12.0395F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

		this.LeftWing.yRot = Mth.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
		this.RightWing.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.4F * limbSwingAmount;
	}
}