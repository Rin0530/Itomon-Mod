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


public class KonsainuModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "konsainu"), "main");
	private final ModelPart body;
	private final ModelPart leg_f_r;
	private final ModelPart leg_f_l;
	private final ModelPart leg_b_l;
	private final ModelPart leg_b_r;
	private final ModelPart leaf;
	private final ModelPart ear_r;
	private final ModelPart ear_l;

	public KonsainuModel(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.leg_f_r = root.getChild("leg_f_r");
		this.leg_f_l = root.getChild("leg_f_l");
		this.leg_b_l = root.getChild("leg_b_l");
		this.leg_b_r = root.getChild("leg_b_r");
		this.leaf = root.getChild("leaf");
		this.ear_r = root.getChild("ear_r");
		this.ear_l = root.getChild("ear_l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(54, 52).addBox(-5.0F, -8.9946F, -8.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-0.9946F, -13.0F, -8.0F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(48, 75).addBox(-4.5F, -8.8951F, -9.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 85).addBox(-0.8951F, -12.5F, -9.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 32).addBox(-4.5F, -8.8951F, 0.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 25).addBox(-0.8951F, -12.5F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 55).addBox(-0.7956F, -12.0F, 2.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 61).addBox(-4.0F, -8.7956F, 2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 99).addBox(-3.0F, -8.0967F, 3.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(27, 89).addBox(-0.5967F, -10.5F, 3.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(97, 53).addBox(-2.5F, -10.5F, -10.1F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(43, 125).addBox(-3.5F, -8.6962F, -10.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 108).addBox(-0.6962F, -11.5F, -10.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 119).addBox(-0.1989F, -7.0F, 7.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 125).addBox(-1.0F, -6.1989F, 7.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 115).addBox(-0.3978F, -9.0F, 6.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 120).addBox(-2.0F, -7.3978F, 6.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(3, 123).addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 115).addBox(-0.3978F, -2.0F, -1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, 0.0F, 0.0F, 0.3927F));

		body.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(3, 116).addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 121).addBox(-0.3978F, -2.0F, -1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		body.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(14, 121).addBox(-0.3978F, -2.0F, -1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		body.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(18, 115).addBox(-0.3978F, -2.0F, -1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		body.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(28, 125).addBox(-1.0F, -0.1989F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 111).addBox(-0.1989F, -1.0F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 9.0F, 0.0F, 0.0F, 0.3927F));

		body.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(34, 121).addBox(-1.0F, -0.1989F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 115).addBox(-0.1989F, -1.0F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 9.0F, 0.0F, 0.0F, -0.3927F));

		body.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(36, 115).addBox(-0.1989F, -1.0F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 9.0F, 0.0F, 0.0F, 0.7854F));

		body.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(30, 111).addBox(-0.1989F, -1.0F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 9.0F, 0.0F, 0.0F, -0.7854F));

		body.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(70, 108).addBox(-0.6962F, -3.5F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 114).addBox(-3.5F, -0.6962F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 54).addBox(-4.0F, -0.7956F, 11.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 71).addBox(-0.7956F, -4.0F, 11.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 40).addBox(-0.8951F, -4.5F, 9.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 24).addBox(-4.5F, -0.8951F, 9.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 84).addBox(-0.8951F, -4.5F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 70).addBox(-4.5F, -0.8951F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 38).addBox(-5.0F, -0.9946F, 1.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(41, 0).addBox(-0.9946F, -5.0F, 1.0F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -9.0F, 0.0F, 0.0F, -0.3927F));

		body.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(56, 103).addBox(-0.6962F, -3.5F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 67).addBox(-4.0F, -0.7956F, 11.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 55).addBox(-0.7956F, -4.0F, 11.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 79).addBox(-4.5F, -0.8951F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 25).addBox(-0.8951F, -4.5F, 9.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2, 39).addBox(-4.5F, -0.8951F, 9.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 69).addBox(-0.8951F, -4.5F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 38).addBox(-5.0F, -0.9946F, 1.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(87, 0).addBox(-0.9946F, -5.0F, 1.0F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(43, 119).addBox(-3.5F, -0.6962F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -9.0F, 0.0F, 0.0F, 0.3927F));

		body.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(70, 120).addBox(-0.6962F, -3.5F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 55).addBox(-0.7956F, -4.0F, 11.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 25).addBox(-0.8951F, -4.5F, 9.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(73, 69).addBox(-0.8951F, -4.5F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(110, 0).addBox(-0.9946F, -5.0F, 1.0F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -9.0F, 0.0F, 0.0F, 0.7854F));

		body.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(39, 102).addBox(-0.5967F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, 5.0F, 0.0F, 0.0F, -0.7854F));

		body.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5967F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(4, 91).addBox(-3.0F, -0.5967F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, 5.0F, 0.0F, 0.0F, -0.3927F));

		body.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(39, 89).addBox(-0.5967F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(4, 107).addBox(-3.0F, -0.5967F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, 5.0F, 0.0F, 0.0F, 0.3927F));

		body.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(27, 102).addBox(-0.5967F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, 5.0F, 0.0F, 0.0F, 0.7854F));

		body.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(28, 40).addBox(-0.8951F, -4.5F, -8.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(73, 84).addBox(-0.8951F, -4.5F, -17.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 71).addBox(-0.7956F, -4.0F, -6.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 0).addBox(-0.9946F, -5.0F, -16.0F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(63, 120).addBox(-0.6962F, -3.5F, -18.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition leg_f_r = partdefinition.addOrReplaceChild("leg_f_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		leg_f_r.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, 1.5F, -14.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.424F, 0.091F, 0.1986F));

		PartDefinition leg_f_l = partdefinition.addOrReplaceChild("leg_f_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		leg_f_l.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, 1.5F, -14.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.424F, -0.091F, -0.1986F));

		PartDefinition leg_b_l = partdefinition.addOrReplaceChild("leg_b_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		leg_b_l.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(4.0F, -2.0F, 1.0F, 0.3618F, -0.0741F, -0.3414F));

		PartDefinition leg_b_r = partdefinition.addOrReplaceChild("leg_b_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		leg_b_r.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-4.0F, -2.0F, 1.0F, 0.3618F, -0.0741F, 0.3414F));

		partdefinition.addOrReplaceChild("leaf", CubeListBuilder.create().texOffs(91, 66).addBox(-1.0F, -14.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 71).addBox(-0.5F, -13.8F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.8F))
		.texOffs(91, 76).addBox(-5.0F, -14.5F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 76).addBox(-5.0F, -14.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 76).addBox(2.0F, -14.5F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 76).addBox(2.0F, -14.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 72).addBox(-2.0F, -14.5F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(91, 72).addBox(1.0F, -14.5F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(91, 72).addBox(-2.0F, -14.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(91, 72).addBox(1.0F, -14.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(101, 65).addBox(-1.0F, -14.5F, -10.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(101, 65).addBox(-1.0F, -14.5F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(101, 72).addBox(1.0F, -14.5F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(101, 72).addBox(-6.0F, -14.5F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ear_r = partdefinition.addOrReplaceChild("ear_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		ear_r.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, 1.5F, -14.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -5.0F, 3.0F, -0.2582F, 0.4012F, 0.5013F));

		PartDefinition ear_l = partdefinition.addOrReplaceChild("ear_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		ear_l.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, 1.5F, -14.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -5.0F, 3.0F, -0.2582F, -0.4012F, -0.5013F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_f_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg_b_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_f_r.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_b_l.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leaf.yRot = headPitch / (180F / (float) Math.PI);
	}

}