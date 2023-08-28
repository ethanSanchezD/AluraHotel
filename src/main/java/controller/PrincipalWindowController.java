package controller;

import view.gui.LoginWindow;
import view.gui.PrincipalWindow;

public class PrincipalWindowController implements Controller{
	
	private PrincipalWindow principalWindow;
	private LoginWindow loginWindow;
	
	

	@Override
	public void build() {
		principalWindow = new PrincipalWindow();
		loginWindow = new LoginWindow();
		
		
		
		principalWindow.setLoginWindow(loginWindow);
		
		
		this.setPrincipalWindow(principalWindow);
		principalWindow.setPrincipalWindowController(this);
		
	}
	
	public void showPrincipalWindow() {
		principalWindow.setVisible(true);
	}
	
	public PrincipalWindow getPrincipalWindow() {
		return principalWindow;
	}

	public void setPrincipalWindow(PrincipalWindow principalWindow) {
		this.principalWindow = principalWindow;
	}
	
	

}
