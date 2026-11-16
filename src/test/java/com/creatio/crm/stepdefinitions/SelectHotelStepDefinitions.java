package com.creatio.crm.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SelectHotelSteps;
import com.creatio.crm.framework.base.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SelectHotelStepDefinitions {
	
	public LoginPageSteps loginPage;
	public HomePageSteps homePage;
	public SelectHotelSteps selecthotelPage;
	@Given("Initialize the page objects for SelectHotelPage")
	public void initialize_the_page_objects_for_select_hotel_page() {
		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
		homePage = new HomePageSteps(driver);
		selecthotelPage = new SelectHotelSteps(driver);
	}

	@Then("verify the selecthotel header is displayed.")
	public void verify_the_selecthotel_header_is_displayed() {
		selecthotelPage.verifySelectHotelHeaderisDisplayed();
	}

	@Then("click selecthotel Radiobutton from select hotel page.")
	public void click_selecthotel_radiobutton_from_select_hotel_page() {
		selecthotelPage.clickSelectHotelRadioButton();
	}

	@Then("click continueButton.")
	public void click_continue_button() {
		selecthotelPage.clickContinueButton();
	}
}
