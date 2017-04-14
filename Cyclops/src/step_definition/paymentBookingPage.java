package step_definition;

import org.openqa.selenium.WebDriver;

import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.paymentPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class paymentBookingPage {

	driverInitialize d = new driverInitialize();
	WebDriver driver = d.driverInit();
	cyclopsLogin login = new cyclopsLogin();
	homePage home = new homePage();
	paymentPage pay = new paymentPage();
	
	@Given("^I have navigated to the Payment Page$")
	public void navigateToPaymentPage() throws Exception
	{
		try
		{
			login.checkOutPageSetup(driver);
			if(home.txt_breadcrumb(driver).getText().contains("Confirmation"))
			{
				System.out.println("navigateToPaymentPage passed");
			}
			else
			{
				System.out.println("Not on Payment Page");
			}
		}
		catch(Exception e)
		{
			System.out.println("navigateToPaymentPage failed");
			throw e;
		}
	}

	@When("^I complete filling the Payment Form$")
	public void fillPaymentForm() throws Exception 
	{
		try
		{
			if(home.txt_breadcrumb(driver).getText().contains("Confirmation"))
			{
				pay.txt_CCFirstName(driver).sendKeys("Test");
				pay.txt_CCLastName(driver).sendKeys("Booking");
				pay.txt_CCNumber(driver).sendKeys("4111 1111 1111 1111");
				pay.drpdwn_CCMonth(driver).selectByIndex(9);
				pay.drpdwn_CCYear(driver).selectByIndex(3);
				pay.txt_CVV(driver).sendKeys("123");
				pay.txt_CCAddress(driver).sendKeys("travelnow");
				pay.txt_CCCity(driver).sendKeys("phoenix");
				pay.txt_CCState(driver).selectByIndex(2);
				pay.txt_CCZipCode(driver).sendKeys("85601");
				pay.chkbox_validateAddress(driver).click();
				System.out.println("fillPaymentForm passed");
			}
		}
		catch(Exception e)
		{
			System.out.println("fillPaymentForm failed");
		}
	}

	@When("^Click on the Complete Reservation Info button$")
	public void clickCompleteReservationInfo() throws Exception
	{
		try
		{
			if(pay.chkbox_validateAddress(driver).isSelected())
			{
				pay.btn_VerifyResvInfo(driver).click();
				Thread.sleep(4000);
				String confirmationPopupHandle = driver.getWindowHandle();
				driver.switchTo().window(confirmationPopupHandle);
				if(pay.btn_completeReservation(driver).isDisplayed())
				{
					System.out.println("clickCompleteReservationInfo passed");
				}
				else
				{
					System.out.println("The popup did not open");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("clickCompleteReservationInfo failed");
			throw e;
		}
	}

	@When("^Click on the Verify Reservation Info button on the Confirmation Page$")
	public void clickCompleteReservation() throws Exception{
	    try
	    {
	    	if(pay.btn_completeReservation(driver).isDisplayed())
	    	{
	    		pay.pop_chkbox_clientInfo(driver).click();
	    		pay.pop_chkbox_cancelPolicy(driver).click();
	    		pay.btn_completeReservation(driver).click();
	    		Thread.sleep(15000);
	    		System.out.println("clickCompleteReservation failed");
	    	}
	    	else {
				System.out.println("popup did not open");
			}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("clickCompleteReservation failed");
	    	throw e;
	    }
	}

	@Then("^I should be navigated to the Confirmation Page$")
	public void validateConfirmationPage() throws Exception
	{
		try
		{
			if(driver.getCurrentUrl().contains("confirmation"))
			{
				System.out.println("validateConfirmationPage passed");
			}
		}
		catch(Exception e)
		{
			System.out.println("validateConfirmationPage failed");
			throw e;
		}
	}

	@Then("^I should be displayed the itinerary number$")
	public void confirmItineraryNumber() throws Exception
	{
		try
		{
			if(pay.txt_itineraryNumber(driver).isDisplayed())
			{
				System.out.println(pay.txt_itineraryNumber(driver).getText());
				System.out.println("confirmaItineraryNumber passed");
			}
		}
		catch(Exception e)
		{
			System.out.println("confirmaItineraryNumber failed");
			throw e;
		}
	}

}
