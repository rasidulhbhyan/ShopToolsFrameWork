package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyCart;
import Pages.PinkShirt;
import Testing.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UndoDeletedItemSteps extends TestBase{

	
	@When("user adds product to cart")
	public void user_adds_product_to_cart() {
		 
		HomePage home = new HomePage(driver); 
		  home.goToPinkShirtPage();
		  
		  PinkShirt pinkShirtPage = new PinkShirt(driver);
		  pinkShirtPage.addProductToCart();
		  pinkShirtPage.goToCart();
		
		
	}

	@And("deletes product from cart")
	public void deletes_product_from_cart() {
		 MyCart myCart = new MyCart(driver); 
		 myCart.deleteItem1();
	}

	@Then("user can also undo the deletion of item")
	public void user_can_also_undo_the_deletion_of_item() {
		  MyCart myCart = new MyCart(driver); 
		  myCart.undoDeletedItem();
		  
		  String item1= myCart.getItem1Name();
		  
		  Assert.assertEquals(item1, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK");

		
		
	}	
	
	
	
	
	
	
}
