
package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Windowhandles {
	
static WebDriver driver;
	
	private static void Browserlaunch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ ");
		
	}

	private static void windowHand() throws AWTException, InterruptedException, IOException {
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobile).build().perform();
		Robot rob = new Robot();
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);

		WebElement elet = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(elet).build().perform();
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
				
		Set<String> allwindow = driver.getWindowHandles();
		for (String onebyone : allwindow) {
			String currentUrl = driver.switchTo().window(onebyone).getTitle();
			System.out.println(currentUrl);
		}
		String page = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String onebyone : allwindow) {
			if (driver.switchTo().window(onebyone).getTitle().equals(page)) {
				WebElement home_Audio = driver.findElement(By.xpath("//span[text()='Home Audio']"));
				home_Audio.click();
				
				WebElement radio = driver.findElement(By.xpath("//span[text()='Radios & Boomboxes']"));
				act.contextClick(radio).build().perform();
				Thread.sleep(3000);
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyPress(KeyEvent.VK_ENTER);
				break;
					}
				}
		String mobilepage = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		
		for (String previouspage : allwindow) {
			if (driver.switchTo().window(previouspage).getTitle().equals(mobilepage)) {
				WebElement smart_watches = driver.findElement(By.xpath("//span[text()='Smartwatches']"));
				act.contextClick(smart_watches).build().perform();
				Thread.sleep(3000);
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyPress(KeyEvent.VK_ENTER);
				break;
			}
		}	
		
		Set<String> allpages = driver.getWindowHandles();
		for (String onepage : allpages) {
			String currenttitle = driver.switchTo().window(onepage).getTitle();
			System.out.println(currenttitle);
		}
		

		String boombox_page = "Radios & Boomboxes: Buy Radios & Boomboxes Online at Best Prices in India-Amazon.in";
		
		for (String boom : allpages) {
			if (driver.switchTo().window(boom).getTitle().equals(boombox_page)) {
				WebElement clock_radio = driver.findElement(By.xpath("(//span[@class='a-list-item'])[52]"));
				clock_radio.click();
				TakesScreenshot pic=(TakesScreenshot)driver;
				File source=pic.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\Screenshot\\Clockradios.png");
				FileHandler.copy(source,destination);
				break;
			}
		}

		
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		Browserlaunch();
		windowHand();
	}

}
