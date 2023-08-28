package controller;

import view.gui.UserMenu;

public class UserMenuController implements Controller{
	
	private UserMenu userMenu;
	private MainController mainController;

	
	@Override
	public void build() {
		userMenu = new UserMenu();
		userMenu.setUserMenuController(this);
		this.setUserMenu(userMenu);
		
	}
	
	public UserMenu getUserMenu() {
		return userMenu;
	}

	public void setUserMenu(UserMenu userMenu) {
		this.userMenu = userMenu;
	}

	public MainController getMainController() {
		return mainController;
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	


}
