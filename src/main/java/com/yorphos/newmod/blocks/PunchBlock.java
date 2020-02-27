package com.yorphos.newmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PunchBlock extends BlockBase {

    public PunchBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.CLOTH);
        setHardness(0.5F);
        setResistance(1000000.0F);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(30.0F);
    }

}
