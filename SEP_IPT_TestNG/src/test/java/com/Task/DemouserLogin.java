package com.Task;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;

public class DemouserLogin extends Baseclass_Testng{

	@Test(priority = -3)
	public void TestHomePage() {
		getDriver("chrome");
		launchUrl("https://tutorialsninja.com/demo/");
	}
	
	@Test()
   public void goToLogin(){
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	
	@Test(priority = 3)
	public void returningUser() {
		driver.findElement(By.id("input-email")).sendKeys("balaji.rajagopal18@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Balaji@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
