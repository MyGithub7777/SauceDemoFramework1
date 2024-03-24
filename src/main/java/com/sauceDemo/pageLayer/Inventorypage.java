package com.sauceDemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sauceDemo.utility.CommonUtils;

public class Inventorypage {
	
	private WebDriver driver;
	private CommonUtils common_utils;
	public Inventorypage(WebDriver d)
	{
		driver = d;
		common_utils = new CommonUtils();
	}
	
	//object Repo 
	private By product_link = By.xpath("//a[@id='item_4_title_link']");
	private By cart_link = By.xpath("//a[@class='shopping_cart_link']");
	private By menu_link = By.xpath("//button[@id='react-burger-menu-btn']");
	private By logout_link = By.xpath("//a[@id='logout_sidebar_link']");
	private By sort_dropdown = By.xpath("//select[@class='product_sort_container']");
	
	// Action method
	public void clickOnProduct()
	{
		driver.findElement(product_link).click();
	}
	
	public void clickOnCartLink()
	{
		driver.findElement(cart_link).click();
	}
	
	public void clickOnMenuLink()
	{
		driver.findElement(menu_link).click();
	}
	
	public void clickOnLogoutLink()
	{
		driver.findElement(logout_link).click();
	}
	
	public void selectOptionFromDropdown(String text)
	{
		WebElement element = driver.findElement(sort_dropdown);
		common_utils.handleDropdownByVisibleText(element, text);
	}

}
