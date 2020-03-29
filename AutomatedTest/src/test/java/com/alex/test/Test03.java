/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Opening a page: Verifications and Assertions - example*/

package com.alex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test03 {

	@Test
	public void simpleTest() {
		// Creating a driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening page
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened!");

		// Login page elements operating
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Sending username and password: tomsmith / SuperSecretPassword!
		username.sendKeys("tomsmith");
		password.sendKeys("SuperSecretPassword!");

		// Clicking Login button
		loginButton.click();

		// 5 sec waiting
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Verifications
		WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		Assert.assertTrue(logOutButton.isDisplayed(), "Logout button in not displayed");

		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("You logged into a secure area!"),
				"Page source does not contain expected text.");

		// Closing browser
		driver.quit();

	}

}
