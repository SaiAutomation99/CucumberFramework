@Regression
Feature: Login functionality
@smoke @sanity
Scenario: Login
Given User is in Login page
Then enter username and password
Then click on login button