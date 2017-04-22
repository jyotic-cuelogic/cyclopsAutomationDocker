package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class propertyPage {

	WebElement element;
	
	public WebElement btn_propPageSearch(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("property-search"));
			System.out.println("Search button on Property Page found");
		}
		catch(Exception e)
		{
			System.out.println("Search button on Property Page not found");
			throw e;
		}
		return element;
	}
	
	public WebElement btn_roomSelect(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath(".//*[@id='default_rates_container']/div/li[1]/div/div[4]/form/input[17]"));
			System.out.println("Select Room Book button found");
		}
		catch(Exception e)
		{
			System.out.println("Select Room Book button not found");
			throw e;
		}
		return element;
	}
	

	
	
	public WebElement txt_roomUnavailable(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//*[@id='default_rates_container']/div/li[1]/div/div[4]/label"));
			System.out.println("Unavailability Text found");
		}
		catch(Exception e)
		{
			System.out.println("Unavailability Text not found");
			throw e;
		}
		return element;
	}
	
	public WebElement loader_RoomInfo(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("loaderMsg"));
			System.out.println("Loader found " +element.getText());
		}
		catch(Exception e)
		{
			System.out.println("Loader not found");
			throw e;
		}
		return element;
	}
	
}

 