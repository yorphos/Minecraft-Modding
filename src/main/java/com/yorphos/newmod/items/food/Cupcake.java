package com.yorphos.newmod.items.food;

import com.yorphos.newmod.init.ModTabs;
import net.minecraft.potion.PotionEffect;

public class Cupcake extends FoodEffectBase {

    public Cupcake(String name, int amount, float saturation, boolean isWolfFood, PotionEffect effect) {
        super(name, amount, saturation, isWolfFood, effect);
        setCreativeTab(ModTabs.MOD_TAB);
    }

}
