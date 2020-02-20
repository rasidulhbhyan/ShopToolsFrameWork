package CucumberSupportCodes;

import Testing.TestBase;
import io.cucumber.java.en.Given;

public class BaseSteps extends TestBase {

	
	@Given("User is on ShopTools Website")
	public void user_is_on_ShopTools_Website() {
		goToURLUsing("firefox");
	}	
	
	
	
	
}
