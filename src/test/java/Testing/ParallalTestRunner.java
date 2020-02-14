package Testing;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MyAccountPage;

public class ParallalTestRunner extends TestBaseForParallel {

	// User is able to Log In
	@Test()
	public void logInTest() {

		WebDriver threadDriver = this.getWebDriver();
		threadDriver.get("http://shop.demoqa.com/");

		
		HomePage home = new HomePage(threadDriver);
		home.goToMyAccuntPage();

		MyAccountPage myAccount = new MyAccountPage(threadDriver);
		myAccount.logIn("user0712", "user0712!");

		String displayedName = myAccount.getNameDisplayed();
		Assert.assertEquals(displayedName, "user0712", "test failed");

	}

	@Test()
	// User is able to logout
	public void logOutTest() {

		WebDriver threadDriver = this.getWebDriver();
		threadDriver.get("http://shop.demoqa.com/");

		
		HomePage home = new HomePage(threadDriver);
		home.goToMyAccuntPage();

		MyAccountPage myAccount = new MyAccountPage(threadDriver);
		myAccount.logIn("user0712", "user0712!");
		myAccount.logOut();

		String displayedText = myAccount.getLogInBannerText();
		Assert.assertEquals(displayedText, "LOGIN", "Test Failed");
	}

	/*
	 * @Test() //User can go to Wishlist Page public void goToWishlistPage() {
	 * 
	 * 
	 * HomePage home = new HomePage(driver); home.goToMyWishlist();
	 * 
	 * MyWishlistPage wishlistPage = new MyWishlistPage(driver);
	 * 
	 * String displayedTest=wishlistPage.getDisplayedTitle();
	 * 
	 * Assert.assertEquals(displayedTest, "WISHLIST","Test Failed");
	 * 
	 * 
	 * }
	 * 
	 * @Test() //User is able to go to Pink Shirt Page public void
	 * goToPinkShirtPage() {
	 * 
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver); String nameDisplayed =
	 * pinkShirtPage.getProductName();
	 * 
	 * Assert.assertEquals(nameDisplayed, "PINK DROP SHOULDER OVERSIZED T SHIRT",
	 * "Test Failed");
	 * 
	 * }
	 * 
	 * @Test() //User is able to add product to cart public void addProductToCart()
	 * {
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver);
	 * pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	 * 
	 * MyCart myCart = new MyCart(driver); String item1= myCart.getItem1Name();
	 * 
	 * Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");
	 * 
	 * 
	 * }
	 * 
	 * @Test() //User can delete product from cart public void
	 * deleteProductFromCart() {
	 * 
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver);
	 * pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	 * 
	 * 
	 * MyCart myCart = new MyCart(driver); myCart.deleteItem1(); String message=
	 * myCart.getDeleteMessage();
	 * 
	 * Assert.assertEquals(message,
	 * "“pink drop shoulder oversized t shirt” removed. Undo?");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test() //User can undo deleted product public void undoDeletedProduct() {
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver);
	 * pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	 * 
	 * 
	 * MyCart myCart = new MyCart(driver); myCart.deleteItem1();
	 * myCart.undoDeletedItem();
	 * 
	 * String item1= myCart.getItem1Name();
	 * 
	 * Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");
	 * 
	 * 
	 * }
	 * 
	 * @Test() //User can increase quantity of product public void
	 * increaseQuantityOfItem() {
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver);
	 * pinkShirtPage.addProductToCart(); pinkShirtPage.goToCart();
	 * 
	 * MyCart myCart = new MyCart(driver); myCart.increaseQuantity();
	 * 
	 * String quantityOfItem = myCart.getQuantityOfItem();
	 * Assert.assertEquals(quantityOfItem, "Cart(2)" + "₹30.00"); }
	 * 
	 * 
	 * @Test() //User is able to add product to Wishlist public void
	 * addProductToWishlist() {
	 * 
	 * HomePage home = new HomePage(driver); home.goToPinkShirtPage();
	 * 
	 * PinkShirt pinkShirtPage = new PinkShirt(driver);
	 * pinkShirtPage.addProductToWishlist(); pinkShirtPage.goToHomePage();
	 * pinkShirtPage.goToWishlistPage();
	 * 
	 * MyWishlistPage myWishlist = new MyWishlistPage(driver);
	 * 
	 * String displayedItem = myWishlist.getItem1();
	 * 
	 * Assert.assertEquals(displayedItem, "PINK DROP SHOULDER OVERSIZED T SHIRT",
	 * "Test Failed");
	 * 
	 * 
	 * 
	 * }
	 * 
	 * //User can quick vioew item
	 * 
	 * @Test() public void quickViewItem() { HomePage homePage = new
	 * HomePage(driver); homePage.quickViewPinkShirt(); }
	 */

}
