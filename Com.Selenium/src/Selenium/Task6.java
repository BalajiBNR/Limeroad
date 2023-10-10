package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {
	
	public static void findElements() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		WebElement drive=driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
		Actions act=new Actions(driver);
		act.click(drive).perform();
		Thread.sleep(3000);
		List<WebElement> alltrends=driver.findElements(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']"));
		for(WebElement singlevideo:alltrends) {
			System.out.println(singlevideo.getText());
			System.out.println();
		}

	}
	
	public static void main(String[] args) throws InterruptedException {
		
		findElements();
	}

}
