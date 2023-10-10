package Pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass_Testng;

public class AmazonTest extends Baseclass_Testng{

	public AmazonTest() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
}
