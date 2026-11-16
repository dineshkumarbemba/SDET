package com.creatio.crm.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.BookHotelSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SelectHotelSteps;
import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.web.commons.WebCommons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BookHotelStepDefinitions {
	public LoginPageSteps loginPage;
	public HomePageSteps homePage;
	public SelectHotelSteps selecthotelPage;
	public BookHotelSteps bookhotelPage;

	@Given("Initialize the page objects for BookHotelPage")
	public void initialize_the_page_objects_for_book_hotel_page() {
		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
		homePage = new HomePageSteps(driver);
		selecthotelPage = new SelectHotelSteps(driver);
		bookhotelPage = new BookHotelSteps(driver);
	}

	@When("user enter the firstname in bookhotel page.")
	public void user_enter_the_firstname_in_bookhotel_page() throws IOException {
		bookhotelPage.enterFirstName(WebCommons.readTestData("Login", 1, 5));
	}

	@When("user enter the lastname in bookhotel page.")
	public void user_enter_the_lastname_in_bookhotel_page() throws IOException {
		bookhotelPage.enterLastName(WebCommons.readTestData("Login", 1, 6));
	}

	@When("user enter address in bookhotel page.")
	public void user_enter_address_in_bookhotel_page() throws IOException {
		bookhotelPage.enterAddress(WebCommons.readTestData("Login", 1, 7));
	}

	@When("user enter creditcard no in book hotel page.")
	public void user_enter_creditcard_no_in_book_hotel_page() throws IOException {
		bookhotelPage.enterCreditCardNo(WebCommons.readTestData("Login", 1, 8));
	}

	@When("user enter credit card type from dropdown.")
	public void user_enter_credit_card_type_from_dropdown() throws IOException {
		bookhotelPage.selectCreditCardType(WebCommons.readTestData("Login", 1, 9));
	}

	@When("user enter credit card expmonth from dropdown .")
	public void user_enter_credit_card_expmonth_from_dropdown() throws IOException {
		bookhotelPage.selectCreditCardExpMonth(WebCommons.readTestData("Login", 1, 10));
	}

	@When("user enter credit card expyear from dropdown.")
	public void user_enter_credit_card_expyear_from_dropdown() throws IOException {
		bookhotelPage.selectCreditCardExpyear(WebCommons.readTestData("Login", 1, 11));
	}

	@When("user enter cvv no.")
	public void user_enter_cvv_no() throws IOException {
		bookhotelPage.enterCVVNo(WebCommons.readTestData("Login", 1, 12));
	}

	@When("user click booknow button in bookhotel page.")
	public void user_click_booknow_button_in_bookhotel_page() throws InterruptedException {
		bookhotelPage.clickBookNow();
	}
}
