package com.yorphos.newmod.init;

import com.yorphos.newmod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block OMEGA_BLOCK = new OmegaBlock("omega_block", Material.IRON);
    public static final Block ALPHA_BLOCK = new AlphaBlock("alpha_block", Material.IRON);
    public static final Block OMEGA_ORE = new OmegaOre("omega_ore", Material.ROCK);

    public static final Block PUNCH_BLOCK = new PunchBlock("punch_block", Material.GROUND);

}
