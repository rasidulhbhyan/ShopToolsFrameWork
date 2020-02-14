package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public WebDriver driver;


	@BeforeMethod
	public void startBrowser() {
		goToURLUsing("chrome");
	}
	
	public void goToURLUsing(String browser) {

		if (browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			// System.setProperty("webdriver.chrome.driver", "/Users/Razzy/eclipse-workspace/ShopTools/chromedriver");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
		}
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver","/Users/Razzy/eclipse-workspace/ShopToolsJanuary2020/geckodriver");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/geckodriver");
		}

		driver.get("http://shop.demoqa.com/");

		try {
			Thread.sleep(500);
		}

		catch (InterruptedException e) {
		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}


}
