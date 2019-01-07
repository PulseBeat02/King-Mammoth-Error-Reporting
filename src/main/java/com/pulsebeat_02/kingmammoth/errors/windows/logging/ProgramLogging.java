package com.pulsebeat_02.kingmammoth.errors.windows.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProgramLogging {
	
	String path = "../../../../logs/KM.log"; 
	
	Logger logger = Logger.getLogger("KMLogger"); 
	
    FileHandler fh;
	
	File tmpDir = new File("../../../../logs/KM.log");
	 
	boolean exists = tmpDir.exists();
	
	{
	
	    
	    if (exists == false) {
	    	
	    	try {
	    	
	        fh = new FileHandler(path);  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages
	        
	        logger.warning("KM.log file not found, making log file."); 
	        
	        logger.info("KM.log file generated, proceeding to Pre - Initialization"); 
	        
			} catch (SecurityException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
	        
	        
	    }
	    
	    else {
	    	
	    	logger.info("KM.log file already generated, proceeding to Pre - Initialization"); 
	    	
	    }
	   

	}
	
}
