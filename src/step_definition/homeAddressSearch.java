package step_definition;

import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CSVRead.CSVReadHotelSearch;
import CommonFunctions.cyclopsLogin;
import pageObjects.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class homeAddressSearch {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	cyclopsLogin cycLogin = new cyclopsLogin();
	
	
	@Given("^I am logged in to Cyclops$")
	public void cyclops_login() throws Exception {
		try
		{
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
	
	@When("^click on Search Hotel button$")
	public void clickSearch() throws Exception {
		try
		{
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('fusion-sidebar').scrollTop += 200");
			homePage.btn_SearchHotels(driver).sendKeys(Keys.ENTER);
			System.out.println("Search Hotels button clicked");
		}
		catch (Exception e)
		{
			System.out.println("Search Hotels button not clicked");
			throw e;
		}
	}
	
	
	@When("^I enter city's search criteria$")
	public void searchFromCityTab() throws Exception
	{
		try
		{
			homePage.tab_city(driver).click();
			System.out.println("city tab clicked on");
			homePage.drpdwn_cityState(driver).selectByValue("AZ");
			System.out.println("State selected under city tab");
			homePage.txt_cityCity(driver).sendKeys("phoenix");
			System.out.println("city value inserted under city tab");
		}
		catch(Exception e)
		{
			System.out.println("searchFromCityTab failed");
			driver.close();
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
