package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;

public class TileEntityKingMammoth extends TileEntity implements ITickable {
	
	/* Rotation */
    public float rotation = 0;
   /* Scale */
   public float scale = 0;

   @Override
   public void tick() {
	   
       /* Increments 0.5  This can be changed */
       if (world.isRemote) rotation += 0.5;
       /* Whatever you want your scale to be */
      if (world.isRemote) scale = (float) 0.5;
      
   }

}
