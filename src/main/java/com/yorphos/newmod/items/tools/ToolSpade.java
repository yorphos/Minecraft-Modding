package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade {

    public ToolSpade(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

}
