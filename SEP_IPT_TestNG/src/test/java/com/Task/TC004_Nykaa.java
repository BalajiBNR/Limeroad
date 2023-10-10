package com.Task;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;
import Pomclass.FlipkartTest;
import Pomclass.NykaaTest;

public class TC004_Nykaa extends Baseclass_Testng{

		@Test(priority = 1)
		public void TestHomePage() {
			getDriver("edge");
			launchUrl("https://www.nykaa.com/");
			
		}
		@Test(priority = 2)
		public void searchProduct() {
			NykaaTest test1 = new NykaaTest();
			clickOnElement(test1.getSearchBox());
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
