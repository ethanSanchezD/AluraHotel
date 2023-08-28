package view.gui;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.UserMenuController;

import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserMenu extends JPanel {

	private JPanel principalUserMenuPanel;
	private UserMenuController userMenuController;


	/**
	 * Create the panel.
	 */
	public UserMenu() {
		setLayout(null);
		
		principalUserMenuPanel = new JPanel();
		principalUserMenuPanel.setBounds(0, 0, 759, 442);
		add(principalUserMenuPanel);
		principalUserMenuPanel.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(148, 142, 153));
		leftPanel.setBounds(0, 0, 230, 442);
		principalUserMenuPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblLogo = new JLabel(" ");
		lblLogo.setBounds(42, 39, 136, 139);
		leftPanel.add(lblLogo);
		lblLogo.setIcon(new ImagePanel().paintComponent(lblLogo, "/icons/aH-150px.png"));
		
		
		
		
		JLabel lblBookingSystem = new JLabel("  Booking System");
		lblBookingSystem.setForeground(new Color(46, 20, 55));
		lblBookingSystem.setFont(new Font("Roboto Condensed", Font.BOLD, 17));
		lblBookingSystem.setBounds(22, 11, 208, 32);
		
		lblBookingSystem.setIcon(new ImageIcon(UserMenu.class.getResource("/icons/calendario-reloj.png")));
		
		JPanel btnBookingSystem = new JPanel();
		btnBookingSystem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBookingSystem.setBackground(new Color(117, 96, 138));
				lblBookingSystem.setForeground(new Color(244, 248, 233));
				btnBookingSystem.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBookingSystem.setBackground(new Color(148, 142, 153));
				lblBookingSystem.setForeground(new Color(46, 20, 55));
			}
		});
		btnBookingSystem.setBackground(new Color(148, 142, 153));
		btnBookingSystem.setBounds(0, 207, 230, 54);
		leftPanel.add(btnBookingSystem);
		btnBookingSystem.setLayout(null);
		btnBookingSystem.add(lblBookingSystem);
		
		
		
		JLabel lblSearchBookings = new JLabel("    Booking Search");
		lblSearchBookings.setForeground(new Color(46, 20, 55));
		lblSearchBookings.setFont(new Font("Roboto Condensed", Font.BOLD, 17));
		lblSearchBookings.setBounds(22, 11, 208, 32);
		
		lblSearchBookings.setIcon(new ImageIcon(UserMenu.class.getResource("/icons/busqueda.png")));
		
		JPanel btnSearchBookings = new JPanel();
		btnSearchBookings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSearchBookings.setBackground(new Color(117, 96, 138));
				lblSearchBookings.setForeground(new Color(244, 248, 233));
				btnSearchBookings.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSearchBookings.setBackground(new Color(148, 142, 153));
				lblSearchBookings.setForeground(new Color(46, 20, 55));
			}
		});
		btnSearchBookings.setLayout(null);
		btnSearchBookings.setBackground(new Color(148, 142, 153));
		btnSearchBookings.setBounds(0, 261, 230, 54);
		leftPanel.add(btnSearchBookings);
		btnSearchBookings.add(lblSearchBookings);
		
		JPanel RigthPanel = new JPanel();
		RigthPanel.setBackground(new Color(81, 66, 95));
		RigthPanel.setBounds(230, 0, 529, 442);
		principalUserMenuPanel.add(RigthPanel);
		RigthPanel.setLayout(null);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBackground(new Color(46, 20, 55));
		TitlePanel.setBounds(0, 57, 529, 76);
		RigthPanel.add(TitlePanel);
		TitlePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALURA HOTEL BOOKING SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(231, 238, 208));
		lblNewLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
		lblNewLabel.setBounds(34, 22, 462, 31);
		TitlePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setForeground(new Color(244, 248, 233));
		lblNewLabel_1.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		lblNewLabel_1.setBounds(33, 164, 127, 29);
		RigthPanel.add(lblNewLabel_1);
		
		String descriptionText = 
				"<html><body>This is the Alura Hotel booking system. In here, you can control and adminestrate the bookings and hosts in the hotel, in the easiest and simple way. </body></html>"; 
		JLabel lblNewLabel_2 = new JLabel(descriptionText);
		lblNewLabel_2.setForeground(new Color(244, 248, 233));
		lblNewLabel_2.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(33, 204, 470, 63);
		RigthPanel.add(lblNewLabel_2);
		
		String descriptionTextTwo = 
				"<html><body>With this tools, you are able to do: <br>   * Bookings registration <br>   * Existing bookings and hosts edition <br>   * Delete all kind of record </body></html>"; 
		JLabel lblNewLabel_3 = new JLabel(descriptionTextTwo);
		lblNewLabel_3.setForeground(new Color(244, 248, 233));
		lblNewLabel_3.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(33, 272, 470, 81);
		RigthPanel.add(lblNewLabel_3);

	}

	public JPanel getPrincipalUserMenuPanel() {
		return principalUserMenuPanel;
	}

	public void setPrincipalUserMenuPanel(JPanel principalUserMenuPanel) {
		this.principalUserMenuPanel = principalUserMenuPanel;
	}

	public UserMenuController getUserMenuController() {
		return userMenuController;
	}

	public void setUserMenuController(UserMenuController userMenuController) {
		this.userMenuController = userMenuController;
	}
	
	
}
