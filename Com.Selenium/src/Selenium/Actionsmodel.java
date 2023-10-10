 package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmodel {
	
static WebDriver driver;
	
	private static void Browserlaunch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	private static void ContextClick() throws InterruptedException, AWTException {
		
		Thread.sleep(2000);
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(skin).build().perform();
		Thread.sleep(2000);
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	
	private static void moveToElement() throws InterruptedException {
		driver.navigate().to("https://www.nykaa.com/");
		Thread.sleep(2000);
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(skin).build().perform();
		Thread.sleep(2000);
	}
	
	private static void click() throws InterruptedException {
		Thread.sleep(2000);
		WebElement skin = driver.findElement(By.xpath("//a[text()='appliances']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.click(skin).build().perform();
		Thread.sleep(2000);
		driver.close();
	}
	
	private static void dragAndDrop() throws InterruptedException {
		driver.get("https://demoqa.com/droppable/"); 
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
	}


	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Browserlaunch();
		dragAndDrop();
		moveToElement();
		ContextClick();
		click();
		
	}

}
