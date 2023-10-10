package com.Task;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.Baseclass_Testng;

public class DemoTestNG extends Baseclass_Testng{
		
		@Test(priority = -3)
		public void TestHomePage() {
			getDriver("chrome");
			launchUrl("https://tutorialsninja.com/demo/");
		}
		
		@Test()
	   public void RegisterNewuser(){
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
		}
		
		@Test(priority = 1)
		public void registerAccount() {
			driver.findElement(By.id("input-firstname")).sendKeys("Balaji");
			driver.findElement(By.id("input-lastname")).sendKeys("Rajagopal");
			driver.findElement(By.id("input-email")).sendKeys("balaji.nayaniak@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys("9786671202");
		}
		
		@Test(priority = 2)
		public void passWord() {
			driver.findElement(By.id("input-password")).sendKeys("Balaji@123");
			driver.findElement(By.id("input-confirm")).sendKeys("Balaji@123");
		}
		
		@Test(priority = 3)
		public void termsAndCondition() {
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	}


