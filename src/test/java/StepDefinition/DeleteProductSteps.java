package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyCart;
import Pages.PinkShirt;
import Testing.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteProductSteps extends TestBase {

@When("User adds product to cart")
	public void user_adds_product_to_cart() {
	
	 HomePage home = new HomePage(driver); 
	  home.goToPinkShirtPage();
	  
	  PinkShirt pinkShirtPage = new PinkShirt(driver);
	  pinkShirtPage.addProductToCart(); 
	  pinkShirtPage.goToCart();
	  
	}

@Then("User can delete product from cart")
public void user_can_delete_product_from_cart() {
	  MyCart myCart = new MyCart(driver); 
	  myCart.deleteItem1(); 
	  String message=myCart.getDeleteMessage();
	  
	  Assert.assertEquals(message,"“pink drop shoulder oversized t shirt” removed. Undo?");  
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
