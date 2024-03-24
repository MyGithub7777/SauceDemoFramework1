package com.sauceDemo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtilClass {
	
	private WebDriver driver;
	public UtilClass(WebDriver d)
	{
		driver = d;
	}


	//object Repo 
	private By add_to_cart_btn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	
	// Action method
	public void clickOnAddToCart()
	{
		driver.findElement(add_to_cart_btn).click();
	}
}
