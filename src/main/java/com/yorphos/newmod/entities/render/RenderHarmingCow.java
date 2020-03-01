package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityHarmingCow;
import com.yorphos.newmod.entities.models.ModelHarmingCow;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderHarmingCow extends RenderLiving<EntityHarmingCow> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/harming_cow.png");

    public RenderHarmingCow(RenderManager manager) {
        super(manager, new ModelHarmingCow(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHarmingCow entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityHarmingCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
