package com.sauceDemo.testLayer;

import org.testng.annotations.Test;

import com.sauceDemo.pageLayer.Inventorypage;
import com.sauceDemo.pageLayer.Loginpage;
import com.sauceDemo.testBase.TestBase;

public class FilterTest extends TestBase {

	@Test
	public void filterTest() throws InterruptedException
	{
		Loginpage login_obj = new Loginpage(driver);
		Inventorypage inv_obj = new Inventorypage(driver);
		
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.clickOnLoginButton();
		Thread.sleep(3000);
		inv_obj.selectOptionFromDropdown("Price (low to high)");
		logger.info("selected filter");
	}
}
