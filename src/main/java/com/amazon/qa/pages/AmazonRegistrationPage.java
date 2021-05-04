package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class AmazonRegistrationPage extends TestBase{
	
	//Page Factory
	@FindBy(xpath="//input[@name='customerName']")
	WebElement yourName;
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='passwordCheck']")
	WebElement renterPassword;
	
	
	
	
	public AmazonRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void CreateAccount(String name, String em, String pass, String repass)
	{
		yourName.sendKeys(name);
		email.sendKeys(em);
		password.sendKeys(pass);
		renterPassword.sendKeys(repass);
	}
	

}
