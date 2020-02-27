package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe {

    public ToolAxe(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
