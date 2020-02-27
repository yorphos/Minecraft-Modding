package com.yorphos.newmod.init;

import com.yorphos.newmod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static Block OMEGA_BLOCK;
    public static Block ALPHA_BLOCK;
    public static Block OMEGA_ORE;
    public static Block PUNCH_BLOCK;

    public static void init() {
        OMEGA_BLOCK = new OmegaBlock("omega_block", Material.IRON);
        ALPHA_BLOCK = new AlphaBlock("alpha_block", Material.IRON);
        OMEGA_ORE = new OmegaOre("omega_ore", Material.ROCK);
        PUNCH_BLOCK = new PunchBlock("punch_block", Material.GROUND);
    }

}