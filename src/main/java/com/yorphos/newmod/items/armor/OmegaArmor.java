package com.yorphos.newmod.items.armor;

import com.yorphos.newmod.init.ModItems;
import com.yorphos.newmod.init.ModTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class OmegaArmor extends ArmorBase {

    public OmegaArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(ModTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

}
