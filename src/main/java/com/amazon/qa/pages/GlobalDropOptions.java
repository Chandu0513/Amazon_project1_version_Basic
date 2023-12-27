package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBaseclass;

public class GlobalDropOptions extends TestBaseclass{

	TestBaseclass testobj = new TestBaseclass();

	@FindBy(id = "searchDropdownBox")
	WebElement SearchDropDown;

	public GlobalDropOptions()
	{
		testobj = new TestBaseclass();
		initElements();
	}

	public void initElements()
	{
		PageFactory.initElements(TestBaseclass.getDriver(),this);
	}

	public void SelectBooksInDropDown() {

		SearchDropDown.click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByIndex(11);
		
		WebElement text = driver.findElement(By.xpath("//span[ text()='Books']"));
		if (text.isDisplayed()) {
			System.out.println("Verification Passed: Books is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Books is not displayed in the global dropdown.");
		}
	}

	
	public void SelectComputersAndAccessoriesInDropDown() {

		SearchDropDown.click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByIndex(15);
		
		WebElement text = driver.findElement(By.xpath("//span[ text()='Computers & Accessories']"));
		if (text.isDisplayed()) {
			System.out.println("Verification Passed: Computers & Accessories is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Computers & Accessories is not displayed in the global dropdown.");
		}
	}
	
	public void SelectElectronicsInDropDown() {

		SearchDropDown.click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByIndex(16);
		
		WebElement text = driver.findElement(By.xpath("//span[ text()='Electronics']"));
		if (text.isDisplayed()) {
			System.out.println("Verification Passed: Electronics is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Electronics is not displayed in the global dropdown.");
		}
	}
	
	public void SelectFashionInDropdown() {
		SearchDropDown.click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByIndex(3);
		
		WebElement text = driver.findElement(By.xpath("//span[ text()='Amazon Fashion']"));
		if (text.isDisplayed()) {
			System.out.println("Verification Passed: Amazon Fashion is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Amazon Fashion is not displayed in the global dropdown.");
		}
	}
		
	
	public void DefaultAllOptionInDropdown() {
		
		
		
		
		WebElement text = driver.findElement(By.xpath("//span[ text()='All']"));
		if (text.isDisplayed()) {
			System.out.println("Verification Passed: All is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: All is not displayed in the global dropdown.");
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}




