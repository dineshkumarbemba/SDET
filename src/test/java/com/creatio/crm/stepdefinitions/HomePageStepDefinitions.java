package com.creatio.crm.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.web.commons.WebCommons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions {
	public LoginPageSteps loginPage;
	public HomePageSteps homePage;
	@Given("Initialize the page objects for Homepage")
	public void initialize_the_page_objects_for_homepage() {
		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
		homePage = new HomePageSteps(driver);
	}

	@When("user has verify the home page header is displayed.")
	public void user_has_verify_the_home_page_header_is_displayed() {
		homePage.verifyHomePageHeaderisDisplayed();		
	}

	@When("select location from dropdown in homepage.")
	public void select_location_from_dropdown_in_homepage() throws IOException {
		String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown(option);
	}

	@When("select noofrooms dropdown in homepage.")
	public void select_noofrooms_dropdown_in_homepage() throws IOException {
		String option1=WebCommons.readTestData("Login",1,4);
		homePage.selectNoOfRoomFromDropDown(option1);
	}

	@When("select roomtype from dropdown in homepage.")
	public void select_roomtype_from_dropdown_in_homepage() throws IOException {
		String option2=WebCommons.readTestData("Login",1,3);
		homePage.selectRoomTypeFromDropDown(option2);
	}

	@When("user click the searchButton.")
	public void user_click_the_search_button() {
		homePage.clickSearchButton();
	}
}
