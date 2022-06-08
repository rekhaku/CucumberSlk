package com.cucumber.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.framework.settings.BrowserSettings;

public class TestBase {

	public static WebDriver driver;
	
	public void setDriver() throws Exception
	{
		driver = BrowserSettings.launchBrowser("chrome");
		System.out.println(this.getClass());
	}
}
