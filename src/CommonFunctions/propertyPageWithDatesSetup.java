/*package CommonFunctions;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Common;
import pageObjects.homePage;
import pageObjects.propertyPage;
import pageObjects.searchResultsPage;

public class propertyPageWithDatesSetup {

	
	public static WebDriver propertyPageSetup(WebDriver driver) throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		propertyPage prop = new propertyPage();
		dateSelector ds = new dateSelector();
		cyclopsLogin login = new cyclopsLogin();
		searchResultsPage search = new searchResultsPage();
		Common common = new Common();
		ResultsPageSetup result = new ResultsPageSetup();
	
		try
		{
			result.resultPageSetup(driver);
			search.btn_ViewHotel(driver).click();
			wait.until(ExpectedConditions.urlContains("hotels"));
			if(driver.getCurrentUrl().contains("/hotel"))
			{
				System.out.println("User is on Property page without Dates");
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
					prop.btn_propPageSearch(driver).click();
					System.out.println("Search button is clicked on");
					Thread.sleep(10000);
					if(driver.getCurrentUrl().contains("commit=SEARCH"))
					{
						System.out.println("User has landed on Property with Dates page");
					}
					else
					{
						System.out.println("User has landed on Unavailability page");
					}
			}
			else
			{
				System.out.println("User is not on Property page without Dates");
			}
		}
		catch(Exception e)
		{
			System.out.println("propertyPageSetup failed");
			throw e;
		}
		return driver;
	}
	
}
*/