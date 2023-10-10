package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;
	
	/**
	 * This will launch the browser
	 * @param browser
	 * @return WebDriver
	 */

	//1 Launch Browser
	
	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	//2 get Url
	public static WebDriver launchUrl(String url) {
		
		driver.get(url);
		return driver;
	}

	//3 get currenturl
	public static String getCurrentTitle() {
		String title = driver.getTitle();
		return title;
	}

	//4 close
	public static void closeBrowser() {
		driver.close();
	}
	
	//5 quit
	public static void terminateBrowser() {
		driver.quit();
	}
	
	//6 getText
	public static String getText(WebElement element) {
		explicitWait(element);
		String text = element.getText();
		return text;
	}
	
	//7 Navigate Forward
	public static void forwardPage() {
		driver.navigate().forward();
	}
	
	//8 send keys
	public static void input(WebElement element, String value) {
		explicitWait(element);
		element.sendKeys(value);	
	}
	//9 click
	public static void clickOnElement(WebElement element) {
		explicitWait(element);
		element.click();
	}
	
	//10 clear
	public static void deleteInput(WebElement element) {
		element.clear();
	}
	
	private static Select dropDownObject(WebElement element) {
		Select s = new Select(element);
		return s;
	}
	
	//11 select by value
	public static void selectbyValue(WebElement element, String ind) {
		dropDownObject(element).selectByValue(ind);
	}

	//11 select by index
		public static void selectbyIndex(WebElement element, int input) {
			dropDownObject(element).deselectByIndex(input);
		}

	//11 select by visible text
		public static void selectbyVisibletext(WebElement element, String sec) {
			dropDownObject(element).deselectByVisibleText(sec);
		}

	//12 ScreenShot
	public static void screenshot() {

		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		String fileName = date.format(dateFormatted);
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File(System.getProperty("user.dir") + "\\screenshots\\" +
			// fileName + ".png");
			File dest = new File(".\\screenshots\\" + fileName + ".png");

			FileHandler.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	//13 screenShot
	public static void screenshot(String fileName) {

		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File(System.getProperty("user.dir") + "\\screenshots\\" +
			// fileName + ".png");
			File dest = new File(".\\screenshots\\" + fileName + ".png");

			FileHandler.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//14 scroll down and up
	public static void scrollUsingCoordinates(int width, int height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + width + "," + height + ");");
	}
	
	//15 Navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	//16 Navigate back
	public static void pageBack(WebElement element) {
		driver.navigate().back();
	}
	
	//17 Navigate refresh
	public static void refresh(WebElement element) {
		driver.navigate().refresh();
	}
	
	//18 Alert accept and dismiss
	public static void confirmAlert(WebElement element, String condition) {

		Alert confirm_alert = driver.switchTo().alert();
		if (condition.equalsIgnoreCase("accept")) {
			confirm_alert.accept();
		} else if (condition.equalsIgnoreCase("dismiss")) {
			confirm_alert.dismiss();
		}

	}

	//19 Alert input
	public static void alertInput(WebElement element, String input) {
		Alert confirm_alert = driver.switchTo().alert();
		confirm_alert.sendKeys(input);
	}
	
	//20 GetAlerttext
	public static void getalerttext() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	}
	
	//21 get current url
	public static void getcurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	//22 get title
	public static void gettitle() {
		System.out.println(driver.getTitle());
	}
	
	//23 get text
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	//24 Actions dropdown
	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
	}
	
	//25 Actions move to element
	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	//26 Actions click
	public static void actionclick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	//27 Actions context click
	public static void contextclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	//28 Actions double click
	public static void doubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
		}
	
	private static Robot robotobj() throws AWTException {
		Robot rt = new Robot();
		return rt;
	}
	
	//29 robots down key press & release
	public static void downkey() throws AWTException {
		robotobj().keyPress(KeyEvent.VK_DOWN);
		robotobj().keyRelease(KeyEvent.VK_DOWN);
	}
	
	//30 robots up key press & release
	public static void upkey() throws AWTException {
		robotobj().keyPress(KeyEvent.VK_UP);
		robotobj().keyRelease(KeyEvent.VK_UP);
	}
	
	//31 robots enter key press & release
		public static void enterkey() throws AWTException {
			robotobj().keyPress(KeyEvent.VK_ENTER);
			robotobj().keyRelease(KeyEvent.VK_ENTER);
		}
		
	//32 get window handles
		public static void switchWindow(int index) {
			Set<String> all_tab_id = driver.getWindowHandles();
			System.out.println(all_tab_id);
			for (String id : all_tab_id) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
			}
		}
		
	//33 get window handle
		public static void windowhandle() {
			String id = driver.getWindowHandle();
			System.out.println(id);
		}
	
	//34 enable
		public static void isenable(WebElement element) {
			System.out.println(element.isEnabled());
		}
		
	//35 displayed
	public static void isDisplayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}
		
	//36 selected
	public static void isSelected(WebElement element) {
		System.out.println(element.isSelected());
	}
	
	//37 deselect by visible text
	public static void deselectbyVisibletext(WebElement element, String des) {
		dropDownObject(element).deselectByVisibleText(des);
	}
	
	//38 deselect by value
	public static void deselectbyValue(WebElement element, String ind) {
		dropDownObject(element).deselectByValue(ind);
	}
	
	//39 deselect by index
		public static void deselectbyIndex(WebElement element, int input) {
			dropDownObject(element).deselectByIndex(input);
		}
		
	//40 is multiple
		public static void ismultiple(WebElement element) {
			Select s = new Select(element);
			System.out.println(s.isMultiple());
		}
		
	//41 get options
		public static void getoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement set : options) {
				System.out.println(set.getText());
			}
		}
		
	//42 get first selected option
		public static void getfirstselectedoptions(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
		
	//43 get all selected option
		public static void getallselectedoption(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selectedOptions : allSelectedOptions) {
				System.out.println(selectedOptions.getText());
			}
		}
	//44 implicit wait
		public static void implicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
		
	//45 web-table allDatas
		public static void webtableAllDatas(List<WebElement> elements) {
			List<WebElement> datas = elements;
			for (WebElement allDatas : datas) {
				System.out.println(allDatas.getText());
			}
		}
		
	//46 web-table rowDatas
		public static void webtableRowDatas(List<WebElement> elements) {
			List<WebElement> rDatas = elements;
			for (WebElement rowDatas : rDatas) {
				System.out.println(rowDatas.getText());
			}
		}
		
	//47 web-table columnDatas
		public static void webtableColumnDatas(List<WebElement> elements) {
			List<WebElement> cDatas = elements;
			for (WebElement columnDatas : cDatas) {
				System.out.println(columnDatas.getText());
			}
		}
		
	//48 web-table singleDatas
		public static void webtableSingleData(WebElement element) {
			System.out.println(element.getText());
		}
		
	//49 frame id
		public static void frameId(String id) {
			driver.switchTo().frame(id);
		}
		
	//50 frame index
		public static void frameIndex(int index) {
			driver.switchTo().frame(index);
		}
		
	//51 frame webelement
		public static void frameWebelement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
	//52 frame exit
		public static void frameExit() {
			driver.switchTo().defaultContent();
		}
		
	//53 outer frame
		public static void outerFrame() {
			driver.switchTo().parentFrame();
		}
		
	//54 scroll down and up
	public static void scroll(String suw, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(suw,element);
	}

	//55 explicit wait
	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	//56 popup blocked
	
	public static void popupBlocked() {
		ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-popup-blocking");
				//ChromeDriver crm = new ChromeDriver(options);
	}

	
	
}
