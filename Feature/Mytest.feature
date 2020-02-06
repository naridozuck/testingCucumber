@test
Feature: Demo Banking system

Scenario: Verify new customer can be created

Given Open the Chrome and launch the application


When Create new customer			


Then Check new customer	

@test2
Scenario: Verify to create new account based on the customer just created above

Given Open the Chrome and launch the application


When Create new account			


Then Check new account	

@test3
Scenario: Verify deposit funcon work fine with the account just created

Given Open the Chrome and launch the application


When Create deposit			


Then Check deposit	


