package com.pulsebeat_02.kingmammoth.errors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pulsebeat_02.kingmammoth.errors.windows.CrashErrorMain;
import com.pulsebeat_02.kingmammoth.errors.windows.crash.VersionCrash;
import com.pulsebeat_02.kingmammoth.errors.windows.mod_errors.MissingMods;

import net.minecraftforge.fml.common.LoaderException;
import net.minecraftforge.fml.common.WrongMinecraftVersionException;
import net.minecraftforge.gradle.GradleStartCommon;

public class ModpackCrash {
	
		{
		
		try {
			
			GradleStartCommon.main(args);
			
		}
		
		catch (WrongMinecraftVersionException VariableDeclaratorId) {
			
			String dummy [] = {"dummy"}; // Passes dummy array because the code in the class being ran doesn't use the inputted String array

			VersionCrash.main(dummy); // Catches Error Statements
			
			}

		catch (LoaderException VariableDeclaratorId) {
		
			String dummy [] = {"dummy"}; // Passes dummy array because the code in the class being ran doesn't use the inputted String array

			CrashErrorMain.main(dummy); // Catches Error Statements
		
			}

		}
		
	}
