package com.yorphos.newmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityBucketCow extends EntityCow {

    public ItemStack ITEMSTACK;
    public Class<? extends EntityAnimal> MATECLASS;

    public EntityBucketCow(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 1.4f);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D, MATECLASS));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.WHEAT, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityBucketCow(world);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (itemstack.getItem() == Items.BUCKET && !this.isChild())
        {
            player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            if(!player.capabilities.isCreativeMode) { itemstack.shrink(1); }

            if (itemstack.isEmpty())
            {
                player.setHeldItem(hand, ITEMSTACK);
            }
            else if (!player.inventory.addItemStackToInventory(ITEMSTACK))
            {
                player.dropItem(ITEMSTACK, false);
            }

            return true;
        }

        return false;
    }

}
