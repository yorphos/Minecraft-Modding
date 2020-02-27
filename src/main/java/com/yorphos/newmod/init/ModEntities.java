package com.yorphos.newmod.init;

import com.yorphos.newmod.Main;
import com.yorphos.newmod.entities.EntityCustom;
import com.yorphos.newmod.util.Ref;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModEntities {

    public static final List<Entity> ENTITIES = new ArrayList<Entity>();

    // Non-Hostile
    public static Entity PERSON;

    public static void init() {
        registerEntity("custom", EntityCustom.class, Ref.ENTITY_CUSTOM, 50, 11437146, 0);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }

}
