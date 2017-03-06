package step_definition;

import java.util.concurrent.TimeUnit;
import pageObjects.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {
	private static WebDriver driver = null;
	
	
	@Given("^I have the permission to Cyclops as an Agent through Phalanx$")
	public void valid_agent_id() throws Throwable {
		driver = new PhantomJSDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@When("^I navigate to cyclops' login url$")
	public void login_url() throws Throwable {
	    driver.get("https://{cyclops-staging-url}/?vocalcomid={vocalcomid}&did={did}&ani={ani}&indexid={indexid}");
	    if(driver.findElement(By.id("call_call_disposition_id")) != null)
	    {
	    	driver.findElement(By.id("call_call_disposition_id")).click();
	    	
	    }
	}

	@Then("^I should be able to view Cyclops' Home Page$")
	public void cyclops_home() throws Throwable {
//	    String agent_info = pageObjects.homePage.agent_id().getText();
		WebElement element = driver.findElement(By.id("search-hotels"));
	    String hotel_button = element.getText();
		System.out.println(hotel_button);
	    if(hotel_button == "SEARCH HOTELS")
	    {
	    	System.out.println("Test Case has passed");
	    }
	    
	}

}
