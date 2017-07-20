#@tag
#Feature: Update search criteria on Search Results Page
#	I want to test the search results page functionality like refine search, sort & filter
#
#Background: User should be logged in to Cyclops
#And should be navigated to the Search Results page
#
#@tag1
#Scenario: Refine search criteria on Search Results Page
#Given I am on Search Results Page
#When I click on the Edit Dates & rooms link 
#	And update the dates, currency and room information
#	And then click on the Search Hotels button
#Then I should be able to see a list of Hotels 

#@tag2
#Scenario: Test Search Results page for Hotel Name Search filter
#Given I am on Search Results Page
#When I enter the name of the hotel in the hotel search filter text
#	And I click on the Go button
#Then I should be able to see a list of Hotels with the searched text in its name
#
#@tag3
#Scenario: Test Search Results page for Distance filter
#Given I am on Search Results Page
#When I set the distance range
#Then I should be able to see a list of Hotels between the set distance range
#
#@tag4
#Scenario: Test Search Results page for Price filter
#Given I am on Search Results Page
#When I set the price range
#Then I should be able to see a list of Hotels between the set price range
#
#@tag5
#Scenario: Test Search Results page for Star Ratings filter
#Given I am on Search Results Page
#When I set the star ratings range
#Then I should be able to see a list of Hotels between the set star rating
#
#@tag5
#Scenario: Test Search Results page for Amenities filter
#Given I am on Search Results Page
#When I set the amenities checkboxes
#Then I should be able to see a list of Hotels with the selected amenity
#
#@tag6
#Scenario: Test Search Results page for Load More
#Given I am on Search Results Page
#When I click on the Load More Hotel button
#Then I should be able to view more number of hotels on the Search Results Page
#
#@tag7
#Scenario: Test Descending Distance Sort on the Search Results Page
#Given I am on Search Results Page
#When I click on the Distance Sort for the first time
#Then I should get a list of hotels in descending order of distance
#
#@tag8
#Scenario: Test Ascending Distance Sort on the Search Results Page
#Given I am on Search Results Page
#When I click on the Distance Sort for the second time
#Then I should get a list of hotels in ascending order of distance
#
#@tag9
#Scenario: Test Price Sort on the Search Results Page when clicked on first time
#Given I am on Search Results Page
#When I click on the Price Sort for the first time
#Then I should get a list of hotels in ascending order of price
#
#@tag10
#Scenario: Test Price Sort on the Search Results Page when clicked on second time
#Given I am on Search Results Page
#When I click on the Price Sort for the second time
#Then I should get a list of hotels in descending order of price
#
#@tag11
#Scenario: Test Star Rating Sort on the Search Results Page when clicked on first time
#Given I am on Search Results Page
#When I click on the Star Rating Sort for the first time
#Then I should get a list of hotels in descending order of star rating
#
#@tag10
#Scenario: Test Star Rating Sort on the Search Results Page when clicked on second time
#Given I am on Search Results Page
#When I click on the Star Rating Sort for the second time
#Then I should get a list of hotels in ascending order of star rating
#
#
#
#
#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
    #| name  |value | status |
    #| name1 |  5   | success|
    #| name2 |  7   | Fail   |
