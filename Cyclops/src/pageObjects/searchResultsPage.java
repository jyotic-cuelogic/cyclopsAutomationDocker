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
	
	public WebElement btn_ViewHotel(WebDriver driver, int i) throws Exception
	{
		try
		{
			System.out.println("Value of i" +i);
			element = driver.findElement(By.xpath("//*[@id='hotel-list-container-distance']/ul/div["+i+"]/li/div[2]/div[3]/a[1]"));
			System.out.println("View Hotel button of the Hotel number" +i+ "is found");
		}
		catch(Exception e)
		{
			System.out.println("View Hotel button is not found");
			throw e;
		}
		return element;
	}
	
}
