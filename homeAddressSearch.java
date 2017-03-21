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
			homePage.drp_country(driver).selectByVisibleText("United States");
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

	@When("^I click on the City tab$")
	public void clickCityTab() throws Exception
	{
		try
		{
			homePage.tab_city(driver).click();
			System.out.println("City tab clicked on");
		}
		catch (Exception e)
		{
			System.out.println("City tab not clicked on");
		}
	}
	
	@When("^enter the city search values$")
	public void fillCity() throws Exception
	{
		try
		{
			homePage.drp_country(driver).selectByVisibleText("United States");
			homePage.drp_state(driver).selectByVisibleText("Nevada");
			homePage.txt_city(driver).sendKeys("las vegas");
			System.out.println("City values filled");
		}
		catch (Exception e)
		{
			System.out.println("City values not filled");
			throw e;
		}
	}
	
	@When("^I click on the Landmark tab$")
	public void clickLandmarkTab() throws Exception
	{
		try
		{
			homePage.tab_landmark(driver).click();
			System.out.println("Landmark tab clicked");
		}
		catch(Exception e)
		{
			System.out.println("Landmark tab not clicked");
			throw e;
		}
	}
	
	@When("^enter the landmark search values$")
	public void fillLandmark() throws Exception
	{
		try
		{
			homePage.drp_country(driver).selectByVisibleText("United States");
			homePage.drp_state(driver).selectByVisibleText("Nevada");
			homePage.txt_city(driver).sendKeys("las vegas");
			if(!homePage.drp_landmark(driver).isMultiple())
			{
				homePage.drp_landmark(driver).selectByIndex(1);
				System.out.println("Landmark value selected");
			}
			else
			{
				System.out.println("Landmarks not present for the selected City value");
			}
		}
		catch(Exception e)
		{
			System.out.println("Landmark value not filled");
			throw e;
		}
	}
	
	@When("^click on Search Hotel button$")
	public void clickSearch() throws Exception {
		try
		{
			homePage.btn_SearchHotels(driver).click();
			Thread.sleep(5000);
			System.out.println("Search Hotels button clicked");
		}
		catch (Exception e)
		{
			System.out.println("Search Hotels button not clicked");
			throw e;
		}
	}
	
	

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
