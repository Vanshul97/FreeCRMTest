package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AmazonRegistrationPage;
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;

public class SignInPageTest extends TestBase {
	SignInPage signInPage;
	SignIn2Page signIn2Page;					//SignIn2 page Class Reference
	AmazonRegistrationPage amazonRegistrationPage;
	public SignInPageTest()  {
				 super();					//Call Test Base Class Constructor
		
		}


	@BeforeMethod
	public void Setup() throws IOException   {
		intialization();
		signInPage=new SignInPage();					//SignInpage class Object
		
	}
	
	@Test(priority=1)
	public void ValidateSignInPageTitle() {
		String Title=signInPage.ValidateSignInPageTitle();
		Assert.assertEquals(Title, "Amazon Sign-In");
	}
	@Test(priority=2)
	public void signInPageLogoTest() {
		Boolean flag=signInPage.ValidateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void signInPageContinueTest() throws IOException {
		signIn2Page=signInPage.Login(prop.getProperty("PhoneNo"));			// Storing SignIn2page object in reference
	}
	@Test(priority=4)
	public void validateCreateYourAmazonAccount() throws IOException {
		amazonRegistrationPage=signInPage.clickCreateYourAmazonAccount();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
}
