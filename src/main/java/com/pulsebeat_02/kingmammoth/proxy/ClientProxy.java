package com.pulsebeat_02.kingmammoth.proxy;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.plot.GUIs.GuiHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item,  meta, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	
	GameRegistry.registerTileEntity(TileEntityKingMammoth.class, "tileKingMammoth");
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKingMammoth.class, new RenderTileEntityKingMammoth());
    
    public void init() {
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(King_Mammoth.instance, new GuiHandler());
    	
    }

}
