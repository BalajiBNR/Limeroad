
package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject {
	
	static WebDriver driver;
	
	private static void browser_Launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");

	}
	
	private static void loginPage() throws InterruptedException {
		
		WebElement SigninPage = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.click(SigninPage).build().perform();
		WebElement mob = driver.findElement(By.name("emailMobile"));
		mob.sendKeys("9786671202");
		WebElement sendotp = driver.findElement(By.xpath("//button[@type='submit']"));
		sendotp.click();
		Thread.sleep(25000);
		WebElement verify = driver.findElement(By.xpath("//button[text()='verify']"));
		verify.click();
		
	}
	
	private static void skinItems() throws InterruptedException {
		Thread.sleep(2000);
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(skin).build().perform();
		WebElement facecream = driver.findElement(By.xpath("(//a[contains(text(),'Day Cream')])[2]"));
		Thread.sleep(3000);
		facecream.click();
		Thread.sleep(3000);
		WebElement hair = driver.findElement(By.xpath("//a[text()='hair']"));
		act.moveToElement(hair).build().perform();
		Thread.sleep(3000);
		hair.click();
		WebElement appliances = driver.findElement(By.xpath("//a[text()='appliances']"));
		act.moveToElement(appliances).build().perform();
		Thread.sleep(3000);
		appliances.click();

	}

	public static void main(String[] args) throws InterruptedException {
		
		browser_Launch();
		loginPage();
		skinItems();
	
	}

}
