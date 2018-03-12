@current
Feature: View Hotel on Property without Dates page
	I want to test the View Hotel functionality when Dates are not selected

Background: User should be logged in to Cyclops
Given I have logged in to Cyclops and navigated through the Search Results page
And have navigated to the View Hotel without date page

Scenario: Validating the Create DID feature on the View Property without Dates page
Then I should be able to create DID number from Property without Dates page

Scenario: Validate the Group Booking Form's functionality on Property without Dates page
When I click on the Group Booking Form in the footer on Property without Dates page
Then I should see the Group Booking Form popup on Property without Dates page
Then I click on blank Group Booking Form on Property without Dates page and see error message for it

Scenario: Validate the Group Booking Form's functionality on Property without Dates page
When I click on the Group Booking Form in the footer on Property without Dates page
Then I should see the Group Booking Form popup on Property without Dates page
Then I insert valid data for the Group Booking Form on Property without Dates page and see success message

Scenario: Validate the checkin & checkout dates selection functionality on Property without Dates page
When I select the checkin and checkout dates from the Property without Dates page
And I click on the Search button on the Property without Dates page
Then I should be taken to the Property with Dates page or Unavailability page

Scenario: Validate the functionality Save for Later on Property without Dates page
When click on the Call Disposition Slider
Then I should be able to see the Save for Later Email and SMS section
And I should be able to send the email for Save for Later hotel
And I should be able to send the SMS for save for Later hotel