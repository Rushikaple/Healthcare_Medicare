package userObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchObject {

	@FindBy(xpath="//*[@id=\"listProducts\"]/a")
		public static WebElement Viewprods;
	
	@FindBy(xpath="//*[@id=\"productListTable_filter\"]/label/input")
		public static WebElement search;
	
}
