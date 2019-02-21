package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import com.pulsebeat_02.kingmammoth.utils.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Gold_Mammoth extends BlockContainer{

    public Gold_Mammoth(Material material) {
    	
        super(material);

        this.setBlockName("King Mammoth");
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
    	
        return new TileEntityKingMammoth();
        
    }
    
}
