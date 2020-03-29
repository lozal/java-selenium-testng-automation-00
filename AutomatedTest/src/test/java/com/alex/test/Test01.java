/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Opening a page - example*/
package com.alex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {

	@Test
	public void simpleTest() {
		// Creating a driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Opening page
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened!");
		
		//Closing browser
		driver.quit();
	}

}
