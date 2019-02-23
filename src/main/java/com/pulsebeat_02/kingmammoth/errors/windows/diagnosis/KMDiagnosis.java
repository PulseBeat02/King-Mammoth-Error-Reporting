package com.pulsebeat_02.kingmammoth.errors.windows.diagnosis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import akka.io.Tcp.Message;
import net.minecraft.util.Session;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Properties;
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
	 * @throws IOException 
	 */
	
	public KMDiagnosis() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	
	private void initialize() throws IOException {
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

		/*
		
		 final String username = "your.mail.id@gmail.com";
		 final String password = "your.password";

		    Properties props = new Properties();
		    props.put("mail.smtp.auth", true);
		    props.put("mail.smtp.starttls.enable", true);
		    props.put("mail.smtp.host", "smtp.gmail.com");
		    props.put("mail.smtp.port", "587");

		    javax.mail.Session session = Session.getInstance(props,
		            new javax.mail.Authenticator() {
		                protected PasswordAuthentication getPasswordAuthentication() {
		                    return new PasswordAuthentication(username, password);
		                }
		            });

		    try {

		        Message message = (Message) new MimeMessage(session);
		        ((MimeMessage) message).setFrom(new InternetAddress("from.mail.id@gmail.com"));
		        message.setRecipients(Message.RecipientType.TO,
		                InternetAddress.parse("to.mail.id@gmail.com"));
		        ((MimeMessage) message).setSubject("Testing Subject");
		        ((JLabel) message).setText("PFA");

		        MimeBodyPart messageBodyPart = new MimeBodyPart();

		        Multipart multipart = new MimeMultipart();

		        messageBodyPart = new MimeBodyPart();
		        String file = "path of file to be attached";
		        String fileName = "attachmentName";
		        DataSource source = new FileDataSource(file);
		        messageBodyPart.setDataHandler(new DataHandler(source));
		        messageBodyPart.setFileName(fileName);
		        multipart.addBodyPart(messageBodyPart);

		        ((MimeBodyPart) message).setContent(multipart);

		        System.out.println("Sending");

		        Transport.send((javax.mail.Message) message);

		        System.out.println("Done");

		    } catch (MessagingException e) {
		        e.printStackTrace();
		    }
		
		*/
		
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
		btnFileExplorer.setBounds(21, 189, 145, 23);
		frmDiagnosis.getContentPane().add(btnFileExplorer);
		
		JButton btnOurWebsite = new JButton("Our Website:");
		btnOurWebsite.setBounds(164, 255, 114, 35);
		frmDiagnosis.getContentPane().add(btnOurWebsite);
		
		if (btnOurWebsite.getModel().isPressed()) {
			
			String url = "https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/mod-packs/2923746-king-mammoth-worlds-largest-500-crazy-modded";			
			File htmlFile = new File(url);
			Desktop.getDesktop().browse(htmlFile.toURI());
			
		}
		
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
