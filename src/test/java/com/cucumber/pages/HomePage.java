package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.helper.TestBase;
import com.cucumber.utils.PageUtils;

public class HomePage extends BasePageObject{
	
		
	@FindBy(linkText = "Pricing")
	public static WebElement pricingLink;
	
	@FindBy(linkText = "#")
	public static WebElement defaultLink;
	
	public HomePage()
	{
		
		this.setId("Home");
		this.setAddress(PageUtils.getReference(this.getId()));
		this.setWebTitle(PageUtils.getReference("Home_Title"));
	}

	
	
}
