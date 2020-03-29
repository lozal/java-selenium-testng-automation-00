/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Mouse Hover Actions - example*/

package com.alex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test09 {

	
	@Test
	public void simpleTest() {
		// Creating driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening page
		driver.get("http://the-internet.herokuapp.com/hovers");
		System.out.println("Page opened!");
		
		// Finding elements
		WebElement picture = driver.findElement(By.xpath("//div[@class='figure']"));
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'View profile')]"));

		// Mouse Action
		Actions action = new Actions(driver);
		action.moveToElement(picture).build().perform();
		
		// Waiting 3 sec
		sleep(3000);
		
		// Mouse Action
		action.moveToElement(link).click().build().perform();
		
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
