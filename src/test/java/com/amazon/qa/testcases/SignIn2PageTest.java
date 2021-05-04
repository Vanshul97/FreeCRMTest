package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;

public class SignIn2PageTest extends TestBase{
	SignInPage signInPage;
	SignIn2Page signIn2Page;
	HomePage homePage;
	
	public  SignIn2PageTest() {									//Call Test Base Class Constructor
		// TODO Auto-generated constructor stub
		super();
	} 
	//Test Cases should be independent
	//After each Test case close browser
	@BeforeMethod
	public void Setup() throws IOException   {
		intialization();
		signInPage=new SignInPage();					//SignInpage class Object
		signIn2Page=signInPage.Login(prop.getProperty("PhoneNo"));	
		
	}	
	@Test(priority=1)
	public void ValidateSignIn2PageTitle() throws IOException {
		String Title=signIn2Page.ValidateSignIn2PageTitle();
		Assert.assertEquals(Title, "Amazon Sign-In","SignIn2Page title not matched");		
	}
	
	@Test(priority=2)
	public void signIn2PageContinueTest() throws IOException {
		homePage=signIn2Page.SignIn(prop.getProperty("Password"));			// Storing HomePage object in reference
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
