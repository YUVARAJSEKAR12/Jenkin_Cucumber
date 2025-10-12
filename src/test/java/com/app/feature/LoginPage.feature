Feature: Validate the Login Page Module

	@tag1
  Scenario: Validate the correct username and password
    Given Load the browser
    And Load the URL
    When Enter the username "Aiite"
    And Enter the password "Aiitewnrbe"
    And Click the login button
    Then Validate the home page
