package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyWishlistPage;
import Testing.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyWishListPageSteps extends TestBase {
	
	
@When("User clicks on MyWishListPage link")
public void user_clicks_on_MyWishListPage_link() {
		 HomePage home = new HomePage(driver); 
		 home.goToMyWishlist();
	}

@Then("User is on MyWishList page")
public void user_is_on_MyWishList_page() {
		
		  MyWishlistPage wishlistPage = new MyWishlistPage(driver);
		  
		  String displayedTest=wishlistPage.getDisplayedTitle();
		  
		  Assert.assertEquals(displayedTest, "WISHLIST","Test Failed");
	  
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
