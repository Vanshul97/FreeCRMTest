package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.OnePlus9ProPage;
import com.amazon.qa.pages.SignIn2Page;
import com.amazon.qa.pages.SignInPage;
import com.amazon.qa.pages.YourOrders;

public class HomePageTest extends TestBase {
	SignInPage signInPage;
	SignIn2Page signIn2Page;
	HomePage homePage;
	OnePlus9ProPage oneplus9proPage;
	YourOrders yourOrders;


	public HomePageTest() {
		// Call Test Base Class Constructor
		super();
	}
	
	//Test Cases should be independent
		//After each Test case close browser
		@BeforeMethod
		public void Setup() throws IOException   {
			intialization();
			signInPage=new SignInPage();					//SignInpage class Object
			signIn2Page=signInPage.Login(prop.getProperty("PhoneNo"));	
			homePage=signIn2Page.SignIn(prop.getProperty("Password"));
			
		}	
		@Test(priority=1)
		public void ValidateHomePageTitle() throws IOException {
			String Title=homePage.HomePageTitle();
			Assert.assertEquals(Title, "Your Amazon.com","SignIn2Page title not matched");		
		}
		
		@Test(priority=2)
		public void ValidateHelloUser() throws IOException {
			Boolean flag=homePage.HelloUser();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=2)
		public void ValidateHomePageLogo() throws IOException {
			Boolean flag=homePage.HomePageLogo();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=4)
		public void ValidateReturnsandOrder() throws IOException {
			Boolean flag=homePage.ReturnsOrderIcon();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=5)
		public void ValidateDeliverTo() throws IOException {
			Boolean flag=homePage.DeliverToIcon();
			Assert.assertTrue(flag);	
		}			
		@Test(priority=6)
		public void HomePageContinueTest() throws IOException {
			oneplus9proPage=homePage.EnterProduct(prop.getProperty("Product"));			// Storing OnePlus9Pro object in reference
		}
		
		@Test(priority=7)
		public void ValidateYourAccountOrderTest() throws IOException {
			yourOrders=homePage.clickYourAccountOrders();							

		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}


