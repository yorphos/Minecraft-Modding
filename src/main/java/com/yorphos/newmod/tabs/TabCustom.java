package com.yorphos.newmod.tabs;

import com.yorphos.newmod.init.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabCustom extends TabBase {

    private static ItemStack icon;

    public TabCustom(String label, Item item) {
        super(label);
        icon = new ItemStack(item);

        ModTabs.TABS.add(this);
    }

    @Override
    public ItemStack getTabIconItem() { return null; }

}
