package step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import CSVRead.CSVReadHotelSearch;
import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homeAddressSearch {

	private static WebDriver driver = null;
	
	
	@Given("^I am logged in to Cyclops$")
	public void cyclops_login() throws Exception {
		try
		{
			cyclopsLogin cycLogin = new cyclopsLogin();
			driver = cycLogin.loginSetup();
			
			System.out.println("Login to Cyclops Successful");
		}
		catch (Exception e)
		{
			System.out.println("Login to Cyclops Failed");
			throw e;
		}
	}

	@Given("^present on the Home Page$")
	public void validateHomePage() throws Exception {
		try
		{
			if(driver.getTitle().equals("Cyclops - Home"))
			{
				System.out.println("On Home Page");
			}
			else
			{
				System.out.println("Not on Home Page");
			}
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@When("^I enter the Search criteria$")
	public void fillAddress() throws Exception
	{
		try
		{
			homePage.drp_country(driver).selectByVisibleText("United States");;
			CSVReadHotelSearch csvRead = new CSVReadHotelSearch();
			csvRead.csvDataRead(driver);
			System.out.println("Address entered");
		}
		catch(Exception e)
		{
			System.out.println("Address not entered");
			throw e;
		}
	}

	@When("^click on Search Hotel button$")
	public void clickSearch() throws Exception {
		try
		{
			homePage.btn_SearchHotels(driver).click();
			System.out.println("Search Hotels button clicked");
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			System.out.println("Search Hotels button not clicked");
			throw e;
		}
	}
	
	@When("^I enter the Search criteria for City$")

	@Then("^I should navigate to the Search Results Page$")
	public void cyclopsSearchResults() throws Exception
	{
		try
		{
			Assert.assertTrue(driver.getTitle().equals("Cyclops - Search"));
		}
		catch(Exception e)
		{
			throw e;
		}
	}	
}
