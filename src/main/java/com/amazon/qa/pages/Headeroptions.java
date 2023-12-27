package com.amazon.qa.pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.TestBaseclass;

public class Headeroptions extends TestBaseclass {

	TestBaseclass obj = new TestBaseclass();

	@FindBy(xpath = "//a[normalize-space()='Electronics']")
	WebElement Electronics;

	@FindBy(xpath = "//a[normalize-space()='Home & Kitchen']" )
	WebElement HomeandKitchen;

	@FindBy(xpath = "//a[normalize-space()='Fashion']")
	WebElement Fashion;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[16]")
	WebElement Books;

	@FindBy(xpath = "//a[normalize-space()='Computers']")
	WebElement Computers;

	@FindBy(xpath = "//a[normalize-space()='New Releases']")
	WebElement Newrelease;

	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	WebElement seardropDown;
	
	@FindBy(xpath = "//a[normalize-space()='Mobiles']")
	WebElement Mobiles;


	//Actions

	public Headeroptions()
	{
		obj = new TestBaseclass();
		initElements();
	}

	public void initElements()
	{
		PageFactory.initElements(TestBaseclass.getDriver(),this);
	}



	public void HeaderlistElectronics() {
		Electronics.click();

		WebElement electronicsInDropdown = driver.findElement(By.xpath("//span[text()='Electronics']"));
		if (electronicsInDropdown.isDisplayed()) {
			System.out.println("Verification Passed: Electronics is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Electronics is not displayed in the global dropdown.");
		}

	}

	public void HeaderlistHomeandKitchen() {
		HomeandKitchen.click();
		
		WebElement HomeandKitchenInDropdown = driver.findElement(By.xpath("//span[ text()='Home & Kitchen']"));
		if (HomeandKitchenInDropdown.isDisplayed()) {
			System.out.println("Verification Passed: HomeandKitchen is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: HomeandKitchen is not displayed in the global dropdown.");
		}
	}

	public void HeaderlistFashion() {
		Fashion.click();

		WebElement FashionInDropdown = driver.findElement(By.xpath("//span[ text()='Amazon Fashion']"));
		if (FashionInDropdown.isDisplayed()) {
			System.out.println("Verification Passed: Fashion is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Fashion is not displayed in the global dropdown.");
		}
	}

	public void HeaderlistComputers() {
		Computers.click();

		WebElement ComputersInDropdown = driver.findElement(By.xpath("//span[ text()='Computers & Accessories']"));
		if (ComputersInDropdown.isDisplayed()) {
			System.out.println("Verification Passed: Computers & Accessories is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Computers & Accessories is not displayed in the global dropdown.");
		}

	}

	public void HeaderlistNewrelease() {
		Newrelease.click();

		WebElement AllInDropdown = driver.findElement(By.xpath("//span[ text()='All']"));
		if (AllInDropdown.isDisplayed()) {
			System.out.println("Verification Passed: All is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: All is not displayed in the global dropdown.");
		}
	}
	

	
	public void HeaderlistMobiles() {
		Mobiles.click();

		WebElement Mobiles = driver.findElement(By.xpath("//span[ text()='Mobiles & Accessories']"));
		if (Mobiles.isDisplayed()) {
			System.out.println("Verification Passed: Mobiles & Accessories is displayed in the global dropdown.");
		} else {
			System.out.println("Verification Failed: Mobiles & Accessories is not displayed in the global dropdown.");
		}
	}


}
