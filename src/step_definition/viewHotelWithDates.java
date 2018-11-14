/*package step_definition;

import org.openqa.selenium.WebDriver;

import CommonFunctions.cyclopsLogin;
import CommonFunctions.propertyPageWithDatesSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driverInitialize.driverInitialize;

public class viewHotelWithDates 
{
	cyclopsLogin login = new cyclopsLogin();
	driverInitialize d = new driverInitialize();
	WebDriver driver = d.driverInit();
	propertyPageWithDatesSetup propertySetup = new propertyPageWithDatesSetup();
	
	
	@Given("^I have logged in to Cyclops for test Property with Dates page$")
	public void setupForPropWithDates() throws Exception
	{
		try
		{
			propertySetup.propertyPageSetup(driver);
			System.out.println("User is on Property with Dates page");
		}
		catch(Exception e)
		{
			System.out.println("setupForPropWithDates failed");
			throw e;
		}
	}


	@Then("^I should be able to validate that rooms are being displayed$")
	public void validateRoomsDisplayed() throws Exception
	{
		
	}
}
*/