/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
Simple test for TestNG*/
package com.alex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test10 {

	@Test
	public void pageTest1() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened!");
		driver.quit();
	}

	@Test
	public void pageTest2() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/large");
		System.out.println("Page opened!");
		driver.quit();
	}

}
