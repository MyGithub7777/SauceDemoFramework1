package com.sauceDemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//-------Obj repo ----------
	private By checkout_btn = By.xpath("//button[text()='Checkout']");
	private By firstname_txtbox = By.xpath("//input[@id='first-name']");
	private By lastname_txtbox = By.xpath("//input[@id='last-name']");
	private By zipcode_txtbox = By.xpath("//input[@id='postal-code']");
	private By continue_btn = By.xpath("//input[@id='continue']");
	private By finish_btn = By.xpath("//button[text()='Finish']");
	private By status_msg = By.xpath("//*[text()='Thank you for your order!']");
	
	//------ Action method-----------
	public void clickOnCheckoutButton()
	{
		driver.findElement(checkout_btn).click();
	}
	
	public void fillYourInfo(String firstname,String lastname, String zipcode)
	{
		driver.findElement(firstname_txtbox).sendKeys(firstname);
		driver.findElement(lastname_txtbox).sendKeys(lastname);
		driver.findElement(zipcode_txtbox).sendKeys(zipcode);
	}
	
	public void clickOnContinueButton()
	{
		driver.findElement(continue_btn).click();
	}
	
	public void clickOnFinishButton()
	{
		driver.findElement(finish_btn).click();
	}
	
	public String getStatus()
	{
		return driver.findElement(status_msg).getText();
	}
}
