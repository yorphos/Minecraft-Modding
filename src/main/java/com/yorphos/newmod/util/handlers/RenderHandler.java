package com.yorphos.newmod.util.handlers;

import com.yorphos.newmod.entities.EntityCustom;
import com.yorphos.newmod.entities.render.RenderCustom;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class,
                new IRenderFactory<EntityCustom>() {
                    @Override
                    public Render<? super EntityCustom> createRenderFor(RenderManager manager) {
                        return new RenderCustom(manager);
                    }
        });
    }

}
