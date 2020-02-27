package com.yorphos.newmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OmegaBlock extends BlockBase {

    public OmegaBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(0.5F);
        setResistance(20.0F);
        setHarvestLevel("pickaxe", 3);
    }

}
