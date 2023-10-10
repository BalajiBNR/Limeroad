package com.Step;

import org.openqa.selenium.WebDriver;

import com.Base.Base_Class;
import com.Pom.Pom_Class;
import com.Runner.Runner_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_Class extends Base_Class{
	
	public WebDriver driver = Runner_Class.driver;
	Pom_Class Hp = new Pom_Class();


	@When("user launch the url {string}")
	public void user_launch_the_url(String url) {
	    launchUrl(url);
	}
	
	@When("user click the on shop women")
	public void user_click_the_on_shop_women() throws InterruptedException {
		clickOnElement(Hp.getShopwomen());
		Thread.sleep(10000);
		popupBlocked();
	}

	@When("user mouse over to women")
	public void user_mouse_over_to_women() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(Hp.getWomencategory());
	    popupBlocked();
	}

	@When("user click on kurta kurtis")
	public void user_click_on_kurta_kurtis() throws Exception {
		Thread.sleep(5000);
	   clickOnElement(Hp.getkurta());
	   popupBlocked();
	}

	@When("user click on first kurta")
	public void user_click_on_first_kurta() throws InterruptedException {
		Thread.sleep(5000);
	   clickOnElement(Hp.getproduct());
	   popupBlocked();
	}
	
	@When("user click on right kurta")
	public void user_click_on_right_kurta() throws InterruptedException {
		Thread.sleep(5000);
	    Hp.getcorrectKurta().click();
	    popupBlocked();
	}

	@When("user click on kurta size")
	public void user_click_on_kurta_size() {
	    clickOnElement(Hp.getsize());
	    popupBlocked();
	}

	@When("user click on add to cart")
	public void user_click_on_add_to_cart() {
	    clickOnElement(Hp.getaddtocart());
	    popupBlocked();
	}
}
