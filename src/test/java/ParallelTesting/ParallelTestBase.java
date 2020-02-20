package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTestBase {
	
	
ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	

public WebDriver getWebDriver() {
	
	return driver.get();
}
	
public void goToURLUsing(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
	
		driver.set(new ChromeDriver());
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");}
	
	if(browser.equalsIgnoreCase("firefox")) {
		driver.set(new FirefoxDriver());
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/geckodriver");}
	
		
	
	

}	
	
	
	
	
	
	
	
	
	
	
	

}
