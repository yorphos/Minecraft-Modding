package com.yorphos.newmod.tabs;

import com.yorphos.newmod.init.ModItems;
import com.yorphos.newmod.init.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabBase extends CreativeTabs {

    private static ItemStack icon;

    public TabBase(String label) {
        super(label);

        ModTabs.TABS.add(this);
    }

    @Override
    public ItemStack getTabIconItem() { return null; }

}
