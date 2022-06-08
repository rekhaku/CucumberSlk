package com.cucumber.stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.helper.TestBase;
import com.cucumber.pages.BasePageObject;
import com.cucumber.pages.CorporateSecretaryPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.PricingPage;
import com.cucumber.utils.PageUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pricing extends TestBase {

	BasePageObject page = null;
	@Before
	public void bf() throws Exception {
		TestBase base = new TestBase();
		base.setDriver();

	}

	@Given("I went to the Sleek SG {string} page")
	public void i_went_to_the_Sleek_SG_page(String string) {
		page = PageUtils.getPage(string);
		PageFactory.initElements(driver, page);
		driver.get(page.getAddress());
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
		assertTrue("Pricing link is available", PageUtils.getLink(string).isDisplayed());
		PageUtils.getLink(string).click();

	}

	@Then("I should be navigated to the Sleek SG {string} page")
	public void i_should_be_navigated_to_the_Sleek_SG_page(String string) {
		page = PageUtils.getPage(string);
		PageFactory.initElements(driver, page);
		System.out.println(driver.getTitle());
	}
	
	@Given("I am on the Sleek SG {string} page")
	public void i_am_on_the_Sleek_SG_page(String string) {
		page = PageUtils.getPage(string);
		PageFactory.initElements(driver, page);
		driver.get(page.getAddress());
	}

	
	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		PageUtils.getLink(string).click();
		page = PageUtils.getPage("CorporateSecretary");
		driver.get(page.getAddress());
	}

	@When("I click on {string} circle")
	public void i_click_on_accounting_progress_circle(String string) {
		PageUtils.getLink(string).click();
		
	}


	@Then("Verify corporate secretary details are correct: {string} {string}")
	public void verify_corporate_secretary_details_are_correct(String string, String string2) {
		assertEquals(CorporateSecretaryPage.accountingLabel.getText(),string);
		assertEquals(CorporateSecretaryPage.accountingContent.getText(),string2);
	}


	
	@After
	public void afterExec()
	{
		driver.quit();
	}

}
