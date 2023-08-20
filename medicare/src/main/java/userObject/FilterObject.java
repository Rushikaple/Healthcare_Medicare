package userObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterObject {
	
	@FindBy(xpath="//*[@id=\"productListTable_length\"]/label/select")
	public static WebElement Dropdown;
	
}
