package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkOutPage {
	
	WebElement element = null;
	
	public WebElement txt_firstNameRoom1(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("rooms_list_0_first_name"));
			System.out.println("First Name text field found");
		}
		catch(Exception e)
		{
			System.out.println("First Name text field not found");
			throw e;
		}
	return element;
	}
	
	public WebElement txt_lastNameRoom1(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("rooms_list_0_last_name"));
			System.out.println("Last Name text field found");
		}
		catch(Exception e)
		{
			System.out.println("Last Name text field not found");
			throw e;
		}
	return element;
	}
	
	public WebElement txt_email(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("rooms_list_0_email"));
			System.out.println("Email text field found");
		}
		catch(Exception e)
		{
			System.out.println("Email text field not found");
			throw e;
		}
	return element;
	}

	public WebElement txt_phoneNumber(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("rooms_list_0_phone_contact"));
			System.out.println("Phone Number text field found");
		}
		catch(Exception e)
		{
			System.out.println("Phone Number text field not found");
			throw e;
		}
	return element;
	}
	
	public WebElement btn_Continue(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("customer-info-submit"));
			System.out.println("Continue button found");
		}
		catch(Exception e)
		{
			System.out.println("Continue button not found");
			throw e;
		}
	return element;
	}
	
}
