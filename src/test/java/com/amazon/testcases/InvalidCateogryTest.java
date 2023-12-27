package com.amazon.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseclass;
import com.amazon.qa.pages.InvalidCateogrySearch;

public class InvalidCateogryTest extends TestBaseclass{

	InvalidCateogrySearch invalisearchobj;
	
	@BeforeMethod
	public void step() {
		launchBrowser();
		invalisearchobj = new InvalidCateogrySearch();
		invalisearchobj.initElements();
		
		
	}
	
	@Test
	public void clickOnElectronicsAndSearchTshirt() {
		invalisearchobj.HeaderlistElectronics();
		invalisearchobj.SearchTshirtinSearchBar();
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
