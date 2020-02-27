package com.yorphos.newmod.blocks;

import com.yorphos.newmod.init.ModTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PunchBlock extends BlockBase {

    public PunchBlock(String name, Material material) {
        super(name, material);
        setCreativeTab(ModTabs.MOD_TAB);
        setSoundType(SoundType.CLOTH);
        setHardness(0.5F);
        setResistance(1000000.0F);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(30.0F);
    }

}
