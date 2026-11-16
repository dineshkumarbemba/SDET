package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import com.creatio.crm.application.elements.SelectHotelElements;

public class SelectHotelSteps extends SelectHotelElements {
    private WebDriver driver;

    public SelectHotelSteps(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifySelectHotelHeaderisDisplayed() {
        int attempts = 0;
        while (attempts < 3) {
            try {
                PageFactory.initElements(driver, this); // Re-sync elements freshly
                waitForElement(selectHotelPageHeader, 10);
              
                break;
            } catch (StaleElementReferenceException e) {
                // If it goes stale, loop repeats instantly and re-fetches elements
            }
            attempts++;
        }
    }

    public void clickSelectHotelRadioButton() {
        int attempts = 0;
        while (attempts < 3) {
            try {
                PageFactory.initElements(driver, this); // Force refresh from active DOM
                waitForElement(selectHotelRadiobutton, 10);
                click(selectHotelRadiobutton);
                
                break; // If click succeeds, break the loop immediately
            } catch (StaleElementReferenceException e) {
                
            }
            attempts++;
        }
    }

    public void clickContinueButton() {
        int attempts = 0;
        while (attempts < 3) {
            try {
                PageFactory.initElements(driver, this); // Force refresh from active DOM
                waitForElement(continueButton, 10);
                click(continueButton);
                
                break; // If click succeeds, break the loop immediately
            } catch (StaleElementReferenceException e) {
               
            }
            attempts++;
        }
    }
}