/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Stale Elements - example*/

package com.alex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test07 {

	@Test
	public void staleElementTest() {
		// Creating driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening page
		driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
		System.out.println("Page opened!");

		// Click on 'Click here'
		WebElement link = driver.findElement(By.linkText("Click here"));
		link.click();

		// Waiting for Notification Message
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

		// Getting and printing message
		WebElement message1 = driver.findElement(By.id("flash"));
		System.out.println("Message: " + message1.getText());

		// Clicking, getting and printing message
		link = driver.findElement(By.linkText("Click here"));
		link.click();
		WebElement message2 = driver.findElement(By.id("flash"));
		System.out.println("Message: " + message2.getText());

		// Clicking, getting and printing message
		link = driver.findElement(By.linkText("Click here"));
		link.click();
		WebElement message3 = driver.findElement(By.id("flash"));
		System.out.println("Message: " + message3.getText());

		// Clicking, getting and printing message
		link = driver.findElement(By.linkText("Click here"));
		link.click();
		WebElement message4 = driver.findElement(By.id("flash"));
		System.out.println("Message: " + message4.getText());
		
		// Closing browser
		driver.quit();
	}

}
