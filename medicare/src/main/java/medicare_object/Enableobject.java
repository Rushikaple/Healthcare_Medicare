package medicare_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enableobject {

	@FindBy (xpath= "//div[@id=\"myCategoryModal\"]")
	 	public static WebElement AvailableProds;
	
	@FindBy(xpath= "//*[@id=\"productsTable\"]/tbody/tr[1]/td[7]/label/div")
		public static WebElement Disable;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
		public static WebElement Popup1;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/button")
		public static WebElement Popup2;
	
	@FindBy(xpath="//*[@id=\"productsTable\"]/tbody/tr[1]/td[7]/label/div")
		public static WebElement Enable;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
		public static WebElement Popup3;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/button")
		public static WebElement Popup4;
	
	//Log Out 
	
	@FindBy(xpath="//*[@id=\"dropdownMenu1\"]")
		public static WebElement DropDown;
	
	@FindBy(xpath="//*[@id=\"logout\"]/a")
		public static WebElement Logout;
}
