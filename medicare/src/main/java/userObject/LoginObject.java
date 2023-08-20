package userObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {

	@FindBy(xpath="//input[@id=\"username\"]")
	public static  WebElement email;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	public static WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	 public static WebElement login;
	
	
}
