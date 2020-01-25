package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.MyWishlistPage;
import ProductPages.PinkShirt;

public class TestRunner extends TestBase {
	


public void logInTest() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToMyAccuntPage();
	
	MyAccountPage myAccount = new MyAccountPage(driver);
	myAccount.logIn("user0712", "user0712!");
	
	String displayedName= myAccount.getNameDisplayed();
	Assert.assertEquals(displayedName, "user0712","test failed");
	
}

public void logOutTest() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToMyAccuntPage();
	
	MyAccountPage myAccount = new MyAccountPage(driver);
	myAccount.logIn("user0712", "user0712!");
	myAccount.logOut();
	
	String displayedText = myAccount.getLogInBannerText();
	
	Assert.assertEquals(displayedText, "LOGIN","Test Failed");
	

}

public void goToWishlistPage() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToMyWishlist();
	
	MyWishlistPage wishlistPage = new MyWishlistPage(driver);
	
	String displayedTest=wishlistPage.getDisplayedTitle();
	
	Assert.assertEquals(displayedTest, "WISHLIST","Test Failed");
	

}

public void goToPinkShirtPage() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToPinkShirtPage();
	
	PinkShirt pinkShirtPage = new PinkShirt(driver);
	String nameDisplayed = pinkShirtPage.getProductName();
	
	Assert.assertEquals(nameDisplayed, "PINK DROP SHOULDER OVERSIZED T SHIRT", "Test Failed");
	
}

@Test
public void addProductToCart() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToPinkShirtPage();
	
	PinkShirt pinkShirtPage = new PinkShirt(driver);
	pinkShirtPage.addProductToCart();
	pinkShirtPage.goToCart();
	
	
}

public void addProductToWishlist() {
	
	goToURLUsing("chrome");
	HomePage home = new HomePage(driver);
	home.goToPinkShirtPage();
	
	PinkShirt pinkShirtPage = new PinkShirt(driver);
	pinkShirtPage.addProductToWishlist();
	pinkShirtPage.goToHomePage();
	pinkShirtPage.goToWishlistPage();
	
	MyWishlistPage myWishlist = new MyWishlistPage(driver);
	
	 String displayedItem = myWishlist.getItem1();
	 
	 Assert.assertEquals(displayedItem, "PINK DROP SHOULDER OVERSIZED T SHIRT", "Test Failed");
	
	
	
}	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
