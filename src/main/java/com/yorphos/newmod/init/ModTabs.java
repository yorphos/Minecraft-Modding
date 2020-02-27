package com.yorphos.newmod.init;

import com.yorphos.newmod.tabs.TabBase;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModTabs {

    public static final List<CreativeTabs> TABS = new ArrayList<CreativeTabs>();

    public static CreativeTabs MOD_TAB;

    public static void init() {
        MOD_TAB = new TabBase("mod_tab");
    }

}
