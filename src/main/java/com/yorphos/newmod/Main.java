package com.yorphos.newmod;

import com.yorphos.newmod.init.*;
import com.yorphos.newmod.proxy.CommonProxy;
import com.yorphos.newmod.util.Ref;

import com.yorphos.newmod.util.handlers.RenderHandler;
import com.yorphos.newmod.world.ModWorldGen;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACCEPTED_VERSIONS)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.COMMON_PROXY)
    public static CommonProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Ref.MOD_ID);

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Starting Pre-initialization...");
        ModTabs.init();
        ModItems.init();
        ModBlocks.init();
        ModEntities.init();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        LOGGER.info("Starting Initialization...");
        ModSmeltingRecipes.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("Starting Post-initialization...");
    }

}
