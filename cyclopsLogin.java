package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import Utilities.settings;

public class cyclopsLogin {
	
	private static WebDriver driver = null;
	
	public WebDriver loginSetup() throws Exception
	{
		try
		{
			driver = new PhantomJSDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String url = settings.cyclops_url();
			driver.get(url);
			if (callDisposition.fcd_text(driver).isDisplayed())
			{
				callDisposition.call_dispose_slider(driver).click();
				callDisposition.call_dispose_option(driver).click();
				callDisposition.apply_button(driver).click();
				System.out.println("FCD value set");
			}	
			else if(homePage.txt_breadcrumb(driver).isDisplayed())
			{
				System.out.println("Home Page is found");
			}
			else
			{
				System.out.println("Login to Cyclops done");
			}
		}
		catch (Exception e)
		{
			System.out.println("Login setup script failed");
			throw e;
		}
		return driver;
	}
	
}
