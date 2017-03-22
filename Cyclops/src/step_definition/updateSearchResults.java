package step_definition;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import pageObjects.cyclopsLogin;
import pageObjects.searchResultsPage;
import pageObjects.searchResultsPageNavigate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class updateSearchResults {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	searchResultsPage search = new searchResultsPage();
	
	
	@Given("^should be navigated to the Search Results page$")
	public void searchResultsSetup() throws Exception
	{
		try
		{
			cyclopsLogin setup = new cyclopsLogin();
			driver = setup.searchResultsSetup(driver);
			System.out.println("Setup for Update Search Results Feature done");
		}
		catch(Exception e)
		{
			System.out.println("Setup for Update Search Results Feature failed");
			throw e;
		}
	}

	@Given("^I am on Search Results Page$")
	public void confirmSearchResultsPage() throws Exception
	{
		try
		{
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Cyclops - Search"))
			{
				System.out.println("Confirmed on Search Results Page");
			}
			else
			{
				System.out.println("Not reached Search Results Page");
			}
		}
		catch(Exception e)
		{
			System.out.println("Unable to confirm on Search Results Page");
			throw e;
		}
	}

	@When("^I click on the Edit Dates & rooms link$")
	public void edr_click() throws Exception {
	    try
	    {
	    	System.out.println(search.link_editCDR(driver));
	    	search.link_editCDR(driver).click();
	    	System.out.println("Edit CDR link clicked on");
	    	if(search.cal_checkIn(driver).isDisplayed())
	    	{
	    		System.out.println("Check In Date Calendar field is visible");
	    	}
	    	else
	    	{
	    		System.out.println("Check In Date Calendar field is not visible");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Click on Edit link failed");
	    	throw e;
	    }
	}

//	@When("^update the dates, currency and room information$")
//	public void update_the_dates_currency_and_room_information() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^then click on the Search Hotels button$")
//	public void then_click_on_the_Search_Hotels_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels$")
//	public void i_should_be_able_to_see_a_list_of_Hotels() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I enter the name of the hotel in the hotel search filter text$")
//	public void i_enter_the_name_of_the_hotel_in_the_hotel_search_filter_text() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Go button$")
//	public void i_click_on_the_Go_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels with the searched text in its name$")
//	public void i_should_be_able_to_see_a_list_of_Hotels_with_the_searched_text_in_its_name() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I set the distance range$")
//	public void i_set_the_distance_range() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels between the set distance range$")
//	public void i_should_be_able_to_see_a_list_of_Hotels_between_the_set_distance_range() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I set the price range$")
//	public void i_set_the_price_range() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels between the set price range$")
//	public void i_should_be_able_to_see_a_list_of_Hotels_between_the_set_price_range() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I set the star ratings range$")
//	public void i_set_the_star_ratings_range() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels between the set star rating$")
//	public void i_should_be_able_to_see_a_list_of_Hotels_between_the_set_star_rating() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I set the amenities checkboxes$")
//	public void i_set_the_amenities_checkboxes() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to see a list of Hotels with the selected amenity$")
//	public void i_should_be_able_to_see_a_list_of_Hotels_with_the_selected_amenity() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Load More Hotel button$")
//	public void i_click_on_the_Load_More_Hotel_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to view more number of hotels on the Search Results Page$")
//	public void i_should_be_able_to_view_more_number_of_hotels_on_the_Search_Results_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Distance Sort for the first time$")
//	public void i_click_on_the_Distance_Sort_for_the_first_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in descending order of distance$")
//	public void i_should_get_a_list_of_hotels_in_descending_order_of_distance() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Distance Sort for the second time$")
//	public void i_click_on_the_Distance_Sort_for_the_second_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in ascending order of distance$")
//	public void i_should_get_a_list_of_hotels_in_ascending_order_of_distance() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Price Sort for the first time$")
//	public void i_click_on_the_Price_Sort_for_the_first_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in ascending order of price$")
//	public void i_should_get_a_list_of_hotels_in_ascending_order_of_price() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Price Sort for the second time$")
//	public void i_click_on_the_Price_Sort_for_the_second_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in descending order of price$")
//	public void i_should_get_a_list_of_hotels_in_descending_order_of_price() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Star Rating Sort for the first time$")
//	public void i_click_on_the_Star_Rating_Sort_for_the_first_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in descending order of star rating$")
//	public void i_should_get_a_list_of_hotels_in_descending_order_of_star_rating() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I click on the Star Rating Sort for the second time$")
//	public void i_click_on_the_Star_Rating_Sort_for_the_second_time() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should get a list of hotels in ascending order of star rating$")
//	public void i_should_get_a_list_of_hotels_in_ascending_order_of_star_rating() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

	
	
	
	
}
