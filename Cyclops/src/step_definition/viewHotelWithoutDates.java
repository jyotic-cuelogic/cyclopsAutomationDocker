package step_definition;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import pageObjects.cyclopsLogin;
import pageObjects.homePage;
import pageObjects.searchResultsPage;
import pageObjects.viewHotelWithoutDatesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class viewHotelWithoutDates {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	viewHotelWithoutDatesPage hotel = new viewHotelWithoutDatesPage();
	searchResultsPage search = new searchResultsPage();
	
	
	
	@When("^I click on the View Hotels button$")
	public void clickViewHotelFromSearchPage() throws Exception
	{
		try
		{
			System.out.println(driver.getTitle());
			System.out.println(homePage.txt_breadcrumb(driver).getText());
			Random r = new Random();
			int viewBtnCount = r.nextInt(5);
			System.out.println("view Button random count" +viewBtnCount);
			for (int i = 1; i <= viewBtnCount; i++ )
			{
				System.out.println("It came here");
				if(i == viewBtnCount)
				{
					System.out.println("It came in here");
					System.out.println(i);
					search.btn_ViewHotel(driver, i).click();
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
	
	
	
}
