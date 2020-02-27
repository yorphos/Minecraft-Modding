package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe {

    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
