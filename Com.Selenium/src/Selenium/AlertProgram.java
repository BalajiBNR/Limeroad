
package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {
	
static WebDriver driver;
	
	private static void Browserlaunch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
	}
	
	private static void Simple_Alert() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Alert sim_A = driver.switchTo().alert();
		Thread.sleep(2000);
		sim_A.accept();
		
	}
	
	private static void Confirm_Alert() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Alert con_A = driver.switchTo().alert();
		Thread.sleep(2000);
		con_A.accept();
	}
	private static void Prompt_Alert() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Alert pro_A = driver.switchTo().alert();
		Thread.sleep(2000);
		pro_A.sendKeys("Balaji");
		System.out.println(pro_A.getText());
		Thread.sleep(2000);
		pro_A.accept();
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		
		Browserlaunch();
		Simple_Alert();
		Confirm_Alert();
		Prompt_Alert();
	}

}
