package com.dairyproduct.valueadded;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa1 {

	static WebDriver Driver;
    
    static private void BrowserLaunch() {	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karth\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.nykaa.com/"); 
	
	
	Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

static private void LoginDetails() throws InterruptedException {
	
	WebElement signin = Driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
	signin.click();
	WebElement mobilenumber = Driver.findElement(By.xpath("//input[@name='emailMobile']"));
	mobilenumber.sendKeys("9786671202");
	WebElement proceed = Driver.findElement(By.id("submitVerification"));
	proceed.click();
	Thread.sleep(35000);
	WebElement OTPVerify = Driver.findElement(By.xpath("//button[@type='submit']"));
	OTPVerify.click();
}

static private void ProductDetails() throws InterruptedException {
	
	Actions act = new Actions(Driver);
	WebElement MomBaby = Driver.findElement(By.xpath("//a[text()='mom & baby']"));
	WebElement babypowder = Driver.findElement(By.xpath("//a[text()='Baby Powder']"));
	act.moveToElement(MomBaby).build().perform();
	act.moveToElement(babypowder).build().perform();
	act.doubleClick(babypowder).build().perform();
	
	Set<String> currentwindow = Driver.getWindowHandles();
	for (String Babypowder : currentwindow) {
    Driver.switchTo().window(Babypowder);
	}
    JavascriptExecutor scroll = (JavascriptExecutor)Driver;
    scroll.executeScript("window,scrollBy(0,400)");
    
    WebElement Himalaya_Powder_Click = Driver.findElement(By.xpath("//img[@alt='Himalaya Baby Powder']"));
    Himalaya_Powder_Click.click();
    
    Set<String> allwindow = Driver.getWindowHandles();
	for (String Babypowder : allwindow) {
    String Alltitle = Driver.switchTo().window(Babypowder).getTitle();
    System.out.println(Alltitle);
	}
    String title = "Himalaya Baby Powder: Buy Himalaya Baby Powder Online at Best Price in India | Nykaa";
    for (String Babypowder1 : allwindow) {	
    if(Driver.switchTo().window(Babypowder1).getTitle().equals(title)) {  
   
    WebElement Select_Gram = Driver.findElement(By.xpath("//select[@title='SIZE']"));
    Select Gram = new Select(Select_Gram); 
    Gram.selectByVisibleText("200g");

    WebElement Addtobag = Driver.findElement(By.xpath("//div[@class='css-vp18r8']"));
    Addtobag.click();
  
    WebElement Bagcount_click = Driver.findElement(By.xpath("//span[@class='cart-count']"));
    Bagcount_click.click();
   
    WebElement iframe = Driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
    Driver.switchTo().frame(iframe);
    
    WebElement Qty_select = Driver.findElement(By.xpath("//img[@src='https://adn-static1.nykaa.com/media/wysiwyg/Payments/down.svg']"));
    Qty_select.click();
   
    WebElement Five_Qty_click = Driver.findElement(By.xpath("(//li[@class='css-18fuhjc edkwwn3'])[5]"));
    Five_Qty_click.click();
    
    WebElement Proceed = Driver.findElement(By.xpath("//span[text()='Proceed']"));
    Thread.sleep(2000);
    Proceed.click();
    
    WebElement Deleveryhere = Driver.findElement(By.xpath("//button[text()='Deliver here']"));
    Deleveryhere.click();
}
}
}

static private void PaymentDetails() throws InterruptedException {
	
	    WebElement Cardnumber = Driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
	    Thread.sleep(2000);
        Cardnumber.click();
        Cardnumber.sendKeys("3566000020000410");
        
        WebElement Card_Expirydate = Driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
        Card_Expirydate.click();
        Card_Expirydate.sendKeys("02/26");
      
        WebElement CVV_Number = Driver.findElement(By.xpath("//input[@placeholder='CVV']"));
        CVV_Number.click();
        CVV_Number.sendKeys("123");
        
        WebElement Payment = Driver.findElement(By.xpath("//button[text()='Pay ₹ 715']"));
        Payment.click();
        
        WebElement Securedcardpay = Driver.findElement(By.xpath("//button[text()='Secure Card and pay']"));
        Securedcardpay.click();
     
       
        WebElement Paymentfailed_close = Driver.findElement(By.xpath("//button[text()='Close']"));
        Paymentfailed_close.click();
}
    
static private void ProductRemoveDetails() throws InterruptedException {
	   
	    WebElement Bagitem_select  = Driver.findElement(By.xpath("//p[text()='1 Items']"));
        Thread.sleep(2000);
        Bagitem_select.click();
        
        WebElement Edit_bag  = Driver.findElement(By.xpath("//p[text()='Edit']"));
        Edit_bag.click();
        
        WebElement Remove_itemselect = Driver.findElement(By.xpath("//div[@class='css-1l5d7z5 e1whhlt1']"));
        Remove_itemselect.click();
       
        WebElement Remove_item = Driver.findElement(By.xpath("//button[text()='Remove']"));
        WebDriverWait Wait = new WebDriverWait(Driver,30);
        Wait.until(ExpectedConditions.visibilityOf(Remove_item));
        Remove_item.click();
}

public static void main(String[] args) throws InterruptedException {
	
	   BrowserLaunch();
	   LoginDetails();
	   ProductDetails();
	   PaymentDetails();
	   ProductRemoveDetails();
	
}

}
