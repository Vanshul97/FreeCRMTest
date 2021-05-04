package com.amazon.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OnePlus9ProPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//span[contains(text(),'OnePlus 9 Pro Morning Mist')]")
	WebElement onePlus9ProMorningMist;

	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
	WebElement sortBy;

	public OnePlus9ProPage() throws IOException {

		PageFactory.initElements(driver, this); // Initialize Page Factory objects

	}

	// Actions:
	public String onePlus9ProPageTitle() {
		return driver.getTitle();
	}

	public OnePlus9ProMorningMistPage selectChecboxByBrand(String Brand) // In case For Dynamic Xpath create function
																			// not FindBy
	{
		driver.findElement(By.xpath("//span[contains(text(),'" + Brand + "')]//preceding::label//parent::div")).click();
		return new OnePlus9ProMorningMistPage();
	}

	public OnePlus9ProMorningMistPage selectMorningMistVariant() {
		onePlus9ProMorningMist.click();
		return new OnePlus9ProMorningMistPage(); // Object of Next Page
	}

	
	/*public void chooseSortBy(String value) {
		List<WebElement> Options = driver.findElements(By.xpath("//span[@class='a-dropdown-prompt']"));
		System.out.println(Options.size());
		for (int i = 0; i < Options.size(); i++) {											//Need Enhancement						
			System.out.println(Options.get(i).getText());
			if (Options.equals(value)) {
				Options.get(i).click();
				break;
			}
		}
	}*/
}
