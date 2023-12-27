package com.amazon.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseclass;
import com.amazon.qa.pages.Headeroptions;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.util.TestUtilitys;


public class HeaderOptionsTestCase extends TestBaseclass {

	Headeroptions headeroptionsobj;
	TestUtilitys testUtil;

	@BeforeClass
	public void launchbrowser() throws InterruptedException, AWTException
	{
		launchBrowser();

		headeroptionsobj = new Headeroptions();
		headeroptionsobj.initElements();
		headeroptionsobj.Zoomout();
		
		
	}

	
	@Test
	public void selectElectronis() {

		
		headeroptionsobj.HeaderlistElectronics();
	}




	@Test
	public void selectHomeandKitchen() {
		
		headeroptionsobj.HeaderlistHomeandKitchen();
	}

	@Test
	public void selectFashion() {
		

		headeroptionsobj.HeaderlistFashion();

	}

	@Test
	public void selectComputers() {
		
		headeroptionsobj.HeaderlistComputers();
	}


	@Test
	public void selectNewrelease() {
		

		headeroptionsobj.HeaderlistNewrelease();
	}

	@Test
	public void selectMobiles() {
		

		headeroptionsobj.HeaderlistMobiles();
	}




	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

}




