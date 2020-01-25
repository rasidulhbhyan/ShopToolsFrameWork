package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
public static WebDriver driver;
	
	
public void goToURLUsing(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/Razzy/eclipse-workspace/ShopTools/chromedriver");}
	
	if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/Razzy/eclipse-workspace/ShopToolsJanuary2020/geckodriver");}
	
	
	driver.get("http://shop.demoqa.com/");
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	

}
