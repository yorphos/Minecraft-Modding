package com.yorphos.newmod.init;

import com.yorphos.newmod.Main;
import com.yorphos.newmod.entities.*;
import com.yorphos.newmod.util.Ref;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModEntities {

    public static void init() {
        registerEntity("water_cow", EntityWaterCow.class, Ref.ENTITY_WATER_COW, 50, Integer.parseInt("69E4FF", 16), Integer.parseInt("C4E8F0", 16));
        registerEntity("lava_cow", EntityLavaCow.class, Ref.ENTITY_LAVA_COW, 50, Integer.parseInt("3F0000", 16), Integer.parseInt("9D1300", 16));
        registerEntity("regeneration_cow", EntityRegenerationCow.class, Ref.ENTITY_REGENERATION_COW, 50, Integer.parseInt("3A0017", 16), Integer.parseInt("FF8EDF", 16));
        registerEntity("poison_cow", EntityPoisonCow.class, Ref.ENTITY_POISON_COW, 50, Integer.parseInt("2d2a26", 16), Integer.parseInt("64a000", 16));
        registerEntity("harming_cow", EntityHarmingCow.class, Ref.ENTITY_HARMING_COW, 50, Integer.parseInt("352a1f", 16), Integer.parseInt("6f0606", 16));
        registerEntity("nightvision_cow", EntityNightvisionCow.class, Ref.ENTITY_NIGHTVISION_COW, 50, Integer.parseInt("1a1a32", 16), Integer.parseInt("818181", 16));
        registerEntity("waterbreathing_cow", EntityWaterbreathingCow.class, Ref.ENTITY_WATERBREATHING_COW, 50, Integer.parseInt("2144a1", 16), Integer.parseInt("a6bbf5", 16));
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }

}
