package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OnePlus9ProMorningMistPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "")
	WebElement addToCart;

	@FindBy(xpath = "")
	WebElement buyNow;

	public OnePlus9ProMorningMistPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public ShoppingCartPage addToCart() {
		addToCart.click();
		return new ShoppingCartPage();
	}

	public String onePlus9ProMorningMistPageTitle() {
		return driver.getTitle();

	}

	public Boolean BuyNowIcon() {
		return buyNow.isDisplayed();
	}

}
