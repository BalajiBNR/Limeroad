package com.Task;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;
import Baseclass.RetryAFailedTest;

public class RetryAnalyzer extends Baseclass_Testng{

	
	@Test(retryAnalyzer = RetryAFailedTest.class)
	public void TestHomePage() {
		getDriver("chrome");
		launchUrl("https://tutorialsninja.com/demo/");
		
		String actual = driver.getTitle();
		String expected = "My Demo page";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dependsOnMethods = "TestHomePage")
   public void goToLogin(){
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	
	@Test(dependsOnMethods = "goToLogin")
	public void returningUser() {
		driver.findElement(By.id("input-email")).sendKeys("balaji.rajagopal18@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Balaji@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
