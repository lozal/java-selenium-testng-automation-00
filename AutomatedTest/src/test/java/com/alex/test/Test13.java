/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Implicit Wait and Explicit Wait  - example. This class shows Implicit Wait*/

package com.alex.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test13 {

	@Test
	public void visibilityTest() {
		// Creating driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait settings
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Opening page
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		System.out.println("Page opened!");

		// Clicking start button
		WebElement startButton = driver.findElement(By.xpath("//button"));
		startButton.click();

		// Waiting for Hello World! text (Implicit Wait)

		// Verifying Hello World text
		WebElement finishText = driver.findElement(By.id("finish"));
		String text = finishText.getText();
		Assert.assertTrue(text.equals("Hello World!"), "'Hello World! text is not present on the page.'");

		// Closing browser
		driver.quit();
	}

}
