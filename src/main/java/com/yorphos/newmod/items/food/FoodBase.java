package com.yorphos.newmod.items.food;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
