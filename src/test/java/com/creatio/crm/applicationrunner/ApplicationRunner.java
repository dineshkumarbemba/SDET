package com.creatio.crm.applicationrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {
				"Feature/01_LoginPage.feature",
				"Feature/02_HomePage.feature",
				"Feature/03_SelectHotel.feature",
				"Feature/04_BookHotel.feature"
			},
		glue= {"com.creatio.crm.stepdefinitions","com.creatio.crm.framework.base"},
		plugin= {"pretty","html:Reports/cucumber-reports.html"},
		monochrome=true
		)
public class ApplicationRunner extends AbstractTestNGCucumberTests {
	@Test
	public void run() {
		System.out.println("Cucumber TestNG Runner execution started.");
	}
}
