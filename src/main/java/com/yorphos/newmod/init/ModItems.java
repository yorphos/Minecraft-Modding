package com.yorphos.newmod.init;

import java.util.ArrayList;
import java.util.List;

import com.yorphos.newmod.items.ItemBase;
import com.yorphos.newmod.items.armor.ArmorBase;
import com.yorphos.newmod.items.food.FoodBase;
import com.yorphos.newmod.items.food.FoodEffectBase;
import com.yorphos.newmod.items.tools.*;

import com.yorphos.newmod.util.Ref;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final ToolMaterial MATERIAL_OMEGA = EnumHelper.addToolMaterial("material_omega", 3, 240319, 10.0F, 5.0F, 20);
    public static final ToolMaterial MATERIAL_ALPHA = EnumHelper.addToolMaterial("material_alpha", 3, 100500, 30.0F, 20.0F, 100);
    public static final ArmorMaterial ARMOR_MATERIAL_OMEGA = EnumHelper.addArmorMaterial("armor_material_omega", Ref.MOD_ID + ":omega", 15,
            new int[] {4, 8, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ArmorMaterial ARMOR_MATERIAL_ALPHA = EnumHelper.addArmorMaterial("armor_material_alpha", Ref.MOD_ID + ":alpha", 100,
            new int[] {10, 16, 20, 10}, 100, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    // Items
    public static final Item OMEGA = new ItemBase("omega");
    public static final Item ALPHA = new ItemBase("alpha");

    // Tools
    public static final Item OMEGA_SWORD = new ToolSword("omega_sword", MATERIAL_OMEGA);
    public static final Item OMEGA_SHOVEL = new ToolSpade("omega_shovel", MATERIAL_OMEGA);
    public static final Item OMEGA_AXE = new ToolAxe("omega_axe", MATERIAL_OMEGA);
    public static final Item OMEGA_PICKAXE = new OmegaPickaxe("omega_pickaxe", MATERIAL_OMEGA);
    public static final Item OMEGA_HOE = new ToolHoe("omega_hoe", MATERIAL_OMEGA);

    public static final Item ALPHA_SWORD = new ToolSword("alpha_sword", MATERIAL_ALPHA);
    public static final Item ALPHA_SHOVEL = new ToolSpade("alpha_shovel", MATERIAL_ALPHA);
    public static final Item ALPHA_AXE = new ToolAxe("alpha_axe", MATERIAL_ALPHA);
    public static final Item ALPHA_PICKAXE = new ToolPickaxe("alpha_pickaxe", MATERIAL_ALPHA);
    public static final Item ALPHA_HOE = new ToolHoe("alpha_hoe", MATERIAL_ALPHA);

    // Armor
    public static final Item OMEGA_HELMET = new ArmorBase("omega_helmet", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.HEAD);
    public static final Item OMEGA_CHESTPLATE = new ArmorBase("omega_chestplate", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.CHEST);
    public static final Item OMEGA_LEGGINGS = new ArmorBase("omega_leggings", ARMOR_MATERIAL_OMEGA, 2, EntityEquipmentSlot.LEGS);
    public static final Item OMEGA_BOOTS = new ArmorBase("omega_boots", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.FEET);

    public static final Item ALPHA_HELMET = new ArmorBase("alpha_helmet", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.HEAD);
    public static final Item ALPHA_CHESTPLATE = new ArmorBase("alpha_chestplate", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.CHEST);
    public static final Item ALPHA_LEGGINGS = new ArmorBase("alpha_leggings", ARMOR_MATERIAL_ALPHA, 2, EntityEquipmentSlot.LEGS);
    public static final Item ALPHA_BOOTS = new ArmorBase("alpha_boots", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.FEET);

    // Food
    public static final Item CUPCAKE = new FoodEffectBase("cupcake", 10, 1.0f, true, new PotionEffect(MobEffects.REGENERATION, 99999999, 255, false, true));
}
