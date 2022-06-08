package com.cucumber.framework.settings;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.framework.utils.Configuration;


public class BrowserSettings {
	
	
	
	public static WebDriver launchBrowser(String browserName) throws Exception {
		WebDriver driver;
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",new Configuration("src/main/resources/Configuration.properties").getProperties().getProperty("chromePath"));
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			return driver;
		default:
			throw new Exception("Browser not found");
		}
	}
}
