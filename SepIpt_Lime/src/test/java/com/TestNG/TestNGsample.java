package com.TestNG;

import org.testng.annotations.Test;

import com.Base.Base_Class;

public class TestNGsample extends Base_Class{
	
	@Test
	public void TestHomePage() {
		getDriver("chrome");
		launchUrl("https://www.amazon.com");
	}

}
