package pageObjects;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInitialize.driverInitialize;
import CSVRead.CSVReadHotelSearch;
import Utilities.settings;

public class cyclopsLogin {
	
	static String home_url;
	static String results_url;



	
	public WebDriver loginSetup(WebDriver driver) throws Exception
	{
		try
		{
			String url = settings.cyclops_url();
			driver.get(url);
			System.out.println(driver.getCurrentUrl());
			if (callDisposition.fcd_text(driver).isDisplayed())
			{
				callDisposition.call_dispose_slider(driver).click();
				callDisposition.call_dispose_option(driver).click();
				callDisposition.apply_button(driver).click();
				System.out.println("FCD value set");
				Thread.sleep(6000);
				System.out.println(driver.getTitle());
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
			else if(homePage.txt_breadcrumb(driver).isDisplayed())
			{
				System.out.println("Logged in & on home page without FCD");
			}
		}
		catch (Exception e)
		{
			System.out.println("Login setup script failed");
			throw e;
		}
		return driver;
	}
	
	public WebDriver searchResultsSetup(WebDriver driver) throws Exception
	{
		try
		{
			cyclopsLogin login = new cyclopsLogin();
			login.loginSetup(driver);
			new WebDriverWait(driver, 8, 7);
			System.out.println(driver.getCurrentUrl());
			if(driver.getTitle().equals("Cyclops - Home"))
			{
				homePage.drp_country(driver).selectByVisibleText("United States");
//				CSVReadHotelSearch csvRead = new CSVReadHotelSearch();
//				csvRead.csvDataRead(driver);
				System.out.println("Address entered");
				homePage.drp_state(driver).selectByVisibleText("Nevada");
				homePage.txt_address(driver).sendKeys("Mandalay Bay");
				homePage.txt_city(driver).sendKeys("Las Vegas");
				homePage.btn_SearchHotels(driver).click();
				Thread.sleep(10000);		
				results_url = driver.getCurrentUrl();
				if(driver.getTitle().equals("Cyclops - Search"))
				{
					System.out.println("Cyclops Search Results Page is found");
					System.out.println("Search Results Page setup done");
				}
				else
				{
					System.out.println("Cyclops Search Results Page is not found");
				}
				
			}
			else
			{
				System.out.println("Home page not opened");
			}
		}
		catch(Exception e)
		{
			System.out.println("Search Results Page setup failed");
			throw e;
		}
		return driver;
	}
	
	searchResultsPage search = new searchResultsPage();
	homePage home = new homePage();
	propertyPage prop = new propertyPage();
	
	
	public WebDriver propertyPageSetup(WebDriver driver) throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try
		{
			cyclopsLogin login = new cyclopsLogin();
			login.searchResultsSetup(driver);
			if(homePage.txt_breadcrumb(driver).getText().contains("Hotel"))
	    	{
	    		Random r = new Random();
	    		int ranInt = r.nextInt(9);
	    		for(int i=1; i<=ranInt; i++)
	    		{
	    			if(i==ranInt)
	    			{
	    				System.out.println(search.btn_ViewHotel(driver, i).getText());
	    				search.btn_ViewHotel(driver, i).click();
	    				Thread.sleep(6000);
	    				System.out.println(home.txt_breadcrumb(driver).getText());
	    				if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    				{
	    					System.out.println("Property without Dates page found");
	    					
	    					search.cal_checkIn(driver).click();
	    					js.executeScript("arguments[0].removeAttribute('readonly','true')", search.cal_checkIn(driver));
	    					search.cal_checkIn(driver).sendKeys("2017-05-05");
	    					search.cal_checkIn(driver).sendKeys(Keys.ENTER);
	    					System.out.println(search.cal_checkIn(driver).getText());
	    					
//	    					search.cal_checkOut(driver).click();
//	    					js.executeScript("arguments[0].removeAttribute('readonly','true')", search.cal_checkOut(driver));
//	    					search.cal_checkOut(driver).sendKeys("2017-05-06");
//	    					search.cal_checkOut(driver).sendKeys(Keys.ENTER);
//	    					System.out.println(search.cal_checkOut(driver).getText());
	    					
	    					Thread.sleep(2000);
//	    					System.out.println(prop.btn_propPageSearch(driver).getTagName());
//	    					prop.btn_propPageSearch(driver).sendKeys(Keys.ENTER);
	    					prop.btn_propPageSearch(driver).click();
	    					Thread.sleep(10000);
	    					String hotel_url = driver.getCurrentUrl();
	    					System.out.println(hotel_url);
	    					driver.get(hotel_url);
	    					Thread.sleep(10000);
	    					if(home.txt_breadcrumb(driver).getText().contains("CheckOut"))
	    			    	{
	    						System.out.println(driver.getCurrentUrl());
//	    						Writer writer = new BufferedWriter(new OutputStreamWriter(
//	    						          new FileOutputStream("C:\\Users\\sandra\\Desktop\\CyclopsPageSource\\propWithDates.txt"), "utf-8"));
//	    						    writer.write(driver.getPageSource());
//	    						System.out.println(prop.heading_hotelName(driver).getText());
	    			    		if(prop.btn_roomSelect(driver).isDisplayed())
	    				    	{
	    				    		System.out.println("Property page with Dates found - Select Room button found");
	    				    	}
	    			    		System.out.println("loginForCheckout passed");
	    			    	}
	    			    	else if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
	    			    	{
	    			    		System.out.println("Unavailability Page found");
	    			    	}
	    				}
	    				else 
	    				{
							System.out.println("Something went wrong while entering if block");
	    				}
	    			}
	    		}  		
	    	}
		}
		catch(Exception e)
		{
			System.out.println("propertyPageSetup failed");
			throw e;
		}
		return driver;
	}
	
	
	public WebDriver checkOutPageSetup(WebDriver driver) throws Exception
	{
		try
		{
			cyclopsLogin login = new cyclopsLogin();
			login.propertyPageSetup(driver);
			checkOutPage checkout = new checkOutPage();
			System.out.println(driver.getCurrentUrl());
	    	prop.btn_roomSelect(driver).click();
	    	Thread.sleep(7000);
	    	System.out.println(home.txt_breadcrumb(driver).getText());
	    	
	    	if(home.txt_breadcrumb(driver).getText().contains("Payment"))
		    {
	    		checkout.txt_firstNameRoom1(driver).sendKeys("Sandra");
	    		checkout.txt_lastNameRoom1(driver).sendKeys("John");
	    		checkout.txt_email(driver).sendKeys("sandra.john@cuelogic.co.in");
	    		checkout.txt_phoneNumber(driver).sendKeys("9876543210");
	    		checkout.btn_Continue(driver).click();
	    		Thread.sleep(5000);
	    		System.out.println(home.txt_breadcrumb(driver).getText());
	    		if(home.txt_breadcrumb(driver).getText().contains("Confirmation"))
	    		{
	    			System.out.println("checkOutPage setup passed");
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
	
	
	public String getResultsURL()
	{
		System.out.println(results_url);
		return results_url;
	
	}
	
}