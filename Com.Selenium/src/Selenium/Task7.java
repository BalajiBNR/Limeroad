package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	
	private static void todayTask() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href='https://www.toysrus.in/shop-by-age/8-12-years/']")).click();
		Thread.sleep(3000);
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='price']"));
		String amount="₹2,499";
		List<String> count=new ArrayList<>();
		for(WebElement webElement:price) {
			if(webElement.getText().equals(amount)) {
				count.add(webElement.getText());
			
			}
		}
		System.out.println("Duplicate size:"+count.size());
		
	}

	private static void todayTask1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href='https://www.toysrus.in/shop-by-age/8-12-years/']")).click();
		Thread.sleep(3000);
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='price']"));
		for(WebElement webElement:price) {
			System.out.println(webElement.getText().replaceAll("₹"," "));
				
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		todayTask();
		todayTask1();
	}

}
