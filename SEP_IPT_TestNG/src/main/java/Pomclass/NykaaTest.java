package Pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass_Testng;

public class NykaaTest extends Baseclass_Testng{

	public NykaaTest() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@placeholder='Search on Nykaa']")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
}
