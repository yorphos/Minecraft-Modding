package com.yorphos.newmod.util.handlers;

import com.yorphos.newmod.Main;
import com.yorphos.newmod.init.ModBlocks;
import com.yorphos.newmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }

        for (Block block : ModBlocks.BLOCKS) {
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }


        RenderHandler.registerEntityRenderers();
    }

}
