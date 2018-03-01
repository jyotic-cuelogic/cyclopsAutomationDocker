Feature: Login to Cyclops
	I want to test the login to Cyclops
	
Scenario: Cyclops' Login
Given I have the permission to Cyclops as an Agent through Phalanx
	When I navigate to cyclops' login url
	Then I should be able to view Cyclops' Home Page