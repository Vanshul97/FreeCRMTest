package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.util.TestUtil;

public class TestBase {
// Class

	public static WebDriver driver; // Global Variable
	public static Properties prop; // Global Variable

	public TestBase() { // Constructor
		try {
			prop = new Properties(); // object for Properties Class
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Vanshul Suneja\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties"); // get
																																				// the
																																				// location
																																				// of
																																				// //
																																				// file
			prop.load(ip); // once stream is established,load object
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void intialization() {
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vanshul Suneja\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String url = prop.getProperty("URL");
		driver.get(url);

	}
}
