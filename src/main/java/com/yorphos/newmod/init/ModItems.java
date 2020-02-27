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
    public static ToolMaterial MATERIAL_OMEGA;
    public static ToolMaterial MATERIAL_ALPHA;
    public static ArmorMaterial ARMOR_MATERIAL_OMEGA;
    public static ArmorMaterial ARMOR_MATERIAL_ALPHA;

    // Items
    public static Item OMEGA;
    public static Item ALPHA;

    // Tools
    public static Item OMEGA_SWORD;
    public static Item OMEGA_SHOVEL;
    public static Item OMEGA_AXE;
    public static Item OMEGA_PICKAXE;
    public static Item OMEGA_HOE;

    public static Item ALPHA_SWORD;
    public static Item ALPHA_SHOVEL;
    public static Item ALPHA_AXE;
    public static Item ALPHA_PICKAXE;
    public static Item ALPHA_HOE;

    // Armor
    public static Item OMEGA_HELMET;
    public static Item OMEGA_CHESTPLATE;
    public static Item OMEGA_LEGGINGS;
    public static Item OMEGA_BOOTS;

    public static Item ALPHA_HELMET;
    public static Item ALPHA_CHESTPLATE;
    public static Item ALPHA_LEGGINGS;
    public static Item ALPHA_BOOTS;

    // Food
    public static Item CUPCAKE;

    public static void init() {
        // Materials
        MATERIAL_OMEGA = EnumHelper.addToolMaterial("material_omega", 3, 240319, 10.0F, 5.0F, 20);
        MATERIAL_ALPHA = EnumHelper.addToolMaterial("material_alpha", 3, 100500, 30.0F, 20.0F, 100);
        ARMOR_MATERIAL_OMEGA = EnumHelper.addArmorMaterial("armor_material_omega", Ref.MOD_ID + ":omega", 15,
                new int[] {4, 8, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
        ARMOR_MATERIAL_ALPHA = EnumHelper.addArmorMaterial("armor_material_alpha", Ref.MOD_ID + ":alpha", 100,
                new int[] {10, 16, 20, 10}, 100, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

        // Items
        OMEGA = new ItemBase("omega");
        ALPHA = new ItemBase("alpha");

        // Tools
        OMEGA_SWORD = new ToolSword("omega_sword", MATERIAL_OMEGA);
        OMEGA_SHOVEL = new ToolSpade("omega_shovel", MATERIAL_OMEGA);
        OMEGA_AXE = new ToolAxe("omega_axe", MATERIAL_OMEGA);
        OMEGA_PICKAXE = new OmegaPickaxe("omega_pickaxe", MATERIAL_OMEGA);
        OMEGA_HOE = new ToolHoe("omega_hoe", MATERIAL_OMEGA);

        ALPHA_SWORD = new ToolSword("alpha_sword", MATERIAL_ALPHA);
        ALPHA_SHOVEL = new ToolSpade("alpha_shovel", MATERIAL_ALPHA);
        ALPHA_AXE = new ToolAxe("alpha_axe", MATERIAL_ALPHA);
        ALPHA_PICKAXE = new ToolPickaxe("alpha_pickaxe", MATERIAL_ALPHA);
        ALPHA_HOE = new ToolHoe("alpha_hoe", MATERIAL_ALPHA);

        // Armor
        OMEGA_HELMET = new ArmorBase("omega_helmet", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.HEAD);
        OMEGA_CHESTPLATE = new ArmorBase("omega_chestplate", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.CHEST);
        OMEGA_LEGGINGS = new ArmorBase("omega_leggings", ARMOR_MATERIAL_OMEGA, 2, EntityEquipmentSlot.LEGS);
        OMEGA_BOOTS = new ArmorBase("omega_boots", ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.FEET);

        ALPHA_HELMET = new ArmorBase("alpha_helmet", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.HEAD);
        ALPHA_CHESTPLATE = new ArmorBase("alpha_chestplate", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.CHEST);
        ALPHA_LEGGINGS = new ArmorBase("alpha_leggings", ARMOR_MATERIAL_ALPHA, 2, EntityEquipmentSlot.LEGS);
        ALPHA_BOOTS = new ArmorBase("alpha_boots", ARMOR_MATERIAL_ALPHA, 1, EntityEquipmentSlot.FEET);

        // Food
        CUPCAKE = new FoodEffectBase("cupcake", 10, 1.0f, true,
                new PotionEffect(MobEffects.REGENERATION, 99999999, 255, false, true));
    }
}
