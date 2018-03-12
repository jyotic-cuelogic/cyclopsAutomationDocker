package step_definition;

import java.awt.RenderingHints.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonFunctions.ResultsPageSetup;
import CommonFunctions.cyclopsLogin;
import pageObjects.Common;
import pageObjects.searchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class SearchResultsPage {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	ResultsPageSetup results = new ResultsPageSetup();
	searchResultsPage search = new searchResultsPage();
	Common common = new Common();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	@Given("^I have logged in to Cyclops to test Search Results Page$")
	public void searchResultsLogin() throws Exception
	{
		try
		{
			results.resultPageSetup(driver);
			if(common.txt_breadcrumbs(driver).getText().contains("Hotel"))
				System.out.println("User has landed on Search Results page");
		}
		catch(Exception e)
		{
			System.out.println("searchResultsLogin failed");
			driver.close();
			throw e;
		}
	}

	
	@When("^User is on Search Results Page to validate search Results page$")
	public void validateSearchResultsPage() throws Exception
	{
		try
		{
			if(driver.getTitle().contains("Search"))
			{
				System.out.println("User is on Search Results page");
			}
			else
			{
				System.out.println("User is not on Search Results page");
			}
		}
		catch(Exception e)
		{
			System.out.println("validateSearchResultsPage failed");
			driver.close();
			throw e;
		}
	}

	@Then("^I should be able to view the breadcrumb with the location's search criteria$")
	public void confirmBreadcrumbValue() throws Exception 
	{
		try
		{
			String breadcrumb = common.txt_breadcrumbs(driver).getText();
			String[] parts = breadcrumb.split(",");
			String part1 = parts[0];
			System.out.println(part1);
			String city = search.txt_CitySearch(driver).getAttribute("value");
			System.out.println(city);
			if(part1.equals(city))
			{
				System.out.println("Breadcrumb matches the searched city");
			}
			else
			{
				System.out.println("Breadcrumb does not match searched city");
				Thread.sleep(10000);
				driver.quit();
			}
		}
		catch(Exception e)
		{
			System.out.println("confirmBreadcrumbValue failed");
			driver.close();
			throw e;
		}
	}

	@Then("^I should also be displayed the Sort tabs$")
	public void validateSortTabDisplay() throws Exception 
	{
		try
		{
			if((search.tab_sortDistance(driver).isDisplayed()) && (search.tab_sortPrice(driver).isDisplayed()) && (search.tab_sortRating(driver).isDisplayed()))
			{
				System.out.println("Sort tabs are displayed");
			}
			else
			{
				System.out.println("Sort tabs are not displayed");
			}
		}
		catch(Exception e)
		{
			System.out.println("validateSortTabDisplay failed");
			driver.close();
			throw e;
		}
	}

	@Then("^I should also be displayed the Search Hotel Section$")
	public void validateHotelSearchSection() throws Exception
	{
	  try
	  {
		  if((search.txt_address(driver).isDisplayed()) && (search.txt_CitySearch(driver).isDisplayed()) && (search.txt_zipCode(driver).isDisplayed()) && (search.drpdwn_Country(driver).isDisplayed()) && (search.drpdwn_State(driver).isDisplayed()))
		  {
			  System.out.println("All the Search form elements - Address, Country, State, City and Zip Code fields are present");
		  }
		  else
		  {
			  System.out.println("Not all of the Search for fields are visible");
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("validateHotelSearchSection failed");
		  driver.close();
		  throw e;
	  }
	}

	@Then("^I should also be displayed the section change the dates, add rooms and change the currency$")
	public void validateEDCRSection() throws Exception
	{
		System.out.println(search.tab_EditDCR(driver).getText());
		if(search.tab_EditDCR(driver).isDisplayed())
		{
			search.tab_EditDCR(driver).sendKeys(Keys.ENTER);
			if((search.cal_CheckIn(driver).isDisplayed()) && (search.cal_CheckOut(driver).isDisplayed()) && (search.title_RoomsSection(driver).isDisplayed()))
			{
				System.out.println("Calendar for checkin and checkout and Rooms Section are displayed");
			}
			else
			{
				System.out.println("Calendar for checkin and checkout and Rooms section are not displayed");
			}
		}
		else
		{
			System.out.println("Edit Date, Currency & Room tab is not displayed");
		}
	}

	@Then("^I should also be displayed the filters to search by hotel's name, star ratings, price range, distance range and amenities filter$")
	public void validateFiltersOnSearchResults() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('fusion-sidebar').scrollTop += 400");
		System.out.println("side scrolled");
	    if((search.txtFilter_HotelName(driver).isDisplayed()) && (search.title_distanceFilter(driver).isDisplayed()) && (search.title_priceFilter(driver).isDisplayed()) && (search.title_ratingsFilter(driver).isDisplayed()))
	    {
	    	System.out.println("Filters are displayed");
	    }
	    else
	    {
	    	System.out.println("Filters are not displayed");
	    }
	}

	@Then("^I should be displayed the Hotel's list which should have the hotel's name, address, star ratings, image icon, map icon, amenities icon, View Hotel button and Search Nearby button$")
	public void validateHotelListDisplaySection() throws Exception
	{
		System.out.println(search.list_hotels(driver).size());
		if(!search.list_hotels(driver).isEmpty())
		{
			System.out.println("Hotel list contains hotel's lists");
		}
		else
		{
			System.out.println("No records found");
		}
		 for(WebElement e : search.list_hotels(driver))
		 {
			 System.out.println(e.getText());
		 }
		 
	}

	@When("^User clicks on the Distance Sort Tab for the first time$")
	public void clickOnDistanceSortFirstTime() throws Exception
	{
		wait.until(ExpectedConditions.invisibilityOf(common.img_loader(driver)));
		   search.tab_sortDistance(driver).click();
		   System.out.println("Distance Sort clicked on first time");
	}

	@Then("^the hotels should get arranged in ascending order of their distance$")
	public void validateAscendingDistanceSort() throws Exception
	{
		
		wait.until(ExpectedConditions.invisibilityOf(common.img_loader(driver)));
		if((driver.getCurrentUrl().contains("sort_by=distance")) && (!driver.getCurrentUrl().contains("sort_by=distance_reverse")))
		{
			System.out.println("Ascending sort for distance tab is applied");
		}
		else
		{
			System.out.println("Ascending sort for distance tab is not applied");
		}
	}

	@When("^User clicks on the Distance Sort Tab for the second time$")
	public void clickOnDistanceSortSecondTime() throws Exception
	{
		Thread.sleep(3000);
		search.tab_sortDistanceReverse(driver).click();
		System.out.println("Distance Sort clicked on second time");
	}

	@Then("^the hotels should get arranged in descending order of their distance$")
	public void validateDescendingDistanceSort() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(search.tab_sortDistance(driver)));
		if((driver.getCurrentUrl().contains("sort_by=distance_reverse")))
		{
			System.out.println("Descending sort for distance tab is applied");
		}
		else
		{
			System.out.println("Descending sort for distance tab is not applied");
		}
	}

	@When("^User clicks on the Price Sort Tab for the first time$")
	public void clickOnPriceSortFirstTime() throws Exception
	{
		Thread.sleep(3000);
		search.tab_sortPrice(driver).click();
		System.out.println("Price Sort clicked on First time");
	}

	@Then("^the hotels should get arranged in ascending order of their price$")
	public void validateAscendingPriceSort() throws Exception 
	{
		wait.until(ExpectedConditions.visibilityOf(search.tab_sortPrice(driver)));
		if((driver.getCurrentUrl().contains("sort_by=room_rate")) && (!driver.getCurrentUrl().contains("sort_by=room_rate_reverse")))
		{
			System.out.println("Ascending sort for price tab is applied");
		}
		else
		{
			System.out.println("Ascending sort for price tab is not applied");
		}
	}

	@When("^User clicks on the Price Sort Tab for the second time$")
	public void clickOnPriceSortSecondTime() throws Exception
	{
		Thread.sleep(5000);
		search.tab_sortPriceReverse(driver).click();
		System.out.println("Price Sort clicked on Second time");
	}
 
	@Then("^the hotels should get arranged in descending order of their price$")
	public void validateDescendingPriceSort() throws Exception 
	{
		if((driver.getCurrentUrl().contains("sort_by=room_rate_reverse")))
		{
			System.out.println("Descending sort for price tab is applied");
		}
		else
		{
			System.out.println("Descending sort for price tab is not applied");
		}
	}

	@When("^User clicks on the Rating Sort Tab for the first time$")
	public void clickOnPriceRatingFirstTime() throws Exception
	{
		Thread.sleep(3000);
		search.tab_sortRating(driver).click();
		System.out.println("Rating Sort clicked on First time");
	}

	@Then("^the hotels should get arranged in descending order of their ratings$")
	public void validateDescendingRatingSort() throws Exception 
	{
		if((driver.getCurrentUrl().contains("sort_by=star_rating_reverse")))
		{
			System.out.println("Descending sort for star ratings tab is applied");
		}
		else
		{
			System.out.println("Descending sort for star ratings tab is not applied");
		}
	}

	@When("^User clicks on the Ratings Sort Tab for the second time$")
	public void clickOnRatingSortSecondTime() throws Exception
	{
		Thread.sleep(3000);
		search.tab_sortRatingReverse(driver).click();
		System.out.println("Rating Sort clicked on Second time");
	}

	@Then("^the hotels should get arranged in ascending order of their ratings$")
	public void validateAscendingRatingSort() throws Exception 
	{
		if((driver.getCurrentUrl().contains("sort_by=star_rating")) && (!driver.getCurrentUrl().contains("sort_by=star_rating_reverse")))
		{
			System.out.println("Ascending sort for ratings tab is applied");
		}
		else
		{
			System.out.println("Ascending sort for ratings tab is not applied");
		}
	}

	@Then("^I should be able to click on the image icon for the first hotel and view the images for that hotel$")
	public void validateHotelImages() throws Exception
	{
		System.out.println(search.list_hotelsImages(driver).size());
		Random rdm = new Random();
		String href = null;
		for(WebElement e : search.list_hotelsImages(driver))
		{
			System.out.println(e.getAttribute("href"));
			if(!search.list_hotelsImages(driver).isEmpty())
			{
				for(int i = rdm.nextInt(2); i <= 2; i++)
				{
					e.click();
					href = e.getAttribute("href");
					System.out.println("Image for hotel is found and clicked on");
					String[] parts = href.split("#");
					String split1 = parts[0];
					String split2 = parts[1];
					System.out.println(split2);
					String[] nxtpart = split2.split("-trigger");
					String split3 = nxtpart[0];
					System.out.println(split3);
					driver.findElement(By.xpath(".//*[@id='"+split3+"']/div[1]/i")).click();
					System.out.println("Hotel popup opened and closed");
					break;
				}
			}
			else
			{
				System.out.println("Hotel popup not found or clicked on");
			}
			break;
		}
		
		
				
	}

