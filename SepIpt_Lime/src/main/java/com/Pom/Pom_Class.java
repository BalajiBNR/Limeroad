package com.Pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Pom_Class extends Base_Class{

	
	public Pom_Class() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "shopWomen")
	private WebElement shopwomen;
	
	
	public WebElement getShopwomen() {
		return shopwomen;
	}
	
	
	@FindBy(id = "women_category")
	private WebElement womencategory;
	
	public WebElement getWomencategory() {
		return womencategory;
	}
	
	
	@FindBy(xpath = "(//a[text()='kurta kurtis'])[1]")
	private WebElement kurta;
	
	public WebElement getkurta() {
		return kurta;
	}
	
	
	@FindBy(xpath = "//*[@id=\"zero_result\"]/div[4]/a/div[1]")
	private WebElement freshdrops;
	
	public WebElement getproduct() {
		return freshdrops;
	}
	
	@FindBy (xpath = "//img[@alt='women printed kurta']")
	private WebElement correctkurta;
	
	public WebElement getcorrectKurta() {
		return correctkurta;
	}
	
	@FindBy(xpath ="//span[text()=' XL ']")
	private WebElement size;
	
	public WebElement getsize() {
		return size;
	}
	
	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement addtocart;
	
	public WebElement getaddtocart() {
		return addtocart;
	}
}
