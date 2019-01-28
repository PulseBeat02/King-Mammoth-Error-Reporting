package com.pulsebeat_02.kingmammoth.errors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pulsebeat_02.kingmammoth.errors.windows.CrashErrorMain;
import com.pulsebeat_02.kingmammoth.errors.windows.crash.VersionCrash;
import com.pulsebeat_02.kingmammoth.errors.windows.logging.ProgramLogging;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MissingMods;
import com.pulsebeat_02.kingmammoth.errors.ModIssues;

import net.minecraftforge.fml.common.LoaderException;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.WrongMinecraftVersionException;
import net.minecraftforge.gradle.GradleStartCommon;

public class ModpackCrash extends ProgramLogging {
	
	public ModIssues myMI = new ModIssues();
		
		public ProgramLogging log = new ProgramLogging();  
	
		{
		
		try {
			
			// GradleStartCommon.main(args);
			
		}
		
		catch (WrongMinecraftVersionException VariableDeclaratorId) {
			
			VersionCrash.main(null); // Catches Error Statements
			
			myMI.PlaySound();
			
			logger.warning("The following mods have the wrong Minecraft Versions:" + mod.getModId);
			logger.warning("Location: " + mod.getSource().toString());
			logger.warning("Expected: " + mod.acceptableMinecraftVersionRange().toString());
			logger.warning("Current: " + mcVersion);
			
			}

		catch (LoaderException VariableDeclaratorId) {
		
			String dummy [] = {"dummy"};

			CrashErrorMain.main(dummy); 
			
			myMI.PlaySound();
		
			}

		}
		
	}
