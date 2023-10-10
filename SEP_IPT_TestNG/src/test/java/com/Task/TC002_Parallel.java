package com.Task;

import java.awt.AWTException;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;
import Pomclass.AmazonTest;

public class TC002_Parallel extends Baseclass_Testng{

	@Test
	public void TestHomePage() {
		getDriver("chrome");
		launchUrl("https://www.amazon.in/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods = "TestHomePage")
	public void searchProduct() {
		AmazonTest test1 = new AmazonTest();
		System.out.println("Start");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		input(test1.getSearchBox(), "samsung");
		System.out.println("End");
		
	}
	
	@Test(dependsOnMethods = "searchProduct")
	public void getProduct() {
		try {
			enterkey();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = "getProduct")
	public void Browserclosed() {
		closeBrowser();
	}
}
