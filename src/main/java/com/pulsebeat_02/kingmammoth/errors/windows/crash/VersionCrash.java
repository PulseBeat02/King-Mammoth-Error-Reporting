package com.pulsebeat_02.kingmammoth.errors.windows.crash;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.pulsebeat_02.kingmammoth.errors.ModIssues;

public class VersionCrash extends ModIssues {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersionCrash window = new VersionCrash();
					window.frame.setVisible(true);
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
	public VersionCrash() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUhOhLooks = new JLabel("Uh Oh, looks like an error has appeared.");
		lblUhOhLooks.setBounds(0, 11, 434, 25);
		lblUhOhLooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUhOhLooks.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblUhOhLooks);
		
		JLabel lblThisErrorHas = new JLabel("Mods had different versions meant for 1.12.2.");
		lblThisErrorHas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThisErrorHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisErrorHas.setBounds(0, 47, 434, 14);
		frame.getContentPane().add(lblThisErrorHas);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblClickabortIf = new JLabel("Click \"Abort\" if you would like to close King Mammoth. ");
		lblClickabortIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickabortIf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClickabortIf.setBounds(0, 101, 434, 14);
		frame.getContentPane().add(lblClickabortIf);
		
		JLabel lblClickignoreIf = new JLabel("Click \"Ignore\" if you would like to ignore this error message. ");
		lblClickignoreIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickignoreIf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClickignoreIf.setBounds(-14, 114, 448, 14);
		frame.getContentPane().add(lblClickignoreIf);
		
		JLabel lblthisMayLead = new JLabel("(This may lead to King Mammoth crashing and having a lot of bugs. ");
		lblthisMayLead.setHorizontalAlignment(SwingConstants.CENTER);
		lblthisMayLead.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblthisMayLead.setBounds(0, 149, 448, 14);
		frame.getContentPane().add(lblthisMayLead);
		
		JLabel lblNewLabel = new JLabel("Crash Report and Log Report reading is recommended. )");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 164, 424, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Abort");
		btnNewButton.setBounds(20, 208, 146, 35);
		frame.getContentPane().add(btnNewButton);
		
		if (btnNewButton.getModel().isPressed()) {
			 
			 System.exit(0);
		        
		 }
		
		JButton btnIgnore = new JButton("Ignore");
		btnIgnore.setBounds(267, 208, 146, 35);
		frame.getContentPane().add(btnIgnore);
		
		if (btnNewButton.getModel().isPressed()) {
			 
			 String path = "../../../resources/batch_files/close_process.bat";
			 Runtime rn = Runtime.getRuntime();
			 Process pr = rn.exec(path);
		        
		 }
		
		JLabel lblReferToThe = new JLabel("Refer to the log for more info.");
		lblReferToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblReferToThe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReferToThe.setBounds(0, 59, 434, 31);
		frame.getContentPane().add(lblReferToThe);
		
	}

}
