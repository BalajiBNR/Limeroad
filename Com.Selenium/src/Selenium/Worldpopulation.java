package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldpopulation {
	
	public static void population() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
	}

	public static void main(String[] args) {
		population();
	}

}
