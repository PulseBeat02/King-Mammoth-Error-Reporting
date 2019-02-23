package com.pulsebeat_02.kingmammoth.proxy;

import com.pulsebeat_02.kingmammoth.init.ModBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {}

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

       // ModBlocks.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        com.pulsebeat_02.kingmammoth.init.ModItems.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {



    }


}