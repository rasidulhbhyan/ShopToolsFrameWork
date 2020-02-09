package StepDefinition;

import org.testng.Assert;

import Pages.HomePage;
import Pages.MyAccountPage;
import Testing.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutDefinition extends TestBase {


@When("User logs in")
public void user_logs_in() {
		HomePage home = new HomePage(driver); home.goToMyAccuntPage();
		  
		  MyAccountPage myAccount = new MyAccountPage(driver);
		  myAccount.logIn("user0712", "user0712!");  
	
	}

@Then("User is also able to log out")
public void user_is_also_able_to_log_out() {
		MyAccountPage myAccount = new MyAccountPage(driver);
		
		myAccount.logOut();
		  
		String displayedText = myAccount.getLogInBannerText();
		  
		Assert.assertEquals(displayedText, "LOGIN","Test Failed");
		
		
	}
	
	
	
	
}
