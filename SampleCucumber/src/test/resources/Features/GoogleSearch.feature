Feature: Check google search functionality

Scenario: Validate google search is working

Given browser is open
And user is on google search page
When user enter a text in google search box
Then user is navigated to the search re sult page 