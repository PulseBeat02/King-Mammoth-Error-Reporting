package com.pulsebeat_02.kingmammoth.errors.windows.errorcause;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import org.apache.commons.io.comparator.LastModifiedFileComparator;

import java.awt.Color;

public class ErrorCauseGUI {

	private JFrame frmErrorCause;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					ErrorCauseGUI window = new ErrorCauseGUI();
					window.frmErrorCause.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	
	public ErrorCauseGUI() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	
	private void initialize() throws Exception {
		
		
		frmErrorCause = new JFrame();
		frmErrorCause.setTitle("Error Cause");
		frmErrorCause.setBounds(100, 100, 450, 300);
		frmErrorCause.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErrorCause.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 414, 239);
		frmErrorCause.getContentPane().add(panel);
		
		{
			
			try { // If there were no crash-reports in the folder, we would need to add a try/catch statement
		
				String crash_report = readFileAsString(FindLatestGenFile().getName()); 
				System.out.println(crash_report); 
				
				
				/*

				int time = crash_report.indexOf("Time:"); // Finds the first "Time:" keyword in crash report
				int A = crash_report.indexOf("detailed"); // Finds the first "detailed" keyword in the crash report
				
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(time, A);
				
				*/

		
			} catch (FileNotFoundException e) {
				
				// Return no crash reports 
				
			}
		
		}
		
		

		// Scan File Starting With Word "Time" --> Letter "A".
	  
	}

	public File FindLatestGenFile() { // Method used to find the latest generate file in a folder
		
		String crash_reportpath = "../../../../crash-reports/";
		File theNewestFile = null;
	    File dir = new File(crash_reportpath);
	    FileFilter fileFilter = new WildcardFileFilter("*." + "txt");
	    File[] files = dir.listFiles(fileFilter);

	    if (files.length > 0) {
	    	
	        /** The newest file comes first **/
	    	
	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
	        
	        theNewestFile = files[0];
	        
	    }

	    return theNewestFile;
		
	}
	
	String readFileAsString (String fileName) throws Exception {
		
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	    
	  	} 
	
	}

