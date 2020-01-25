package Pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage {
	
	String userNameBox= "name:username";
	String passwordBox = "name:password";
	String logInButton = "name:login";
	String userNameDisplayed= "xpath://strong[1]";
	String logOutButton = "xpath://a[contains(text(),'Logout')]";
	
	String logInBanner = "xpath://h2[contains(text(),'Login')]";

	
	
public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}


	
public void logIn(String username, String password) {
	
	type(userNameBox,username);
	type(passwordBox,password);
	click(logInButton);
	
	
	
	
}	
	
public void logOut() {	
	click(logOutButton);
}
	

public String getLogInBannerText() {
	
	return getText(logInBanner);
	
}

public String getNameDisplayed() {
	
	
	return getText(userNameDisplayed);
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
