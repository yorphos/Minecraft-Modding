package com.yorphos.newmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCustom extends EntityCow {

    public EntityCustom(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 1.4f);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
    }

    @Override
    public float getEyeHeight() {
        return super.getEyeHeight();
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityCustom(world);
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

}
