package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {

	WebElement element;
	
	public WebElement tab_Booking(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//a[contains(.,'BOOKING')]"));
			System.out.println("Booking tab found");
		}
		catch(Exception e)
		{
			System.out.println("tab_Booking failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_breadcrumbs(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//a[@class='f-current']"));
			System.out.println("Breadcrumbs text value found");
		}
		catch(Exception e)
		{
			System.out.println("txt_breadcrumbs failed");
			throw e;
		}
		return element;
	}
	
	public WebElement img_loader(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath(".//*[@class='blockUI']"));
			System.out.println("Loader Image on page");
		}
		catch(Exception e)
		{
			System.out.println("img_loader failed");
			throw e;
		}
		return element;
	}
	
	public WebElement slider_CD(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//a[contains(.,'CALL DISPOSITION')]"));
			System.out.println("Call Disposition slider found");
		}
		catch(Exception e)
		{
			System.out.println("slider_CD Failed");
			throw e;
		}
		return element;
	}
	
	//*[@id="jGrowl"]/div[2]/div[2]
	
	public WebElement msgJGrowl(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//div[@class='jGrowl-message']"));
			System.out.println("jGrowl message found");
		}
		catch(Exception e)
		{
			System.out.println("errorMsgJGrowl failed");
			throw e;
		}
		return element;
	}
	
}
