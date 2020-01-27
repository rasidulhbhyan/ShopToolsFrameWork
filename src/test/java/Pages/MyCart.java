package Pages;

import org.openqa.selenium.WebDriver;

public class MyCart extends MasterPage {

public MyCart(WebDriver driver) {
		super(driver);
		
	}

String item1Name= "xpath://td[@data-title='Product']//a[1]";
						
String delteItem1 = "xpath:/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[6]/a";
String deleteMessage= "xpath://div[@class='woocommerce-notices-wrapper']//div[1]";
String undoButton= "xpath://div[@role='alert']//a[1]";
String increaseQuantity="xpath:(//button[@type='button']//i)[2]";
String updateCart= "xpath:(//input[@class='button'])[2]";

String quantityAndTotalOfCart= "xpath://span[@class='cart-name-and-total']";

public void deleteItem1() {
	
	click(delteItem1);
}

public void undoDeletedItem() {
	click(undoButton);
	pause(1000);
}

public void increaseQuantity() {
	
	click(increaseQuantity);
	click(updateCart);
	pause(1000);
}

public String getDeleteMessage() {
	
	return getText(deleteMessage);
}

public String getItem1Name() {
	
	return getText(item1Name);
	
}

public String getQuantityOfItem() {
	
	return getText(quantityAndTotalOfCart);
}



















	
}
