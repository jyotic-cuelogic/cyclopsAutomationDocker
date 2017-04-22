package step_definition;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.searchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class viewHotelWithoutDates {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	searchResultsPage search = new searchResultsPage();
	cyclopsLogin login = new cyclopsLogin();
	homePage home = new homePage();
	
	@Given("^I navigate to Search Results Page$")
	public void searchLogin() throws Exception {
		try
		{
			login.searchResultsSetup(driver);
			System.out.println(home.txt_breadcrumb(driver).getText());
			if(home.txt_breadcrumb(driver).getText().contains("Hotel"))
			{
				System.out.println("searchLogin passed");
			}
		}
		catch (Exception e)
		{
			System.out.println("searchLogin Failed");
			throw e;
		}
	}
	
	@When("^I click on the View Hotels button$")
	public void clickViewHotelFromSearchPage() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try
		{
			driver.get(login.getResultsURL());
			Random r = new Random();
			int viewBtnCount = r.nextInt(5);
			viewBtnCount++;
			
			for (int i = 1; i <= viewBtnCount; i++ )
			{
				if(i == viewBtnCount)
				{
					System.out.println(search.btn_ViewHotel(driver, i).getText());
					search.btn_ViewHotel(driver, i).click();
					wait.until(ExpectedConditions.titleContains("Show"));
					System.out.println("View Hotel button clicked on");
				}
			}
			System.out.println("Click on the view hotels button test case passed");
		}
		catch(Exception e)
		{
			System.out.println("Click on the view Hotels button test case failed");
			throw e;
		}
	}
	
	@Then("^I should be navigated to Property without Dates page$")
	public void navigatePropertyWithoutDates() throws Exception {
		try
		{
			if(home.txt_breadcrumb(driver).getText().contains("Checkout"));
			System.out.println("navigatePropertyWithoutDates has passed");
		}
		catch(Exception e)
		{
			System.out.println("navigatePropertyWithoutDates has failed");
			throw e;
		}
	}
	
	
	
}