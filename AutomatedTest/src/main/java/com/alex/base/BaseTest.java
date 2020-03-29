/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
Best Practices in Test Structure - example*/

package com.alex.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	protected void setUp() {
		// Creating driver
		System.out.println("[Setting up driver]");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod(alwaysRun = true)
	protected void tearDown( ) {
		// Closing driver
		System.out.println("[Closing driver]");
		driver.quit();
	}

}
