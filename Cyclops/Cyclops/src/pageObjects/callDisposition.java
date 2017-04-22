package pageObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import driverInitialize.driverInitialize;



public class callDisposition {
	
		public callDisposition() {
			// TODO Auto-generated constructor stub
		}
	 private static WebElement element = null;
	 
	 
	 
    public static WebElement fcd_text(WebDriver d) throws Exception
	{
		try
		{	
			
			element = d.findElement(By.className("cd-message"));
			System.out.println("FCD text page & text found");
		}
		catch (Exception e)
		{
			System.out.println("FCD text page & text not found");
			throw e;
		}
		return element;
	}
		
	
	public static WebElement call_dispose_slider(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.id("call_call_disposition_id"));
			System.out.println("Call Disposition Slider found");
		}
		catch (Exception e)
		{
			System.out.println("Call Disposition Slider not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement call_dispose_option(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath("//*[@id='call_call_disposition_id']/optgroup[1]/option[1]"));
			System.out.println("Call Disposition Slider option found");
		}
		catch (Exception e)
		{
			System.out.println("Call Disposition Slider option not found");
			throw e;
		}
		return element;
	}
	
	public static WebElement apply_button(WebDriver d) throws Exception
	{
		try
		{
			element = d.findElement(By.xpath("//*[@id='new_call']/div[2]/input"));
			System.out.println("Call disposition button found");
		}
		catch (Exception e)
		{
			System.out.println("Call disposition button not found");
			throw e;
		}
		return element;
	}
}
