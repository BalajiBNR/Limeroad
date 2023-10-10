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

public class Task5 {
	
	public static void purchase() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in/");
		driver.findElement(By.xpath("(//strong[@class='years_in_num'])[6]")).click();
		driver.findElement(By.xpath("(//span[@class='price'])[10]"));
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[2]")).click();
		WebElement print=driver.findElement(By.xpath("//span[contains(text(),'SUNNYLiFE pink color')]"));
		System.out.println(print.getText());
		TakesScreenshot pic=(TakesScreenshot)driver;
		File source=pic.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\karth\\eclipse-workspace\\Com.Selenium\\Screenshot\\balaji1.png");
		FileHandler.copy(source,destination);
	}

	public static void main(String[] args) throws IOException {
		purchase();

	}

}
