package com.yorphos.newmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {

    public static void init() {
        GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.OMEGA, 64), 1000.0F);
        GameRegistry.addSmelting(ModItems.OMEGA, new ItemStack(ModItems.ALPHA, 1), 1000.0F);
    }

}
