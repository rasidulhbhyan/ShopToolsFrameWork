package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyAccountPage;
import Testing.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps extends TestBase {
	
	


	@When("user completes log in procedure with correct credentials")
	public void user_completes_log_in_procedure_with_correct_credentials() {
		
		HomePage home = new HomePage(driver);
		home.goToMyAccuntPage();
		
		MyAccountPage myAccount = new MyAccountPage(driver);
		myAccount.logIn("user0712", "user0712!");
	  
	}


	@Then("user sees profile as user0712")
	public void user_sees_profile_as_user0712() {
		
		MyAccountPage myAccount = new MyAccountPage(driver);
		String displayedName= myAccount.getNameDisplayed();
		Assert.assertEquals(displayedName, "user0712","test failed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



