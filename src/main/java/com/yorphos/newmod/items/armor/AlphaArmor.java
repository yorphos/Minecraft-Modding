package com.yorphos.newmod.items.armor;

import com.yorphos.newmod.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;

public class AlphaArmor extends OmegaArmor {

    public AlphaArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn);

        ModItems.ITEMS.add(this);
    }

}
