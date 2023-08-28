package view.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.PrincipalWindowController;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.awt.Window;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;

import javax.swing.JSeparator;

public class PrincipalWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private PrincipalWindowController principalWindowController;

	private static JPanel contentPane;

	private static JPanel principalPanel;

	private JPanel leftPanel;

	private JLabel lblWelcome;

	private JLabel lblWelcomeIcon;

	private JPanel footer;

	private JLabel lblfooter;

	private JPanel rigthPanel;

	private JLabel lblHotelLogo;

	private JLabel lblSignInIcon;

	private JLabel lblSignUpIcon;

	private JLabel lblLogin;

	private JLabel lblSignUp;
	
	/**
	 * Create the frame.
	 */
	public PrincipalWindow() {
		
		setTitle("Principal Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	
		        if (JOptionPane.showConfirmDialog(contentPane, 
		            "Are you sure you want to exit?", "Close Window?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }else {
		        	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		        }
		        
		    }
		});
		
		principalPanel = new JPanel();
		principalPanel.setBounds(0, 0, 759, 442);
		contentPane.add(principalPanel);
		principalPanel.setLayout(null);
		
		leftPanel = new JPanel();
		leftPanel.setBackground(new Color(148, 142, 153));
		leftPanel.setBounds(0, 0, 511, 399);
		principalPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		lblWelcome = new JLabel("WELCOME!");
		lblWelcome.setForeground(new Color(244, 248, 233));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(ProyectFont.createFont("src/main/resources/fonts/ROBOTOCONDENSED-BOLD.ttf",35));
		lblWelcome.setBounds(164, 58, 203, 36);
		leftPanel.add(lblWelcome);
		
		lblWelcomeIcon = new JLabel("   ");
		lblWelcomeIcon.setBounds(139, 105, 256, 256);
		leftPanel.add(lblWelcomeIcon);
		lblWelcomeIcon.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/icons/recepcion.png")));
		
		footer = new JPanel();
		footer.setBackground(new Color(46, 20, 55));
		footer.setBounds(0, 399, 759, 43);
		principalPanel.add(footer);
		footer.setLayout(new BorderLayout(0, 0));
		
		lblfooter = new JLabel("Desarrollado por Ethan Sanchez © 2023");
		lblfooter.setForeground(new Color(244, 248, 233));
		lblfooter.setBackground(new Color(244, 248, 233));
		lblfooter.setFont(ProyectFont.createFont("src/main/resources/fonts/ROBOTOCONDENSED-BOLD.ttf",12));
		lblfooter.setHorizontalAlignment(SwingConstants.CENTER);
		footer.add(lblfooter, BorderLayout.CENTER);
		
		rigthPanel = new JPanel();
		rigthPanel.setBackground(new Color(108, 91, 123));
		rigthPanel.setBounds(509, 0, 250, 399);
		principalPanel.add(rigthPanel);
		rigthPanel.setLayout(null);
		
		lblHotelLogo = new JLabel("  ");
		lblHotelLogo.setBounds(76, 47, 100, 100);
		rigthPanel.add(lblHotelLogo);
		lblHotelLogo.setIcon(new ImagePanel().paintComponent(lblHotelLogo, "/icons/Ha-100px.png"));
		
		lblSignInIcon = new JLabel("  ");
		lblSignInIcon.setBounds(76, 187, 35, 57);
		rigthPanel.add(lblSignInIcon);
		lblSignInIcon.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/icons/iniciar-sesion.png")));
		
		lblSignUpIcon = new JLabel("  ");
		lblSignUpIcon.setBounds(76, 274, 24, 24);
		rigthPanel.add(lblSignUpIcon);
		lblSignUpIcon.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/icons/agregar-usuario.png")));
		
		lblLogin = new JLabel("Login");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePrincipalPanel(principalWindowController.getMainController().getLoginWindowController().getLoginWindow());
				setTitle("Login");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setUnderline(lblLogin, true);
				lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setUnderline(lblLogin, false);
			}
		});
		lblLogin.setForeground(new Color(244, 248, 233));
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setFont(ProyectFont.createFont("src/main/resources/fonts/ROBOTOCONDENSED-BOLD.ttf",16));
		lblLogin.setBounds(121, 201, 100, 24);
		rigthPanel.add(lblLogin);
		
		lblSignUp = new JLabel("Sign up");
		lblSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setUnderline(lblSignUp, true);
				lblSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setUnderline(lblSignUp, false);
			}
		});
		lblSignUp.setForeground(new Color(244, 248, 233));
		lblSignUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignUp.setFont(ProyectFont.createFont("src/main/resources/fonts/ROBOTOCONDENSED-BOLD.ttf",16));
		lblSignUp.setBounds(121, 272, 100, 24);
		rigthPanel.add(lblSignUp);
		
		
	}
	
	/**
	 * Underlines a JLabel text depending if it is called with a 'true' parameter
	 * 
	 * @param labelAsButton The JLabel that is going to be underlined
	 * @param underlineOnOf true if wants the JLabel text underlined, false if don't
	 *                      want it underlined
	 */
	private void setUnderline(JLabel labelAsButton, Boolean underlineOnOf) {
		Font fontUnderlined = labelAsButton.getFont();
		Map attribute = fontUnderlined.getAttributes();
		if (underlineOnOf) {
			attribute.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		} else {
			attribute.put(TextAttribute.UNDERLINE, -1);
		}

		labelAsButton.setFont(fontUnderlined.deriveFont(attribute));
	}
	
	/**
	 * It change the centerPanel when a converter option is selected
	 * 
	 * @param panel The panel that is going to be replaced in the centerPanel
	 */
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(759, 442);
		panel.setLocation(0, 0);

		contentPane.removeAll();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.revalidate();
		contentPane.repaint();
	}

	public PrincipalWindowController getPrincipalWindowController() {
		return principalWindowController;
	}

	public void setPrincipalWindowController(PrincipalWindowController principalWindowController) {
		this.principalWindowController = principalWindowController;
	}

	public static JPanel getPrincipalPanel() {
		return principalPanel;
	}

	public static void setPrincipalPanel(JPanel principalPanel) {
		PrincipalWindow.principalPanel = principalPanel;
	}
	
	
}
