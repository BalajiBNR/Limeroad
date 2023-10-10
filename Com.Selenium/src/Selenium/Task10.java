package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	
static WebDriver driver;
	
	private static void Browserlaunch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame1);
		WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text.getText());
		
	}

	public static void main(String[] args) {
		Browserlaunch();
	}
}
