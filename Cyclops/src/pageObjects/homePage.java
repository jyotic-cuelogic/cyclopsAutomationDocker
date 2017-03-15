package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage{
	public homePage(){
		
	}
	
	private static WebElement element = null;
	
	public static WebElement img_map(WebDriver d1) throws Exception
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
	
	public static WebElement drp_country(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.name("country"));
			System.out.println("Country dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Country dropdown not found");
			throw e;
		}
		return element;
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
	
	public static WebElement drp_state(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("state_address_state"));
			System.out.println("State dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Address textfield not found");
			throw e;
		}
		return element;
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
	
	
	
}
