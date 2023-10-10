package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	
	static WebDriver driver;
	
	static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/shampoo");
		Thread.sleep(3000);
		selectorsTypes();
	}

	static void selectorsTypes() throws InterruptedException {
		WebElement element=driver.findElement(By.cssSelector("div#desktopSearchResults"));//id based cssSelectors
		System.out.println("The below are the all product details:"+element.getText());
		System.out.println("=============================================");
		Thread.sleep(3000);
		System.out.println();
		
		WebElement element1=driver.findElement(By.cssSelector("ul.results-base"));//Class based cssSelectors
		//System.out.println("CssSelector class used get the product details:"+element1.getText());
		Thread.sleep(3000);
		System.out.println();
		
		WebElement element2=driver.findElement(By.cssSelector("ul.results-base>li"));//parent tag> child tag
		System.out.println("Product deatils:"+element2.getText());
		System.out.println("=============================================");
		Thread.sleep(3000);
		System.out.println();
		
		WebElement element3=driver.findElement(By.cssSelector("ul.results-base>li:first-of-type"));//first-of-type in css
		System.out.println("First product deatils:"+element3.getText());
		System.out.println("=============================================");
		Thread.sleep(3000);
		System.out.println();
		
		WebElement element4=driver.findElement(By.cssSelector("ul.results-base>li:last-of-type"));//last-of-type in css
		System.out.println("last product deatils:"+element4.getText());
		System.out.println("=============================================");
		Thread.sleep(3000);
		System.out.println();
		
		WebElement element5=driver.findElement(By.cssSelector("ul.results-base>li:nth-of-type(50)"));//nth-of-type in css
		System.out.println("50th product deatils:"+element5.getText());
		System.out.println("=============================================");
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();

	}

}
