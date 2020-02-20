package CucumberSupportCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.MyWishlistPage;

public class PageLoader {

WebDriver driver;
	
public HomePage home;
public MyAccountPage myAccount;
public MyWishlistPage wishlistPage;
	
	
	
public WebDriver getDriver() {
		
		if (driver == null) {
			driver= new FirefoxDriver();
		}
		return driver;
	}

public HomePage getHomePage() {
	
	if (home == null) {
		home= new HomePage(driver);
	}
	return home;
}

public MyAccountPage getMyAccountPage() {
	
	if (myAccount == null) {
		myAccount= new MyAccountPage(driver);
	}
	return myAccount ;
}

public MyWishlistPage getWishlistPage() {
	
	if (wishlistPage == null) {
		wishlistPage= new MyWishlistPage(driver);
	}
	return wishlistPage ;
}
	
	
	
}
