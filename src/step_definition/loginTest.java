package step_definition;

import org.openqa.selenium.By;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.io.Writer;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;
import pageObjects.Page;
import Utilities.*;
import automationframework.AutomationTestCaseVerification;

public class loginTest extends AutomationTestCaseVerification {
	
	


	
	// static driverInitialize d = new driverInitialize();
	// static WebDriver driver = d.driverInit();
	// WebDriverWait wait = new WebDriverWait(driver, 60);
	// settings seturl = new settings();

	@Given("^I have the permission to Cyclops as an Agent through Phalanx$")
	public void valid_agent_id() throws Exception {
		try {
			super.setup();
			System.out.println("in given");
			// String url = settings.cyclops_url();
			// driver.get(url);
		} catch (Exception e) {
			throw e;
		}
	}

	@When("^I navigate to cyclops' login url$")
	public void login_url() throws Exception {
		try {
			if (pageObjects.callDisposition.fcd_text().isDisplayed())

			{
				pageObjects.callDisposition.call_dispose_slider().selectByValue("6");
				
				pageObjects.callDisposition.apply_button().click();
				System.out.println("Forced Call Disposition value set");
			} else {
				System.out.println("Forced Call Disposition page not found");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("^I should be able to view Cyclops' Home Page$")
	public void cyclops_home() throws Exception {
		try {
			//wait.until(ExpectedConditions.urlContains("home"));
			System.out.println("url contains home");
			Thread.sleep(4000);
			if (  Page.driver.getCurrentUrl().contains("home")) {
				System.out.println("User has landed on Cyclops' Home Page. Test Case has passed.");
			} else {
				System.out.println("cyclops_home failed");
			}
//			driver.close();
		} catch (Exception e) {
			throw e;
		}
		finally {
			super.cleanup();
		}
	}

}
