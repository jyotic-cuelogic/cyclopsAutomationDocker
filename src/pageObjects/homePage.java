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
	
	
	
	
	public static WebElement txt_address(WebDriver d1) throws Exception
	{
		try
		{
			//element = d1.findElement(By.id("address"));
			element = d1.findElement(By.id("pac-input"));
		
			System.out.println("Address textfield found");
		}
		catch(Exception e)
		{
			System.out.println("Address textfield not found");
			throw e;
		}
		return element;
		
		}
	
	
	public static WebElement checkIn_checkOut(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.name("check_in_date"));
			element.click();
			
			System.out.println("checkin text found");
			
		}
		catch(Exception e)
		{
			System.out.println("checkIn_checkOut failed");
			throw e;
		}
		return element;
	
	
	
	/*
      public static WebElement btn_SearchHotels(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.xpath("//button[@type='submit']"));
			System.out.println("Search Hotels button found");
		}
		catch(Exception e)
		{
			System.out.println("Search Hotels button not found");
			throw e;
		}
		return element;
		
		
	}
	

	public static WebElement tab_city(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.name("check_in_date"));
			System.out.println("City form tab found");
		}
		catch(Exception e)
		{
			System.out.println("tab_city failed");
			throw e;
		}
		return element;
	}*/
	
	/*
	public static Select drpdwn_cityState(WebDriver d1) throws Exception
	{
		try
		{
			//select[@id='state_province-city-search']
			element = d1.findElement(By.id("state_province-city-search"));
			select = new Select(element);
			System.out.println("State dropdown found under City Tab");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_cityState failed");
			throw e;
		}
		return select;
	}

	
	public static WebElement txt_cityCity(WebDriver d1) throws Exception
	{
		try
		{
			element = d1.findElement(By.id("city-city-search"));
			System.out.println("City textfield found under City Tab");
		}
		catch(Exception e)
		{
			System.out.println("txt_cityCity failed");
			throw e;
		}
		return element;
	}
	
	
	
		//used
	public static WebElement txt_zip(WebDriver d1) throws Exception
	{
		try
		{
			//input[@id='postal_code-address-search']
			element = d1.findElement(By.id("postal_code-address-search"));
			System.out.println("Address - Postal Code textfield found");
		}
		catch(Exception e)
		{
			System.out.println("Address - Postal Code textfield not found");
			throw e;
		}
		return element;
	}
	
	
	
		public static Select drp_country(WebDriver d1) throws Exception
	{
		try
		{
			//select[@id='country-address-search']
			element = d1.findElement(By.id("country-address-search"));
			select = new Select(element);
			System.out.println("Address - Country dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Address - Country dropdown not found");
			throw e;
		}
		return select;
	}
	
	
	
	
	//used
	public static WebElement txt_city(WebDriver d1) throws Exception
	{
		try
		{
			System.out.println("It has come here");
			element = d1.findElement(By.id("city-address-search"));
			System.out.println("Address - City textfield found");
		}
		catch(Exception e)
		{
			System.out.println("Address - City textfield not found");
			throw e;
		}
		return element;
	}
	
	
	
			
	//used
	public static Select drp_state(WebDriver d1) throws Exception
	{
		try
		{
			//select[@id='state_province-address-search']
			element = d1.findElement(By.id("state_province-address-search"));
			select = new Select(element);
//			System.out.println("Address - State dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("Address - State dropdown not found");
			throw e;
		}
		return select;
	}
	
	*/
	
	
}}
