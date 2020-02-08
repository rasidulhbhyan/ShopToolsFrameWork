package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends MasterPage {

	String dismissPopUp= "xpath://a[@class='woocommerce-store-notice__dismiss-link']";
	String myAccountLink = "xpath://a[contains(text(),'My Account')]";
	String myWishlistLink= "xpath://ul[contains(@class,'pull-right noo-topbar-right')]//li[1]";
	
	
	String pinkShirtLink= "xpath://div[@class='noo-product-item noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//h3";
	String quickViewPinkShirt= "xpath://span[@ class='noo-quick-view icon_zoom-in_alt']";
	
public HomePage(WebDriver driver){
	
	
	super(driver);
	
	
	
}
	
	
public void goToMyAccuntPage() {
	
	click(dismissPopUp);
	click(myAccountLink);
}	
	
	
public void goToMyWishlist () {
	click(dismissPopUp);
	click(myWishlistLink);
}

public void goToPinkShirtPage() {
	
	click(dismissPopUp);
	click(pinkShirtLink);	
}

public void quickViewPinkShirt() {
	
	click(dismissPopUp);
	click(quickViewPinkShirt);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
