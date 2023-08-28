package controller;

import view.gui.LoginWindow;
import view.gui.PrincipalWindow;

public class PrincipalWindowController implements Controller{
	
	private PrincipalWindow principalWindow;
	private MainController mainController;

	@Override
	public void build() {
		principalWindow = new PrincipalWindow();
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

	public MainController getMainController() {
		return mainController;
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	
	
	

}
