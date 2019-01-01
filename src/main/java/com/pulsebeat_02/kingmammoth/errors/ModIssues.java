package com.pulsebeat_02.kingmammoth.errors;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.pulsebeat_02.kingmammoth.errors.windows.CrashErrorMain;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.DuplicateMods;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MissingMods;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MultipleMods;

import net.minecraftforge.fml.common.DuplicateModsFoundException;
import net.minecraftforge.fml.common.EnhancedRuntimeException;
import net.minecraftforge.fml.common.LoaderExceptionModCrash;
import net.minecraftforge.fml.common.MissingModsException;
import net.minecraftforge.fml.common.MultipleModsErrored;
import net.minecraftforge.gradle.GradleStartCommon;

// Global Variables



public class ModIssues {
	
		{
	
			try {
				
				String launch [] = {"launch"};
		
				GradleStartCommon.main("launch");
				
				PlaySound();
				
			}

		
			catch (DuplicateModsFoundException VariableDeclaratorId) {
			
					String dummy [] = {"dummy"};
			
					DuplicateMods.main(dummy);
					
				}
		
			catch (MultipleModsErrored VariableDeclaratorId) {
			
					String dummy [] = {"dummy"};
			
					MultipleMods.main(dummy);
			
				}
		
			catch (LoaderExceptionModCrash VariableDeclaratorId) {
			
					String dummy [] = {"dummy"};
			
					CrashErrorMain.main(dummy);
			
				}
			
			catch (EnhancedRuntimeException VariableDeclaratorId) {
			
					String dummy [] = {"dummy"};
				
					CrashErrorMain.main(dummy); // Catches any other errors
				
				}

			}

		static void PlaySound() {
			
			{
				
				try {
					
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(Sound));
						clip.start();
						
						Thread.sleep(clip.getMicrosecondLength()/1000);
						
				} catch (Exception e) {	}
				
			}
								
		}
			
	}