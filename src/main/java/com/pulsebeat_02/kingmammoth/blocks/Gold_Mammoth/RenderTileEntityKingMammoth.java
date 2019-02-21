package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import org.lwjgl.opengl.GL11;

import com.pulsebeat_02.kingmammoth.utils.Reference;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;

public class RenderTileEntityKingMammoth {
	
	ResourceLocation texture;
	ResourceLocation objModelLocation;
	ICustomModelLoader model; {
	
    texture = new ResourceLocation(Reference.MOD_ID, "models/KingMammothTexture.png");
    objModelLocation = new ResourceLocation(Reference.MOD_ID, "models/KingMammothModel.obj");
    model = (ICustomModelLoader) ModelLoaderRegistry.getModel(objModelLocation);
    
    @Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
    	
    	TileEntityKingMammoth te2 = (TileEntityKingMammoth) te;
    	float rotation = te2.rotation + (timeSinceLastTick / 2F);
    	
    }
    
    bindTexture(texture);

    GL11.glPushMatrix();
    GL11.glTranslated(posX + 0.5, posY + 0.5, posZ + 0.5);
    GL11.glScalef(1, 1, 1);
    GL11.glPushMatrix();
    GL11.glRotatef(0, 0F, 1F, 0.5F);
    model.renderAll();
    GL11.glPopMatrix();
    GL11.glPopMatrix();
    
    

	}
	
}