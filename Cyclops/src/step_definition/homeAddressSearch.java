package step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
			cycLogin.loginSetup();
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
			if(homePage.drp_country(driver).isDisplayed())
			{
				System.out.println("Home page found");
			}
			else
			{
				System.out.println("Home page not found");
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
			pageObjects.homePage.drp_country(driver).sendKeys("United States");
			pageObjects.homePage.txt_address(driver).sendKeys("3950 S Las Vegas Blvd");
			pageObjects.homePage.txt_city(driver).sendKeys("Las Vegas");
			pageObjects.homePage.drp_state(driver).sendKeys("Nevada");
			pageObjects.homePage.txt_zip(driver).sendKeys("89119");
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
			pageObjects.homePage.btn_SearchHotels(driver).click();
			System.out.println("Search Hotels button clicked");
			Thread.sleep(5000);
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
			Assert.assertEquals("Cyclops - Search", driver.getTitle());
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
}
