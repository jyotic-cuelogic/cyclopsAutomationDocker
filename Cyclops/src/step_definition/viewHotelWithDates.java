package step_definition;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.searchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class viewHotelWithDates {

	driverInitialize d = new driverInitialize();
	WebDriver driver = d.driverInit();
	cyclopsLogin login = new cyclopsLogin();
	homePage home = new homePage();
	searchResultsPage search = new searchResultsPage();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^I navigate to Search Results Page to select dates$")
	public void searchResultsNavigate() throws Exception {
		try
		{
			login.searchResultsSetup(driver);
			if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
			{
				System.out.println(home.txt_breadcrumb(driver).getText());
				System.out.println("searchResultNavigate Passed");
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("searchResultNavigate Failed");
			throw e;
		}		
	}

	@When("^I click on the View Hotels button when Dates are selected$")
	public void selectDatesClickViewHotel() throws Exception {
	    try
	    {
	    	if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
	    	{
	    		Random r = new Random();
	    		int ranInt = r.nextInt(9);
	    		for(int i=1; i<=ranInt; i++)
	    		{
	    			if(i==ranInt)
	    			{
	    				System.out.println(search.btn_ViewHotel(driver, i).getText());
	    				search.btn_ViewHotel(driver, i).click();
	    				Thread.sleep(10000);
	    				System.out.println(home.txt_breadcrumb(driver).getText());
	    				if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    				{
	    					System.out.println("Property without Dates page found");
	    					search.cal_checkIn(driver).click();
	    					js.executeScript("search.cal_checkIn(driver).setAttribute('value', '2017-04-20')");
	    					System.out.println(search.cal_checkIn(driver).getAttribute("value"));
	    				}
	    			}
	    		}
	    		
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("selectDatesClickViewHotel failed");
	    	throw e;
	    }
	}

//	@Then("^I should be navigated to Property with Dates page$")
//	public void i_should_be_navigated_to_Property_with_Dates_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

	
}
