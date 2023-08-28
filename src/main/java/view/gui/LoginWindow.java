package view.gui;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import antlr.debug.NewLineEvent;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class LoginWindow extends JPanel {
	private JTextField txtUsernameInput;
	private JPasswordField txtPassword;
	private final String fontUrlString = "src/main/resources/fonts/ROBOTOCONDENSED-BOLD.ttf";

	/**
	 * Create the panel.
	 */
	public LoginWindow() {
		setLayout(null);
		
		JPanel principalLogInPanel = new JPanel();
		principalLogInPanel.setBounds(0, 0, 759, 442);
		add(principalLogInPanel);
		principalLogInPanel.setLayout(null);
		
		JPanel loginLeftPanel = new JPanel();
		loginLeftPanel.setBackground(new Color(81, 66, 95));
		loginLeftPanel.setBounds(0, 0, 467, 442);
		principalLogInPanel.add(loginLeftPanel);
		loginLeftPanel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOG IN");
		lblLogin.setForeground(new Color(244, 248, 233));
		lblLogin.setFont(ProyectFont.createFont(fontUrlString,32));
		lblLogin.setBounds(48, 81, 214, 25);
		loginLeftPanel.add(lblLogin);
		
		JLabel lblUserName = new JLabel("USERNAME");
		lblUserName.setForeground(new Color(28, 12, 33));
		lblUserName.setFont(ProyectFont.createFont(fontUrlString,20));
		lblUserName.setBounds(48, 147, 111, 25);
		loginLeftPanel.add(lblUserName);
		
		txtUsernameInput = new JTextField();
		txtUsernameInput.setBackground(new Color(81, 66, 95));
		txtUsernameInput.setForeground(new Color(219, 219, 219));
		txtUsernameInput.setFont(ProyectFont.createFont(fontUrlString,13));
		txtUsernameInput.setText("Enter your username");
		txtUsernameInput.setBounds(48, 183, 306, 25);
		loginLeftPanel.add(txtUsernameInput);
		txtUsernameInput.setColumns(10);
		txtUsernameInput.setBorder(null);
		txtUsernameInput.setForeground(SystemColor.activeCaptionBorder);
		txtUsernameInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtUsernameInput.getText().equals("Enter your username")) {
					txtUsernameInput.setText("");
					txtUsernameInput.setForeground(new Color(244, 248, 233));
			    }if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
			    	txtPassword.setText("********");
			    	txtPassword.setForeground(Color.gray);
		        }

			}
		});
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(81, 66, 95));
		separator.setBounds(48, 208, 306, 2);
		loginLeftPanel.add(separator);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(28, 12, 33));
		lblPassword.setFont(ProyectFont.createFont(fontUrlString,20));
		lblPassword.setBounds(48, 245, 111, 25);
		loginLeftPanel.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("********");
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (String.valueOf(txtPassword.getPassword()).equals("********")) {
					txtPassword.setText("");
					txtPassword.setForeground(new Color(244, 248, 233));
		        }
		        if (txtUsernameInput.getText().isEmpty()) {
		        	txtUsernameInput.setText("Enter your username");
		        	txtUsernameInput.setForeground(Color.gray);
		        }
			}
		});
		
		txtPassword.setForeground(SystemColor.activeCaptionBorder);
		txtPassword.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtPassword.setBackground(new Color(81, 66, 95));
		txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtPassword.setBounds(48, 276, 324, 32);
		loginLeftPanel.add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(81, 66, 95));
		separator_1.setBounds(48, 308, 306, 2);
		loginLeftPanel.add(separator_1);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBackground(new Color(244, 248, 233));
		btnNewButton.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(46, 20, 55));
		btnNewButton.setBounds(265, 368, 89, 23);
		loginLeftPanel.add(btnNewButton);
		
		JPanel rigthLoginPanel = new JPanel();
		rigthLoginPanel.setBackground(new Color(202, 209, 195));
		rigthLoginPanel.setBounds(467, 0, 292, 442);
		principalLogInPanel.add(rigthLoginPanel);
		rigthLoginPanel.setLayout(null);
		
		JLabel lblHotelIcon = new JLabel("   ");
		lblHotelIcon.setBounds(45, 87, 206, 262);
		rigthLoginPanel.add(lblHotelIcon);
		lblHotelIcon.setIcon(new ImagePanel().paintComponent(lblHotelIcon, "/icons/hotel.png"));

	}
}
