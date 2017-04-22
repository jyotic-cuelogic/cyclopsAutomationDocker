package step_definition;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.checkOutPage;
import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.propertyPage;
import pageObjects.searchResultsPage;
import driverInitialize.driverInitialize;

public class checkOutPageForm {

	driverInitialize d = new driverInitialize();
	WebDriver driver = d.driverInit();
	cyclopsLogin login = new cyclopsLogin();
	homePage home = new homePage();
	searchResultsPage search = new searchResultsPage();
	propertyPage prop = new propertyPage();
	checkOutPage checkout = new checkOutPage();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	@Given("^I have been able to login to Cyclops$")
	public void loginForCheckout() throws Exception {
	    try
	    {
	    	login.propertyPageSetup(driver);
	    	if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    	{
	    		System.out.println("loginForCheckout passed");
	    	}
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println("loginForCheckout failed");
	    	throw e;
	    }
	}

	@Given("^navigate to the checkout page$")
	public void navigateToCheckout() throws Exception {
	    try
	    {
	    	System.out.println(driver.getCurrentUrl());
	    	prop.btn_roomSelect(driver).click();
	    	wait.until(ExpectedConditions.titleContains("Customer_info"));
	    	System.out.println(home.txt_breadcrumb(driver).getText());
	    	
	    	if(home.txt_breadcrumb(driver).getText().contains("Payment"))
		    {
		    	System.out.println("navigateToCheckout passed");
		    }	
    	 	else
    		{
    			System.out.println("Room is unavailable");
    		}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("navigateToCheckout failed");
	    	throw e;
	    }
	}

	@When("^I complete filling the form with valid info$")
	public void fillCheckoutForm() throws Exception {
	    try
	    {
	    	if(home.txt_breadcrumb(driver).getText().contains("Payment"))
	    	{
	    		checkout.txt_firstNameRoom1(driver).sendKeys("Sandra");
	    		checkout.txt_lastNameRoom1(driver).sendKeys("John");
	    		checkout.txt_email(driver).sendKeys("sandra.john@cuelogic.co.in");
	    		System.out.println("fillCheckoutForm passed");
	    	}
	    	else
	    	{
	    		System.out.println("Unable to find checkout form to fill");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("fillCheckoutForm failed");
	    	throw e;
	    }
	}

	@When("^click on the Continue button$")
	public void clickContinue() throws Exception {
	    try
	    {
	    	if(home.txt_breadcrumb(driver).getText().contains("Payment"))
	    	{
	    		checkout.btn_Continue(driver).click();
	    		wait.until(ExpectedConditions.titleContains("Payment"));
	    		System.out.println("clickContinue passed");
	    	}
	    	else
	    	{
	    		System.out.println("Agent is not on Checkout Page");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("clickContinue failed");
	    	throw e;
	    }
	}

	@Then("^I should be navigated to the Payments page$")
	public void paymentPageConfirm() throws Exception
	{
		try
		{
			if(home.txt_breadcrumb(driver).getText().contains("Confirmation"))
			{
				System.out.println("Agent is on Payment Page - paymentPageConfirmation Passed");
			}
			else
			{
				System.out.println("Agent is not Payment Page");
			}
		}
		catch(Exception e)
		{
			System.out.println("paymentPageConfirm failed");
			throw e;
		}
	}
	
	
	
}
