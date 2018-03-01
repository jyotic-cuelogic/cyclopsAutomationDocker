package CommonFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.homePage;
import CSVRead.CSVReadHotelSearch;

public class ResultsPageSetup {

	public static WebDriver resultPageSetup(WebDriver driver) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		cyclopsLogin login = new cyclopsLogin();
		try
		{
			login.loginSetup(driver);
			if(driver.getCurrentUrl().contains("home"))
			{
				homePage.drp_country(driver).selectByVisibleText("United States");
				CSVReadHotelSearch csvRead = new CSVReadHotelSearch();
				csvRead.csvDataRead(driver);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("document.getElementById('fusion-sidebar').scrollTop += 200");
				homePage.btn_SearchHotels(driver).sendKeys(Keys.ENTER);
				wait.until(ExpectedConditions.urlContains("search"));
				if(driver.getCurrentUrl().contains("/search"))
				{
					System.out.println("Cyclops Search Results Page is found");
					System.out.println("Search Results Page setup done");
				}
				else
				{
					System.out.println("Cyclops Search Results Page is not found");
				}
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
