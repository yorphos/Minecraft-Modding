package com.yorphos.newmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import java.awt.*;

public class EntityRegenerationCow extends EntityBottleCow {

    public EntityRegenerationCow(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 1.4f);
        this.ITEMSTACK = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), getVanillaType("regeneration"));
        this.MATECLASS = EntityRegenerationCow.class;
    }

    @Override
    protected void initEntityAI() { super.initEntityAI(); }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityWaterCow(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return this.getHurtSound(source);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return this.getDeathSound();
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        return super.processInteract(player, hand);
    }

}
