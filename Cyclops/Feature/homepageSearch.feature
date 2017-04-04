#@smoke
#Feature: Hotel Search from Home Page
#	I want to test hotel search for a location
#
#@tag1
#Scenario: Home Page Search for Hotel using Address 
#Given I am logged in to Cyclops
#	And present on the Home Page
#When I enter the Search criteria
#	And click on Search Hotel button
#Then I should navigate to the Search Results Page
#
#@tag2
#Scenario: Home Page Search for Hotel using City
#Given I am logged in to Cyclops
#	And present on the Home Page
#When I click on the City tab 
#	And enter the city search values
#	And click on Search Hotel button
#Then I should navigate to the Search Results Page
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
