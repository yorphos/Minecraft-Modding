package com.yorphos.newmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionType;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBottleCow extends EntityCow {

    public ItemStack ITEMSTACK;
    public Class<? extends EntityAnimal> MATECLASS;

    public EntityBottleCow(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 1.4f);
    }

    public static PotionType getVanillaType(String name) {
        return PotionType.REGISTRY.getObject(new ResourceLocation(name));
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
        return new EntityBottleCow(world);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (itemstack.getItem() == Items.GLASS_BOTTLE && !this.isChild())
        {
            player.playSound(SoundEvents.ITEM_BOTTLE_FILL, 1.0F, 1.0F);
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
