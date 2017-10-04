package com.dc.cucumber.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstStepDefinition {
	WebDriver driver;
	
	public FirstStepDefinition() {
		System.setProperty("webdriver.gecko.driver", "I:\\LOGS\\WEBDRIVER//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "I:\\LOGS\\WEBDRIVER//geckodriver.exe");
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		// Tell the Java bindings to use Marionette.
		// This will not be necessary in the future,
		// when Selenium will auto-detect what remote end
		// it is talking to.
		//capabilities.setCapability("marionette", true);

		driver = new FirefoxDriver(); 
		//driver = new ChromeDriver();
		//driver = new RemoteWebDriver(capabilities);
	}

	@Given("^I navigate to TheTestRoom\\.com$")
	public void i_navigate_to_TheTestRoom_com() throws Throwable {
		System.out.println("Going to TheTestRoom.com");
		//driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
	}

	@When("^I navigate to Cucumber Tutorial page$")
	public void i_navigate_to_Cucumber_Tutorial_page() throws Throwable {
		System.out.println("Clicking on Cucumber Tutorial Page");
		driver.findElement(By.linkText("Java Cucumber Tutorial")).click();
	}

	@Then("^the page title should be visible$")
	public void the_page_title_should_be_visible() throws Throwable {
		System.out.println("Checking page title");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
