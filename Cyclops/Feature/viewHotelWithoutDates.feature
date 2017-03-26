@tag
Feature: View Hotel on Property without Dates page
	I want to test the View Hotel functionality when Dates are not selected

Background: User should be logged in to Cyclops
And should be navigated to the Search Results page

@tag1
Scenario: Navigating to Property without Dates Page
Given I am on Search Results Page
When I click on the View Hotels button 
Then I should be navigated to Property without Dates page 
