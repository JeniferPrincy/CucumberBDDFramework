Feature: Check Login functionality

  Scenario Outline: Check login is successful with valid credentials

	Given browser is open
	And user is in login page
	When user enters <username> and <password>
	And user clicks on login button
	Then user is navigated to the homepage
	
	Examples:
	  | username | password |
	  | jenifers | j12354 |
	  | MARTIN | M1234 |
	  