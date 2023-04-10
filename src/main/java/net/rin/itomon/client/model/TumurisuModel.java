package net.rin.itomon.client.model;

import net.minecraft.world.entity.Entity;
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
public class TumurisuModel<T extends Entity> extends AbstractItomonModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("itomon", "modeljava"), "main");
	public final ModelPart legs_r;
	public final ModelPart legs_l;
	public final ModelPart heads;
	public final ModelPart shell;
	public final ModelPart hand_r;
	public final ModelPart hand_l;
	public final ModelPart bb_main;

	public TumurisuModel(ModelPart root) {
		super(root);
		this.legs_r = root.getChild("legs_r");
		this.legs_l = root.getChild("legs_l");
		this.heads = root.getChild("heads");
		this.shell = root.getChild("shell");
		this.hand_r = root.getChild("hand_r");
		this.hand_l = root.getChild("hand_l");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legs_r = partdefinition.addOrReplaceChild("legs_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition legs_l = partdefinition.addOrReplaceChild("legs_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hand_r = partdefinition.addOrReplaceChild("hand_r", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hand_l = partdefinition.addOrReplaceChild("hand_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		
		legs_r.addOrReplaceChild("leg_4_r_r1",
				CubeListBuilder.create().texOffs(33, 0).addBox(-5.2F, -1.0F, -3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(-2.6F, -1.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 1)
						.addBox(0.0F, -1.0F, -3.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0).addBox(2.0F, -1.0F, -4.8F, 2.0F, 1.0F,
								2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.0F, 1.5708F, 0.0F));
		
		legs_l.addOrReplaceChild("leg_4_r_r2",
				CubeListBuilder.create().texOffs(33, 0).addBox(-5.2F, -1.0F, 3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(-2.6F, -1.0F, 3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 1)
						.addBox(0.0F, -1.0F, 3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 1).addBox(2.0F, -1.0F, 3.2F, 2.0F, 1.0F,
								2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.0F, 1.5708F, 0.0F));
		partdefinition.addOrReplaceChild("heads",
				CubeListBuilder.create().texOffs(21, 9).addBox(-2.8F, -9.2F, -4.8F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2F, -11.6F, -3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.9F, -11.6F, -3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("shell",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.8F, -9.2F, -1.6F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		
		hand_r.addOrReplaceChild("hand_r_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 3.7F, -4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -3.1416F));
		
		hand_l.addOrReplaceChild("hand_l_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 3.7F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -3.1416F));
		partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 17).addBox(-2.8F, -3.0F, -4.8F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

}
