package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchResultsPage {	
	
	WebElement element = null;
	
	public WebElement link_editCDR(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("search-dates-rooms-text"));
			System.out.println("Edit Currency, Dates & Rooms links found");
		}
		catch(Exception e)
		{
			System.out.println("Edit Currency, Dates & Rooms links not found");
			throw e;
		}
		return element;
	}
	
	public WebElement cal_checkIn(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("check-in-picker"));
			System.out.println("Check In Date calendar field found");
		}
		catch(Exception e)
		{
			System.out.println("Check In Date calendar field not found");
			throw e;
		}
		return element;
	}
	
	
}
