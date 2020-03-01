package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityWaterbreathingCow;
import com.yorphos.newmod.entities.models.ModelWaterbreathingCow;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderWaterbreathingCow extends RenderLiving<EntityWaterbreathingCow> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/waterbreathing_cow.png");

    public RenderWaterbreathingCow(RenderManager manager) {
        super(manager, new ModelWaterbreathingCow(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityWaterbreathingCow entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityWaterbreathingCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
