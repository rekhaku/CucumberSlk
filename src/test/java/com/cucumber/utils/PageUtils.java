package com.cucumber.utils;

import org.openqa.selenium.WebElement;

import com.cucumber.framework.utils.Configuration;
import com.cucumber.pages.BasePageObject;
import com.cucumber.pages.CorporateSecretaryPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.PricingPage;

public class PageUtils {

	public static BasePageObject getPage(String text) {

		switch (text) {
		case "Home":
			return new HomePage();
		case "Pricing":
			return new PricingPage();
		case "CorporateSecretary" :
			return new CorporateSecretaryPage();
		
		default:
			return new HomePage();
		}

	}
	
	public static WebElement getLink(String text) {

		switch (text) {
		case "Pricing":
			return HomePage.pricingLink;
		case "Find out more" :
			return PricingPage.findOutMoreButton;
		case "Step 2" :
			return CorporateSecretaryPage.accountingStep2;
		case "Step 4" :
			return CorporateSecretaryPage.accountingStep4;
		case "Step 7" :
			return CorporateSecretaryPage.accountingStep7;
		default:
			return HomePage.pricingLink;
		}

	}

	public static String getReference(String text) {

		String s = new Configuration("src/test/resources/Properties/PageReference.properties").getProperties()
				.getProperty(text);
		return s;
	}

}
