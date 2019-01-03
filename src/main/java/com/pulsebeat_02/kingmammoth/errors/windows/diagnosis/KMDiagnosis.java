package com.pulsebeat_02.kingmammoth.errors.windows.diagnosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class KMDiagnosis {

	private JFrame frmDiagnosis;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					KMDiagnosis window = new KMDiagnosis();
					window.frmDiagnosis.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}

	/**
	 * Create the application.
	 */
	
	public KMDiagnosis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmDiagnosis = new JFrame();
		frmDiagnosis.setTitle("Diagnosis");
		frmDiagnosis.setBounds(100, 100, 450, 340);
		frmDiagnosis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiagnosis.getContentPane().setLayout(null);
		
		JLabel lblWouldYouLike = new JLabel("Would you like to send the crash report and log report to us?");
		lblWouldYouLike.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWouldYouLike.setHorizontalAlignment(SwingConstants.CENTER);
		lblWouldYouLike.setBounds(10, 11, 414, 23);
		frmDiagnosis.getContentPane().add(lblWouldYouLike);
		
		JLabel lblWeCanFind = new JLabel("We can find your issue and email you.");
		lblWeCanFind.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeCanFind.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWeCanFind.setBounds(10, 39, 414, 23);
		frmDiagnosis.getContentPane().add(lblWeCanFind);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.LIGHT_GRAY);
		txtEmail.setText("Example: example@example.com");
		txtEmail.setBounds(21, 97, 249, 20);
		frmDiagnosis.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		String email = txtEmail.getText();
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 72, 46, 14);
		frmDiagnosis.getContentPane().add(lblEmail);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(10, 255, 114, 35);
		frmDiagnosis.getContentPane().add(btnSubmit);
		
		JButton btnNoThanks = new JButton("No Thanks!");
		btnNoThanks.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			}
			
		});
		
		btnNoThanks.setBounds(310, 255, 114, 35);
		frmDiagnosis.getContentPane().add(btnNoThanks);
		
		if (btnNoThanks.getModel().isPressed()) {
			
			System.exit(0);
			
		}
		
		JLabel lblweWillReply = new JLabel("(We will reply by emailing you your issue. You can also post an issue on discord.)");
		lblweWillReply.setBounds(21, 128, 391, 14);
		frmDiagnosis.getContentPane().add(lblweWillReply);
		
		JLabel lblAttachTheCrash = new JLabel("Attach the crash report and log here:");
		lblAttachTheCrash.setBounds(20, 158, 385, 14);
		frmDiagnosis.getContentPane().add(lblAttachTheCrash);
		
		JButton btnFileExplorer = new JButton("File Explorer");
		btnFileExplorer.setBounds(30, 183, 145, 23);
		frmDiagnosis.getContentPane().add(btnFileExplorer);
		
		if (btnFileExplorer.getModel().isPressed()) {
		
			Desktop d = null;
		
			File file = new File(System.getenv("programfiles"));
		
			if (Desktop.isDesktopSupported()) {
			
				d = Desktop.getDesktop();
			
			}
		
			try {
			
				d.open(file);
			
			} catch (IOException e) {}
		
		}
				
	}
	
}
