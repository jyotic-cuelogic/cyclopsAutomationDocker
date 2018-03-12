@current
Feature: Update search criteria on Search Results Page
	I want to test the search results page functionality like refine search, sort & filter

Background: User should be logged in to Cyclops
Given I have logged in to Cyclops to test Search Results Page 

Scenario: Validate Search Results page
	When User is on Search Results Page to validate search Results page
	Then I should be able to view the breadcrumb with the location's search criteria
	And I should also be displayed the Sort tabs
	And I should also be displayed the Search Hotel Section
	And I should also be displayed the section change the dates, add rooms and change the currency
	And I should also be displayed the filters to search by hotel's name, star ratings, price range, distance range and amenities filter
	And I should be displayed the Hotel's list which should have the hotel's name, address, star ratings, image icon, map icon, amenities icon, View Hotel button and Search Nearby button

Scenario: Validate Sort functionality on Results Page
	When User is on Search Results Page to validate search Results page
	When User clicks on the Distance Sort Tab for the first time
	Then the hotels should get arranged in ascending order of their distance
	When User clicks on the Distance Sort Tab for the second time
	Then the hotels should get arranged in descending order of their distance
	When User clicks on the Price Sort Tab for the first time
	Then the hotels should get arranged in ascending order of their price
	When User clicks on the Price Sort Tab for the second time
	Then the hotels should get arranged in descending order of their price
	When User clicks on the Rating Sort Tab for the first time
	Then the hotels should get arranged in descending order of their ratings
	When User clicks on the Ratings Sort Tab for the second time
	Then the hotels should get arranged in ascending order of their ratings
	

Scenario: Validate the Hotel Information on the Results Page
	When User is on Search Results Page to validate search Results page
	Then I should be displayed the Hotel's list which should have the hotel's name, address, star ratings, image icon, map icon, amenities icon, View Hotel button and Search Nearby button
	And I should be able to click on the image icon for the first hotel and view the images for that hotel
	And I should be able to click on the map's icon for the first hotel for which the gmap's url should get generated
	And I should be able to click on the amenities icon for the first hotel and view the list of amenities for that hotel