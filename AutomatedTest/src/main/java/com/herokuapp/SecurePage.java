/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Part of Page Object Models example*/

package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.alex.base.BasePageObject;

public class SecurePage extends BasePageObject {

	By logOutButtonLocator = By.xpath("//a[@class='button secondary radius']");

	public SecurePage(WebDriver driver) {
		super(driver);
	}

	public void waitForSecurePage(long millis) {

		System.out.println("Waiting for secure page");
		WebDriverWait wait = new WebDriverWait(driver, millis);
		wait.until(ExpectedConditions.presenceOfElementLocated(logOutButtonLocator));
	}

	public boolean isLogOutButtonVisible() {
		return find(logOutButtonLocator).isDisplayed();
	}

}
