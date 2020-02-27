package com.yorphos.newmod.items;

import com.yorphos.newmod.init.ModItems;

import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
