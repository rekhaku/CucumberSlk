package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.utils.PageUtils;

public class CorporateSecretaryPage  extends BasePageObject{
	
		
	@FindBy(id = "step2")
	public static WebElement accountingStep2;
	
	@FindBy(id = "step4")
	public static WebElement accountingStep4;

	@FindBy(id = "step7")
	public static WebElement accountingStep7;
	
	@FindBy(xpath = "//div[contains(@class,'accounting-price-label')]//div//p")
	public static WebElement accountingLabel;
	
	@FindBy(xpath = "//div[contains(@class,'accounting-price-content')]//div//p")
	public static WebElement accountingContent;
	
	public CorporateSecretaryPage()
	{
		
		this.setId("CorporateSecretary");
		this.setAddress(PageUtils.getReference(this.getId()));
		this.setWebTitle(PageUtils.getReference("CorporateSecretary_Title"));
	}



}
