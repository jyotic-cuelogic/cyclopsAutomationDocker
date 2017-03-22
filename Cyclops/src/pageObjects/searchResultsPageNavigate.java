package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import CSVRead.CSVReadHotelSearch;

public class searchResultsPageNavigate {

	
	
	public WebDriver searchResultsNavigateSetup(WebDriver driver) throws Exception
	{
		try
		{
			driver = new PhantomJSDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

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
		catch(Exception e)
		{
			System.out.println("Search Results Page setup failed");
			throw e;
		}
		return driver;

	}
	
	
	
	
}
