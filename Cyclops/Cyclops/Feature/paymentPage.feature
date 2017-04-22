@smoke
Feature: Verify Payment Page
	I want to test the Payment and Booking in Cyclops

@tag1
Scenario: Payment Page & Booking test
Given I have navigated to the Payment Page
When I complete filling the Payment Form
	And Click on the Complete Reservation Info button
	And Click on the Verify Reservation Info button on the Confirmation Page
Then I should be navigated to the Confirmation Page
	And I should be displayed the itinerary number
