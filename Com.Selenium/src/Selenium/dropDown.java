package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	static WebDriver driver;
	
	private static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
	}
	
	private static void singleDropDown() {
		WebElement element=driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(element);
		select.selectByValue("5");
		List<WebElement> alloptions=select.getOptions();
		for(WebElement singleoption:alloptions) {
			System.out.println(singleoption.getText());
		}
	}
	
	private static void multipleDropDown() {
		WebElement cars=driver.findElement(By.id("cars"));
		Select sel=new Select(cars);
		sel.selectByVisibleText("Audi");
		sel.selectByIndex(0);
		System.out.println(sel.isMultiple());
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		singleDropDown();
		multipleDropDown();
		
	}

}
