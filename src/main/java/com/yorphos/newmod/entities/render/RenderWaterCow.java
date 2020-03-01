package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityWaterCow;
import com.yorphos.newmod.entities.models.ModelCustom;
import com.yorphos.newmod.entities.models.ModelWaterCow;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderWaterCow extends RenderLiving<EntityWaterCow> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/water_cow.png");

    public RenderWaterCow(RenderManager manager) {
        super(manager, new ModelWaterCow(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityWaterCow entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityWaterCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
