package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.PinkShirt;
import Testing.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PinkShirtPage extends TestBase {

	@When("User clicks on PinkShirtPage link")
	public void user_clicks_on_PinkShirtPage_link() {
		HomePage home = new HomePage(driver); 
		home.goToPinkShirtPage();   
		
		
		
	}

	@Then("User is on PinkShirtPage page")
	public void user_is_on_PinkShirtPage_page() {
	   
		PinkShirt pinkShirtPage = new PinkShirt(driver); 
		String nameDisplayed = pinkShirtPage.getProductName();
				  
		Assert.assertEquals(nameDisplayed, "PINK DROP SHOULDER OVERSIZED T SHIRT","Test Failed");
		
		
	}	
	
	
	
	
	
	
	
	
	
	
}
