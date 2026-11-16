package com.creatio.crm.application.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.application.elements.BookHotelElements;

public class BookHotelSteps extends BookHotelElements {
	
	public BookHotelSteps(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterFirstName(String firstname) {
		waitForElement(firstName,10);
		enterText(firstName,firstname);
		
	}
	public void enterLastName(String lastname) {
		waitForElement(lastName,10);
		enterText(lastName,lastname);
		
	}
	public void enterAddress(String Address) {
		waitForElement(address,10);
		enterText(address,Address);
		
	}
	
	public void enterCreditCardNo(String no) {
		waitForElement(ccno,10);
		enterText(ccno,no);
		
	}
	public void selectCreditCardType(String option) {
		waitForElement(cctype,10);
		selectDropdownOption(cctype,"visibletext",option);
		
	}
	public void selectCreditCardExpMonth(String option) {
		waitForElement(ccexpmonth,10);
		selectDropdownOption(ccexpmonth,"visibletext",option);
		
	}
	public void selectCreditCardExpyear(String option) {
		waitForElement(ccexpyear,10);
		selectDropdownOption(ccexpyear,"value",option);
		
	}
	public void enterCVVNo(String cvv) {
		waitForElement(cvvno,10);
		enterText(cvvno,cvv);
		
	}
	public void clickBookNow() throws InterruptedException {
		waitForElement(booknow,10);
		click(booknow);
		Thread.sleep(Duration.ofSeconds(10));;
		
		
	}
	
	
}
