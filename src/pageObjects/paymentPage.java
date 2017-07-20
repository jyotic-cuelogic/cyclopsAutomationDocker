package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class paymentPage {

	WebElement element;
	Select select;
	public WebElement txt_CCFirstName(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("billing_first_name"));
			System.out.println("CC FirstName text field found");
		}
		catch(Exception e)
		{
			System.out.println("CC FirstName text field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CCLastName(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("billing_last_name"));
			System.out.println("CC LastName text field found");
		}
		catch(Exception e)
		{
			System.out.println("CC LastName text field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CCNumber(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("card_number"));
			System.out.println("CC Card Number text field found");
		}
		catch(Exception e)
		{
			System.out.println("CC Card Number text field not found");
			throw e;
		}
		return element;
	}
	
	
	public Select drpdwn_CCMonth(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("month"));
			select = new Select(element);
			System.out.println("CC Month dropdown field found");
		}
		catch(Exception e)
		{
			System.out.println("CC Month dropdown field not found");
			throw e;
		}
		return select;
	}
	
	public Select drpdwn_CCYear(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("year"));
			select = new Select(element);
			System.out.println("CC Year dropdown field found");
		}
		catch(Exception e)
		{
			System.out.println("CC Year dropdown field not found");
			throw e;
		}
		return select;
	}
	
	public WebElement txt_CVV(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("card_details_sec_code"));
			System.out.println("CVV text field field found");
		}
		catch(Exception e)
		{
			System.out.println("CVV text field field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CCAddress(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("payment-address"));
			System.out.println("Payment Address text field field found");
		}
		catch(Exception e)
		{
			System.out.println("Payment Address text field field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CCCity(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("payment-city"));
			System.out.println("Payment City text field field found");
		}
		catch(Exception e)
		{
			System.out.println("Payment City text field field not found");
			throw e;
		}
		return element;
	}
	
	public Select txt_CCState(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("payment-state"));
			select = new Select(element);
			System.out.println("Payment State dropdown field field found");
		}
		catch(Exception e)
		{
			System.out.println("Payment State dropdown field field not found");
			throw e;
		}
		return select;
	}
	
	public WebElement txt_CCZipCode(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("payment-zipcode"));
			System.out.println("Payment Zip Code text field field found");
		}
		catch(Exception e)
		{
			System.out.println("Payment Zip Code text field field not found");
			throw e;
		}
		return element;
	}
	
	public WebElement chkbox_validateAddress(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("billing_verified"));
			System.out.println("Verify Billing Checkbox found");
		}
		catch(Exception e)
		{
			System.out.println("Verify Billing Checkbox not found");
			throw e;
		}
		return element;
	}
	
	public WebElement btn_VerifyResvInfo(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//*[@id='main-container']/div[2]/div[3]/div/div[3]/a"));
			System.out.println("Verify Reservation Info button found");
		}
		catch(Exception e)
		{
			System.out.println("Verify Reservation Info button not found");
			throw e;
		}
		return element;
	}
	
	public WebElement pop_chkbox_clientInfo(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.name("agree_cp"));
			System.out.println("Verify client info checkbox found");
		}
		catch(Exception e)
		{
			System.out.println("Verify client info checkbox not found");
			throw e;
		}
		return element;
	}
	
	public WebElement pop_chkbox_cancelPolicy(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.name("correct_data"));
			System.out.println("Cancellation Policy checkbox found");
		}
		catch(Exception e)
		{
			System.out.println("Cancellation Policy checkbox not found");
			throw e;
		}
		return element;
	}
	
	public WebElement btn_completeReservation(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("complete-reservation-submit"));
			System.out.println("Complete Reservation button found");
		}
		catch(Exception e)
		{
			System.out.println("Complete Reservation button not found");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_itineraryNumber(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//*[@id='map-script']/div[3]/p[2]"));
			System.out.println("Itinerary Number found");
		}
		catch(Exception e)
		{
			System.out.println("Itinerary Number not found");
			throw e;
		}
		return element;
	}
	
	
}
