package com.yorphos.newmod.items.food;

import com.yorphos.newmod.Main;
import com.yorphos.newmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);

        ModItems.ITEMS.add(this);
    }

}
