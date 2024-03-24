package com.sauceDemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver driver;	
	public Loginpage(WebDriver d)       
	{
		driver = d;
	}
	
	//Object repo 
	private By username_txtbox = By.xpath("//input[@id='user-name']");
	private By password_txtbox = By.xpath("//input[@id='password']");
	private By login_btn = By.xpath("//input[@id='login-button']");	
	
	
	// Action method
	public void enterUsername(String username)
	{
		driver.findElement(username_txtbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
}
