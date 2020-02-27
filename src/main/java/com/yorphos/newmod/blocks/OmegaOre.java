package com.yorphos.newmod.blocks;

import com.yorphos.newmod.init.ModItems;
import com.yorphos.newmod.init.ModTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class OmegaOre extends BlockBase {

    public OmegaOre(String name, Material material) {
        super(name, material);
        setCreativeTab(ModTabs.MOD_TAB);
        setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.OMEGA;
    }

    @Override
    public int quantityDropped(Random rand) {
        return (rand.nextFloat() <= 0.05f) ? 1 : 0;
    }

}
