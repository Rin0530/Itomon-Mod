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
public class NyafukaModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sample", "modelnyahukamodel_64x_37x_18"), "main");
	public final ModelPart body;
	public final ModelPart tail;
	public final ModelPart head;
	public final ModelPart leftFrontLeg;
	public final ModelPart rightFrontLeg;
	public final ModelPart leftHindLeg;
	public final ModelPart rightHindLeg;

	public NyafukaModel(ModelPart root) {
		super(root, 0.5F, 10F);
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.leftFrontLeg = root.getChild("leftFrontLeg");
		this.rightFrontLeg = root.getChild("rightFrontLeg");
		this.leftHindLeg = root.getChild("leftHindLeg");
		this.rightHindLeg = root.getChild("rightHindLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(66, 106).addBox(-4.0F, -23.0F, 16.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 119).addBox(-3.0F, -22.0F, 17.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 121).addBox(-2.0F, -21.0F, 18.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 62).addBox(-4.0F, -24.0F, -15.0F, 8.0F, 12.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(0, 87).addBox(4.0F, -23.0F, -15.0F, 1.0F, 10.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(120, 106).addBox(-1.0F, -30.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(122, 115).addBox(-1.0F, -29.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(113, 106).addBox(-1.0F, -28.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(113, 112).addBox(-1.0F, -27.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(122, 122).addBox(-1.0F, -30.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(115, 121).addBox(-1.0F, -25.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(115, 117).addBox(-1.0F, -26.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 87).addBox(-5.0F, -23.0F, -15.0F, 1.0F, 10.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(-6.0F, -22.0F, -15.0F, 1.0F, 8.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(5.0F, -22.0F, -15.0F, 1.0F, 8.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 20).addBox(-11.0F, -10.0F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(12, 18).addBox(-11.0F, -9.0F, -2.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

		body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 44).addBox(-11.0F, -14.0F, 7.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

		body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 44).addBox(-11.0F, -14.0F, -6.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

		body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 78).addBox(-12.0F, -22.0F, -4.0F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(112, 6).addBox(-1.5F, -20.0F, 19.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(118, 0).addBox(-1.5F, -21.0F, 24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 7).addBox(-1.5F, -23.0F, 26.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(90, 13).addBox(-1.5F, -20.0F, 26.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(99, 12).addBox(-1.5F, -22.0F, 25.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(-1.5F, -24.0F, 28.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(107, 0).addBox(-1.5F, -26.0F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(108, 6).addBox(-1.5F, -23.0F, 30.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(99, 6).addBox(-1.5F, -25.0F, 29.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 9).addBox(-1.5F, -21.0F, 23.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 19).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -23.5F, 34.0F, -0.3054F, 0.0F, 0.0F));

		tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(110, 15).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -25.5F, 34.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 14).addBox(-5.0F, -27.0F, -18.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(69, 0).addBox(-4.0F, -26.0F, -20.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 8).addBox(-2.0F, -23.0F, -22.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(41, 1).addBox(-5.0F, -29.0F, -17.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -1.0F));

		head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 43).addBox(-12.0F, -21.0F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(15, 44).addBox(-12.0F, -23.0F, -3.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(15, 60).addBox(-14.0F, -27.0F, -3.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(16, 80).addBox(-14.0F, -25.0F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 68).addBox(-13.0F, -24.0F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(30, 57).addBox(-13.0F, -25.0F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(15, 60).addBox(-13.0F, -26.0F, -3.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 45).addBox(-13.0F, -27.0F, -4.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(35, 76).addBox(-15.0F, -26.0F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(30, 57).addBox(-15.0F, -27.0F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(30, 57).addBox(-14.0F, -26.0F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-13.0F, -23.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-12.0F, -27.0F, -4.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

		head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 35).mirror().addBox(-10.0F, -21.0F, -16.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -3.0F, -1.0F, 0.0F, 0.0F, -0.2618F));

		head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 30).mirror().addBox(-11.0F, -22.0F, -16.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

		head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 35).addBox(6.0F, -21.0F, -16.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.2618F));

		head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 30).addBox(7.0F, -22.0F, -16.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition ear = head.addOrReplaceChild("ear", CubeListBuilder.create(), PartPose.offset(10.3348F, -29.0415F, -17.0F));

		PartDefinition l = ear.addOrReplaceChild("l", CubeListBuilder.create().texOffs(33, 28).addBox(-0.35F, -0.417F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.15F, -0.917F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.1848F, -0.0415F, 0.5F));

		l.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 38).addBox(-0.2884F, 0.0129F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		l.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(37, 35).addBox(-0.2714F, -1.0031F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bone2 = l.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 19).addBox(-2.75F, -1.9659F, 18.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(-0.15F, 0.333F, -19.5F, 0.0F, 0.0F, 1.5708F));

		bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 19).addBox(-2.25F, -1.9659F, 18.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.75F))
		.texOffs(4, 20).addBox(-2.0F, -1.2159F, 18.7412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 3.333F, -19.5F, 0.0F, 0.0F, 1.5708F));

		bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 30).addBox(-3.0F, 1.7841F, 18.7412F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.85F, 1.333F, -19.5F, 0.0F, 0.0F, 1.5708F));

		bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(6, 30).addBox(-3.0F, 1.7841F, 18.2412F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.85F, 1.333F, -18.5F, 0.0F, 0.0F, 1.5708F));

		bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(4, 20).addBox(-2.0F, -1.2159F, 17.7412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, -0.667F, -18.5F, 0.0F, 0.0F, 1.5708F));

		bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, 1.7841F, 18.7412F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.85F, 1.333F, -18.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition r = ear.addOrReplaceChild("r", CubeListBuilder.create().texOffs(28, 28).mirror().addBox(-16.3348F, -0.9585F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 28).mirror().addBox(-18.1348F, -0.4585F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		r.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 35).mirror().addBox(-1.213F, -1.108F, -1.201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-16.9838F, -0.2085F, 0.201F, 0.0F, 0.0F, 0.5236F));

		r.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 38).mirror().addBox(-1.363F, 0.407F, -1.201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-16.9838F, -0.2085F, 0.201F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bone = r.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5848F, -0.2085F, 0.6429F, 0.0F, -0.2618F, 0.0F));

		bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(1.25F, -1.5481F, -0.8847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false)
		.texOffs(0, 19).mirror().addBox(-2.25F, -1.5481F, -0.8847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false)
		.texOffs(4, 20).mirror().addBox(-2.5F, -0.7981F, -0.6347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(6, 30).mirror().addBox(-1.5F, -1.7981F, -0.6347F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(6, 30).mirror().addBox(-1.5F, -0.7981F, -0.1347F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, 20).mirror().addBox(1.5F, -0.7981F, -0.6347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 24).mirror().addBox(-1.5F, 0.2019F, 0.3653F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0909F, 0.0F, 2.7823F, -0.3927F, 0.0F, -1.5708F));

		partdefinition.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create().texOffs(40, 26).addBox(2.0F, 7.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 26).addBox(2.0F, 6.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 36).addBox(1.0F, -5.0F, 5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 32).addBox(4.0F, 6.0F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 32).addBox(1.0F, 7.0F, 10.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -7.0F, 6.0F, 3.0F, 15.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(59, 24).addBox(1.0F, 6.0F, 5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 36).addBox(4.0F, -2.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 8).addBox(-1.0F, 0.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-1.0F, -2.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(-2.0F, -1.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(23, 11).addBox(-3.0F, -2.0F, 6.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(16, 5).addBox(0.0F, -3.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 7).addBox(3.0F, -2.0F, 10.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 13).addBox(0.0F, 3.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(23, 13).addBox(-1.0F, 2.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(23, 13).addBox(-2.0F, 1.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(0.0F, 2.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 27).addBox(1.0F, 7.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 27).addBox(0.0F, 7.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 26).addBox(2.0F, 6.0F, 9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 16.0F, -21.0F));

		partdefinition.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create().texOffs(40, 26).mirror().addBox(50.0F, 7.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(40, 26).mirror().addBox(50.0F, 6.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(45, 36).mirror().addBox(50.0F, -5.0F, 5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(43, 32).mirror().addBox(49.0F, 6.0F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 32).mirror().addBox(49.0F, 7.0F, 10.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(50.0F, -7.0F, 6.0F, 3.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(59, 24).mirror().addBox(49.0F, 6.0F, 5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 36).mirror().addBox(49.0F, -2.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 8).mirror().addBox(53.0F, 0.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 0).mirror().addBox(53.0F, -2.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 0).mirror().addBox(55.0F, -1.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(23, 11).mirror().addBox(56.0F, -2.0F, 6.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 5).mirror().addBox(53.0F, -3.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 7).mirror().addBox(50.0F, -2.0F, 10.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(23, 13).mirror().addBox(53.0F, 3.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(23, 13).mirror().addBox(54.0F, 2.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(23, 13).mirror().addBox(55.0F, 1.0F, 6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 0).mirror().addBox(53.0F, 2.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 27).mirror().addBox(49.0F, 7.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 27).mirror().addBox(53.0F, 7.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(40, 26).mirror().addBox(50.0F, 6.0F, 9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-44.0F, 16.0F, -21.0F));

		partdefinition.addOrReplaceChild("rightHindLeg", CubeListBuilder.create().texOffs(15, 96).addBox(-17.0F, -4.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(99, 78).mirror().addBox(-15.0F, -12.0F, 1.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 106).mirror().addBox(-16.0F, -10.0F, 2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(108, 120).mirror().addBox(-17.0F, -8.0F, 2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 113).mirror().addBox(-17.0F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 80).mirror().addBox(-17.0F, 7.0F, -4.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(34, 101).mirror().addBox(-17.0F, 6.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(34, 88).mirror().addBox(-16.5F, 6.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(43, 100).mirror().addBox(-16.5F, 7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(43, 100).mirror().addBox(-16.5F, 5.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 92).mirror().addBox(-18.0F, 7.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(43, 84).mirror().addBox(-14.0F, 7.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(8.0F, 16.0F, 8.0F));

		partdefinition.addOrReplaceChild("leftHindLeg", CubeListBuilder.create().texOffs(99, 78).addBox(14.0F, -12.0F, 1.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(85, 106).addBox(15.0F, -10.0F, 2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(108, 120).addBox(16.0F, -8.0F, 2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(93, 113).addBox(14.0F, 0.0F, 0.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 80).addBox(14.0F, 7.0F, -4.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(34, 101).addBox(14.0F, 6.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 96).addBox(14.0F, -4.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 88).addBox(14.5F, 6.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(43, 100).addBox(14.5F, 7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 100).addBox(14.5F, 5.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 92).addBox(17.0F, 7.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(43, 84).addBox(13.0F, 7.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 16.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leftFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.rightHindLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftHindLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
}

