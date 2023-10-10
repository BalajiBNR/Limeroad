package Baseclass;

import org.testng.annotations.Test;


public class Sample {

	public class TestNGsample extends Baseclass_Testng{
		
		@Test
		public void TestHomePage() {
			getDriver("chrome");
			launchUrl("https://www.amazon.com");
		}
		
	}
}
