package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homePage{
	public homePage(){
		
	}
	
	private static WebElement element = null;
	private static Select select = null;
	
	public static WebElement txt_breadcrumb(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("breadcrum-script"));
			System.out.println("Home Page Map found");
		}
		catch(Exception e)
		{
			System.out.println("Home Page Map not found");
			throw e;
		}
		return element;
	}
	
	public static Select drp_country(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("search_address_country"));
			select = new Select(element);
			System.out.println("Country dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Country dropdown not found");
			throw e;
		}
		return select;
	}
	
	public static WebElement txt_address(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("address"));
			System.out.println("Address textfield found");
		}
		catch(Exception e)
		{
			System.out.println("Address textfield not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement txt_city(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("city"));
			System.out.println("City textfield found");
		}
		catch(Exception e)
		{
			System.out.println("City textfield not found");
			throw e;
		}
		return element;
	}
	
	public static Select drp_state(WebDriver d1) throws Exception
	{
		try
		{
			select = new Select(d1.findElement(By.id("search_address_state")));
			System.out.println("State dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Address textfield not found");
			throw e;
		}
		return select;
	}
	
	public static WebElement txt_zip(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("postal_code"));
			System.out.println("Address textfield found");
		}
		catch(Exception e)
		{
			System.out.println("Address textfield not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement btn_SearchHotels(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("search-hotels"));
			System.out.println("Search Hotels button found");
		}
		catch(Exception e)
		{
			System.out.println("Search Hotels button not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement tab_city(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath("//*[@id='search-content']/li[2]/a"));
			System.out.println("City tab found");
		}
		catch (Exception e)
		{
			System.out.println("City tab not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement tab_landmark(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath("//*[@id='search-content']/li[3]/a"));
			System.out.println("Landmark tab found");
		}
		catch (Exception e)
		{
			System.out.println("Landmark tab not found");
			throw e;
		}
		return element;
	}
	
	public static Select drp_landmark(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("landmark"));
			select = new Select(element);
			System.out.println("Landmark dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Landmark dropdown not found");
			throw e;
		}
		return select;
	}
}
