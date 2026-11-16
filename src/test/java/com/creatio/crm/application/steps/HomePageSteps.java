package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.application.elements.HomePageElements;

public class HomePageSteps extends HomePageElements {
	
public HomePageSteps(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void verifyHomePageHeaderisDisplayed() {
	waitForElement(homePageHeader,10);
	
}

public void selectLocationFromDropDown(String option) {
	waitForElement(locationDropDown,10);
	selectDropdownOption(locationDropDown,"visibletext",option);
		
}
public void selectNoOfRoomFromDropDown(String option) {
	waitForElement(roomDropDown,10);
	selectDropdownOption(roomDropDown,"visibletext",option);
	
}
public void selectRoomTypeFromDropDown(String option) {
	waitForElement(roomType,10);
	selectDropdownOption(roomType,"visibletext",option);

}

public void clickSearchButton() {
	waitForElement(submitButton,10);
	click(submitButton);
	
}



}
