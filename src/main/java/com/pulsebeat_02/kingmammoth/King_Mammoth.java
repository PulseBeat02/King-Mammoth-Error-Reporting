package com.pulsebeat_02.kingmammoth;

import com.pulsebeat_02.kingmammoth.errors.ModIssues;
import com.pulsebeat_02.kingmammoth.init.ModItems;
import com.pulsebeat_02.kingmammoth.proxy.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = King_Mammoth.MOD_ID, name = King_Mammoth.NAME, version = King_Mammoth.VERSION, acceptedMinecraftVersions = King_Mammoth.ACCEPTED_VERSIONS)

public class King_Mammoth {

    public static final String MOD_ID = "pkm";
    public static final String NAME = "King Mammoth";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String RESOURCE_PREFIX = "pkm:";

    public static final String CLIENT_PROXY_CLASS = "com.pulsebeat_02.King_Mammoth.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.pulsebeat_02.King_Mammoth.proxy.ServerProxy";

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static King_Mammoth instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);



    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }

    public static CreativeTabs King_Mammoth = new CreativeTabs("King_Mammoth") {

        @Override
        public ItemStack getTabIconItem() {

            return new ItemStack(ModItems.King_Mammoth);

        }

    };

}