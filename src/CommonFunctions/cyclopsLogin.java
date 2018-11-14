package CommonFunctions;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Common;
import pageObjects.Page;
import pageObjects.callDisposition;
import driverInitialize.driverInitialize;
import CSVRead.CSVReadHotelSearch;
import Utilities.settings;

public class cyclopsLogin extends Page{
	
	public cyclopsLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	static String home_url;
	static String results_url;
	settings seturl = new settings();
	Common common = new Common();
		
/*	public WebDriver loginSetup(WebDriver driver) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try
		{
			String url = seturl.cyclops_url();
			driver.get(url);
			if(driver.getCurrentUrl().contains("home"))
			{
				System.out.println("Logged in & on home page without FCD");
			}
			else
			{
				callDisposition.call_dispose_slider(driver).selectByIndex(2);
				callDisposition.apply_button(driver).click();
				System.out.println("FCD value set");
				wait.until(ExpectedConditions.titleContains("Home"));
				if(driver.getTitle().equals("Cyclops - Home"))
				{
					home_url = driver.getCurrentUrl();
					System.out.println("FCD Passed. Logged in & on home page with FCD");
				}
				else
				{
					System.out.println("FCD script failed");
				}
			}
			
		}
		catch (Exception e)
		{
			System.out.println("loginSetup() failed");
			throw e;
		}
		return driver;
	}
	
*/
	/*public WebDriver checkOutPageSetup(WebDriver driver) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 80);
		try
		{
			cyclopsLogin login = new cyclopsLogin();
			login.propertyPageSetup(driver);
			checkOutPage checkout = new checkOutPage();
			System.out.println(driver.getCurrentUrl());
	    	prop.btn_roomSelect(driver).click();
	    	wait.until(ExpectedConditions.titleContains("Customer"));
	    	System.out.println(home.txt_breadcrumb(driver).getText());
	    	
	    	if(home.txt_breadcrumb(driver).getText().contains("Payment"))
		    {
	    		checkout.txt_firstNameRoom1(driver).sendKeys("Sandra");
	    		checkout.txt_lastNameRoom1(driver).sendKeys("John");
	    		checkout.txt_email(driver).sendKeys("sandra.john@cuelogic.co.in");
	    		checkout.btn_Continue(driver).click();
	    		wait.until(ExpectedConditions.titleContains("Payment"));
	    		System.out.println(driver.getCurrentUrl());
	    		System.out.println(home.txt_breadcrumb(driver).getText());
	    		if(home.txt_breadcrumb(driver).getText().contains("Confirmation"))
	    		{
	    			System.out.println("checkOutPage setup passed");
	    		}
	    		else
	    		{
	    			System.out.println("checkOutPage setup failed");
	    		}
		    	
		    }	
		}
		catch(Exception e)
		{
			System.out.println("checkOutPageSetup failed");
			throw e;
		}
		return driver;
	}
	*/
	
	public String getResultsURL()
	{
		System.out.println(results_url);
		return results_url;
	
	}
	
}