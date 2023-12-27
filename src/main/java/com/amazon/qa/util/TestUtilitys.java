package com.amazon.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.qa.base.TestBaseclass;

public class TestUtilitys extends TestBaseclass{

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 20;


	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}


	
	public WebElement getElement(String locatorType, String locatorValue)
	{
		String value =  locatorType.toUpperCase();
		WebElement element = null;
		switch(value)
		{
		case "XPATH":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "ID":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "NAME":
			element = driver.findElement(By.name(locatorValue));
			break;
		case "CSS":
			element = driver.findElement(By.cssSelector(locatorValue));
			break;
		case "TAGNAME":
			element = driver.findElement(By.tagName(locatorValue));
			break;
		}
		return element;
	}
	
	public void switchToAnotherWindow(String WindowID)
	{
		driver.switchTo().window(WindowID);
	}
	
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String id)
	{
		driver.switchTo().frame(id);
	}
	
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public String getWindowId()
	{
		return driver.getWindowHandle();
	}
	
	public Set<String> getAllWindowsId()
	{
		return driver.getWindowHandles();
	}
	
	public Alert switchToAlert()
	{
		 return driver.switchTo().alert();
	}
	
	public void  acceptAlert()
	{
		switchToAlert().accept();
	}
	
	public void cancelAlert()
	{
		switchToAlert().dismiss();
	}
	
	
	
	
	public void mouseOverElement(WebDriver driver,WebElement element)
	{
			new Actions(driver).moveToElement(element).build().perform();
	}
	
	public void moveToElement(WebDriver driver, WebElement ele) {
		
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			actions.moveToElement(ele).build().perform();
			ele.getText();
			
	}

	public void mouseover(WebDriver driver, WebElement ele) 
	{
			new Actions(driver).moveToElement(ele).build().perform();
	}
	
	
	public void draganddrop(WebDriver driver,WebElement source, WebElement target)
	{
			new Actions(driver).dragAndDrop(source, target).perform();
	}
	
	

	
	public void rightclick(WebDriver driver,WebElement ele) 
	{
		
			Actions clicker = new Actions(driver);
			clicker.contextClick(ele).perform();
			
	}
}
		
	



