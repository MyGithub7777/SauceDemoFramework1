package com.sauceDemo.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pageLayer.Loginpage;
import com.sauceDemo.testBase.TestBase;

public class LoginpageTest extends TestBase {
	
	@Test
	public void verifyLoginTest()
	{
		String expected_op =  "https://www.saucedemo.com/inventory.html";
		Loginpage login_obj = new Loginpage(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.clickOnLoginButton();
		logger.info("logged in app");
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_op);
	}

}
