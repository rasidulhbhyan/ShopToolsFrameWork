package Testing;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
features= {"src/test/resource/Features/LogIn.feature"},
glue= {"StepDefinition","CucumberSupportCodes"},
plugin= {"pretty", "json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
monochrome= true,
tags= {"~@ignore"}
)
 

public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {
	
	

}
