package com.pulsebeat_02.kingmammoth.items;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.init.ModItems;
import com.pulsebeat_02.kingmammoth.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		King_Mammoth.proxy.registerItemRenderer(this, 0, "inventory");
		
		
	}

}
