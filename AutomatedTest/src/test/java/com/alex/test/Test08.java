/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Scrolling - example*/

package com.alex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test08 {

	@Test
	public void simpleTest() {
		// Creating driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening page
		driver.get("http://the-internet.herokuapp.com/large");
		System.out.println("Page opened!");

		// Waiting 3 sec
		sleep(3000);

		// Scrolling. The scrollBy() method involves two parameters, x and y, that
		// represent the horizontal and vertical pixel values.
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,250)", "");

		// Waiting 3 sec
		sleep(3000);

		// Finding element
		WebElement table = driver.findElement(By.id("large-table"));

		// This will scroll until the element is in view
		jsExecutor.executeScript("arguments[0].scrollIntoView();", table);

		// Waiting 3 sec
		sleep(3000);

		// Closing browser
		driver.quit();
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
