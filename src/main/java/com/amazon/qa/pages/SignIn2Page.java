package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignIn2Page extends TestBase {

	// Page Factory- OR
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")

	WebElement signin;

	public SignIn2Page() throws IOException { // Constructor to initialize all objects

		PageFactory.initElements(driver, this); // Initialize all @FindBy Page Factory elements

		// TODO Auto-generated constructor stub
	}

	// Actions:
	public String ValidateSignIn2PageTitle() {
		return driver.getTitle();
	}

	public HomePage SignIn(String pwd) throws IOException { // return Type is Home Page
		password.sendKeys(pwd);
		signin.click();

		return new HomePage(); // return Home Page class object

	}

}
