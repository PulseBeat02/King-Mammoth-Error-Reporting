package com.pulsebeat_02.kingmammoth;

import com.pulsebeat_02.kingmammoth.errors.ModIssues;
import com.pulsebeat_02.kingmammoth.init.ModItems;
import com.pulsebeat_02.kingmammoth.proxy.CommonProxy;
import com.pulsebeat_02.kingmammoth.utils.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class King_Mammoth {
		
	@Instance
	public static King_Mammoth instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS) 
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		
		
	}

}
