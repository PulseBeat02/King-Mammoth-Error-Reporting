package com.pulsebeat_02.kingmammoth.blocks;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.init.ModBlocks;
import com.pulsebeat_02.kingmammoth.utils.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}

	@Override
	public void registerModels() {
		
		King_Mammoth.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
