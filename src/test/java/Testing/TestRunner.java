package Testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MasterPage;
import Pages.MyAccountPage;
import Pages.MyCart;
import Pages.MyWishlistPage;
import Pages.PinkShirt;
import io.cucumber.java.Before;

public class TestRunner extends TestBase {
	
	
	
@BeforeMethod
public void startBrowser() {
	goToURLUsing("firefox");
}	
@AfterMethod
public void closeBrowser() {
	MasterPage master = new MasterPage(driver);
	master.closeBrowser();
}


//User is able to Log In 
@Test
public void logInTest() {
	
	HomePage home = new HomePage(driver);
	home.goToMyAccuntPage();
	
	MyAccountPage myAccount = new MyAccountPage(driver);
	myAccount.logIn("user0712", "user0712!");
	
	String displayedName= myAccount.getNameDisplayed();
	Assert.assertEquals(displayedName, "user0712","test failed");
	
}
	
// User is able to logout
@Test
public void logOutTest() {
	  
	  
	  HomePage home = new HomePage(driver); home.goToMyAccuntPage();
	  
	  MyAccountPage myAccount = new MyAccountPage(driver);
	  myAccount.logIn("user0712", "user0712!"); 
	  myAccount.logOut();
	  
	  String displayedText = myAccount.getLogInBannerText();
	  
	  Assert.assertEquals(displayedText, "LOGIN","Test Failed");
	  
	  
	  }
	  
//User can go to Wishlist Page
@Test 
public void goToWishlistPage() {
	  
	  
	  HomePage home = new HomePage(driver); 
	  home.goToMyWishlist();
	  
	  MyWishlistPage wishlistPage = new MyWishlistPage(driver);
	  
	  String displayedTest=wishlistPage.getDisplayedTitle();
	  
	  Assert.assertEquals(displayedTest, "WISHLIST","Test Failed");
	  
	  
	  }
	  
//User is able to go to Pink Shirt Page
@Test 
public void goToPinkShirtPage() {
	  
	  
	  HomePage home = new HomePage(driver); 
	  home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver); String nameDisplayed =
	  pinkShirtPage.getProductName();
	  
	  Assert.assertEquals(nameDisplayed, "PINK DROP SHOULDER OVERSIZED T SHIRT",
	  "Test Failed");
	  
	  }
	  
//User is able to add product to cart  
@Test 
public void addProductToCart() {
	  
	  HomePage home = new HomePage(driver); 
	  home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); 
	  
	  
	  pinkShirtPage.goToCart();
	  
	  MyCart myCart = new MyCart(driver); 
	  String item1= myCart.getItem1Name();
	  
	  Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");
	  
	  
	  }

//User can delete product from cart
@Test 
public void deleteProductFromCart() {
	  
	  
	  HomePage home = new HomePage(driver); 
	  home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); 
	  pinkShirtPage.goToCart();
	  
	  
	  MyCart myCart = new MyCart(driver); 
	  myCart.deleteItem1(); 
	  String message=myCart.getDeleteMessage();
	  
	  Assert.assertEquals(message,"“pink drop shoulder oversized t shirt” removed. Undo?");
	  
	  
	  
	  
	  
	  }
	  
//User can undo deleted product
@Test 
public void undoDeletedProduct() {
	  
	  HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	  
	  
	  MyCart myCart = new MyCart(driver); myCart.deleteItem1();
	  myCart.undoDeletedItem();
	  
	  String item1= myCart.getItem1Name();
	  
	  Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");
	  
	  
	  }
	  
//User can increase quantity of product
@Test 
public void increaseQuantityOfItem() {
	  
	  HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	  
	  MyCart myCart = new MyCart(driver); myCart.increaseQuantity();
	  
	  String quantityOfItem = myCart.getQuantityOfItem();
	  Assert.assertEquals(quantityOfItem, "Cart(2)" + "₹30.00"); }
	  
//User is able to add product to Wishlist
	  
@Test 
public void addProductToWishlist() {
	  
	  HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToWishlist(); pinkShirtPage.goToHomePage();
	  pinkShirtPage.goToWishlistPage();
	  
	  MyWishlistPage myWishlist = new MyWishlistPage(driver);
	  
	  String displayedItem = myWishlist.getItem1();
	  
	  Assert.assertEquals(displayedItem, "PINK DROP SHOULDER OVERSIZED T SHIRT",
	  "Test Failed");
	  
	  
	  
	  }
	  
//User can quick vioew item
@Test
public void quickViewItem() {
	  
	  HomePage homePage = new HomePage(driver); homePage.quickViewPinkShirt();
	  
	  
	  
	  }
	  
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
