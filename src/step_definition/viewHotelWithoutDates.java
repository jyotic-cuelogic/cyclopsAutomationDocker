package step_definition;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonFunctions.CreateDID;
import CommonFunctions.GroupBookingForm;
import CommonFunctions.ResultsPageSetup;
import CommonFunctions.cyclopsLogin;
import CommonFunctions.dateSelector;
import pageObjects.Common;
import pageObjects.callDisposition;
import pageObjects.homePage;
import pageObjects.propertyPage;
import pageObjects.searchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class viewHotelWithoutDates {

	driverInitialize d = new driverInitialize();
	WebDriver driver = d.driverInit();
	ResultsPageSetup results = new ResultsPageSetup();
	homePage home = new homePage();
	searchResultsPage search = new searchResultsPage();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	propertyPage prop = new propertyPage();
	Common common = new Common();
	dateSelector date = new dateSelector();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	callDisposition cd = new callDisposition();
	dateSelector ds = new dateSelector();
	
	@Given("^I have logged in to Cyclops and navigated through the Search Results page$")
	public void searchResultsSetup() throws Exception
	{
		try
		{
			results.resultPageSetup(driver);
			System.out.println("Results page setup done");
		}
		catch(Exception e)
		{
			System.out.println("searchResultsSetup failed");
			throw e;
		}

	}

	@Given("^have navigated to the View Hotel without date page$")
	public void verifyPropertyWithoutDatesPage() throws Throwable
	{
		try
		{
			search.btn_ViewHotel(driver).click();
			wait.until(ExpectedConditions.urlContains("hotels"));
			if(driver.getCurrentUrl().contains("/hotel"))
			{
				System.out.println("User is on Property page without Dates");
			}
			else
			{
				System.out.println("User is not on Property page without Dates");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("verifyPropertyWithoutDatesPage failed");
			throw e;
		}
	}
	
	@Then("^I should be able to create DID number from Property without Dates page$")
	public void createDIDPropertyWithoutDates() throws Exception
	{
		try
		{
			String[] createDID = CreateDID.createDID(driver);
			String phone = createDID[0];
			String url = createDID[1];
			if(phone != null && url != null)
			{
				System.out.println("Create DID functionality works fine");
				driver.close();
			}
			else
			{
				System.out.println("Create DID functionality failed");
			}
		}
		catch(Exception e)
		{
			System.out.println("createDIDPropertyWithoutDates failed");
			throw e;
		}
	}
	

	@When("^click on the Call Disposition Slider$")
	public void clickOnCDSlider() throws Exception
	{
		common.slider_CD(driver).click();
		if(cd.fcd_text(driver).isDisplayed())
		{
			System.out.println("Call Disposition slider is open");
		}
		else
		{
			System.out.println("Call Disposition slider is not open");
		}
	}
	
	@When("^I click on the Group Booking Form in the footer on Property without Dates page$")
	public void clickOnGBF() throws Exception
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,100)");
			prop.link_GBForm(driver).click();
		}
		catch(Exception e)
		{
			System.out.println("clickOnGBF failed");
			throw e;
		}
	}

	@Then("^I should see the Group Booking Form popup on Property without Dates page$")
	public void validateGBFOpened() throws Exception
	{
		String mywindowhandle = driver.getWindowHandle();
		driver.switchTo().window(mywindowhandle);
		if(driver.findElement(By.xpath("//p[contains(.,'Group Booking Request Form')]")).isDisplayed())
		{
			System.out.println("Group Booking Form is being displayed");
		}
		else
		{
			System.out.println("Group Booking Form is not being displayed");
		}
	}

	GroupBookingForm gbf = new GroupBookingForm();
	
	@Then("^I click on blank Group Booking Form on Property without Dates page and see error message for it$")
	public void validateBlankGBF() throws Exception
	{
		try
		{
			gbf.blankGroupBookingForm(driver);
		}
		catch(Exception e)
		{
			System.out.println("validateBlankGBF failed");
			throw e;
		}
	}



	@When("^I insert valid data for the Group Booking Form on Property without Dates page and see success message$")
	public void validateValidGBFRequest() throws Exception
	{
		try
		{
		    gbf.validGroupBookingForm(driver);			
		}
		catch(Exception e)
		{
			System.out.println("validateValidGBFRequest failed");
			throw e;
		}
	}

	@When("^I select the checkin and checkout dates from the Property without Dates page$")
	public void selectCheckInCheckOutDates() throws Exception
	{
		try
		{
			String checkIn = ds.checkInDate();
			String checkOut = ds.checkOutDate();
			js.executeScript("arguments[0].removeAttribute('readonly','true')", prop.txt_calCheckIn(driver));
			prop.txt_calCheckIn(driver).sendKeys(checkIn);
			js.executeScript("arguments[0].removeAttribute('readonly','true')", prop.txt_calCheckOut(driver));
			prop.txt_calCheckOut(driver).sendKeys(checkOut);
			js.executeScript("propertiesDate.storeInSession({checkInDay:'"+checkIn+"',checkOutDay:'"+checkOut+"',saveToSessionFlag:true});");
			js.executeScript("document.getElementById('date-overlay').remove();");
			js.executeScript("document.getElementById('fusion-sidebar').scrollTop += 400");
			wait.until(ExpectedConditions.visibilityOf(prop.btn_propPageSearch(driver)));
		}
		catch(Exception e)
		{
			System.out.println("selectCheckInCheckOutDates failed");
			throw e;
		}
	}

	@When("^I click on the Search button on the Property without Dates page$")
	public void clickOnSearch() throws Exception
	{
		try
		{
			prop.btn_propPageSearch(driver).click();
			System.out.println("Search button is clicked on");
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println("clickOnSearch failed");
			throw e;
		}
	}

	@Then("^I should be taken to the Property with Dates page or Unavailability page$")
	public void validatePageLandedOn() throws Exception
	{
		try
		{
			if(driver.getCurrentUrl().contains("commit=SEARCH"))
			{
				System.out.println("User has landed on Property with Dates page");
			}
			else
			{
				System.out.println("User has landed on Unavailability page");
			}
		}
		catch(Exception e)
		{
			System.out.println("validatePageLandedOn");
			throw e;
		}
	}

	

}
