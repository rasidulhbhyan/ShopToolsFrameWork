package Pages;

import org.openqa.selenium.WebDriver;

public class MyCart extends MasterPage {

public MyCart(WebDriver driver) {
		super(driver);
		
	}

String item1Name= "xpath://td[@data-title='Product']//a[1]";
	
public String getItem1Name() {
	
	return getText(item1Name);
	
}




	
}
