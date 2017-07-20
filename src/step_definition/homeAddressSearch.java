package step_definition;

import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CSVRead.CSVReadHotelSearch;
import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class homeAddressSearch {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	
	@Given("^I am logged in to Cyclops$")
	public void cyclops_login() throws Exception {
		try
		{
			cyclopsLogin cycLogin = new cyclopsLogin();
			driver = cycLogin.loginSetup(driver);
			
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

	/*@When("^I click on the City tab$")
	public void clickCityTab() throws Exception
	{
		try
		{
			homePage.tab_city(driver).click();
			System.out.println("City tab clicked on & Active");
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
			System.out.println(driver.getTitle());
			homePage.drp_country_city(driver).selectByVisibleText("United States");
			System.out.println("reached here - country selected");
			homePage.drp_state_City(driver).selectByVisibleText("Nevada");
			System.out.println("reached here - state selected");
			homePage.txt_city_city(driver).clear();
			System.out.println("reached here - city selected");
			homePage.txt_city_city(driver).sendKeys("las vegas");
			System.out.println("City values filled");
		}
		catch (Exception e)
		{
			System.out.println("City values not filled");
			throw e;
		}
	}
	*/

	
	@When("^click on Search Hotel button$")
	public void clickSearch() throws Exception {
		try
		{
			homePage.btn_SearchHotels(driver).click();
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
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try
		{
			wait.until(ExpectedConditions.titleContains("Search"));
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals("Cyclops - Search"));
		}
		catch(Exception e)
		{
			throw e;
		}
	}	
}
