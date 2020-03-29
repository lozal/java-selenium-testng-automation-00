/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
   Login page - a part of Page Object Models example*/

package com.alex.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.alex.base.BaseTest;
import com.herokuapp.LogInPage;
import com.herokuapp.SecurePage;

public class Test12 extends BaseTest {

	@Test
	public void simpleTest() {
		LogInPage logInPage = new LogInPage(driver);
		// Opening page
		logInPage.open();

		// Clicking Login button
		SecurePage securePage = logInPage.logIn();
		securePage.waitForSecurePage(10000);

		// Verifications
		Assert.assertTrue(securePage.isLogOutButtonVisible(), "Logout button in not displayed");
		Assert.assertTrue(securePage.getPageSource().contains("You logged into a secure area!"),
				"Page source does not contain expected text.");
		// Closing browser
		driver.quit();

	}
}
