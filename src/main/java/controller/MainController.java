package controller;

import java.util.Arrays;
import java.util.List;

public class MainController implements Controller{
	private PrincipalWindowController principalWindowController;
	private LoginWindowController loginWindowController;
	private UserMenuController userMenuController;
	
	
	@Override
	public void build() {
		principalWindowController = new PrincipalWindowController();
		loginWindowController = new LoginWindowController();
		userMenuController = new UserMenuController();
		
		List<Controller> controllers = 
				Arrays.asList(principalWindowController,loginWindowController,userMenuController);
		
		principalWindowController.setMainController(this);
		loginWindowController.setMainController(this);
		userMenuController.setMainController(this);
		
		
		for (Controller controller : controllers) {
			controller.build();
		}
		
		principalWindowController.showPrincipalWindow();
		
	}
	public PrincipalWindowController getPrincipalWindowController() {
		return principalWindowController;
	}
	public LoginWindowController getLoginWindowController() {
		return loginWindowController;
	}
	public UserMenuController getUserMenuController() {
		return userMenuController;
	}
	
	
	
	
	
	
	
	

}
