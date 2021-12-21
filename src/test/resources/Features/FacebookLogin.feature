Feature: Validation of Facebook

Scenario: Validation of Facebook with correct Username and correct password
Given User should be launch in Facebook page
When User enters the username  and password
|username|password|
|ramsss				|3456|
|suresh|45678|
|ravi|87654|
And User clicks on login button
Then User checks that logeed into home page or not

