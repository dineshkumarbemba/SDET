package com.creatio.crm.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.utilities.PropUtil;
import com.creatio.crm.framework.web.commons.WebCommons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {

	public LoginPageSteps loginPage;

	@Given("Initialize the page objects")
	public void initialize_the_page_objects() {
		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
	}

	@Given("user has launched the application.")
	public void user_has_launched_the_application() {
		loginPage.launchTheApplication();
		
	}

	@When("verify the homepage application logo is displayed")
	public void verify_the_homepage_application_logo_is_displayed() {
		
		loginPage.verifyLogoDisplayed();
	}

	@When("user click forgot password link and verify the text available in the forgot password page.")
	public void user_click_forgot_password_link_and_verify_the_text_available_in_the_forgot_password_page() throws IOException {
		String expectedText=WebCommons.readTestData("Login",1,13);
		loginPage.clickForgotPasswordLink(expectedText);
	}

	@When("user has entered the username and password.")
	public void user_has_entered_the_username_and_password() {
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
		String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		
	}

	@Then("user clicked the login button.")
	public void user_clicked_the_login_button() {
		loginPage.clickLoginButton();		
	}
}
