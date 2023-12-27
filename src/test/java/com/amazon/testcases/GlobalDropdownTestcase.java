package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseclass;
import com.amazon.qa.pages.GlobalDropOptions;
import com.amazon.qa.pages.Headeroptions;

public class GlobalDropdownTestcase extends TestBaseclass {

	GlobalDropOptions globaldropobj = null;

	@BeforeClass
	public void launchbrowser()

	{

		launchBrowser();
		globaldropobj = new GlobalDropOptions();

	}

	@Test
	public void SelectBooksFromGlobalDropDown() {	

		globaldropobj.SelectBooksInDropDown();
	}

	@Test
	public void SelectElectronicsFromGlobalDropDown() {	

		globaldropobj.SelectElectronicsInDropDown();
	}

	@Test

	public void SelectComputersAndAccessoriesFromGlobalDropDown() throws InterruptedException {

		globaldropobj.SelectComputersAndAccessoriesInDropDown();

	}

	@Test
	public void SelectFashionFromGlobalDropDown() {

		globaldropobj.SelectFashionInDropdown();
	}

	@Test
	public void SelectDefualtOptionAllFromGlobalDropDown() {

		globaldropobj.DefaultAllOptionInDropdown();
	}



	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

	{	


	}

}
