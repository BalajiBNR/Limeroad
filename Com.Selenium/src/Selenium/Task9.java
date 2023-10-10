package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task9 {
	
	static WebDriver driver;
	
	public static void Browserlaunch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	 
	public static void ProductPurchase() {
		Actions act = new Actions(driver);
		WebElement bathbody = driver.findElement(By.xpath("//a[text()='Bath & Body']"));
		WebElement oralcare = driver.findElement(By.xpath("(//a[text()='Oral Care'])[1]"));
		act.moveToElement(bathbody).build().perform();
		act.moveToElement(oralcare).build().perform();
		act.click(oralcare).build().perform();
		
		Set<String> currentwindow = driver.getWindowHandles();
		for (String oralcare1 : currentwindow) {
	    driver.switchTo().window(oralcare1);
		}
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window,scrollBy(0,700)");
        
        WebElement Colgate_Paste = driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[1]"));
        Colgate_Paste.click();
        
        
        Set<String> allwindow = driver.getWindowHandles();
		for (String oralcare1 : allwindow) {
	    String Alltitle = driver.switchTo().window(oralcare1).getTitle();
	    System.out.println(Alltitle);
		}
	    String title = "Colgate Visible White O2, Teeth Whitening Toothpaste - Peppermint Sparkle\r\n";
        for (String oralcare2 : allwindow) {	
        if(driver.switchTo().window(oralcare2).getTitle().equals(title)) {  
       
       // WebElement Select_Gram = driver.findElement(By.xpath("//select[@title='SIZE']"));
        //Select Gram = new Select(Select_Gram); 
        //Gram.selectByVisibleText("25g");
 
        WebElement Addtobag = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
        Addtobag.click();
     
        }
        }
	}

	public static void main(String[] args) {
	
		Browserlaunch();
		ProductPurchase();
	}

}
