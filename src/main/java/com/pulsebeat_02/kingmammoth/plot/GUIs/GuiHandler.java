package com.pulsebeat_02.kingmammoth.plot.GUIs;

import java.io.IOException;

import javax.annotation.Resource;
import javax.swing.JFileChooser;

import com.pulsebeat_02.kingmammoth.utils.Reference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

public class GuiHandler extends GuiScreen {
	
	public static final int BLOCK_BREAKER = 0;
	
	private static JFileChooser filechooser = new JFileChooser();
	
	ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/intro");
	
    NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
    Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
    MediaPlayerFactory mpf = new MediaPlayerFactory();
    emp.setEnableMouseInputHandling(false);
    emp.setEnableKeyInputHandling(false);
    
    String file = "";
    
    emp.prepareMedia(file);
    
    
		@Override
		public void drawScreen (int mouseX, int mouseY, float partialTicks) {
			
			super.drawScreen(mouseX, mouseY, partialTicks);
			
		}
		
		@Override
		public void initGui() {
			
			super.initGui();
			
		}
		
		@Override
		protected void actionPerformed(GuiButton button) throws IOException {
			
			super.actionPerformed(button);
			
		}
		
		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			
			super.keyTyped(typedChar, keyCode);
			
		}
		
		@Override
		public boolean doesGuiPauseGame() {
			
			return true;
			
		}

	
	
}
