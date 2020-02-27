package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe {

    public ToolHoe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
