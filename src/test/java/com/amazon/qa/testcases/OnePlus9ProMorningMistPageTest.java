package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.OnePlus9ProMorningMistPage;
import com.amazon.qa.pages.OnePlus9ProPage;
import com.amazon.qa.pages.ShoppingCartPage;
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;

public class OnePlus9ProMorningMistPageTest extends TestBase {
	SignInPage signInPage;
	SignIn2Page signIn2Page;
	HomePage homePage;
	OnePlus9ProPage oneplus9proPage;
	OnePlus9ProMorningMistPage onePlus9ProMorningMistPage;
	ShoppingCartPage shoppingCartPage;
	public OnePlus9ProMorningMistPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws IOException {
		intialization();
		signInPage=new SignInPage();					//SignInpage class Object
		signIn2Page=signInPage.Login(prop.getProperty("PhoneNo"));	
		homePage=signIn2Page.SignIn(prop.getProperty("Password"));
		oneplus9proPage=homePage.EnterProduct(prop.getProperty("Product"));	
		
	}
	
	@Test(priority=1)
	public void ValidatePageTitle() {
		String Title=onePlus9ProMorningMistPage.onePlus9ProMorningMistPageTitle();
		Assert.assertEquals(Title, "Amazon.com:OnePlus 9 Pro Model","Wrong Title");
		
	}
	@Test(priority=2)
	public void ValidateBuyNowIcon() {
		Boolean flag =onePlus9ProMorningMistPage.BuyNowIcon();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void ValixdatePageTitle() {
		shoppingCartPage=onePlus9ProMorningMistPage.addToCart();
		
	}
		
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
