@homepage
Feature: Hotel Search from Home Page
	I want to test hotel search for a location

#This needs to be updated as Search has been removed from Home Page

@tag1
Scenario: Home Page Search for Hotel using Address 
Given I am logged in to Cyclops
	And present on the Home Page
When I enter the Search criteria
	And click on Search Hotel button
Then I should navigate to the Search Results Page

