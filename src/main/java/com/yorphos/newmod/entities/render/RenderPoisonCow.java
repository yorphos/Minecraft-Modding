package com.yorphos.newmod.entities.render;

import com.yorphos.newmod.entities.EntityPoisonCow;
import com.yorphos.newmod.entities.EntityRegenerationCow;
import com.yorphos.newmod.entities.models.ModelPoisonCow;
import com.yorphos.newmod.entities.models.ModelRegenerationCow;
import com.yorphos.newmod.util.Ref;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderPoisonCow extends RenderLiving<EntityPoisonCow> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entities/poison_cow.png");

    public RenderPoisonCow(RenderManager manager) {
        super(manager, new ModelPoisonCow(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityPoisonCow entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPoisonCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
