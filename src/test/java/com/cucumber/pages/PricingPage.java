package com.cucumber.pages;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.utils.PageUtils;

public class PricingPage extends BasePageObject{
	
//	@FindBy(how = How.CLASS_NAME , using = "accounting-price-label" )
//	public static List<WebElement> accountingPriceLabel;
//	
//	@FindBy(how = How.CLASS_NAME , using = "accounting-price-content" )
//	public static List<WebElement> accountingPriceContent;
//	
	@FindBy(xpath = "//a[contains(@href,'/sg/corporate-secretary-singapore/')]")
	public static WebElement findOutMoreButton ;
	
	public PricingPage()
	{
		
		this.setId("Pricing");
		this.setAddress(PageUtils.getReference(this.getId()));
		this.setWebTitle(PageUtils.getReference("Pricing_Title"));
	}
	
	//public ge
	
//	//	}
}
