package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import driverInitialize.driverInitialize;
import CSVRead.CSVReadHotelSearch;
import Utilities.settings;

public class cyclopsLogin {
	
	String home_url;
	public WebDriver loginSetup(WebDriver driver) throws Exception
	{
		try
		{
			String url = settings.cyclops_url();
			driver.get(url);
			if (callDisposition.fcd_text(driver).isDisplayed())
			{
				callDisposition.call_dispose_slider(driver).click();
				callDisposition.call_dispose_option(driver).click();
				callDisposition.apply_button(driver).click();
				System.out.println("FCD value set");
				Thread.sleep(6000);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equals("Cyclops - Home"))
				{
					home_url = driver.getCurrentUrl();
					System.out.println("FCD Passed. Logged in & on home page with FCD");
				}
				else
				{
					System.out.println("FCD script failed");
				}
			}	
			else if(homePage.txt_breadcrumb(driver).isDisplayed())
			{
				System.out.println("Logged in & on home page without FCD");
			}
		}
		catch (Exception e)
		{
			System.out.println("Login setup script failed");
			throw e;
		}
		return driver;
	}
	
	public WebDriver searchResultsSetup(WebDriver driver) throws Exception
	{
		try
		{
			cyclopsLogin login = new cyclopsLogin();
			login.loginSetup(driver);
			Thread.sleep(3000);
		
			if(driver.getTitle().equals("Cyclops - Home"))
			{
				homePage.drp_country(driver).selectByVisibleText("United States");
				CSVReadHotelSearch csvRead = new CSVReadHotelSearch();
				csvRead.csvDataRead(driver);
				System.out.println("Address entered");
				homePage.btn_SearchHotels(driver).click();
				Thread.sleep(14000);
				if(driver.getTitle().equals("Cyclops - Search"))
				{
					System.out.println("Cyclops Search Results Page is found");
				}
				else
				{
					System.out.println("Cyclops Search Results Page is not found");
				}
				System.out.println("Search Results Page setup done");
			}
			else
			{
				System.out.println("Home page not opened");
			}
		}
		catch(Exception e)
		{
			System.out.println("Search Results Page setup failed");
			throw e;
		}
		return driver;

	}
	
}
