package com.pulsebeat_02.kingmammoth.errors.windows.diagnosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

public class DiagnosisGUI {

	private JFrame frmModpackDiagnosis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiagnosisGUI window = new DiagnosisGUI();
					window.frmModpackDiagnosis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiagnosisGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModpackDiagnosis = new JFrame();
		frmModpackDiagnosis.setTitle("Modpack Diagnosis");
		frmModpackDiagnosis.setBounds(100, 100, 450, 300);
		frmModpackDiagnosis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmModpackDiagnosis.getContentPane().setLayout(null);
		
		JLabel lblWeHaveFound = new JLabel("We have found that the modpack experienced the following");
		lblWeHaveFound.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWeHaveFound.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeHaveFound.setBounds(10, 11, 414, 28);
		frmModpackDiagnosis.getContentPane().add(lblWeHaveFound);
		
		JLabel lblError = new JLabel("error.");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblError.setBounds(10, 29, 414, 28);
		frmModpackDiagnosis.getContentPane().add(lblError);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 68, 414, 93);
		frmModpackDiagnosis.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(gm func_71505_b); // ? 
		panel.add(lblNewLabel);
	}
}
