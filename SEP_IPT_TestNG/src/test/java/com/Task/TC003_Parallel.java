package com.Task;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;
import Pomclass.FlipkartTest;

public class TC003_Parallel extends Baseclass_Testng{

	@Test(priority = 1)
	public void TestHomePage() {
		getDriver("edge");
		launchUrl("https://www.flipkart.com/");
		
	}
	@Test(priority = 2)
	public void searchProduct() {
		FlipkartTest test1 = new FlipkartTest();
		clickOnElement(test1.getclosePopup());
		input(test1.getSearchBox(), "samsung");
		
	}
	
	@Test(priority = 3)
	public void getProduct() throws AWTException, InterruptedException {
		enterkey();
		implicitWait(10);
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void Browserclosed() {
		closeBrowser();
	}
}
