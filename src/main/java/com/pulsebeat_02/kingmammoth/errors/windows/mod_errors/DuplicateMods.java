package com.pulsebeat_02.kingmammoth.errors.windows.mod_errors;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.SwingConstants;

import com.pulsebeat_02.kingmammoth.errors.ModIssues;
import com.pulsebeat_02.kingmammoth.errors.windows.diagnosis.KMDiagnosis;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateMods extends ModIssues {

	private JFrame frmError;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					DuplicateMods window = new DuplicateMods();
					
					window.frmError.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	
	public DuplicateMods() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	
	private void initialize() throws IOException {
		frmError = new JFrame();
		frmError.setIconImage(Toolkit.getDefaultToolkit().getImage(DuplicateMods.class.getResource("/com/pulsebeat_02/kingmammoth/resources/images/error.png")));
		frmError.setTitle("Error");
		frmError.setBounds(100, 100, 450, 300);
		frmError.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmError.getContentPane().setLayout(null);
		
		JLabel lblUhOhLooks = new JLabel("Uh Oh, looks like an error has appeared.");
		lblUhOhLooks.setBounds(0, 11, 434, 25);
		lblUhOhLooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUhOhLooks.setHorizontalAlignment(SwingConstants.CENTER);
		frmError.getContentPane().add(lblUhOhLooks);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 114, 46, 14);
		frmError.getContentPane().add(label);
		
		JLabel lblClickabortIf = new JLabel("Click \"Abort\" if you would like to close King Mammoth. ");
		lblClickabortIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickabortIf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClickabortIf.setBounds(0, 101, 434, 14);
		frmError.getContentPane().add(lblClickabortIf);
		
		JLabel lblClickignoreIf = new JLabel("Click \"Ignore\" if you would like to ignore this error message. ");
		lblClickignoreIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickignoreIf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClickignoreIf.setBounds(-14, 114, 448, 14);
		frmError.getContentPane().add(lblClickignoreIf);
		
		JLabel lblthisMayLead = new JLabel("(This may lead to King Mammoth crashing and having a lot of bugs. ");
		lblthisMayLead.setHorizontalAlignment(SwingConstants.CENTER);
		lblthisMayLead.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblthisMayLead.setBounds(0, 149, 448, 14);
		frmError.getContentPane().add(lblthisMayLead);
		
		JLabel lblNewLabel = new JLabel("Crash Report and Log Report reading is recommended. )");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 164, 424, 14);
		frmError.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Abort");
		btnNewButton.setBounds(20, 208, 146, 35);
		frmError.getContentPane().add(btnNewButton);
		
		if (btnNewButton.getModel().isPressed()) {
			 
			 System.exit(0);
		        
		 }
		
		JButton btnIgnore = new JButton("Ignore");
		btnIgnore.setBounds(267, 208, 146, 35);
		frmError.getContentPane().add(btnIgnore);
		
		if (btnNewButton.getModel().isPressed()) {
			
			 if (Desktop.isDesktopSupported()) {
				 
				 String path = "../../../resources/batch_files/close_process.bat";
				 Runtime rn = Runtime.getRuntime();
				 Process pr = rn.exec(path);
			 
			 }
			 
			 else {
					
				 	ProcessBuilder pb = new ProcessBuilder("../../../resources/sh_files/close_process.sh", "myArg1", "myArg2");
				 	Process p = pb.start();
				 	BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				 	String line = null;
				 	
				 	while ((line = reader.readLine()) != null) {
						 
					    System.out.println(line);
					    
					 	}
					
					}
		        
		 		}
		
		JLabel lblDuplicateModsWere = new JLabel("There were mods that were bugged and did not run.");
		lblDuplicateModsWere.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuplicateModsWere.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDuplicateModsWere.setBounds(0, 47, 434, 14);
		frmError.getContentPane().add(lblDuplicateModsWere);
		
		JLabel lblPleaseReferTo = new JLabel("Please refer to the log for more information.");
		lblPleaseReferTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseReferTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseReferTo.setBounds(0, 61, 434, 29);
		frmError.getContentPane().add(lblPleaseReferTo);
		
		String dummy [] = {"dummy"};
		
		KMDiagnosis.main(dummy);
		
	}
	
}
