package com.pulsebeat_02.kingmammoth.errors;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.errors.windows.CrashErrorMain;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.DuplicateMods;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MissingMods;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MultipleMods;
import com.pulsebeat_02.kingmammoth.errors.windows.logging.ProgramLogging;

import net.minecraft.client.main.Main;
import net.minecraftforge.fml.common.DuplicateModsFoundException;
import net.minecraftforge.fml.common.EnhancedRuntimeException;
import net.minecraftforge.fml.common.LoaderExceptionModCrash;
import net.minecraftforge.fml.common.MissingModsException;
import net.minecraftforge.fml.common.MultipleModsErrored;

// Global Variables

public class ModIssues extends ProgramLogging {
	
		King_Mammoth main = new King_Mammoth();
	
		String path = "../resources/wav/Windows Error.wav";

		File Error = new File(path);
		  
	
		{
	
			try { 
				
				ScanMainRunning.main(null);
						
			}

		
			catch (DuplicateModsFoundException VariableDeclaratorId) {
			
					DuplicateMods.main(null);
					
					logger.warning("Duplicate Mods Have Been Found. ");
					
					PlaySound();
					
					// logger.info("");
					
				}
		
			catch (MultipleModsErrored VariableDeclaratorId) {
			
					MultipleMods.main(null);
					
					PlaySound();
			
				}
		
			catch (LoaderExceptionModCrash VariableDeclaratorId) {
			
					CrashErrorMain.main(null);
					
					logger.warning("");
					
					PlaySound();
			
				}
			
			catch (EnhancedRuntimeException VariableDeclaratorId) {
				
					CrashErrorMain.main(null); // Catches any other errors
					
					PlaySound();
					
					logger.warning("An error has appeared and the modpack cannot seem to find it. Please look at the forge log to find the issue.");
				
				} 
			
			catch (Exception e) {
					
				e.printStackTrace();
				
			}

		}

		void PlaySound() {
			
			{
				
				try {
					
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(Error));
						clip.start();
						
						Thread.sleep(clip.getMicrosecondLength()/1000);
						
				} catch (Exception e) {	
					
					
					
				}
				
			}
								
		}
    
	}