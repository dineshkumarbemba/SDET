package com.creatio.crm.framework.base;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.creatio.crm.framework.utilities.PropUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BasePage {
	
	
	// This class will have all the common methods and configurations related to browser setup to begin the execution process.
	
	private static WebDriver driver;
	Properties prop = PropUtil.readData("Config.properties");
	
	
	// Common method to launch the browser window.
	@Before
	public void setupBrowser() {
		String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			Assert.fail("Browser not supported");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	// Common method to close the browser sessions
	@After(order = 0)
	public void tearDownBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}	
	
	// Common method to verify scenario status and capture the failure screenshot.
	@After(order = 1)
	public void reportFailure(Scenario scenario) {
		if(scenario.isFailed()) {
			byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName()+"_screenshot");	
		}
	}
	
	// Common method to share the browser session details with all other classes.
	public static WebDriver getDriver() {
		return driver;
	}
	
	// Common method to update the browser station details from other classes.
	public static void setDriver(WebDriver driverRef) {
		driver = driverRef;
	}

}