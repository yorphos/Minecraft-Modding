package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.init.ModTabs;
import net.minecraft.item.ItemSword;

public class OmegaSword extends ToolSword {

    public OmegaSword(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(ModTabs.COMBAT);
    }

}
