package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBaseclass;
import com.github.dockerjava.api.model.Driver;

public class Homepage extends TestBaseclass {

	TestBaseclass baseObj = null;
	
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		 return driver.getTitle();
		
	}
		
		
	}



