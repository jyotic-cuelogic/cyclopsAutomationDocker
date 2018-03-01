package CommonFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pageObjects.Common;
import pageObjects.propertyPage;

public class GroupBookingForm {

	public static void blankGroupBookingForm(WebDriver driver) throws Exception
	{
		propertyPage pr = new propertyPage();
		Common common = new Common();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('group_booking_form').childNodes[1].childNodes[1].scrollTop += 1000;");
		pr.btn_GBFSubmit(driver).click();
		if(common.msgJGrowl(driver).getText().contains("Please enter mandatory field"))
		{
			System.out.println("Error messages are displayed for blank group booking form submission");
			System.out.println(common.msgJGrowl(driver).getText());
			driver.close();
		}
		else
		{
			System.out.println("Error message are not displayed for blank group booking form submission");
			System.out.println(common.msgJGrowl(driver).getText());
		}
	}
	
	public static void validGroupBookingForm(WebDriver driver) throws Exception
	{
		try
		{
			propertyPage pr = new propertyPage();
			Common common = new Common();
			dateSelector ds = new dateSelector();
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			pr.drpdwn_roomsGBF(driver).selectByValue("10");
			pr.txt_roomPriceGBF(driver).sendKeys("100");;
			String checkinDate = ds.checkInDate();
			String checkOutDate = ds.checkOutDate();
			js.executeScript("document.getElementById('group_booking_form').childNodes[1].childNodes[1].scrollTop += 200;");
			js.executeScript("arguments[0].removeAttribute('readonly','true')", pr.txt_calCheckInGBF(driver));
			pr.txt_calCheckInGBF(driver).sendKeys(checkinDate);
			js.executeScript("arguments[0].removeAttribute('readonly','true')", pr.txt_calCheckOutGBF(driver));
			pr.txt_calCheckOutGBF(driver).sendKeys(checkOutDate);
			js.executeScript("document.getElementById('date-overlay').remove();");
			js.executeScript("document.getElementById('group_booking_form').childNodes[1].childNodes[1].scrollTop += 500;");
			pr.txt_guestFirstNameGBF(driver).sendKeys("Sandra");
			pr.txt_guestLastNameGBF(driver).sendKeys("John");
			pr.txt_guestPhoneGBF(driver).sendKeys("7894561230");
			pr.txt_guestEmailGBF(driver).sendKeys("sandra.john@cuelogic.co.in");
			pr.btn_GBFSubmit(driver).click();
			if(common.msgJGrowl(driver).getText().contains("Group booking request sent"))
			{
				System.out.println("Group booking form sent for valid data");
				driver.close();
			}
			else
			{
				System.out.println("Group bookking form not sent for valid data");
				System.out.println(common.msgJGrowl(driver).getText());
			}
		}
		catch(Exception e)
		{
			System.out.println("validGroupBookingForm failed");
			throw e;
		}
	}
	
}
