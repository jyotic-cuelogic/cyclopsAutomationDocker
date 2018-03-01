package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class propertyPage {

	WebElement element;
	Select select;
	
	public WebElement btn_propPageSearch(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("fusion-sidebar-submit"));
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
			Thread.sleep(5000);
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
	
	public Select drpdwn_TypeforCreateDID(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("interaction_type"));
			select = new Select(element);
			System.out.println("Type dropdown is found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_TypeforCreateDID failed");
			throw e;
		}
		return select;
	}

	public Select drpdwn_BrandeforCreateDID(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("brand_type"));
			select = new Select(element);
			System.out.println("Brand dropdown is found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_BrandforCreateDID failed");
			throw e;
		}
		return select;
	}
	
	public WebElement btn_CreateDID(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//input[@value='CREATE DID']"));
			System.out.println("Create DID button found");
		}
		catch(Exception e)
		{
			System.out.println("btn_CreateDID failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CreateDIDPhoneNumber(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("show-shadow-phone"));
			System.out.println("Create DID Phone number created");
		}
		catch(Exception e)
		{
			System.out.println("txt_CreateDIDPhoneNumber failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_CreateDIDUrl(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("show-shadow-url"));
			System.out.println("Create DID URL created");
		}
		catch(Exception e)
		{
			System.out.println("txt_CreateDIDUrl failed");
			throw e;
		}
		return element;
	}

	public WebElement txt_SFLEmail(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("fusion_save_for_later_email"));
			System.out.println("Save for later email text field found");
		}
		catch(Exception e)
		{
			System.out.println("txt_SFLEmail failed");
			throw e;
		}
		return element;
	}
	
	public WebElement link_GBForm(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("//a[contains(.,'Group Booking Lead Form')]"));
			System.out.println("Group Booking Form Link found");
		}
		catch(Exception e)
		{
			System.out.println("link_GBForm failed");
			throw e;
		}
		return element;
	}
	
	public WebElement btn_GBFSubmit(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("group_booking_submit"));
			System.out.println("Group Booking Form button found");
		}
		catch(Exception e)
		{
			System.out.println("btn_GBFSubmit failed");
			throw e;
		}
		return element;
	}
	
	public Select drpdwn_roomsGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("room_per_night"));
			select = new Select(element);
			System.out.println("Group Booking Form - Rooms dropdown found");
		}
		catch(Exception e)
		{
			System.out.println("drpdwn_roomsGBF failed");
			throw e;
		}
		return select;
	}
	
	public WebElement txt_roomPriceGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("cost_per_room"));
			System.out.println("Group Booking Form room textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_roomPriceGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_calCheckInGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("group-booking-check-in-picker"));
			System.out.println("Group Booking Form calendar checkin textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_calCheckInGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_calCheckOutGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("group-booking-check-out-picker"));
			System.out.println("Group Booking Form calendar checkout textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_calCheckOutGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_guestFirstNameGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("first_name"));
			System.out.println("Group Booking Form first name textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_guestFirstNameGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_guestLastNameGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("last_name"));
			System.out.println("Group Booking Form first name textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_guestFirstNameGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_guestPhoneGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("phone"));
			System.out.println("Group Booking Form phone number textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_guestPhoneGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_guestEmailGBF(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("email"));
			System.out.println("Group Booking Form emailaddress textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_guestEmailGBF failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_calCheckIn(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("check-in-picker"));
			System.out.println("Checkin textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_calCheckIn failed");
			throw e;
		}
		return element;
	}
	
	public WebElement txt_calCheckOut(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.id("check-out-picker"));
			System.out.println("Checkout textfield found");
		}
		catch(Exception e)
		{
			System.out.println("txt_calCheckOut failed");
			throw e;
		}
		return element;
	}

}

 