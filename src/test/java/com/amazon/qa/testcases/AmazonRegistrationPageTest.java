package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AmazonRegistrationPage;
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;

public class AmazonRegistrationPageTest extends TestBase {
	SignInPage signInPage;
	AmazonRegistrationPage amazonRegistrationPage;
	
	
	public AmazonRegistrationPageTest() {
		super();
		
	}
	@BeforeMethod
	public void Setup() throws IOException {
		intialization();
		signInPage=new SignInPage();
		amazonRegistrationPage=signInPage.clickCreateYourAmazonAccount();
	}
	/*@DataProvider									//Will Implement Data Driven Approach later
	public void getTestData() {
		
	}
	@Test(priority=1)
	public void validateCreateYourAccount() {
		amazonRegistrationPage.CreateAccount(name, em, pass, repass);
		
	}*/
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
