package com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth;

import java.io.FileNotFoundException;

import org.lwjgl.opengl.GL11;

import com.pulsebeat_02.kingmammoth.King_Mammoth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;

public class RenderTileEntityKingMammoth extends TileEntitySpecialRenderer {
	
	ICustomModelLoader model;
	ResourceLocation objModelLocation;
	ResourceLocation texture;
	
	private static Gold_Mammoth modelBlock = new Gold_Mammoth();
	

	{
		
	try {
		
		texture = new ResourceLocation(King_Mammoth.MOD_ID, "models/KingMammothModel.obj");
	    model = (ICustomModelLoader) ModelLoaderRegistry.getModel(objModelLocation);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
			} catch (Exception e) {

				e.printStackTrace();
		
			}
	
	}
	
    @Override
	public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float partialTicks, int damageCount) {
		
	    this.renderTileEntityEconomyAt(((TileEntityKingMammoth) tileEntity), posX, posY, posZ, partialTicks);
	    
	}

    public void renderTileEntityEconomyAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) throws Exception {

        TileEntityKingMammoth te2 = (TileEntityKingMammoth) te;
        float rotation = te2.rotation + (timeSinceLastTick / 2F);

        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        GL11.glTranslated(posX + 0.5, posY + 0.5, posZ + 0.5);
        GL11.glScalef(1, 1, 1);
        GL11.glPushMatrix();
        GL11.glRotatef(0, 0F, 1F, 0.5F);
        model.loadModel(objModelLocation);
        GL11.glPopMatrix();
        GL11.glPopMatrix();

    }

}












