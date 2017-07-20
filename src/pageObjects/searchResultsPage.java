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
	
	private static WebElement element = null;
//	private static WebElement [] arraylist;
	private static Select select = null;
	
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
			element = driver.findElement(By.xpath(".//*[@id='check-in-picker']"));
			
			System.out.println("Check In Date calendar field found");
		}
		catch(Exception e)
		{
			System.out.println("Check In Date calendar field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement cal_checkOut(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//*[@id='check-out-picker']"));
			System.out.println("Check Out Date calendar field found");
		}
		catch(Exception e)
		{
			System.out.println("Check Out Date calendar field not found");
			throw e;
		}
		return element;
	}

	public Select drpdwn_currency(WebDriver driver) throws Exception
	{
		try
		{
			select = new Select(driver.findElement(By.id("currency_code")));
			System.out.println("Currency dropdown field found");
		}
		catch (Exception e)
		{
			System.out.println("Currency dropdown field not found");
			throw e;
		}
		return select;
	}
	
	public WebElement btn_addRooms(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("add_room"));
			System.out.println("Add Rooms button found");
		}
		catch(Exception e)
		{
			System.out.println("Add Rooms button not found");
			throw e;
		}
		return element;
	}
	
	public WebElement btn_removeRooms(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("remove_room"));
			System.out.println("Remove Rooms button found");
		}
		catch(Exception e)
		{
			System.out.println("Remove Rooms button not found");
			throw e;
		}
		return element;
	}
	
	public Select drpdwn_Adults(WebDriver driver, int n) throws Exception
	{
		try
		{
			select = new Select(driver.findElement(By.xpath("//*[@id='search-dates-rooms-container']/div[2]/div[n]/div[1]/select")));
			System.out.println("Adult dropdown found of Room" +n);
		}
		catch(Exception e)
		{
			System.out.println("Adult dropdown not found of Room" +select.toString());
			throw e;
		}
		return select;
	}
	
	public Select drpdwn_Child(WebDriver driver, int n) throws Exception
	{
		try
		{
			select = new Select(driver.findElement(By.xpath("//*[@id='search-dates-rooms-container']/div[2]/div[n]/div[2]/select")));
			System.out.println("Child dropdown found of Room:" +select.toString());
		}
		catch(Exception e)
		{
			System.out.println("Child dropdown not found of Room" +n);
			throw e;
		}
		return select;
	}
	
	public Select drpdwn_ChildAge(WebDriver driver, int n) throws Exception
	{
		try
		{
			select = new Select(driver.findElement(By.xpath("//*[@id='search-dates-rooms-container']/div[2]/div[n]/div[3]")));
			System.out.println("Child Age dropdown found of Room" +select.toString());
		}
		catch(Exception e)
		{
			System.out.println("Child Age dropdown not found of Room" +n);
			throw e;
		}
		return select;
	}
	
	public WebElement btn_CalNext(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span"));
			System.out.println("Calendar's next button found");
		}
		catch (Exception e)
		{
			System.out.println("Calendar's next button not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_DateSelect(WebDriver driver, int i, int j) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[i]/td[j]/a"));
			System.out.println("Date selected : " +element.getText());
		}
		catch(Exception e)
		{
			System.out.println("Date not selected");
			throw e;
		}
		return element;
	}
	
	
	public WebElement btn_resetDates(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("reset-date"));
			System.out.println("Reset Dates button found");
		}
		catch(Exception e)
		{
			System.out.println("Reset Dates button not found");
			throw e;
		}
		return element;
	}

	
	public WebElement btn_ViewHotel(WebDriver d, int i) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath("//*[@id='hotel-list-container-distance']/ul/div["+i+"]/li/div[2]/div[3]/a[1]"));
			System.out.println("View Hotel button found");
		}
		catch(Exception e)
		{
			System.out.println("View Hotel button not found");
			throw e;
		}
		return element;
	}
	
	
	public WebElement calbox(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));
			System.out.println("Calendar select box found");
		}
		catch(Exception e)
		{
			System.out.println("Calendat select box not found");
			throw e;
		}
		return element;
	}
	
	public WebElement sect_EditCDR(WebDriver d)throws Exception
	{
		try
		{
			element = d.findElement(By.id("search-dates-rooms-container"));
			System.out.println("Edit Dates section has expanded");
		}
		catch(Exception e)
		{
			System.out.println("Edit dates section is collapsed");
			throw e;
		}
		return element;
	}
	
}