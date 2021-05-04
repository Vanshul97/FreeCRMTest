package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory- OR;
	@FindBy(xpath = "//span[contains(text(),'Hello, Vanshul')]")
	WebElement HelloUser;

	@FindBy(xpath = "//A[@id='nav-cart']")
	WebElement CartIcon;

	@FindBy(xpath = "//a[@class='nav-logo-link nav-progressive-attribute']")
	WebElement AmazonHomeLogo;

	@FindBy(xpath = "//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement ReturnsandOrders;

	@FindBy(xpath = "//span[contains(text(),'Deliver to Vanshul')]")
	WebElement DeliverTo;

	@FindBy(xpath = "//INPUT[@id='twotabsearchtextbox']")
	WebElement SearchTextBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement SearchButton;
	
	@FindBy(xpath = "(//a[contains(text(),'Today')])[1]")
	WebElement todaysDeal;
	
	@FindBy(xpath = "//span[@class='nav-text' and contains(text(),'Orders')]")
	WebElement yourAccountOrders;

	public HomePage() throws IOException {

		PageFactory.initElements(driver, this); // Initialize all @FindBy Page Factory elements

		// TODO Auto-generated constructor stub
	}

	// Actions

	public String HomePageTitle() {
		return driver.getTitle();
	}

	public Boolean HelloUser() {
		return HelloUser.isDisplayed();

	}

	public Boolean HomePageLogo() {
		return AmazonHomeLogo.isDisplayed();

	}

	public Boolean ReturnsOrderIcon() {
		return ReturnsandOrders.isDisplayed();

	}

	public Boolean DeliverToIcon() {
		return DeliverTo.isDisplayed();

	}

	public  OnePlus9ProPage EnterProduct(String prod) throws IOException {
		SearchTextBox.sendKeys(prod);
		SearchButton.click();
		return new OnePlus9ProPage();

	}
	public void  ClickAllIcon() {
	}
	public YourOrders clickYourAccountOrders() {
		Actions action= new Actions(driver);
		action.moveToElement(HelloUser).build().perform();
		yourAccountOrders.click();
		return new YourOrders();
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
