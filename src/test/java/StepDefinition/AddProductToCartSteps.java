package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyCart;
import Pages.PinkShirt;
import Testing.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCartSteps extends TestBase {

	
@When("user goes to Pink Shirt page")
public void user_goes_to_Pink_Shirt_page() {
	HomePage home = new HomePage(driver); 
	home.goToPinkShirtPage();
	}

@Then("user can add product to cart")
public void user_can_add_product_to_cart() {
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); 
	  
	  
	  pinkShirtPage.goToCart();
	  
	  MyCart myCart = new MyCart(driver); 
	  String item1= myCart.getItem1Name();
	  
	  Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");
	}	
	
	
	
	
	
	
	
	
	
}
