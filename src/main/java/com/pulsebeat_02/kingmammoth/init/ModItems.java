package com.pulsebeat_02.kingmammoth.init;

import java.util.ArrayList;
import java.util.List;

import com.pulsebeat_02.kingmammoth.items.Item_King_Mammoth;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ModItems {
	
	public static Item_King_Mammoth King_Mammoth;
	
	public static void init() {
		
		//King_Mammoth = new Item_King_Mammoth();
		//King_Mammoth.setRegistryName(new ResourceLocation(King_Mammoth.MOD_ID, Item_Names.King_Mammoth));
		//GameRegistry.register(King_Mammoth);
		
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		ModelResourceLocation model = new ModelResourceLocation("pkm:King_Mammoth", "inventory");
		ModelLoader.registerItemVariants(King_Mammoth, model);
		mesher.register(King_Mammoth, 0, model);
		
	}

}
