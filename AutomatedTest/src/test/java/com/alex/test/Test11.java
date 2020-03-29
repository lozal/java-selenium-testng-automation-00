/* Test automation using Java & Selenium. Set of examples. Created by Alex L. 
This class used with BaseTest class*/
package com.alex.test;

import org.testng.annotations.Test;
import com.alex.base.*;

public class Test11 extends BaseTest {

	@Test
	public void pageTest1() {
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page opened!");
	}

	@Test
	public void pageTest2() {
		driver.get("http://the-internet.herokuapp.com/large");
		System.out.println("Page opened!");
	}

}
