package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Utilities.*;

public class loginTest {
	private static WebDriver driver = null;
		
	@Given("^I have the permission to Cyclops as an Agent through Phalanx$")
	public void valid_agent_id() throws Exception
	{
		try
		{
			driver = new PhantomJSDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String url = settings.cyclops_url();
			driver.get(url);
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@When("^I navigate to cyclops' login url$")
	public void login_url() throws Exception 
	{
		try
		{
			if(pageObjects.callDisposition.fcd_text(driver).isDisplayed())
			{
				pageObjects.callDisposition.call_dispose_slider(driver).click();
		    	pageObjects.callDisposition.call_dispose_option(driver).click();
		    	pageObjects.callDisposition.apply_button(driver).click();
		    	System.out.println("Forced Call Disposition value set");
		    }
		    else
		    {
		    	System.out.println("Forced Call Disposition page not found");
		    }
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@Then("^I should be able to view Cyclops' Home Page$")
	public void cyclops_home() throws Exception
	{
		try
		{
			Thread.sleep(10000);
			if(pageObjects.homePage.txt_breadcrumb(driver).isDisplayed())
		    {
		    	System.out.println("Test Case has passed");
		    }
		    else
		    {
		    	System.out.println("Test Case has failed");
		    }
			driver.quit();
		}
		catch (Exception e)
		{
			throw e;
		}	
	}
	
	
}
