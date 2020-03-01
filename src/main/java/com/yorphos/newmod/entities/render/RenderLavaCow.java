package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityLavaCow;
import com.yorphos.newmod.entities.EntityWaterCow;
import com.yorphos.newmod.entities.models.ModelCustom;
import com.yorphos.newmod.entities.models.ModelLavaCow;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderLavaCow extends RenderLiving<EntityLavaCow> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/lava_cow.png");

    public RenderLavaCow(RenderManager manager) {
        super(manager, new ModelLavaCow(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityLavaCow entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityLavaCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
