package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntityKingMammoth {
	
	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
    texture = new ResourceLocation(YourMod.MODID, "models/KingMammothTexture.png");
    objModelLocation = new ResourceLocation(YourMod.MODID, "models/KingMammothModel.obj");
    model = AdvancedModelLoader.loadModel(objModelLocation);
    
    @Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
    	
    	TileEntityKingMammoth te2 = (TileEntityKingMammoth) te;
    	float rotation = te2.rotation + (timeSinceLastTick / 2F);
    	
    }
    
    bindTexture(texture);

    GL11.glPushMatrix();
    GL11.glTranslated(posX + 0.5, posY + 0.5, posZ + 0.5);
    GL11.glScalef(scale, scale, scale);
    GL11.glPushMatrix();
    GL11.glRotatef(rotation, 0F, 1F, 0.5F);
    model.renderAll();
    GL11.glPopMatrix();
    GL11.glPopMatrix();

}
