package Pages;

import org.openqa.selenium.WebDriver;

public class MyWishlistPage extends MasterPage{

	String displayedTitle= "xpath://h1[@class='page-title']";
	String item1= "xpath://a[contains(text(),'pink drop shoulder oversized t shirt')]";
	
	
public MyWishlistPage(WebDriver driver) {
		super(driver);
		
	}


public String getDisplayedTitle() {
	
	return getText(displayedTitle);
	
	
	
}

public String getItem1() {
	
	return getText(item1);
}





}
