package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseForParallel {

	//public WebDriver driver;
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	WebDriver threadDriver;
	
	public WebDriver getWebDriver() {
		return driver.get();
	}


	@BeforeMethod
	public void startBrowser() {
		createBrowser("chrome");
	}
	
	public void createBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
			driver.set(new ChromeDriver());
			//driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
			driver.set(new FirefoxDriver());
		}

		try {
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
		}
	}

	@AfterMethod
	public void closeBrowser() {
		//driver.get().quit();
	}


}
