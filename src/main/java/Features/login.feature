Feature: Facebook login feature

Scenario: Facebook login test with valid credentials
Given user is on login page
When I provide valid username and password
And user clicks on login button
Then user should be able to login
And user is on home page



