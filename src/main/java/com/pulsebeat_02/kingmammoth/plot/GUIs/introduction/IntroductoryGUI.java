package com.pulsebeat_02.kingmammoth.plot.GUIs.introduction;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IntroductoryGUI {

    @SideOnly(Side.CLIENT)
    public class BlockGuiWindow extends GuiScreen //extend GuiContainer if you want your gui to have an inventory
    {
        final int xSizeOfTexture = 192, ySizeOfTexture = 135, white = Color.white.getRGB();
        int posX, posY;

        //If you want your gui to change based on TileEntity values, reference the tile entity in the constructor
        //you must pass the tile entity using "return new BlockGuiWindow(world.getBlockTileEntity(x, y, z))" in the GuiHandler
        TileEntity te;
        
        public BlockGuiWindow(TileEntity te) {
            this.te = te;
        }

        public void initGui() {
            this.buttonList.clear();

            posX = (this.width - xSizeOfTexture) / 2;
            posY = (this.height - ySizeOfTexture) / 2;

            this.buttonList.add(new GuiButton(0, posX + 4, posY + 4, 20, 20, "ButtonText"));
            /*Parameters:
             * button id used when checking what to do when a button is pressed
             * The X position of the button
             * The Y position of the button
             * The width
             * The height (keep this at 20 if you can)
             * The text to be displayed on the button*/
        }

        public void actionPerformed(GuiButton button) {
            switch (button.id) {
                case 0:
                    //Do button stuff
                    break;
            }
        }

        @Override
        public void drawScreen(int x, int y, float f) {
            drawDefaultBackground();

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("path/to/the/background/texture"));

            int posX = (this.width - xSizeOfTexture) / 2;
            int posY = (this.height - ySizeOfTexture) / 2;

            drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture); //This draws the background
            //Make sure your background texture is a multiple of 256x256.
            //The xSizeOfTexture and ySizeOfTexture assume that the texture is 256x256. so 128 and 128 always reference half of the texture.
            //Look in the Gui class to see what else you can do here (like rendering textures and strings)
            this.drawString(fontRenderer, "Text", posX + 20, posY + 31, white); //this is where the white variable we set up at the beginning is used
            super.drawScreen(x, y, f);
            /*Here is a trick:
               If you reset the texture after "super.drawScreen(x, y, f);" (this.mc.renderEngine.bindTexture("path/to/the/background/texture"),
               you can draw on top of everything, including buttons.
               Use this to texture buttons, if you don't want them to have text.*/
        }

    }

}