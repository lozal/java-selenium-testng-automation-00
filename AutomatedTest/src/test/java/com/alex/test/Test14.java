/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Soft Assertions - example*/

package com.alex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test14 {

	@Test
	public void simpleTest() {
		// Creating a driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening page
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened!");

		// Assertion
		SoftAssert softAssert = new SoftAssert();

		// Login page elements operating
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Sending username and password: tomsmith / SuperSecretPassword!
		username.sendKeys("tomsmith");
		password.sendKeys("SuperSecretPassword!");

		// Clicking Login button
		loginButton.click();

		// Waiting for the element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='button secondary radius']")));

		// Verifications - Soft Assertions
		WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		softAssert.assertTrue(logOutButton.isDisplayed(), "Logout button is not displayed");

		String pageSource = driver.getPageSource();
		softAssert.assertTrue(pageSource.contains("You logged!!! into a secure area!"),
				"Page source does not contain expected text.");

		softAssert.assertAll();

		// Closing browser
		driver.quit();

	}

}
