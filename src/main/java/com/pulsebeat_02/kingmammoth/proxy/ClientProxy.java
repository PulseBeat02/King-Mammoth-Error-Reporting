package com.pulsebeat_02.kingmammoth.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item,  meta, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	
	GameRegistry.registerTileEntity(TileEntityKingMammoth.class, "tileKingMammoth");
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKingMammoth.class, new RenderTileEntityKingMammoth());

}
