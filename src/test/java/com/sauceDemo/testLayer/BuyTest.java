package com.sauceDemo.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pageLayer.CheckoutPage;
import com.sauceDemo.pageLayer.Inventorypage;
import com.sauceDemo.pageLayer.Loginpage;
import com.sauceDemo.testBase.TestBase;
import com.sauceDemo.utility.UtilClass;

public class BuyTest extends TestBase {
	
	@Test
	public void buyProductTest()
	{
		String expected_result = "Thank you for your order!";
		Loginpage login_obj = new Loginpage(driver);
		Inventorypage inv_obj = new Inventorypage(driver);
		CheckoutPage checkout_obj = new CheckoutPage(driver);
		UtilClass util = new UtilClass(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.clickOnLoginButton();
		logger.info("Object creation");
		
		inv_obj.clickOnProduct();
		util.clickOnAddToCart();
		inv_obj.clickOnCartLink();
		logger.info("product added to cart");
		
		checkout_obj.clickOnCheckoutButton();
		checkout_obj.fillYourInfo("David", "Waner", "505225");
		checkout_obj.clickOnContinueButton();
		checkout_obj.clickOnFinishButton();
		logger.info("product placed");
		String actual_result = checkout_obj.getStatus();
		
		Assert.assertEquals(actual_result, expected_result);
				
	}

}
