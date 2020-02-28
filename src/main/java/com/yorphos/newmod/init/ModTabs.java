package com.yorphos.newmod.init;

import com.yorphos.newmod.tabs.TabCustom;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModTabs {

    public static final List<CreativeTabs> TABS = new ArrayList<CreativeTabs>();

    public static CreativeTabs DEFAULT;
    public static CreativeTabs COMBAT;
    public static CreativeTabs FOOD;
    public static CreativeTabs BUILDING;
    public static CreativeTabs TOOLS;

    public static void init() {
        DEFAULT = new TabCustom("default", ModItems.OMEGA);
        COMBAT = new TabCustom("combat", ModItems.OMEGA_SWORD);
        FOOD = new TabCustom("food", ModItems.CUPCAKE);
        BUILDING = new TabCustom("building", Item.getItemFromBlock(ModBlocks.OMEGA_BLOCK));
        TOOLS = new TabCustom("tools", ModItems.OMEGA_PICKAXE);
    }

}
