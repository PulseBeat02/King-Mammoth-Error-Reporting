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

import com.pulsebeat_02.kingmammoth.errors.windows.logging.ProgramLogging;

import org.apache.commons.io.comparator.LastModifiedFileComparator;

import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ErrorCauseGUI extends ProgramLogging {
	
	public ProgramLogging log = new ProgramLogging();    

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
		
		String errorString = "";
		
		{
			int[] startend = new int[2];
			
			
			
			try { // If there were no crash-reports in the folder, we would need to add a try/catch statement
		
				String crash_report = readFileAsString(FindLatestGenFile().getName()); 
				
				System.out.println(crash_report); 
				
				startend = secscanner(crash_report);
				
				errorString = String.valueOf(crash_report.toCharArray(), startend[0], startend[1]);
				
				if (errorString != null) {
						
					errorString = "Null or Empty. Please contact mod owner.";	
					
				}
				
		
			} catch (FileNotFoundException e) {
				
				logger.warning("No Crash Report Generated."); 
				
			}
			
			// Scan File Starting With Word "Time" --> Letter "A".
			
			// Do this later. Use subset methods to make this class.
		
		}
		
		frmErrorCause = new JFrame();
		frmErrorCause.setTitle("Error Cause");
		frmErrorCause.setBounds(100, 100, 600, 475);
		frmErrorCause.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErrorCause.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 564, 414);
		frmErrorCause.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(String.valueOf(errorString)); // Inputs String into Panel
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

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

	int[] secscanner(String crash_report) {
		
		int Start;
		int End;
		
		Scanner scanner = new Scanner(crash_report);
			
		Start = crash_report.indexOf("Time");
				
		End = crash_report.indexOf("A detailed") - 10;
			
		scanner.close();
				
		return new int[] {Start, End};
		
	}
	
}
	
	
	
	
	
	
	
	
	

