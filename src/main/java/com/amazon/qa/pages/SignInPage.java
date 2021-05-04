package com.amazon.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignInPage extends TestBase{

		//Page Factory- OR
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement CreateAccount;
	
	@FindBy(xpath="//span[contains(text(),'Need help?')]")
	WebElement NeedHelp;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-logo']")
	WebElement AmazonLogo;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement createYourAmazonAccount;
	
	public SignInPage() throws IOException {
		
		PageFactory.initElements(driver, this);				//Initialize all @FindBy Page Factory elements
		
		// TODO Auto-generated constructor stub
	}
	//Actions:
	public String ValidateSignInPageTitle() {
		return driver.getTitle();
	}
	public Boolean ValidateLogo() {
		return AmazonLogo.isDisplayed();
	}
	
	public  AmazonRegistrationPage clickCreateYourAmazonAccount() {
		createYourAmazonAccount.click();
		return new AmazonRegistrationPage();
	}
	public SignIn2Page Login(String em) throws IOException {				// return Type is SignIn2Page
		email.sendKeys(em);
		Continue.click();
		
		return new SignIn2Page();						// return SignIn2 Page class object
		 
	}
	
	
	
	
	
	
	
}
 

























































