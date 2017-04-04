@smoke
Feature: View Hotel on Property with Dates page
	I want to test the View Hotel functionality when Dates are selected

Background: Login User and navigate to Results Page to select dates

@tag1
Scenario: Navigating to Property with Dates Page
Given I navigate to Search Results Page to select dates
When I click on the View Hotels button when Dates are selected
Then I should be navigated to Property with Dates page 