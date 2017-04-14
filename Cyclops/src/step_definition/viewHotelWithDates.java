package step_definition;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.propertyPage;
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
	propertyPage prop = new propertyPage();
	
	@Given("^I navigate to Search Results Page to select dates$")
	public void searchResultsNavigate() throws Exception {
		try
		{
			login.searchResultsSetup(driver);
			if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
			{
				System.out.println(home.txt_breadcrumb(driver).getText());
				System.out.println("searchResultNavigate Passed");
				Thread.sleep(2000);
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
	    				Thread.sleep(6000);
	    				System.out.println(home.txt_breadcrumb(driver).getText());
	    				if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    				{
	    					System.out.println("Property without Dates page found");
	    					
	    					search.cal_checkIn(driver).click();
	    					js.executeScript("arguments[0].removeAttribute('readonly','true')", search.cal_checkIn(driver));
	    					search.cal_checkIn(driver).sendKeys("2017-03-25");
	    					search.cal_checkIn(driver).sendKeys(Keys.ENTER);
	    					System.out.println(search.cal_checkIn(driver).getText());
	    					
//	    					search.cal_checkOut(driver).click();
//	    					js.executeScript("arguments[0].removeAttribute('readonly','true')", search.cal_checkOut(driver));
//	    					search.cal_checkOut(driver).sendKeys("2017-03-27");
//	    					search.cal_checkOut(driver).sendKeys(Keys.ENTER);
//	    					System.out.println(search.cal_checkOut(driver).getText());
	    					
	    					prop.btn_propPageSearch(driver).click(); 
	    					Thread.sleep(8000);
	    					
	    				}
	    				else 
	    				{
							System.out.println("Something went wrong while entering if block");
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

	@Then("^I should be navigated to Property with Dates page$")
	public void confirmPropertyWithDatesPage() throws Exception {
	    try
	    {
	    	System.out.println(driver.getCurrentUrl());
	    	String currentURL =	driver.getCurrentUrl();
	    	driver.get(currentURL);
	    	Thread.sleep(5000);
	    	System.out.println(home.txt_breadcrumb(driver).getText());
	    	if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    	{
	    		if(prop.btn_propPageSearch(driver).isDisplayed())
		    	{
	    			System.out.println("Property page with Dates found - Select Room button found");
		    	}
	    		System.out.println("confirmPropertyWithDatesPage passed");
	    	}
	    	else if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
	    	{
	    		Writer writer = new BufferedWriter(new OutputStreamWriter(
				          new FileOutputStream("C:\\Users\\sandra\\Desktop\\CyclopsPageSource\\unavailabilityPage.txt"), "utf-8"));
				    writer.write(driver.getPageSource());
	    		System.out.println("Unavailability Page found");
	    	}
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println("confirmPropertyWithDatesPage failed");
	    	throw e;
	    }
	}

	
}
