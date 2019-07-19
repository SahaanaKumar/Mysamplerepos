Feature: Login function file
Background: Browser Launch
Given Browser must be installed by the user
When  User enters AUT URL in the browser
Then  Application must open in the browser
Scenario: Login functionality
Given user must be registered
When  user must enter the cedentials and confirm login
Then  user must be in the homepage
Scenario: Search
Given user must be logged in
When  search for a product
Then  Product details must be displayed to the user

