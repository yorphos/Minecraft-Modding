package com.yorphos.newmod.util.handlers;

import com.yorphos.newmod.entities.*;
import com.yorphos.newmod.entities.render.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenderers() {
        renderWaterCow();
        renderLavaCow();
        RenderRegenerationCow();
        RenderPoisonCow();
        RenderHarmingCow();
        RenderNightvisionCow();
        RenderWaterbreathingCow();
    }

    public static void renderWaterCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityWaterCow.class,
                new IRenderFactory<EntityWaterCow>() {
                    @Override
                    public Render<? super EntityWaterCow> createRenderFor(RenderManager manager) {
                        return new RenderWaterCow(manager);
                    }
                });
    }

    public static void renderLavaCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityLavaCow.class,
                new IRenderFactory<EntityLavaCow>() {
                    @Override
                    public Render<? super EntityLavaCow> createRenderFor(RenderManager manager) {
                        return new RenderLavaCow(manager);
                    }
                });
    }

    public static void RenderRegenerationCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegenerationCow.class,
                new IRenderFactory<EntityRegenerationCow>() {
                    @Override
                    public Render<? super EntityRegenerationCow> createRenderFor(RenderManager manager) {
                        return new RenderRegenerationCow(manager);
                    }
                });
    }

    public static void RenderPoisonCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPoisonCow.class,
                new IRenderFactory<EntityPoisonCow>() {
                    @Override
                    public Render<? super EntityPoisonCow> createRenderFor(RenderManager manager) {
                        return new RenderPoisonCow(manager);
                    }
                });
    }

    public static void RenderHarmingCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityHarmingCow.class,
                new IRenderFactory<EntityHarmingCow>() {
                    @Override
                    public Render<? super EntityHarmingCow> createRenderFor(RenderManager manager) {
                        return new RenderHarmingCow(manager);
                    }
                });
    }

    public static void RenderNightvisionCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityNightvisionCow.class,
                new IRenderFactory<EntityNightvisionCow>() {
                    @Override
                    public Render<? super EntityNightvisionCow> createRenderFor(RenderManager manager) {
                        return new RenderNightvisionCow(manager);
                    }
                });
    }

    public static void RenderWaterbreathingCow() {
        RenderingRegistry.registerEntityRenderingHandler(EntityWaterbreathingCow.class,
                new IRenderFactory<EntityWaterbreathingCow>() {
                    @Override
                    public Render<? super EntityWaterbreathingCow> createRenderFor(RenderManager manager) {
                        return new RenderWaterbreathingCow(manager);
                    }
                });
    }

}
