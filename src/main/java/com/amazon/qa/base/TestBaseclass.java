package com.amazon.qa.base;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import com.amazon.qa.util.TestUtilitys;
import com.amazon.qa.util.WebListners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebListners eventListener;
	
	public String getConfigValue(String key) {
		String value = "";
		try {
			File file = new File("./src/main/java/com/amazon/qa/config/config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			prop = new Properties();
			prop.load(fileInput);
			value = prop.getProperty(key);
		} catch (IOException i) {

		}
		return value;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void launchBrowser() {
		String browserName = getConfigValue("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser name");
			Assert.assertTrue(false);
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		
		// create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebListners();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilitys.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilitys.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	

}
