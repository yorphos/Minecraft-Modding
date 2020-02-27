package com.yorphos.newmod.tabs;

import com.yorphos.newmod.init.ModItems;
import com.yorphos.newmod.init.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBase extends CreativeTabs {

    public TabBase(String label) {
        super(label);

        ModTabs.TABS.add(this);
    }

    @Override
    public ItemStack getTabIconItem() { return new ItemStack(ModItems.OMEGA); }
}
