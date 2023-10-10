package Pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass_Testng;

public class FlipkartTest extends Baseclass_Testng{
	
	public FlipkartTest() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//span[@role='button']")
	private WebElement closePopup;
	
	public WebElement getclosePopup() {
		return closePopup;
	}
	@FindBy (xpath = "//input[@type='text']")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}

}
