Feature: View Hotel on Property with Dates page
	I want to test the View Hotel functionality when Dates are selected and rooms are displayed

Background: User should be logged in to Cyclops
Given I have logged in to Cyclops for test Property with Dates page

@current
Scenario: Verifying if rooms are available when user navigates to Property with Dates page
Then I should be able to validate that rooms are being displayed 

Scenario: Verifying is Create DID functionality is working fine as expected
Then I should be able to create DID number from Property with Dates page