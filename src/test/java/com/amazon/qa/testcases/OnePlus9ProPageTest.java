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
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;

public class OnePlus9ProPageTest extends TestBase{
	SignInPage signInPage;
	SignIn2Page signIn2Page;
	HomePage homePage;
	OnePlus9ProPage oneplus9proPage;
	OnePlus9ProMorningMistPage onePlus9ProMorningMistPage;
	

	public  OnePlus9ProPageTest() {
		// Call Test Base Class Constructor
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
		String Title=oneplus9proPage.onePlus9ProPageTitle();
		Assert.assertEquals(Title,"Amazon.com : one plus 9 pro","Page title not correct");
	}
	@Test(priority=2)
	public void OnePlu9ProContinueTest() {
		onePlus9ProMorningMistPage=oneplus9proPage.selectMorningMistVariant();									//Reference variable of next page
	}
	@Test(priority=3)							//Needs further Enhancements
	public void ClickCheckBox() {
		onePlus9ProMorningMistPage=oneplus9proPage.selectChecboxByBrand((prop.getProperty("Brand")));		//Reference variable of next page
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}


