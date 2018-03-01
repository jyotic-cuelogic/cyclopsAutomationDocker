package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class searchResultsPage {	
	
	WebElement element = null;
	Select select = null;
	List<WebElement> list = null;
	
	public WebElement txt_CitySearch(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.name("city"));
			System.out.println("City textfield found");
		}
		catch(Exception e)
		{
			System.out.println("City textfield not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortDistance(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//span[contains(.,'Distance')]"));
			System.out.println("Distance sort found");
		}
		catch(Exception e)
		{
			System.out.println("Distance sort not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortPrice(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//span[contains(.,'Price')]"));
			System.out.println("Price sort found");
		}
		catch(Exception e)
		{
			System.out.println("Price sort not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortRating(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//span[contains(.,'Rating')]"));
			System.out.println("Rating sort found");
		}
		catch(Exception e)
		{
			System.out.println("Rating sort not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortDistanceReverse(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("distance_reverse"));
			System.out.println("Reverse Distance sort found");
		}
		catch(Exception e)
		{
			System.out.println("Reverse Distance sort not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortPriceReverse(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("room_rate_reverse"));
			System.out.println("Reverse Price sort found");
		}
		catch(Exception e)
		{
			System.out.println("Reverse Price sort not found");
			throw e;
		}
		return element;
	}
	
	public WebElement tab_sortRatingReverse(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("star_rating_reverse"));
			System.out.println("Reverse Rating sort found");
		}
		catch(Exception e)
		{
			System.out.println("Reverse Rating sort not found");
			throw e;
		}
		return element;
	}
		
	public WebElement drpdwn_Country(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("search_form_country"));
			System.out.println("Country dropdown on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_Country failed");
			throw e;
		}
		return element;
	}
	
	public WebElement drpdwn_State(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("state_province"));
			System.out.println("State dropdown on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_State failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_address(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("address"));
			System.out.println("Address textfield on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("txt_address failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_zipCode(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("postal_code_filter"));
			System.out.println("Postal Code textfield on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("txt_zipCode failed");
			throw e;
		}
		return element;
	}

	public WebElement tab_EditDCR(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//a[contains(.,'EDIT DATES, CURRENCY & ROOMS')]"));
			System.out.println("Tab to Edit Dates, Currency and Rooms found on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("tab_EditDCR failed");
			throw e;
		}
		return element;
	}
	
	public WebElement cal_CheckIn(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("check-in-picker"));
			System.out.println("CheckIn Date calendar textfield on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("cal_CheckIn failed");
			throw e;
		}
		return element;
	}

	public WebElement cal_CheckOut(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("check-out-picker"));
			System.out.println("CheckOut Date calendar textfield on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("cal_CheckOut failed");
			throw e;
		}
		return element;
	}
	
	public Select drpdwn_Currency(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("currency_code"));
			select = new Select(element);
			System.out.println("Currency dropdown on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_Currency failed");
			throw e;
		}
		return select;
	}
	
	public WebElement title_RoomsSection(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//div[@class='fusion-rooms-title f-size-md f-bold']"));
			System.out.println("Rooms section on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("title_RoomsSection failed");
			throw e;
		}
		return element;
	}

	public WebElement txtFilter_HotelName(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("fusion_sidebar_hotel_name"));
			System.out.println("Hotel name filter on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("txtFilter_HotelName failed");
			throw e;
		}
		return element;
	}

	public WebElement title_distanceFilter(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//p[contains(.,'Distance (ml)')]"));
			System.out.println("Distance filter on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("title_distanceFilter failed");
			throw e;
		}
		return element;
	}

	public WebElement title_priceFilter(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//p[contains(.,'Price Range (USD)')]"));
			System.out.println("Price filter on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("title_priceFilter failed");
			throw e;
		}
		return element;
	}
	
	public WebElement title_ratingsFilter(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//p[contains(.,'Rating')]"));
			System.out.println("Ratings filter on Search Results Page found");
		}
		catch(Exception e)
		{
			System.out.println("title_ratingsFilter failed");
			throw e;
		}
		return element;
	}

	public List<WebElement> list_hotels(WebDriver driver) throws Exception
	{
		try
		{
			list = driver.findElements(By.className("fusion-hotel-header-without-img"));
		}
		catch(Exception e)
		{
			System.out.println("list_hotels failed");
			throw e;
		}
		return list;
	}
	
	public List<WebElement> list_hotelsImages(WebDriver driver) throws Exception
	{
		try
		{
			list = driver.findElements(By.xpath(".//a[contains(@class,'fusion-trigger photo')]"));
		}
		catch(Exception e)
		{
			System.out.println("list_hotelsImages failed");
			throw e;
		}
		return list;
	}
	
//	google-external-map-link
	
	public List<WebElement> list_hotelsMaps(WebDriver driver) throws Exception
	{
		try
		{
			list = driver.findElements(By.xpath(".//a[contains(@class,'google-external-map-link')]"));
			System.out.println("Hotel map link found");
		}
		catch(Exception e)
		{
			System.out.println("list_hotelsMaps failed");
			throw e;
		}
		return list;
	}
	
	public List<WebElement> list_hotelsAmenities(WebDriver driver) throws Exception
	{
		try
		{
			list = driver.findElements(By.xpath(".//p[contains(@class,'fusion-tooltip tooltip-click')]"));
			System.out.println("Hotel amenities link found");
		}
		catch(Exception e)
		{
			System.out.println("list_hotelsAmenities failed");
			throw e;
		}
		return list;
	}

	public WebElement btn_ViewHotel(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath(".//a[contains(.,'VIEW HOTEL')]"));
			System.out.println("View Hotel button found");
		}
		catch(Exception e)
		{
			System.out.println("btn_ViewHotel failed");
			throw e;
		}
		return element;
	}

	
}