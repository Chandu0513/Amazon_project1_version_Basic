package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBaseclass;

public class InvalidCateogrySearch extends TestBaseclass{

	TestBaseclass baseObj = null;

	@FindBy(xpath = "//a[normalize-space()='Electronics']")
	WebElement Electronics;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement Searchbar;



	public void initElements() {
		PageFactory.initElements(driver, this);
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

	public void SearchTshirtinSearchBar() {
		Searchbar.click();
		Searchbar.sendKeys("Tshirt");


	
	WebElement AllInDropdown = driver.findElement(By.xpath("//span[ text()='All']"));
	if (AllInDropdown.isDisplayed()) {
		System.out.println("Verification Passed: All is displayed in the global dropdown.");
	} else {
		System.out.println("Verification Failed: All is not displayed in the global dropdown.");
	}

}



}
