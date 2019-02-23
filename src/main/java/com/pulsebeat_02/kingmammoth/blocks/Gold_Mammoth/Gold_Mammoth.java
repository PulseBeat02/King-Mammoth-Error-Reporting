package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.names.Names;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Gold_Mammoth extends BlockContainer implements ITileEntityProvider {

    public static final PropertyDirection FACING =
        PropertyDirection.create("facing",
            EnumFacing.Plane.HORIZONTAL);
    private static boolean hasTileEntity;

    public Gold_Mammoth() {

        super(Material.ROCK);

        this.setHardness(5.0f);

        this.setResistance(20.0f);

        this.setSoundType(SoundType.ANVIL);

        this.setUnlocalizedName("King Mammoth");

        setCreativeTab(King_Mammoth.King_Mammoth);

        lightOpacity = 20; // cast a light shadow

        setTickRandomly(false);

        useNeighborBrightness = false;

        blockParticleGravity = 1.0F;

    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer playerEntity, int w, float px, float py, float pz) {
        //the second parameter (0) is the gui ID and is used in the gui handler
        //for it to know which gui window to use - use a different ID for each gui window
        playerEntity.openGui(King_Mammoth.instance, 0, world, x, y, z);
        return false;
    }

    public TileEntity createNewTileEntity(World world) {

        return new TileEntityKingMammoth();

    }

    //	@Override
    //    public void onBlockAdded(World parWorld, BlockPos parBlockPos, IBlockState parIBlockState) 
    //	{
    //        if (!parWorld.isRemote)
    //        {
    //            // Rotate block if the front side is blocked
    //        	
    //            Block blockToNorth = parWorld.getBlockState(parBlockPos.offsetNorth()).getBlock();
    //            
    //            Block blockToSouth = parWorld.getBlockState(parBlockPos.offsetSouth()).getBlock();
    //            
    //            Block blockToWest = parWorld.getBlockState(parBlockPos.offsetWest()).getBlock();
    //            
    //            Block blockToEast = parWorld.getBlockState(parBlockPos.offsetEast()).getBlock();
    //            EnumFacing enumfacing = (EnumFacing)parIBlockState.getValue(FACING);
    //
    //            if (enumfacing == EnumFacing.NORTH && blockToNorth.isFullBlock(parIBlockState) && !blockToSouth.isFullBlock(parIBlockState)) {
    //            	
    //                enumfacing = EnumFacing.SOUTH;
    //                
    //            }
    //            
    //            else if (enumfacing == EnumFacing.SOUTH && blockToSouth.isFullBlock(parIBlockState) && !blockToNorth.isFullBlock(parIBlockState)) {
    //            	
    //                enumfacing = EnumFacing.NORTH;
    //                
    //            }
    //            
    //            else if (enumfacing == EnumFacing.WEST && blockToWest.isFullBlock(parIBlockState) && !blockToEast.isFullBlock(parIBlockState)) {
    //            	
    //                enumfacing = EnumFacing.EAST;
    //                
    //            }
    //            
    //            else if (enumfacing == EnumFacing.EAST && blockToEast.isFullBlock(parIBlockState) && !blockToWest.isFullBlock(parIBlockState)) {
    //            	
    //                enumfacing = EnumFacing.WEST;
    //                
    //            }
    //
    //            parWorld.setBlockState(parBlockPos, parIBlockState
    //                  .withProperty(FACING, enumfacing), 2);
    //        }
    //        
    //    }

    @Override
    public String getUnlocalizedName() {

        return "tile." + King_Mammoth.RESOURCE_PREFIX + Names.King_Mammoth;

    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {

        return EnumBlockRenderType.MODEL;

    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {

        return false;

    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {

        return new TileEntityKingMammoth();

    }

}