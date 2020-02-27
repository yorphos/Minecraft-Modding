package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword {

    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
