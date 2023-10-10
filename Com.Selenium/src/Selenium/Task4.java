package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task4 {
	
	public static void Xpath() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in/customer/account/create/");
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Balaji");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Rajagopal");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("balaji.student@gmail.com");
		Thread.sleep(3000);
		WebElement mobileno=driver.findElement(By.id("mobile_no"));
		mobileno.sendKeys("8098408498");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Balaji@123");
		Thread.sleep(3000);
		WebElement createaccount=driver.findElement(By.xpath("(//span[text()='Create Account'])[2]"));
		createaccount.click();
		TakesScreenshot pic=(TakesScreenshot)driver;
		File source=pic.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\Screenshot\\balaji.png");
		FileHandler.copy(source,destination);
		
	}

	
	public static void main(String[] args) throws InterruptedException, IOException {
	    Xpath();
	
	}

}
