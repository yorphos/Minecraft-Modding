package com.yorphos.newmod.items.tools;

import com.yorphos.newmod.Main;
import com.yorphos.newmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe {

    public ToolAxe(String name, ToolMaterial material) {
        super(material, 6.0F, -3.2F);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

}
