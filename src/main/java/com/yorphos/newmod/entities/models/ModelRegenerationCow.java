package com.yorphos.newmod.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelRegenerationCow extends ModelBase {
    public ModelRenderer cow_body;
    public ModelRenderer cow_udders;
    public ModelRenderer cow_bl_leg;
    public ModelRenderer cow_fl_leg;
    public ModelRenderer cow_br_leg;
    public ModelRenderer cow_fr_leg;
    public ModelRenderer cow_head;
    public ModelRenderer cow_horn_r;
    public ModelRenderer cow_horn_l;

    protected void convertToChild(ModelRenderer parent, ModelRenderer child)
    {
        parent.addChild(child);

        child.rotationPointX -= parent.rotationPointX;
        child.rotationPointY -= parent.rotationPointY;
        child.rotationPointZ -= parent.rotationPointZ;

        child.rotateAngleX -= parent.rotateAngleX;
        child.rotateAngleY -= parent.rotateAngleY;
        child.rotateAngleZ -= parent.rotateAngleZ;
    }

    public ModelRegenerationCow() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.cow_horn_r = new ModelRenderer(this, 22, 0);
        this.cow_horn_r.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.cow_horn_r.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.cow_bl_leg = new ModelRenderer(this, 0, 16);
        this.cow_bl_leg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.cow_bl_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cow_fr_leg = new ModelRenderer(this, 0, 16);
        this.cow_fr_leg.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.cow_fr_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cow_horn_l = new ModelRenderer(this, 22, 0);
        this.cow_horn_l.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.cow_horn_l.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.cow_body = new ModelRenderer(this, 18, 4);
        this.cow_body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.cow_body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(cow_body, 1.5707963267948966F, 0.0F, 0.0F);
        this.cow_udders = new ModelRenderer(this, 52, 0);
        this.cow_udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.cow_udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(cow_udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.cow_head = new ModelRenderer(this, 0, 0);
        this.cow_head.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.cow_head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.cow_br_leg = new ModelRenderer(this, 0, 16);
        this.cow_br_leg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.cow_br_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cow_fl_leg = new ModelRenderer(this, 0, 16);
        this.cow_fl_leg.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.cow_fl_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        convertToChild(this.cow_head, this.cow_horn_l);
        convertToChild(this.cow_head, this.cow_horn_r);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.cow_bl_leg.render(f5);
        this.cow_fr_leg.render(f5);
        this.cow_body.render(f5);
        this.cow_udders.render(f5);
        this.cow_head.render(f5);
        this.cow_br_leg.render(f5);
        this.cow_fl_leg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.cow_fl_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662f) * 1.4f * limbSwingAmount;
        this.cow_bl_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662f) * 1.4f * limbSwingAmount;

        this.cow_fr_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662f + (float)Math.PI) * 1.4f * limbSwingAmount;
        this.cow_br_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662f + (float)Math.PI) * 1.4f * limbSwingAmount;

        this.cow_head.rotateAngleY = netHeadYaw * 0.017453292f;
        this.cow_head.rotateAngleX = headPitch * 0.017453292f;
    }

}
