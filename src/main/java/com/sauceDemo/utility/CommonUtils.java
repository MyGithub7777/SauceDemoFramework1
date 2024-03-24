package com.sauceDemo.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.sauceDemo.testBase.TestBase;

public class CommonUtils extends TestBase {

	//Dropdown hanling 
	public void handleDropdownByVisibleText(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	//switch on child window
	public void switchToChildWindow()
	{
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(all_ids);
		driver.switchTo().window(al.get(1));
	}
	
	//switch to parent window
	public void switchToParentWindow()
	{
		String parentid = driver.getWindowHandle();
		driver.switchTo().window(parentid);
	}
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	//takescreenshot 
	public static void takeScreenshotOfWebpage(String filename)
	{
		String path = "D:\\Workspace\\eclipse-workspace\\SauceDemoFramework\\screenshot\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);		
		File des = new File(path +filename+".png");
		try 
		{
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
