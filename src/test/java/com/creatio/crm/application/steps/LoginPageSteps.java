package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {
	
	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	public void launchTheApplication() {
		launchApplication();
	}
	
	public void verifyLogoDisplayed() {
		//launchApplication();
		waitForElement(adactinLogo, 10);
		
	}
	
	public void enterUserNameandPassword(String username,String password) {
		waitForElement(userName,10);
		enterText(userName,username);
		
		waitForElement(passWord,10);
		enterText(passWord,password);
		
	}
	public void clickForgotPasswordLink(String expectedText) {
		waitForElement(forgotPasswordLink,10);
		
		click(forgotPasswordLink);
	
		waitForElement(forgotPasswordPage,10);
		String actualText = getElementText(forgotPasswordPage);
		Assert.assertTrue(actualText.contains(expectedText.trim()), 
			    "Failed: Expected header text snippet not found on page.");
			
	}
	public void clickLoginButton() {
		waitForElement(loginButton,10);
	
		click(loginButton);
		
	}
	
	
}