/*	@Then("^I should be able to click on the map's icon for the first hotel for which the gmap's url should get generated$")
	public void clickHotelMaps() throws Exception
	{
		Thread.sleep(3000);
		System.out.println(search.list_hotelsMaps(driver).size());
		Random rdm = new Random();
		String hotel_name = null;
		for(WebElement e : search.list_hotelsMaps(driver))
		{
			System.out.println(e.getAttribute("data-hotel-name"));
			if(!search.list_hotelsImages(driver).isEmpty())
			{
				for(int i = rdm.nextInt(2); i <= 2; i++)
				{
					e.click();
					hotel_name = e.getAttribute("data-hotel-name");
					System.out.println("Hotel Map found");
					driver.findElement(By.xpath(".//a[@data-hotel-name='"+hotel_name+"']")).click();
					System.out.println("Hotel map redirected");
					break;
				}
			}
			else
			{
				System.out.println("Hotel map not found or clicked on");
			}
			break;
		}
	}*/

	/*@Then("^I should be able to click on the amenities icon for the first hotel and view the list of amenities for that hotel$")
	public void verifyAmenitiesIconSearchResults() throws Exception
	{
		try
		{
			Random rdm = new Random();
			String amenities = null;
			for(WebElement e : search.list_hotelsAmenities(driver))
			{
				if(!search.list_hotelsAmenities(driver).isEmpty())
				{
					e.click();
					System.out.println(e.getText());
					System.out.println("Amenities found on search results page");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("verifyAmenitiesIconSearchResults failed");
			throw e;
		}
	}*/
	
}
