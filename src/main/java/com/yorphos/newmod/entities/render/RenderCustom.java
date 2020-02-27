package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityCustom;
import com.yorphos.newmod.entities.models.ModelCustom;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderCustom extends RenderLiving<EntityCustom> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/custom.png");

    public RenderCustom(RenderManager manager) {
        super(manager, new ModelCustom(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCustom entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityCustom entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
