package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseclass;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.util.TestUtilitys;
import com.relevantcodes.extentreports.LogStatus;


public class HomapageTestcase extends TestBaseclass {
	
	Homepage homepageObj;
	TestUtilitys testUtil;
	
	
		
	@BeforeMethod
	public void setUp()
	{
		launchBrowser();
		testUtil = new TestUtilitys();
		homepageObj = new Homepage();
	}
	
	@Test
	public void LandedOnAmazonHomepage()
	{
		
		String homePageTitle = homepageObj.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Home page title not matched");
		
		
		
		
	}

    
	
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
}
