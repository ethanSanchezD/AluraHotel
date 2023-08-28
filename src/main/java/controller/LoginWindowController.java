package controller;

import view.gui.LoginWindow;

public class LoginWindowController implements Controller{
	
	private LoginWindow loginWindow;
	private MainController mainController;

	

	@Override
	public void build() {
		loginWindow = new LoginWindow();
		this.setLoginWindow(loginWindow);
		loginWindow.setLoginWindowController(this);
		
		
		
	}

	private void setLoginWindow(LoginWindow loginWindow) {
		this.loginWindow = loginWindow;
		
	}
	
	public LoginWindow getLoginWindow() {
		return loginWindow;
	}

	public MainController getMainController() {
		return mainController;
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	

}
