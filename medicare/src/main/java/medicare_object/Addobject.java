package medicare_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addobject {

	@FindBy(id="name")
		public static WebElement name;
	
	@FindBy(id="brand")
		public static WebElement brand;
	
	@FindBy(id="description")
		public static WebElement desc;
	
	@FindBy(id="unitPrice")
		public static WebElement price;
	
	@FindBy(id="quantity")
	 	public static WebElement quantity;
	
	@FindBy(id="file")
		public static WebElement upload;
	
	@FindBy(id="categoryId")
		public static WebElement category;
	
	@FindBy(name="submit")
		public static WebElement save;
}
