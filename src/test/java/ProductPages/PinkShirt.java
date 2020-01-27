package ProductPages;

import org.openqa.selenium.WebDriver;

import Pages.MasterPage;

public class PinkShirt extends MasterPage {

//Actions
String productNameDisplayed= "xpath://h1[@class='product_title entry-title']";	
String addItemToCart= "xpath://button[text()='Add to cart']";
String addToWishlistButton= "xpath://div[contains(@class,'wishlist-fragment on-first-load add-to-wishlist-1497')]//a[contains(@class,'add_to_wishlist single_add_to_wishlist')]";

String selectColor= "id:pa_color";									
String selectSize= "id:pa_size";

//Pages
String myWishlistLink= "xpath://ul[contains(@class,'pull-right noo-topbar-right')]//li[1]";
String homePageLink= "xpath://a[@class='custom-logo-link']//img[@class='custom-logo']";	
String cartLink = "xpath:(//span[@class='woocommerce-Price-amount amount'])[1]";

							
public PinkShirt(WebDriver driver) {
		super(driver);
		
	}


//PRODUCT INTERACTIONw		
public String getProductName() {
	
	return getText(productNameDisplayed);
	
}	

public void addProductToCart() {

	select(selectColor,"Pink");
	
	select(selectSize,"36");
	
	click(addItemToCart);
	
}

public void addProductToWishlist() {
	
	click(addToWishlistButton);
	pause(200);
}



//GO TO OTHER PAGES 
public void goToWishlistPage() {
	
	click(myWishlistLink);
}

public void goToHomePage() {
	
	click(homePageLink);
	
}	
	
public void goToCart() {
	
	click(cartLink);
	
}	
	
	
	
	

}
