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
import org.openqa.selenium.support.ui.Select;

public class Task8 {
	
	static WebDriver driver;
	
	private static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}
	
	private static void accountCreate() throws InterruptedException, IOException {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Balaji");
		Thread.sleep(3000);
		
		WebElement surName=driver.findElement(By.name("lastname"));
		surName.sendKeys("Rajagopal");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("balaji.rajagopal88@gmail.com");
		Thread.sleep(2000);
		
		WebElement reEmail=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		reEmail.sendKeys("balaji.rajagopal88@gmail.com");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("Balaji@321");
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByValue("18");
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("Nov");
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1988");
		Thread.sleep(2000);
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		Thread.sleep(2000);
		
		TakesScreenshot pic=(TakesScreenshot)driver;
		File source=pic.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\Screenshot\\facebook.png");
		FileHandler.copy(source, destination);
		
		WebElement signUp=driver.findElement(By.name("websubmit"));
		signUp.click();
		Thread.sleep(3000);
		
		TakesScreenshot pic1=(TakesScreenshot)driver;
		File source1=pic.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\Screenshot\\facebook1.png");
		FileHandler.copy(source1, destination1);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch();
		accountCreate();

	}

}
